package project.ecryptDecrypt.mine;

import java.io.File;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class EncryptingAndDecrpting {

	private void  whenEncryptingIntoFile_andDecryptingFileAgain_thenOriginalStringIsReturned() {
		String originalContent="foobar";
        SecretKey secretKey=KeyGenerator.getInstance("AES").generateKey();
        
        FileEncrypterDecrypter fileEncrypterDecrypter=
        		new FileEncrypterDecrypter(secretKey, "AES/CBC/PKCS5Padding");
        fileEncrypterDecrypter.encrypt(originalContent, "baz.enc");
        
        String decryptedContent=fileEncrypterDecrypter.decrypt("baz.enc");
        assertThat(decryptedContent,is(originalContent));
        
        new File("baz.enc").delete();

	}
	
	
	
}
