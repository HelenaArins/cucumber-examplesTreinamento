package com.mastercad;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class CalculadoraSteps {
	Calculadora calculadora;
	
	@Dado("que eu ligue a calculadora.")
	public void que_eu_ligue_a_calculadora() {
		calculadora = new Calculadora();
	}

	@Quando("adiciono o {int} e o {int}")
	public void adiciono_o_e_o(Integer int1, Integer int2) {
		calculadora.adiciona(int1, int2);
	}

	@Então("o resultado é {int}")
	public void o_resultado_é(Integer int1) {
		assertThat(int1, is(equalTo(calculadora.getResult())));
	}

	@Quando("subtraio o {int} e o {int}")
	public void subtraio_o_e_o(Integer int1, Integer int2) {
		calculadora.subtrai(int1, int2);
	}

	@Quando("divido o {int} e o {int}")
	public void divido_o_e_o(Integer int1, Integer int2) {
		calculadora.divisao(int1, int2);
	}

	@Quando("multiplico o {int} e o {int}")
	public void multiplico_o_e_o(Integer int1, Integer int2) {
		calculadora.mutiplicacao(int1, int2);
	}
}
