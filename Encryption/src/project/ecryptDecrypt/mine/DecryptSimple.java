package project.ecryptDecrypt.mine;

public class DecryptSimple {
	public static void main(String[] args) {
		int key=6;
		String textDecrypted="Vxu|g&jo&Ixovzg?outk";
		System.out.println(textDecrypted);
		
		
		char[]chars=textDecrypted.toCharArray();
		for(char c:chars) {
			c -= key;
			System.out.print(c);
			
			}
		
		}
}
