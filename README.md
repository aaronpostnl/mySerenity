# mySerenity
Casus voor het testen van webservice middels het BDD framework JBehave

Dit project is een eerste opzet voor het testen van webservices waarbij gebruik gemaakt wordt van het BDD framework JBehave.

Het project maakt gebruik van een SOAPUI project welke via de SOAPUI API wordt aangeroepen om de project properties van waarden te voorzien

Het voorbeeld toont hoe middels geparamteriseerde JBehave stories testen uitgevoerd kunnen worden. 
De serenity component zorgt voor de testrapportage. In de rapportage wordt de link tussen de requirements (storie / scenario) en de testgevallen weergegeven.

Om de testen succesvol uit te kunnen voeren moet de Parabank applicatie lokaal uitgeoverd worden op http://localhost:8080/ParaBank

De testen uit het project kunnen worden uitgevoerd door een nieuwe maven 'run' configuratie aan te maken in IntelliJ met de volgende commandline opties:

clean verify -Dtest=AcceptanceTestSuite -Dmaven.test.failure.ignore=true
