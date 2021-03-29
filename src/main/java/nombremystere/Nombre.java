package nombremystere;

import java.util.Random;
import java.util.Scanner;

public class Nombre extends Jeu {


	public static int[] getSaisie(int[] nb) {
		int saisie;
		
		Scanner sc = new Scanner(System.in);
		saisie = sc.nextInt();
		
		for(int i = 4; i > 0; i++) {
			nb [ i - 4 ] = saisie % 10;
			saisie /= 10;
		}
		
		return nb;
	}
	
	public static int[] getMystere() {
		int[] nombreMystere = new int[4];
		Random rd = new Random();
		
		for(int i = 0; i < nombreMystere.length; i++) {
			nombreMystere[i] = rd.nextInt(10);
		}
		
		return nombreMystere;
	}
	
	public static void afficherNombre(int[] nb) {
		for(int i = 0; i < nb.length; i++) {
			System.out.print(nb[i]);
		}
	}
	
	public static void afficherReponse(int[] random, int[] saisie) {
		for(int i = 0; i < saisie.length; i++) {
			
			if(random[i] == saisie[i]) {
				System.out.print(" = ");
			}
			else if(random[i] > saisie[i]) {
				System.out.print(" + ");
			}
			else if(random[i] < saisie[i]) {
				System.out.print(" - ");
			}
			else {
				System.out.println("Nous n'avons pas pu traiter votre demande");
			}
		}
	}
	
}
