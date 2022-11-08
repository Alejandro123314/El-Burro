package pgv;

import java.util.Random;

public class Mazo {

	public boolean mano = true;
	private Cartas[] cartas = new Cartas[40];
	public static int cartaActual = 0;

	public Mazo() {
		Palos[] palos = new Palos[4];
		palos = Palos.values();
		int carta = 0;
		for (int palo = 0; palo < palos.length; palo++) {
			for (int valor = 1; valor <= 12; valor++) {
				if (!(valor == 8 || valor == 9)) {
					cartas[carta++] = new Cartas(palos[palo], valor, getFigura(valor));
				}
			}
		}
		mezclar();

	}
	
	private int getFigura(int valor) {
	      int respuesta = 0;
	      switch(valor) {
	      case 1: respuesta=1;
	      break;
	      case 2: respuesta=2;
	      break;
	      case 3: respuesta=3;
	      break;
	      case 4: respuesta=4;
	      break;
	      case 5: respuesta=5;
	      break;
	      case 6: respuesta=6;
	      break;
	      case 7: respuesta=7;
	      break;
	      case 10:
	         respuesta = 8;
	         break;
	      case 11:
	         respuesta = 9;
	         break;
	      case 12:
	         respuesta = 10;
	         break;
	      }
	      return respuesta;
	   }
	
	public void mezclar() {
	      Random r = new Random();
	      for(int i = 0; i < cartas.length; i ++) {
	         int pos = r.nextInt(40);
	         Cartas[] aux = cartas;
	         cartas[i] = cartas[pos];
	         cartas[pos] = aux;
	      }
	      cartaActual = 0;
	   }
	
	   
}
