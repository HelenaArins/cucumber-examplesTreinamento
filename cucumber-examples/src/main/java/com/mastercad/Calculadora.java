package com.mastercad;

public class Calculadora {
	
	private int result;
	
	public void adiciona(Integer int1, Integer int2) {
		setResult(int1 + int2);	
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

	public void subtrai(Integer int1, Integer int2) {
		setResult(int1-int2);		
	}

	public void divisao(Integer int1, Integer int2) {
		setResult(int1/int2);		
	}

	public void mutiplicacao(Integer int1, Integer int2) {
		setResult(int1*int2);
	}

}
