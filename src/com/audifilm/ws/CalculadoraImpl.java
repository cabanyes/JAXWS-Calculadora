package com.audifilm.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.audifilm.ws.Calculadora")

public class CalculadoraImpl implements Calculadora {

	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		// TODO Auto-generated method stub
		
		double result = 0;
		
		switch (opcion) {
		case 1:
			result = valor1 + valor2;
			break;
		case 2:
			result = valor1 - valor2;
			break;
		case 3:
			result = valor1 * valor2;
			break;
		case 4:
			result = valor1 / valor2;
			break;
		default:
			break;
		}
		return result;
	}

}
