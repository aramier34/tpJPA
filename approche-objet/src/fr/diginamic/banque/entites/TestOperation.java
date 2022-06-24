package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operations= new Operation[4];
		operations[0]=new Credit("20220112",152.56F);
		operations[1]=new Debit("20220215",84.56F);
		operations[2]=new Credit("20220315",845.14F);
		operations[3]=new Debit("20220526",478.15F);
		
		float montant=0;
		
		for (Operation operation : operations) {
			if (operation instanceof Credit) { 
				// pas en rapport avec le TP8
				Credit credit = (Credit) operation;
				credit.methodeSpecifiqueCredit();
			}
			System.out.println(operation.toString());
			if (operation.getType().equals("CREDIT")) {
				montant+=operation.getMontant();
			}else if (operation.getType().equals("DEBIT")){
				montant-=operation.getMontant();
			}else {
				System.err.println("Operation de type inconnu : "+operation.toString());
			}
		}
		System.out.println("Le montant global des opérations est : "+montant+"€");
	}

}
