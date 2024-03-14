package view;
import controller.Metodos2;

public class Main2 {

	public static void main (String[] args) {
		int Mat[][] = new int[3][5];
		for (int y = 0; y < 3; y++) {
			System.out.print("Linha " + y + ": ");
			for (int x = 0; x < 5; x++) {
				Mat[y][x]= (int) ((Math.random() * 10) + 0);
				System.out.print(Mat[y][x]+ " ");
			}
			System.out.println();	
			System.out.println();
		}
		for (int y = 0; y < 3; y++) {
		Thread m = new Metodos2(Mat[y] , y);
		m.start();
		}
	}
}