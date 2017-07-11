package es.cic.taller.ejercicio09.mus;

public class Carta {
	private Numero numero;
	private Palo palo;
	
	public Carta() {
		
	}
	
	public Carta(Numero numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public Palo getPalo() {
		return palo;
	}
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return numero.getTexto() + " de " + palo.getTexto();
	}
}
