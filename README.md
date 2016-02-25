
The processing flow for this project goes as below:
1.	A route called ‘bindy’ is created in the Camel-context.xml with the consumer endpoint ‘File’ and producer endpoint ‘Bean’.
2.	The route polls for the input directory ‘C:/test_bindy’ for the input file.
3.	Once the input file is added to the directory ‘C:/test_bindy’, RouteProcessor is invoked.
4.	RouteProcessor identifies the RecordType by extracting the data from 33rd to 35th position. If ‘01’ is retrieved then it is a header record and if ’02’ is retrieved then it is a stop record. This record type is set as a property in the outbound exchange object.
5.	Based on the record type the record is unmarshalled to either a HeaderRecord or a StopRecord.
6.	These records are expected to be of length 1000 and mapped to appropriate data field based on the position and length mentioned in HeaderRecord and StopRecord VO’s.
7.	These unmarshalled objects are added to a Array List for further processing in EdiProcessor.
