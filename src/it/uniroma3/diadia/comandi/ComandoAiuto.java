package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando{

	static final public String[] ELENCO_COMANDI = {"vai", "aiuto", "fine", "prendi", "posa","guarda"};
	private IO io;
	
	
	
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< ELENCO_COMANDI.length; i++) 
			io.mostraMessaggio(ELENCO_COMANDI[i]+" ");
		io.mostraMessaggio("");
		
	}

	@Override
	public void setParametro(String parametro) {
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
