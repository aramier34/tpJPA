package projetlogger01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppSL4J {
	public static final Logger log = 
			LoggerFactory.getLogger(AppSL4J.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("HELLO !");

	}

}
