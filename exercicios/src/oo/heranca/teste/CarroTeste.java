package oo.heranca.teste;

import oo.heranca.desafio.Asx;
import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;

public class CarroTeste {

	public static void main(String[] args) {
		
		
		Carro c1 = new Civic();
		
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Carro c2 = new Asx(400);
		c2.ligarTurbo();
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);

		c2.acelerar();
		System.out.println(c2);
		
	}
}
