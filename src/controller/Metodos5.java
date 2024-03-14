package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Metodos5 extends Thread {
	String processo;
	String site;
	
	public Metodos5 (String processo, String site) {
		this.site = site;
		this.processo = processo;
	}
	
	public void run() {
		try {
			Process p = Runtime.getRuntime().exec(processo);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while (linha != null) {
				
				if (linha.contains("time=")) {
					String[] msg = linha.split("time=");	
					System.out.println(site + " " + msg[1]);
				}
				if (linha.contains("avg")) {
					String[] msg = linha.split("/");	
					System.out.println("Tempo medio em " + site + " :" + msg[5]);
				}
				linha = buffer.readLine();				
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
