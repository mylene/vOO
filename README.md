# vOO: Voorbeeld Online Ontwikkelstraat



## Opzet:

* Check of je [Git], [Java] en [Maven] hebt geïnstalleerd (zo niet, doe dat...).

*Onderstaande stappen kun je overslaan als je dit project gebruikt*

* Creëer een basis Github repository, en clone dat naar je eigen omgeving
* Maak basis Maven project van je git project.    
    De eenvoudigste manier is door een standaard archetype te gebruiken: 
    `mvn archetype:generate -DgroupId=org.mylenereiners -DartifactId=voo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
    (indien gewenst groupId en artifactId aanpassen!)
* Maak een .gitignore file (zie nuttige hulpmiddelen) 
* Check of je test werkt
* Ga naar TravisCI.org
   
   
   
## Buildstraat onderdelen:    

* IDE (IntelliJ IDEA gebruikt, maar is niet heel relevant (behalve voor .gitignore file :))
* Build tool: [Maven]
* SCM (Source Code Management System): Github



##  Nuttige hulpmiddelen:

* [gitignore.io] - Aanmaken .gitignore file
*    
   
   
   
   
   


<!--- Links -->
[gitignore.io]: http://gitignore.io/
[Git]: http://git-scm.com/
[Java]: http://www.oracle.com/technetwork/java/index.html
[Maven]: http://maven.apache.org/
