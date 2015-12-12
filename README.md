# basic-soap-webservice
Template for SOAP webservice with spring

## Tecnologies

* Java 8
* Spring Boot
* Maven 3
  * Release plugin
  * FindBugs plugin
* JUnit

## Builds

To generate local builds with maven:
```bash
 mvn clean install
``` 
To generate versioned builds for production and homologation enviroments:
```
  mvn release:clean
  mvn release:prepare
```

## Deploys

After building project, get .war file and run on your current web server:

* Tomcat
```bash
	./startup.sh
```

## Requests

After starting the server, execute:

Echo:
```bash
 curl --header "content-type: text/xml" -d @(?path/)EchoRequest.xml (your server)/basic/endpoints/BasicDetailsService.wsdl
``` 

Insert Basic:
```bash
 curl --header "content-type: text/xml" -d @(?path/)NewRequest.xml (your server)/basic/endpoints/BasicDetailsService.wsdl
``` 