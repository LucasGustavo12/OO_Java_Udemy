package oo.heranca.desafio;

public class Civic extends Carro{
	
	
	void acelerar(Carro acelera) {
		velocidadeAtual += 10;
		
	}
	
	void frear(Carro freia) {
		if(velocidadeAtual >= 5) {
		}else
		velocidadeAtual = 0;
	}

}
