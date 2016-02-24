# vOO: Voorbeeld Online Ontwikkelstraat

[![Build Status](https://travis-ci.org/mylene/vOO.svg?branch=master)](https://travis-ci.org/mylene/vOO) &nbsp; [![Coverage Status](https://coveralls.io/repos/github/mylene/vOO/badge.svg?branch=master)](https://coveralls.io/github/mylene/vOO?branch=master) &nbsp; [![codecov.io](https://codecov.io/github/mylene/vOO/coverage.svg?branch=master)](https://codecov.io/github/mylene/vOO?branch=master) &nbsp; [![Dependency Status](https://www.versioneye.com/user/projects/56cdb9cd6b21e5003d474261/badge.svg?style=flat)](https://www.versioneye.com/user/projects/56cdb9cd6b21e5003d474261) &nbsp; <a href="https://scan.coverity.com/projects/mylene-voo">
  <img alt="Coverity Scan Build Status"
       src="https://img.shields.io/coverity/scan/8052.svg"/>
</a>

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
* Ga naar [TravisCI], log in (kan met je github wachtwoord, dan heb je meteen je repositories bij de hand...), synchronise, zet de betreffende repo "aan", en maak een .travis.yml file aan.
* Push die file naar je Github repo, en vergeet de badge niet toe te voegen aan je readme.
   
   __TODO: toevoegen coverity, coveralls, versioneye etc.____
   
## Buildstraat onderdelen:    

* IDE (IntelliJ IDEA gebruikt, maar is niet heel relevant (behalve voor .gitignore file :))
* Build tool: [Maven]
* SCM (Source Code Management System): Github
* CI: [TravisCI]



##  Nuttige hulpmiddelen:

* [gitignore.io] - Aanmaken .gitignore file
*   
   
   
   
   
   


<!--- Links -->
[gitignore.io]: http://gitignore.io/
[TravisCI]: http://travisci.org/
[Git]: http://git-scm.com/
[Java]: http://www.oracle.com/technetwork/java/index.html
[Maven]: http://maven.apache.org/
