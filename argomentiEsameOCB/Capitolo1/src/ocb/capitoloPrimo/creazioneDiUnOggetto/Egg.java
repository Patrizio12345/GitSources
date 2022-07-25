package ocb.capitoloPrimo.creazioneDiUnOggetto;
/*il programma procede in ordine dal primo all'ultimo blocco ({})
 * 
 * setta variabile numero, non istanziata con una tipologia di classe, prima a 3 poi a 4,
 * dopodichè il costruttore runna, e il numero viene settato a 5. 
 */
public class Egg {
	public Egg() {
		numero=5;
	}
    
	public static void main(String[] args) {
		Egg egg=new Egg();
		System.out.println(egg.numero);
	}
private int numero=3;
{numero=4;}
}
