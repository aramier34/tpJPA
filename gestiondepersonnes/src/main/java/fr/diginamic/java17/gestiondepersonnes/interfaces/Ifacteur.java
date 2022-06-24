package fr.diginamic.java17.gestiondepersonnes.interfaces;

public interface Ifacteur {
	
	/**
	 * depuis java 11 on peut mettre un comprtement par defaut dans une interface sans quer la classe qui l'impl�mente la surchage
	 * 
	 * on doit surcharger les m�thodes d'une interface quand elle est impl�ment�e dans une classe impl�ments
	 */
	
	default void trier() {
		System.out.println("je trie par defaut !");
	}
	
	/**
	 * objet distribuer()
	 * doit �tre surcharg�e @override
	 * @return
	 */
	Object distribuer();

}
