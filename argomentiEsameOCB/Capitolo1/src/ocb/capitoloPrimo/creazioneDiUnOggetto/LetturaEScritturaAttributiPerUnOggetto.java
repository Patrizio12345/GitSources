package ocb.capitoloPrimo.creazioneDiUnOggetto;

public class LetturaEScritturaAttributiPerUnOggetto {

	//è possibile leggere e scrivere variabili direttamente dal caller (LetturaEScritturaAttributiPerUnOggetto)
	//variabile d'istanza
	int elementi_oggetto=10;
	
	
	String variabile_nome="Nome";
	String variabile_cognome="Cognome";
	//possono essere lette variabili già inizializzate, in una nuova variabile
	String totale=variabile_nome+variabile_cognome;
	
	
	public static void main(String[] args) {
           
		//istanziazione della classe
		LetturaEScritturaAttributiPerUnOggetto creazione_oggetto=new LetturaEScritturaAttributiPerUnOggetto();
		//set della variabile
		creazione_oggetto.elementi_oggetto=1;
		//lettura della variabile
		System.out.println(creazione_oggetto.elementi_oggetto);

	}

}
