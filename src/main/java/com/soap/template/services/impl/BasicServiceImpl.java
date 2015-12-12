package com.soap.template.services.impl;

import java.math.BigInteger;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Service;

import com.soap.template.services.BasicService;
import com.soap.template.webservices.Basic;

@Service  
public class BasicServiceImpl implements BasicService  
{  
	@Override
	public JAXBElement<String> echo(JAXBElement<String> output) {
        return output;
	}

	@Override
	public String newBasic(JAXBElement<String> content) {
		
		Basic basic = new Basic();
		basic.setId(BigInteger.valueOf((long)(Math.random() * 1000)));
		basic.setContent(content.getValue());
		return "Successfully inserted.";
	}  
}  