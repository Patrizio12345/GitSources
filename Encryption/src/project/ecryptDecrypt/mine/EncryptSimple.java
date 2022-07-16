package project.ecryptDecrypt.mine;





public class EncryptSimple{

	public static void main(String[] args) {
		int key=6;
		String textEncrypted="Prova di Criptazione";
		System.out.println(textEncrypted);
		
		
		char[]chars=textEncrypted.toCharArray();
		for(char c:chars) {
			c += key;
			System.out.print(c);
			
			
			}
		
		
		
		}

		
		}
		
		
		
		
		
		
		
		

	


