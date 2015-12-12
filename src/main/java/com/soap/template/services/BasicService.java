package com.soap.template.services;

import javax.xml.bind.JAXBElement;

public interface BasicService {
	public String newBasic(JAXBElement<String> content);
	public JAXBElement<String> echo(JAXBElement<String> output);
}