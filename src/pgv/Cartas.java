package pgv;

public class Cartas {
	 	 
	   public int numero;
	   public Palos palo;
	   public int valor;
	 
	 
	   public Cartas(Palos palo, int numero, int valor) {
	      this.palo = palo;
	      this.numero = numero;
	      this.valor = valor;
	   }
	 
	 
	 
	   public String toString() {
	      return numero + " de " + palo;
	   }
	 
	   public int getValor() {
	      return valor;
	   }
	}
