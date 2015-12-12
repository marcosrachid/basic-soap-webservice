package com.soap.template;

import java.util.List;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.interceptor.PayloadLoggingInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@ComponentScan("com.soap.template")
public class WebServiceConfig extends WsConfigurerAdapter {
	
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		ServletRegistrationBean registration = new ServletRegistrationBean(servlet, "/endpoints/*", "*.wsdl");
		registration.setLoadOnStartup(1);
		return registration;
	}

	@Bean(name = "BasicDetailsService")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schemas) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("BasicDetailsService");
		wsdl11Definition.setLocationUri("/endpoints");
		wsdl11Definition.setTargetNamespace("http://webservices.template.soap.com");
		wsdl11Definition.setSchema(schemas);
		return wsdl11Definition;
	}
	
	@Override
	public void addInterceptors(List<EndpointInterceptor> interceptors) {
		PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
		validatingInterceptor.setXsdSchema(schemas());
		validatingInterceptor.setValidateRequest(true);
		validatingInterceptor.setValidateResponse(true);
		interceptors.add(validatingInterceptor);

		interceptors.add(new PayloadLoggingInterceptor());
	}

	@Bean
	public XsdSchema schemas() {
		return new SimpleXsdSchema(new ClassPathResource("schemas/BasicDetailsServiceOperations.xsd"));
	}
}