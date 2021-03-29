package nombremystere;

import java.util.Arrays;
import java.util.Scanner;

public class Jeu {
	
	protected int[] nombreMystere;
	protected int[] saisie;
	
	private int tour;
	private Boolean gagner;
	
	Scanner sc = new Scanner(System.in);
	
	public void modeJoueur() {
		
		nombreMystere = Nombre.getMystere();
		
		while(tour > 0) {
			Nombre.getSaisie(saisie);
			tour -= 1;
			
			if (Arrays.equals(saisie, nombreMystere)) {
				System.out.print("Vous êtes un génie, vous avez trouvé le nombre mystère : ");
				Nombre.afficherNombre(saisie);
				System.out.println("\n");
				gagner = true;
				tour = 0;
			}
			else {
				System.out.print("Votre saisie : ");
				Nombre.afficherNombre(saisie);
				System.out.print(" -> Réponse : ");
				Nombre.afficherReponse(nombreMystere, saisie);
				System.out.println("\n");
			}
		}
		if(tour <= 0 && gagner == false) {
			System.out.print("Dommage, vous avez perdu ! Le nombre mystère est : ");
			Nombre.afficherNombre(nombreMystere);
			System.out.println("\n");
		}
	}
	
	public void modeOrdinateur() {
		
		Nombre.getSaisie(nombreMystere);
		
		while(tour > 0) {
			saisie  = Nombre.getMystere();
			tour -= 1;
			
			if(Arrays.equals(saisie, nombreMystere)) {
				System.out.println("L'Ordinateur est surpuissant, il a trouvé le nombre mystère !");
				Nombre.afficherNombre(saisie);
				System.out.println("\n");
				gagner = true;
				tour = 0;
			}
			else {
				System.out.print("Proposition : ");
				Nombre.afficherNombre(saisie);
				System.out.print(" -> Résultat : ");
				Nombre.afficherReponse(nombreMystere, saisie);
			}
			
		}
		if(tour <= 0 && gagner == false) {
			System.out.println("L'ordinateur n'a pas été capable de deviné votre nombe mystère !");
		}
	}
	
	public Jeu() {
		this.nombreMystere = new int[4];
		this.saisie = new int[4];
		this.tour = 10;
		this.gagner = false;
	}
}
