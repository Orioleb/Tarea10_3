package Aplicacion;

import java.util.concurrent.ThreadLocalRandom;

import Excepcion.Impar;

public class Main {
	public static void main(String[] args) {
		//intervalo
		int minval=0;
		int maxval=999;
		//Generamos numeor aleatorio
		int numero=ThreadLocalRandom.current().nextInt(minval, maxval + 1);
		try {
			//Condicion si es par
			if(numero%2==0) {
				System.out.println("Es par");
				
				
			}else {
				//salta excepcion
				throw new Impar();
			}
		}catch(Impar e) {
			System.out.println(e);
		}finally {
			System.out.println("Programa terminado");
		}

	}
}
