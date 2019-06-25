package projet1;

import java.util.Scanner;

public class Tp1 {

	public static void main(String[] args) {
		System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT" + "\n-------------------------------------------");
		convertisseur();
		
	}
	
	public static void convertisseur() {
		System.out.println("Choisissez le mode de conversion : ");
		System.out.println("1 - Convertisseur Celsius -> Fahrenheit");
		System.out.println("2 - Convertisseur Fahrenheit -> Celsius");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("Température à convertir :");
			Scanner scTempScanner = new Scanner(System.in);
			int temp = scTempScanner.nextInt();
			double resulF = 9/5 * temp +32;
			resulF = arrondi(resulF, 2);
			System.out.println(temp + " °C correspond à : " + resulF + " °F.");
			
			again();
			
		} else if (choice ==2) {
			System.out.println("Température à convertir :");
			Scanner scTempScanner = new Scanner(System.in);
			int temp = scTempScanner.nextInt();
			double resulC = (temp - 32)*5 / 9;
			resulC = arrondi(resulC, 2);
			System.out.println(temp + " °F correspond à : " + resulC + " °C.");
			
			again();
			
		} else {
			System.out.println("Entrez 1 ou 2");
			convertisseur();
		}
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}
	
	public static void again() {
		System.out.println("Souhaitez-vous convertir une autre tempérture ? (O/N)");
		Scanner scLine = new Scanner(System.in);
		String response = scLine.nextLine();
		if (response.equals("O")) {
			convertisseur();
		} else if (response.equals("N")) {
			System.out.println("Au revoir !");
		} else {
			System.out.println("entrez O ou N");
			again();
		}
	}

}
