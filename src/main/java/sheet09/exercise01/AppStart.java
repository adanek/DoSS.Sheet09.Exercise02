package main.java.sheet09.exercise01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppStart {

	private static final Logger log  = LogManager.getLogger(AppStart.class);	
	
	public static void main(String[] args) {
		
		log.trace("Entering application.");
		
		Incrementer i = new Incrementer();
		i.increment(3);		
	}
}
