package view;
import controller.Metodos5;

public class Main5 {
	public static void main (String [] args) {
		
		String sistema = System.getProperty("os.name");
		
		if (sistema.contains("Linux")) {	
			String processo = "ping -4 -c 10 ";
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				Thread ping = new Metodos5("ping -4 -c 10 www.uol.com.br" , "UOL");
				ping.start();
			} else if (i == 1) {
				Thread ping = new Metodos5("ping -4 -c 10 www.terra.com.br" , "Terra");
				ping.start();
			} else {
				Thread ping = new Metodos5("ping -4 -c 10 www.google.com.br" , "Google");
				ping.start();
			}
		}
		} else {
			System.out.println("Sistema incompativel.");
		}
	}
}
