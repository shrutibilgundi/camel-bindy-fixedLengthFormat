package com.tcs.edi.processor;

import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


/**
 * @author a563121
 * This is a processor which handles any exception occurred in the route.
 */
public class ErrorProcessor implements Processor {

	private static final Logger logger = Logger
			.getLogger(ErrorProcessor.class.getName());
		
	  /* 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 * Logs the cause of the exception and prepares the route for a graceful 
	 * shutdown with a timeout of 30 seconds
	 */
	@Override
	  public void process(Exchange exchange) throws Exception {

		logger.info("inside ErrorPocessor");
	    Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
	    logger.severe("Error has occurred: " + cause);
	    exchange.getContext().getShutdownStrategy().setLogInflightExchangesOnTimeout(false);
	    exchange.getContext().getShutdownStrategy().setTimeout(30);
	    exchange.getContext().stopRoute("bindy");
	   
	  }
	}