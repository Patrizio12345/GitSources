package srl.panzerSpace.streams.api;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainStreamsAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// Stream API 00 --begin--	
						try {
							System.out.println(System.currentTimeMillis());
							Files.lines(Paths.get("name01.txt")).
							    parallel().
							    filter(element ->element.contains("r"));
							System.out.println(System.currentTimeMillis());	
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				// Stream API 00 --end--
				System.out.println("--------------------");
				// Stream API 01 --begin--	
				try {
					Stream<String>nomi=Stream.<String>builder().add("Riccardo").add("Luca").add("Patrizio").build();
					
					Files.lines(Paths.get(nomi.toString())).
					    sorted().
						filter(element ->element.contains("r")).
						forEach(element -> {
							    System.out.println(element.length());
						});
						
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Stream API 01 --end--
				// Stream API 02 --begin--	
				try {
					Files.lines(Paths.get("name01.txt")).
					  map(element ->{
						   return element.substring(0, 5);  
					  }).
					  sorted().toList().toString();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Stream API 02 --end--

	}

}
