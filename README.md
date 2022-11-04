# soapconsumer

Technical Implementation:

1) Use WSDL file and generate the STUB java files in consumer application
2) Create web service template configuration, so that we can access producer application
3) Test using Rest controller.

Things we need to do,

mvn clean install
Test rest controller endpoint, it should fetch the values from SOAP producer application.
access the url http://localhost:8081/empinformation
It should return json response.
