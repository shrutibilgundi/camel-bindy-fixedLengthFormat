package com.tcs.edi.processor;

import java.util.logging.Logger;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author a563121
 * This is the first processor class in the route. This class gets the first line of
 * the input file which is the set in the body of the exchange object. Part of the data
 * provided by the record is used to identify the type of the record. This data is set
 * as property of the exchange object which is utilized by the camel route to choose
 * appropriate model object for unmarshalling.
 *
 */
public class RouteProcessor implements Processor {

	private static final Logger logger = Logger
			.getLogger(RouteProcessor.class.getName());
	
	/* 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 * This method gets the body of the exchange object as a string. 
	 * If the string is empty, then an exception is thrown. Otherwise the 
	 * record type is fetched and set it into the outbound exchange object 
	 * as a property ‘RecordType’
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
			logger.info("Start RouteProcessor : process()");
			//converting the body of the exchange object to string
			String record = exchange.getIn().getBody().toString();
			if(record.trim().equals("")) {
				throw new Exception("The file does not contain any data");
			}
			//recordType determines the type of the record i.e., header record or stop record)
			int recordType = Integer.parseInt(record.substring(32, 34));
			if(recordType == 01) {
				exchange.setProperty("RecordType", 01);
			} else if (recordType == 02) {
				exchange.setProperty("RecordType", 02);
			}
			exchange.setOut(exchange.getIn());
			logger.info("End RouteProcessor : process()");
		
	}
}
