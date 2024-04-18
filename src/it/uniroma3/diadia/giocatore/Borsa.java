package it.uniroma3.diadia.giocatore;
import it.uniroma3.diadia.attrezzi.*;

/**
 * Classe che modella e gestisce la borsa del giocatore 
 * @author docente di POO & matricola 559945
 * @see Attrezzo
 * @version v0.1
 */

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;


	public Borsa() {
		this.pesoMax = DEFAULT_PESO_MAX_BORSA;
		this.attrezzi = new Attrezzo[10];
		this.numeroAttrezzi=0;

	}

	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		if (this.numeroAttrezzi==10)
			return false;
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return true;
	}


	public int getPesoMax() {
		return pesoMax;
	}


	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
				a = attrezzi[i];

		return a;
	}


	public int getPeso() {
		int peso = 0;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			peso += this.attrezzi[i].getPeso();

		return peso;
	}


	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}


	public boolean hasAttrezzo(String nomeAttrezzo) {
		
		boolean trovato=false;
		for(Attrezzo a:this.attrezzi) {
			if(a!=null) {
				if(a.getNome().equals(nomeAttrezzo))
					trovato = true;
			}
		}
		return trovato;
		//return this.getAttrezzo(nomeAttrezzo)!=null;
	}


	public Attrezzo removeAttrezzo(String nomeAttrezzo) {

		Attrezzo rimuovi = null;

		if(nomeAttrezzo!=null) {
			int i=0;
			for(Attrezzo a : this.attrezzi) {
				if(a!=null) {
					if(a.getNome().equals(nomeAttrezzo)) {
						rimuovi = a;
						this.attrezzi[i]=null;
						this.numeroAttrezzi--;
					}
				}
				i++;
			}
		}
		return rimuovi;
	}


	public String toString() {
		StringBuilder s = new StringBuilder();

		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i= 0; i<this.numeroAttrezzi; i++)
				s.append(attrezzi[i].toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
}