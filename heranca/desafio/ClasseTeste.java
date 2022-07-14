package oo.heranca.desafio;

public class ClasseTeste {
	public static void main(String[] args) {
		
		Carro ferrari = new Ferrari();
		System.out.println(ferrari.velocidadeAtual);
		ferrari.acelerar(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.acelerar(ferrari);
		ferrari.acelerar(ferrari);
		ferrari.acelerar(ferrari);
		ferrari.acelerar(ferrari);
		
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		ferrari.frear(ferrari);
		
		
		
		
		
		
		Carro civic = new Civic();
		System.out.println(civic.velocidadeAtual);
		civic.acelerar(civic);
		civic.acelerar(civic);
		civic.acelerar(civic);
		civic.acelerar(civic);
		
		Carro carro = new Carro();
		System.out.println(carro.velocidadeAtual);
		carro.acelerar(carro);
		carro.acelerar(carro);
		carro.acelerar(carro);
		carro.acelerar(carro);
		carro.acelerar(carro);
		carro.acelerar(carro);
		carro.acelerar(carro);
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		System.out.println(carro.velocidadeAtual);
		
	}
}
