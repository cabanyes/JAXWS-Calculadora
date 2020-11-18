package com.audifilm.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/WS/Calculadora", new CalculadoraImpl());
	}

}
