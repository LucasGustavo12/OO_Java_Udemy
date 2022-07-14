package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi(10, 11);

		System.out.println("Montro tem =>" + monstro.vida);
		System.out.println("herói tem =>" + heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Montro tem =>" + monstro.vida);
		System.out.println("herói tem =>" + heroi.vida);

		monstro.andar(Direcao.NORTE);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Montro tem =>" + monstro.vida);
		System.out.println("herói tem =>" + heroi.vida);
	}
}