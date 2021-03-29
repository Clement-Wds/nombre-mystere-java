package nombremystere;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//INITIALISATION
		System.out.println("Bienvenue dan le jeu du NOMBRE MYSTERE !");
		Scanner sc = new Scanner(System.in);
		int choix = 0;
		Jeu j = new Jeu();
		
		//LANCEMENT
		do {
			
			System.out.println("1 : Deviner le nombre mystère");
			System.out.println("2 : Faire deviner à l'ordinateur le nombre mystère");
			System.out.println("3 : Quitter le jeu\n");
			
			choix = sc.nextInt();
			
			
			switch (choix) {
			case 1:
				j.modeJoueur();
				break;
			case 2:
				j.modeOrdinateur();
				break;
			}
			
		}
		while(choix != 3);

		System.out.println("Fin du programme !");
	}

}
