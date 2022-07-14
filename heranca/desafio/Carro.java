package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAtual;
	
	
	void acelerar(Carro acelera) {
		velocidadeAtual += 5;
		
	}
	
	void frear(Carro freia) {
		if(velocidadeAtual >= 5) {
		}else
		velocidadeAtual = 0;
	}
}
