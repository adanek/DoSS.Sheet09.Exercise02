package main.java.sheet09.exercise01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Incrementer implements IIncrementer {
	
	private static final Logger logger = LogManager.getLogger(Incrementer.class.getName());
	
	@Override
	public int increment(int value) {		
		
		logger.info(String.format("Incrementing %d to %d", value, value + 1));
		
		return ++value;
	}

}
