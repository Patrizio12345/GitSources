package ocb.capitoloPrimo.packageAndImportDeclare;

//l'import seguente importa la singola classe esplicitata
import java.util.Random;

//l'import seguente importa tutte le classi presenti nel package
import java.util.*;

/* il pckg java.lang, è importato automaticamente , quindi
 * utilizzare java.lang.System o java.lang.* è inutile e ridondante.
 * Se noi avessimo in questa classe , sotto questo package:
 * 
 * import java.lang.System
 * import java.lang.*
 * import java.util.Random
 * import java.util.*
 * 
 * sarebbe funzionale esclusivamente import java.util.*, poichè i primi 2 import
 * sono automatici, mentre il .Random, è già presente nel pckg .util.*,
 * ergo, i primi 3 sarebbero ridondanti.
 * 
 * uno shrtcut per gli import è altresì la combo:
 * ctrl+shift+o, la quale importerà le classi, ma facendo comparire una finestra
 * con la scelta del package necessario al proprio codice.
 * 
 * Come si vede a rg 7,java allerta con un "compiler error",
 * questo indica che ci sono pckg che forniscono la medesima soluzione, quindi
 * per una corretta scrittura del codice, ci chiede di eliminare quello superfluo.
 * 
 * Quindi in questo specifico caso di "same name on multiple package", la presenza
 * di uno dei due è "nuovamente" ridondante(x3), ma ciò si applica a qualsiasi casistica. 
 */


public class Wildcards {

	public static void main(String[] args) {
	
		Random r=new Random();
		System.out.println(r.nextInt(10));

		/*Nel caso sottostante troviamo la classe Date.
		 *Java fornisce :
		 *
		 *import java.util.Date
		 *import java.sql.Date
		 *
		 *Nel caso avessimo bisogno di entrambi i pckg, potremmo fare:
		 *
		 *import java.util.Date
		 *import java.sql.*
		 *
		 *Ulteriore casistica potrebbe essere voler usare entrambi i pckg per 
		 *le due differenti casistiche:
		 *
		 *import java.util.Date
		 *import java.sql.Date
		 *
		 *In questo caso sarà necessaria un'implementazione, quindimquando andremo 
		 *a definire un fields, specificheremo prima della classe, gli elementi
		 *che caratterizzano l'import :
		 *
		 *java.util.Date  date;
		 *java.sql.Date  sql_date;
		 *
		 */
		
		
		
		
		class Wildcards2{
			
			java.util.Date date;
			java.sql.Date sql_date;
			
			
		}
		
		
		
		
		
		
		
	}

}
