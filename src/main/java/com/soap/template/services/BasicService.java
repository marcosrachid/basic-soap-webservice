package com.soap.template.services;

import javax.xml.bind.JAXBElement;

import com.soap.template.webservices.Basic;

public interface BasicService {
	public Basic newBasic(String content);
	public JAXBElement<String> echo(JAXBElement<String> output);
}