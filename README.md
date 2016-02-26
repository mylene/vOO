# vOO: Voorbeeld Online Ontwikkelstraat - Java / Maven

Elke badge die hier getoond wordt, betreft een stap in de ontwikkelstraat. Sommige stappen worden vaker uitgevoerd.
Waneer je op een badge klikt, ga je naar de betreffende online tool, met de data van dit project.

[![Build Status](https://travis-ci.org/mylene/vOO.svg?branch=master)](https://travis-ci.org/mylene/vOO)
[![codecov.io](https://codecov.io/github/mylene/vOO/coverage.svg?branch=master)](https://codecov.io/github/mylene/vOO?branch=master)
[![Dependency Status](https://www.versioneye.com/user/projects/56cdb9cd6b21e5003d474261/badge.svg?style=flat)](https://www.versioneye.com/user/projects/56cdb9cd6b21e5003d474261)
[![Codacy Badge](https://api.codacy.com/project/badge/grade/e8a7d768196d48739b5b84c7560ece68)](https://www.codacy.com/app/mylenereiners/vOO)
<a href="https://scan.coverity.com/projects/mylene-voo"><img alt="Coverity Scan Build Status" src="https://img.shields.io/coverity/scan/8052.svg"/></a> 

## Basis Ontwikkelstraat:

![Image of Basis Ontwikkelstraat](https://github.com/mylene/vOO/blob/master/vooJava.png)
   
## Ontwikkelstraat onderdelen:    

* IDE (IntelliJ IDEA gebruikt, maar is niet heel relevant (behalve voor .gitignore file :))
* Build tool: [Maven]
* SCM (Source Code Management System): Github
* CI: [TravisCI] - werkt via Github
* Code Coverage: [CodeCov] - werkt via TravisCI
* Code Quality: [Codacy] en [Coverity] - Codacy werkt via Github (wel veel minder snel dan TravisCI), Coverity kan via TravisCI werken, maar ik gebruik hem nu stand-alone, en upload een file.
* Check Dependencies: [VersionEye] - werkt via Github

## Opzet:

* Check of je [Git], [Java] en [Maven] hebt geïnstalleerd (zo niet, doe dat...).
* Creëer een basis Github repository, en clone dat naar je eigen omgeving
* Maak basis Maven project van je git project.    
    De eenvoudigste manier is door een standaard archetype te gebruiken: 
    `mvn archetype:generate -DgroupId=org.mylenereiners -DartifactId=voo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
    (indien gewenst groupId en artifactId aanpassen!)
* Maak een .gitignore file (zie nuttige hulpmiddelen) 
* Check of je test werkt
* Ga naar [TravisCI], log in (kan met je github wachtwoord, dan heb je meteen je repositories bij de hand...), synchronise, zet de betreffende repo "aan", en maak een .travis.yml file aan.
* Push die file naar je Github repo, en vergeet de badge niet toe te voegen aan je readme.
* Op dezelfde manier kun je de andere tools toevoegen. Ik heb eerst coveralls geprobeerd, maar codecov is gewoon sneller en makkelijker.

Momenteel ben ik bezig de code coverage in Codacy aan te zetten, maar dat werkt nog niet. Lokaal kan ik alles draaien, maar hij vindt mijn jacoco file niet vanaf Codacy. De helpdesk is er mee bezig :)

##  Nuttige hulpmiddelen:

* [gitignore.io] - Aanmaken .gitignore file
* [gliffy] - Gebruikt om het plaatje te maken
   
<!--- Links -->
[gitignore.io]: http://gitignore.io/
[TravisCI]: http://travisci.org/
[Git]: http://git-scm.com/
[Java]: http://www.oracle.com/technetwork/java/index.html
[Maven]: http://maven.apache.org/
[CodeCov]: https;//codecov.io/
[Codacy]: https://www.codacy.com/
[Coverity]: https://scan.coverity.com/
[VersionEye]: https://www.versioneye.com/
[gliffy]: https://www.gliffy.com/