package myPackage;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		CCourant CourantGreg = new CCourant();
		
		while(running) {
		//Espace de connexion
		System.out.println("Bienvenue chez SimplonCoin");
		System.out.println("Veuillez taper vos identifiants(nom/prénom) pour vous connecter.");
		String nom = sc.next();
		CourantGreg.setNom(nom);
		String prenom = sc.next();
		CourantGreg.setPrenom(prenom);
		
		System.out.println("Bon retour parmi nous Mr." + CourantGreg.getNom() + "  " + CourantGreg.getPrenom());
		//
		
		System.out.println("Quelle(s) opération(s) voulez-vous effectuer ?");
		System.out.println("Consulter mes soldes - 1");
		System.out.println("***");
		
		System.out.println("Retirer de l'argent - 2");
		System.out.println("***");
		
		System.out.println("Versement - 3");
		System.out.println("***");
		
		System.out.println("Se deconnecter - 4");
		System.out.println("***");
		int actions = sc.nextInt();
		if(actions == 1) {
			System.out.println("Vos comptes ont actuellement : " + CourantGreg.getSolde());
		} else if(actions == 2) {
			
		} else if(actions == 3) {
			
		} else if(actions == 4) {
			running = false;
			System.out.println("Au revoir.");
		}


		}
	}


}


