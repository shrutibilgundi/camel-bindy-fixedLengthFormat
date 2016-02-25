package com.tcs.edi.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.tcs.edi.model.header.HeaderRecord;
import com.tcs.edi.model.stop.StopRecord;


/**
 * @author a563121
 * This is the second processor class in the camel route. After the fixed length 
 * record of the input flat file is binded to the model class, this processor class
 * type casts the body of the exchange object to appropriate model class and adds
 * them to a Array list.
 * 
 */
public class EDIProcessor implements Processor {

	private static final Logger logger = Logger
			.getLogger(EDIProcessor.class.getName());
	
	List<Object> listOfMappedObjs = new ArrayList<Object>();
	
	/* 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 * This method gets the property ‘RecordType’ from the exchange object and 
	 * type casts the body of the exchange object to appropriate model class and 
	 * adds them to a Array List
	 */
	public void process(Exchange exchange) throws Exception {
		
				logger.info("Start EDIProcessor : process()");
				int recordType = (int) exchange.getProperty("RecordType");
				//Type cast the exchange object to the expected POJO class which is determined by the RecordType
				if(recordType == 01) {
					HeaderRecord headerObj = (HeaderRecord) exchange.getIn().getBody();
					listOfMappedObjs.add(headerObj);
				} else if(recordType ==02) {
					StopRecord stopObj = (StopRecord) exchange.getIn().getBody();
					listOfMappedObjs.add(stopObj);
			}	
			logger.info("list size "+ listOfMappedObjs.size());
			logger.info("End EDIProcessor : process()");
		}

}
