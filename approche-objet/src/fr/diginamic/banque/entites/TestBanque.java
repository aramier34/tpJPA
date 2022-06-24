package fr.diginamic.banque.entites;



public class TestBanque {

 

    public static void main(String[] args) {
        
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(1456987, 10000.45F);
        comptes[1] = new CompteTaux(5487964, 150.25F, 1.2F);
        
        for (Compte compte : comptes) {
            System.out.println(compte.toString());
        }
            
    }

 

}