package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando{

	private String nomeAttrezzo;
	private Partita partita;
	private IO io;


	@Override
	public void esegui(Partita partita) {

		if (this.partita.getLabirinto().getStanzaCorrente().hasAttrezzo(nomeAttrezzo)) {
			Attrezzo daPrendere = this.partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
			this.partita.getGiocatore().getBorsa().addAttrezzo(daPrendere);
			this.partita.getLabirinto().getStanzaCorrente().removeAttrezzo(daPrendere);

			io.mostraMessaggio("Attrezzo preso");
		}	

	}


	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
		
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
