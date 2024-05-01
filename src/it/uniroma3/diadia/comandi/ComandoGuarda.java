package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando{
	
	private IO io;
	private Partita partita;

	@Override
	public void esegui(Partita partita) {

		io.mostraMessaggio("Stanza Corrente: ");
		io.mostraMessaggio(this.partita.getLabirinto().getStanzaCorrente().getDescrizione());
		io.mostraMessaggio("Contenuto Borsa: ");
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
		io.mostraMessaggio("Hai "+partita.getGiocatore().getCfu()+" "+ "CFU\n");
		
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub	
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
