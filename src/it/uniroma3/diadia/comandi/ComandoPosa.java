package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;


public class ComandoPosa implements Comando{

	private String nomeAttrezzo;
	private Partita partita;
	private IO io;
	
	@Override
	public void esegui(Partita partita) {
		if (this.partita.getGiocatore().getBorsa().hasAttrezzo(nomeAttrezzo)) {

			Attrezzo daPosare = this.partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
			this.partita.getLabirinto().getStanzaCorrente().addAttrezzo(daPosare);
			this.partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
			
			io.mostraMessaggio("Attrezzo posato");

		}

	}
	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo= parametro;
	}
	@Override
	public void getNome() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getParametro() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setIO(IO io) {
		// TODO Auto-generated method stub
		
	}
}
