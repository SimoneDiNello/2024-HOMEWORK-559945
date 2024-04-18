package it.uniroma3.diadia;

import java.util.Scanner;

/**Classe che gestisce tutte le interazioni 
 * di input ed output delle classi del project Diadia
 * 
 */

public class IOConsole {

	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}

	public String leggiRiga() {
		Scanner scannerDiLinee = new Scanner(System.in);
		String riga = scannerDiLinee.nextLine();
		return riga;
	}
}