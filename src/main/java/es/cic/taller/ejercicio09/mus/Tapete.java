package es.cic.taller.ejercicio09.mus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Tapete {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;

	public Carta getCarta1() {
		return carta1;
	}

	public void setCarta1(Carta carta1) {
		this.carta1 = carta1;
	}

	public Carta getCarta2() {
		return carta2;
	}

	public void setCarta2(Carta carta2) {
		this.carta2 = carta2;
	}

	public Carta getCarta3() {
		return carta3;
	}

	public void setCarta3(Carta carta3) {
		this.carta3 = carta3;
	}

	public Carta getCarta4() {
		return carta4;
	}

	public void setCarta4(Carta carta4) {
		this.carta4 = carta4;
	}

	public int getPuntuacion() {
		return carta1.getNumero().getValor() + carta2.getNumero().getValor() + carta3.getNumero().getValor()
				+ carta4.getNumero().getValor();
	}

	public static int compararMayor(Tapete tapete1, Tapete tapete2) {
		List<Carta> listaCartasTapete1 = getCartasOrdenas(tapete1);
		List<Carta> listaCartasTapete2 = getCartasOrdenas(tapete2);

		int resultado = 0;

		for (int i = 0; i < listaCartasTapete1.size(); i++) {
			int numero1 = listaCartasTapete1.get(i).getNumero().getNumeroReal();
			int numero2 = listaCartasTapete2.get(i).getNumero().getNumeroReal();

			if (numero1 != numero2) {
				resultado = numero2 - numero1;
				break;
			}
		}
		return resultado;
	}

	public static int compararMenor(Tapete tapete1, Tapete tapete2) {
		List<Carta> listaCartasTapete1 = getCartasOrdenas(tapete1);
		List<Carta> listaCartasTapete2 = getCartasOrdenas(tapete2);

		int resultado = 0;

		for (int i = listaCartasTapete1.size()-1; i>=0; i--) {
			int numero1 = listaCartasTapete1.get(i).getNumero().getNumeroReal();
			int numero2 = listaCartasTapete2.get(i).getNumero().getNumeroReal();

			if (numero1 != numero2) {
				resultado = numero1 - numero2;
				break;
			}
		}
		return resultado;
	}

//	public static int numeroPares(Tapete tapete) {
//		List<Carta> listaCartasTapete = new ArrayList<>();
//		listaCartasTapete.add(tapete.getCarta1());
//		listaCartasTapete.add(tapete.getCarta2());
//		listaCartasTapete.add(tapete.getCarta3());
//		listaCartasTapete.add(tapete.getCarta4());
//
//		int resultado = 0;
//
//		for (int i = 0; i < listaCartasTapete.size() - 1; i++) {
//
//			for (int j = i + 1; j < listaCartasTapete.size(); j++) {
//
//				int valor1 = listaCartasTapete.get(i).getNumero().getValor();
//				int valor2 = listaCartasTapete.get(j).getNumero().getValor();
//				int numero1 = listaCartasTapete.get(i).getNumero().getNumero();
//				int numero2 = listaCartasTapete.get(j).getNumero().getNumero();
//
//				if (numero1 != 10 & numero1 != 11 & numero2 != 10 & numero2 != 11) {
//
//					if (valor1 == valor2) {
//						resultado++;
//					}
//				} else if (numero1 == numero2) {
//					resultado++;
//				}
//			}
//		}
//		return resultado;
//	}

	private static List<Carta> getCartasOrdenas(Tapete tapete) {
		List<Carta> listaCartas = new ArrayList<>();
		listaCartas.add(tapete.getCarta1());
		listaCartas.add(tapete.getCarta2());
		listaCartas.add(tapete.getCarta3());
		listaCartas.add(tapete.getCarta4());

		for (int i = 0; i < listaCartas.size() - 1; i++) {
			int indiceMayor = i;
			for (int j = i + 1; j < listaCartas.size(); j++) {
				if (listaCartas.get(j).getNumero().getNumeroReal() > 
				listaCartas.get(indiceMayor).getNumero().getNumeroReal()) {
					indiceMayor = j;
				}

			}
			Carta aux = listaCartas.get(i);
			listaCartas.set(i, listaCartas.get(indiceMayor));
			listaCartas.set(indiceMayor, aux);

		}
		return listaCartas;
	}
	
//	HashMap mapOrden =  new HashMap<Numero, Integer>() {
//		{
//		        put("UNO", 1);
//		        put("DOS", 1);
//		        put("TRES", 12);
//		        put("CUATRO", 4);
//		        put("CINCO", 5);
//		        put("SEIS", 6);
//		        put("SIETE", 7);
//		        put("SOTA", 10);
//		        put("CABALLO", 11);
//		        put("REY", 12);
//		    }
//		};
	
	
	
	/*Cargamos el HashMap con los valores de los tapetes */
	
	
	
	private static HashMap<Numero, Integer>  cargaHashMap(Tapete tapete1,Tapete tapete2,Tapete tapete3,Tapete tapete4) {
		List<Carta> listaCartas = new ArrayList<>();
		listaCartas.add(tapete1.getCarta1());
		listaCartas.add(tapete1.getCarta2());
		listaCartas.add(tapete1.getCarta3());
		listaCartas.add(tapete1.getCarta4());
		listaCartas.add(tapete2.getCarta1());
		listaCartas.add(tapete2.getCarta2());
		listaCartas.add(tapete2.getCarta3());
		listaCartas.add(tapete2.getCarta4());
		listaCartas.add(tapete3.getCarta1());
		listaCartas.add(tapete3.getCarta2());
		listaCartas.add(tapete3.getCarta3());
		listaCartas.add(tapete3.getCarta4());
		listaCartas.add(tapete4.getCarta1());
		listaCartas.add(tapete4.getCarta2());
		listaCartas.add(tapete4.getCarta3());
		listaCartas.add(tapete4.getCarta4());
		
	
	HashMap<Numero, Integer> cartaMap = new HashMap<Numero, Integer>();
		for (Carta carta : listaCartas) {
	   cartaMap.put(carta.getNumero(), carta.getNumero().getNumeroReal());}
		return cartaMap;
	}
	
	private static Entry<Numero, Integer> getNumeroMayor(HashMap<Numero, Integer> map){        
	    Entry<Numero, Integer> maxEntry = null;
	    Integer max = Collections.max(map.values());
	    	    
	    for(Entry<Numero, Integer> entry : map.entrySet()) {
	        Integer value = entry.getValue();
	        if(null != value && max == value) {
	            maxEntry = entry;
	            }
	    }
	    return maxEntry;
	}
	
	

}
