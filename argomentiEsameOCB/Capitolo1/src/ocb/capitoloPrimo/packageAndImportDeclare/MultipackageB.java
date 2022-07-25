package ocb.capitoloPrimo.packageAndImportDeclare;
/*pckg dell'attuale classe
 * 
 * 
 * 
 * 
 * pckg della classe importata con il nome della classe
 */

import ocb.capitoloPrimo.packageForMulti.MultiPackageA;


	public class MultipackageB{
	public static void main(String[] args) {
	
		//classe importata tramite pckging
		MultiPackageA a;
		
		System.out.println("multi_packeging_accomplished");

	}

	/*Per runnare il codice con entrambi i pckg , bisogna crearli ed accorparli:
	 * 
	 * 
	 * 
	 * creazione prima classe:
	 * C:\temp\ocb.capitoloPrimo.packageForMulti\MultiPackageA.java (WINDOWS)
	 * /temp/ocb.capitoloPrimo.packageForMulti/MultiPackageA.java (MAC/LINUX)
	 *
	 * creazione seconda classe:
	 * C:\temp\ocb.capitoloPrimo.packageAndImportDeclare\MultiPackageB.java (W)
	 * /temp/ocb.capitoloPrimo.packageAndImportDeclare/MultiPackageB.java (M/L)
	 * 
	 * directory:
	 * cd C:\temp
	 * cd/temp
	 * 
	 * tramite il comando javac creare le le .class:
	 * javac ocb.capitoloPrimo.packageForMulti/MultiPackageA.java 
	 *        ocb.capitoloPrimo.packageAndImportDeclare/MultiPackageB.java
	 * 
	 * verranno creati 2 file:
	 * ocb.capitoloPrimo.packageForMulti/MultiPackageA.class
	 * ocb.capitoloPrimo.packageAndImportDeclare/MultiPackageB.class
	 * 
	 * Nel caso si vogliano includere tutti i file presenti in uno o entrabi i package:
	 *javac ocb.capitoloPrimo.packageForMulti/*.java 
	 *        ocb.capitoloPrimo.packageAndImportDeclare/*.java
	 *
	 * javac -d <dir> =comando per indicare in quale directory spostare i .class generati
	 * 
	 * per runnare il codice, bisogna specificare il percorso per trovare le classi:
	 * (i 3 comandi forniscono il medesimo risultato)
	 * 
	 * java -cp classes package.Class
	 * java -classpath classes package.Class
	 * java --class-path classes package.Class
	 */
	
	
	
	
	
}
