package myPackage;


//Premi�re classe enfant.
public class CCourant extends Comptes {
	
	
	//Retrait                                               --------------------------------------------------------------------------
	
	/*
	 * System.out.println("Quelle somme souhaitez vous retirer ?");
				
				
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
	 */
		public void retrait(CCourant d�bit�, double montant) {
			
			if (montant > d�bit�.getSolde()) {
				System.out.println("Vous n'avez pas assez d'argent");
			} else {
				
				d�bit�.solde = d�bit�.getSolde() - montant ;
				System.out.println("Vous avez retir� : " + montant + " euros.");
				System.out.println("Il vous reste :" + d�bit�.getSolde() + " euros.");
			}
			
		}
		
		
		
		//Virement                                               --------------------------------------------------------------------------
		
		/*
		 * //v�rification du solde pour pouvoir effectuer l'op�ration
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
		 */
		
		public void versement(PEL receveur, double montant) {
			if(montant > getSolde()) {
				System.out.println("Vous n'avez pas assez d'argent.");
			} else {
				solde = getSolde() - montant ;
				receveur.solde = receveur.getSolde() + montant;
				
				System.out.println("Vous avez envoyer : " + montant + " euros. " +  "au compte num�ro" + receveur.getNom() + "  " + receveur.getPrenom() + "  :" + " ID de compte " + receveur.getID());
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
