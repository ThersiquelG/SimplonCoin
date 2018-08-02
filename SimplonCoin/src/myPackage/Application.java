package myPackage;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//création et inialisation d'une variable "running" de type boolean, initialisée en "true" pour la boucle lors de l'utilisation du programme
		boolean running = true;

		//création d'une instance de Scanner
		Scanner sc = new Scanner(System.in);

		//création d'une instance de la classe enfant "CCourant", héritant des propriétées de la classe parent "Comptes"
		CCourant CourantGreg = new CCourant();
		CourantGreg.setSolde(0);


		//Création d'une deuxième instance de la classe enfant "CCourant", héritant des propriétées de la classe parent "Comptes"
		PEL DummyAccount = new PEL();
		DummyAccount.setID(239324);
		DummyAccount.setNom("Jean-Joseph");
		DummyAccount.setPrenom("Christian");
		DummyAccount.setSolde(100);

		//Instruction pour l'utilisateur
		System.out.println("Bienvenue chez SimplonCoin");
		System.out.println("Veuillez votre nom.");
		String nom = sc.next();
		CourantGreg.setNom(nom);
		System.out.println("Veuillez votre prénom.");
		String prenom = sc.next();
		CourantGreg.setPrenom(prenom);
		//--------------------------
		System.out.println("Bon retour parmi nous Mr." + CourantGreg.getNom() + "  " + CourantGreg.getPrenom());

		while(running) {

			//Choix des opérations
			System.out.println("Quelle(s) opération(s) voulez-vous effectuer ?");
			System.out.println("Veuillez-taper le numéro de l'opération désirée.");
			System.out.println("Consulter mes soldes - 1");
			System.out.println("***");

			System.out.println("Retirer de l'argent - 2");
			System.out.println("***");

			System.out.println("Versement - 3");
			System.out.println("***");

			System.out.println("Déposition d'argent - 4");
			System.out.println("***");

			System.out.println("Se deconnecter - 5");
			System.out.println("***");

			//création d'une variable de type int pour que l'utilisateur puisse sélectionner une opération
			int actions = sc.nextInt();


			//Consultation du solde
			if(actions == 1) {
				System.out.println("----------------------------");
				System.out.println("Vos comptes ont actuellement : " + CourantGreg.getSolde() + " euros.");
				System.out.println("----------------------------");

				//Retrait d'argent
			} else if(actions == 2) {
				System.out.println("Quelle somme souhaitez vous retirer ?");


				//création d'une variable de type double pour indiquer un montant de retrait
				double amount = sc.nextDouble();

				CourantGreg.retrait(CourantGreg, amount);


				//Versement
			} else if(actions == 3) {

				//Instruction pour l'utilisateur
				System.out.println("Vers quels compte(s) souhaitez vous transferer de l'argent ?");
				System.out.println("[1]: " + DummyAccount.getNom() + "  " + DummyAccount.getPrenom() + "  :" + " ID de compte " + DummyAccount.getID());

				//création d'une variable de type int pour que l'utilisateur puisse sélectionner le compte désiré
				int x = sc.nextInt();
				if(x == 1) {
					System.out.println("Quelle somme souhaitez vous envoyer vers ce compte ?");

					//création d'une variable de type double pour indiquer le montant de versement désiré
					double versAmount = sc.nextInt();

					CourantGreg.virement(DummyAccount, versAmount);
				}
			}

			//rajouter du crédit
			else if (actions == 4) {
				System.out.println("De combien voulez vous créditer votre compte ?");
				double credit = sc.nextDouble();

				CourantGreg.crédit(CourantGreg, credit);


				//Log out
			} else if(actions == 5) {
				running = false;
				System.out.println("Au revoir.");
			}


		}
	}


}