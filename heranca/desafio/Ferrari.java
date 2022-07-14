package oo.heranca.desafio;

import oo.heranca.desafioprofessor.Esportivo;

public class Ferrari extends Carro  implements Esportivo{
	
	void acelerar(Carro acelera) {
		velocidadeAtual += 20;
		
	}
	
	void frear(Carro freia) {
		if(velocidadeAtual >= 5) {
		}else
		velocidadeAtual = 0;
	}
	
	@Override
	public void ligarTurbo() {
		velocidadeAtual = 35;
		
	}
	
	@Override
	public void desligarTurbo() {
		velocidadeAtual = 15;
		
	}

}
