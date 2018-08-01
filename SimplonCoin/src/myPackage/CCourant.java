package myPackage;


//Première classe enfant.
public class CCourant extends Comptes {
	
	
	//Retrait                                               --------------------------------------------------------------------------
	
	/*
	 * System.out.println("Quelle somme souhaitez vous retirer ?");
				
				
				//création d'une variable de type double pour indiquer un montant de retrait
				double amount = sc.nextDouble();
				
				//Opération de retrait qui va attribuer une nouvelle valeur avec .setSolde de la classe CourantGreg
				double newsold = CourantGreg.getSolde() - amount ;
				CourantGreg.setSolde(newsold);
				CourantGreg.getSolde();
				//---
				
				//vérification du solde pour pouvoir effectuer l'opération
				if(CourantGreg.getSolde() < 0) {
					System.out.println("Vous n'avez pas assez d'argent.");
				} else {
					System.out.println("Vous avez retirer :" + amount + "euros.");
					System.out.println("----------------------------");
					System.out.println("Il vous reste : " + newsold + "euros.");
					System.out.println("----------------------------");
					running = true;
	 */
		public void retrait(CCourant débité, double montant) {
			
			if (montant > débité.getSolde()) {
				System.out.println("Vous n'avez pas assez d'argent");
			} else {
				
				débité.solde = débité.getSolde() - montant ;
				System.out.println("Vous avez retiré : " + montant + " euros.");
				System.out.println("Il vous reste :" + débité.getSolde() + " euros.");
			}
			
		}
		
		
		
		//Virement                                               --------------------------------------------------------------------------
		
		/*
		 * //vérification du solde pour pouvoir effectuer l'opération
					if(versAmount > CourantGreg.getSolde()) {
						System.out.println("Vous n'avez pas assez d'argent.");
					} else {
						
						//Opération de versement qui va attribuer une nouvelle valeur avec .setSolde de la classe CourantGreg
						CourantGreg.setSolde(CourantGreg.getSolde() - versAmount);
						CourantGreg.getSolde();
						System.out.println("Vous avez envoyer : " + versAmount + " au compte numéro" + DummyAccount.getNom() + "  " + DummyAccount.getPrenom() + "  :" + " ID de compte " + DummyAccount.getID());
						System.out.println("----------------------------");
						System.out.println("Il vous reste :"  + (CourantGreg.getSolde()) + "euros");
						System.out.println("----------------------------");
						double dummySold = versAmount + DummyAccount.getSolde();
						System.out.println("**************************");
						System.out.println("Votre ami a maintenant :" + (DummyAccount.getSolde() + versAmount) + " euros.");
						System.out.println("**************************");
					}
		 */
		
		public void versement(PEL receveur, double montant) {
			if(montant > getSolde()) {
				System.out.println("Vous n'avez pas assez d'argent.");
			} else {
				solde = getSolde() - montant ;
				receveur.solde = receveur.getSolde() + montant;
				
				System.out.println("Vous avez envoyer : " + montant + " euros. " +  "au compte numéro" + receveur.getNom() + "  " + receveur.getPrenom() + "  :" + " ID de compte " + receveur.getID());
				System.out.println("----------------------------");
				System.out.println("Il vous reste :"  + (getSolde()) + "euros");
				System.out.println("----------------------------");
				//double dummySold = versAmount + DummyAccount.getSolde();
				System.out.println("**************************");
				System.out.println("Votre ami a maintenant :" + (receveur.getSolde() + " euros."));
				System.out.println("**************************");
			}
			
			
		}
}
