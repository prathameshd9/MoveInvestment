To compile and deploy the MoveInvestment service as a SOAP-based web service
------------------------------------------------------------------------

==> Server side commands:

	Make sure you compile both the webservice classes and server classes to "classes" folder
	
	--> javac -d classes src/move/*.java
	
	--> /opt/jboss/bin/wsprovide.sh -c classes -w move.MoveInvestment
	
	-->	Create webapp/WEB-INF/web.xml
	
	--> mv classes/move webapp/WEB-INF/classes
	
	--> cd webapp
		jar cvf ../Prathamesh_Dhanawade_move.war .
		
	-->deploy server
		install -m 644 Prathamesh_Dhanawade_move.war  /opt/wildfly-10.1.0.Final/standalone/deployments
	
	
==> Clint side commands:
	

1. Generate the client stubs:

   --> /opt/jboss/bin/wsconsume.sh -k 'http://uml.cs.uga.edu:8080/Prathamesh_Dhanawade_move/MoveInvestment?wsdl'
		

   By default, the generated and compiled classes are 
   placed in the directory output (it may be changed by providing a
   suitable option to wsconsume.sh).

2. Compile the client (you must provide the path to the generated 
   client stubs):

   --> javac -cp classes -d classes src/*.java

3. Run the client:

   --> java -cp classes:output MoveInvestmentClient