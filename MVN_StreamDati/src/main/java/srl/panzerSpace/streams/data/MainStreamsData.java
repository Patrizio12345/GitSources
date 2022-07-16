package srl.panzerSpace.streams.data;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class MainStreamsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File Stream 01--begin--
		try {
			InputStream fis=new FileInputStream("img01.jpg");
		   int i = fis.read();
	       while(i != -1) {
	           System.out.print((char)i);
	           i = fis.read();
	        }
	       fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//File Stream 01 --end--
		//File Stream 02--begin--
				try {
					InputStream fis=new FileInputStream("img01.jpg");
			        InputStream bais=new ByteArrayInputStream(fis.readAllBytes());
				    bais.transferTo(new FileOutputStream("img02.jpg"));
				    fis.close();
				    bais.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//File Stream 02 --end--
		//File Stream 03--begin--
				try {
					InputStream fis=new FileInputStream("img01.jpg");
					byte[] dati = new byte[fis.available()];
					fis.read(dati);
					dati[1870]=0;
					dati[2300]=0;
					dati[2301]=0;
					dati[2302]=0;
					OutputStream fos=new FileOutputStream("img04.jpg");
					fos.write(dati);
			        fos.close();
			        fis.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//File Stream 03 --end--		
		//File Stream 04--begin--
				try {
					URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Facebook_icon.svg/480px-Facebook_icon.svg.png");
					InputStream is = url.openStream(); 
					OutputStream fos=new FileOutputStream("img06.jpg");
					byte[] b = new byte[is.available()];
					is.read(b);
					fos.write(b);
			        fos.close();
			        is.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		//File Stream 04 --end--		
		
	}

}
