# Domain Design

## Inhoud
* [Tekstueel](#Tekstueel)
* [Domeinklassen](#Domeinklassen)
* [Overzicht variabelen en types](#Overzicht-variabelen-en-types)
* [Relaties](#Relaties)
* [Methoden](#Methoden)
* [UML klassendiagram](#UML-klassendiagram)

## Tekstueel
“De applicatie moet voor Nederland overzicht geven van de faciliteiten en huizen van een park, en welke klant welk huis gehuurd heeft.


## Domeinklassen
*	Land
*	Park
*	Faciliteit
*	Huis
*	Klant

 
## Overzicht variabelen en types
Land
* naam : String

Park
* naam : String
* plaats : String
*	provincie : String
*	beoordeling : double

Faciliteit
*	type : String
*	naam : String

Huis
*	type : String
*	prijsPerNacht : double
*	oppervlakte : int
*	aantalSlaapkamers : int
*	aantalVerdiepingen : int
*	verwarming : boolean
*	wifi : boolean
*	vaatwasser: boolean
*	koffiemachine: boolean
* aantalGaspitten : int
*	aantalBadkamers : int
*	föhn : boolean
*	sauna : boolean
*	zonnebank : boolean

Klant
*	naam : String
*	straat : String
*	huisnummer : int
*	postcode : String
*	woonplaats : String
*	geboortedatum : String
*	telefoonnummer : int
*	e-mailadres: String
*	manOfVrouw : String
*	kortingsPercentage : double

 
## Relaties
-	Land <-> Park 
1.	Een land heeft één of meer parken
2.	Een park hoort altijd bij één land
-	Park <-> Faciliteit
1.	Een park heeft nul of meer faciliteiten
2.	Een faciliteit hoort altijd bij één park
-	Park <-> Huis
1.	Een park heeft één of meer huizen
2.	Een huis hoort altijd bij één park
-	Park <-> Klant
1.	Een park heeft nul of meer klanten
2.	Een klant hoort altijd bij één of meer parken
-	Huis <-> Klant
1.	Een huis heeft nul of één klant
2.	Een klant hoort altijd bij nul of één huis

## Methoden


## UML klassendiagram
![image](https://user-images.githubusercontent.com/74547189/115883951-a7875280-a44e-11eb-92c0-cf4779229218.png)
