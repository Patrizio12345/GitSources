package ocb.capitoloPrimo.creazioneDiUnOggetto;

public class Oggetto {

	
	//istanza di una classe
	Oggetto o=new Oggetto();
	
	/*costruttore=tipologia speciale di metodo che permette la creazione di un nuovo oggetto.
	* 
	* i due elementi fondamentali che caratterizzano un costruttore sono:
	* 1. il nome del costruttore matcha con quello della classe;
	* 2. non c'è il return
	* 
	* Se notassimo un costruttore con la prima lettera maiuscola e il return,
	* esso non è il sopracitato costruttore, bensì un semplice metodo.
	* Quest'ultimo non viene chiamato col new
	*/
	
	//costruttore
	public Oggetto() {
		System.out.println("sono_nel_costruttore");
	}
	
	//metodo(in questo specifico caso non possiede il return, in quanto non è contemplato per il void
	public void Oggetto(){
		
	}
	
	
}
