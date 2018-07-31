package myPackage;
import java.util.Scanner;

//Sc�nario d'utilisation d'une appli bancaire avec 500 euros d'avoir disponible.

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cr�ation et inialisation d'une variable "running" de type boolean, initialis�e en "true" pour la boucle lors de l'utilisation du programme
		boolean running = true;
		
		//cr�ation d'une instance de Scanner
		Scanner sc = new Scanner(System.in);
		
		//cr�ation d'une instance de la classe enfant "CCourant", h�ritant des propri�t�es de la classe parent "Comptes"
		CCourant CourantGreg = new CCourant();
		CourantGreg.setSolde(1000);
		
		
		//Cr�ation d'une deuxi�me instance de la classe enfant "CCourant", h�ritant des propri�t�es de la classe parent "Comptes"
		CCourant DummyAccount = new CCourant();
		DummyAccount.setID(239324);
		DummyAccount.setNom("Jean-Joseph");
		DummyAccount.setPrenom("Christian");
		DummyAccount.setSolde(100);

		//Instruction pour l'utilisateur
		System.out.println("Bienvenue chez SimplonCoin");
		System.out.println("Veuillez votre nom.");
		String nom = sc.next();
		CourantGreg.setNom(nom);
		System.out.println("Veuillez votre pr�nom.");
		String prenom = sc.next();
		CourantGreg.setPrenom(prenom);
		//--------------------------
		System.out.println("Bon retour parmi nous Mr." + CourantGreg.getNom() + "  " + CourantGreg.getPrenom());

		while(running) {
			
			//Choix des op�rations
			System.out.println("Quelle(s) op�ration(s) voulez-vous effectuer ?");
			System.out.println("Veuillez-taper le num�ro de l'op�ration d�sir�e.");
			System.out.println("Consulter mes soldes - 1");
			System.out.println("***");

			System.out.println("Retirer de l'argent - 2");
			System.out.println("***");

			System.out.println("Versement - 3");
			System.out.println("***");

			System.out.println("Se deconnecter - 4");
			System.out.println("***");
			
			//cr�ation d'une variable de type int pour que l'utilisateur puisse s�lectionner une op�ration
			int actions = sc.nextInt();


			//Consultation du solde
			if(actions == 1) {
				System.out.println("----------------------------");
				System.out.println("Vos comptes ont actuellement : " + CourantGreg.getSolde() + " euros.");
				System.out.println("----------------------------");

				//Retrait d'argent
			} else if(actions == 2) {
				System.out.println("Quelle somme souhaitez vous retirer ?");
				
				
				//cr�ation d'une variable de type double pour indiquer un montant de retrait
				double amount = sc.nextDouble();
				
				//Op�ration de retrait qui va attribuer une nouvelle valeur avec .setSolde de la classe CourantGreg
				double newsold = CourantGreg.getSolde() - amount ;
				CourantGreg.setSolde(newsold);
				CourantGreg.getSolde();
				//---
				
				//v�rification du solde pour pouvoir effectuer l'op�ration
				if(CourantGreg.getSolde() < 0) {
					System.out.println("Vous n'avez pas assez d'argent.");
				} else {
					System.out.println("Vous avez retirer :" + amount + "euros.");
					System.out.println("----------------------------");
					System.out.println("Il vous reste : " + newsold + "euros.");
					System.out.println("----------------------------");
					running = true;
				}
				
				


				//Versement
			} else if(actions == 3) {
				
				//Instruction pour l'utilisateur
				System.out.println("Vers quels compte(s) souhaitez vous transferer de l'argent ?");
				System.out.println("[1]: " + DummyAccount.getNom() + "  " + DummyAccount.getPrenom() + "  :" + " ID de compte " + DummyAccount.getID());
				
				//cr�ation d'une variable de type int pour que l'utilisateur puisse s�lectionner le compte d�sir�
				int x = sc.nextInt();
				if(x == 1) {
					System.out.println("Quelle somme souhaitez vous envoyer vers ce compte ?");
					
					//cr�ation d'une variable de type double pour indiquer le montant de versement d�sir�
					double versAmount = sc.nextInt();
					
					//v�rification du solde pour pouvoir effectuer l'op�ration
					if(versAmount > CourantGreg.getSolde()) {
						System.out.println("Vous n'avez pas assez d'argent.");
					} else {
						
						//Op�ration de versement qui va attribuer une nouvelle valeur avec .setSolde de la classe CourantGreg
						CourantGreg.setSolde(CourantGreg.getSolde() - versAmount);
						CourantGreg.getSolde();
						System.out.println("Vous avez envoyer : " + versAmount + " au compte num�ro" + DummyAccount.getNom() + "  " + DummyAccount.getPrenom() + "  :" + " ID de compte " + DummyAccount.getID());
						System.out.println("----------------------------");
						System.out.println("Il vous reste :"  + (CourantGreg.getSolde()) + "euros");
						System.out.println("----------------------------");
						double dummySold = versAmount + DummyAccount.getSolde();
						System.out.println("**************************");
						System.out.println("Votre ami a maintenant :" + (DummyAccount.getSolde() + versAmount) + " euros.");
						System.out.println("**************************");
					}
				}


				//Log out
			} else if(actions == 4) {
				running = false;
				System.out.println("Au revoir.");
			}


		}
	}


}


