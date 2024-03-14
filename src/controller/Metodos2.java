package controller;

public class Metodos2 extends Thread {
	int linha[], y;

	public Metodos2(int linha[], int y) {
		this.linha = linha;
		this.y = y;
	}
	public void run() {
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			soma = soma + linha[i];
		}
		System.out.println("Soma da linha " + y + " = " + soma);
	}
}