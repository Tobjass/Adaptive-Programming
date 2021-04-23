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
*	prijsPerNacht : int
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
*	geslacht : char
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
Land
* Land(n : String)
* setPark(p : Park) : void
* toString() : String

Park
* Park(n : String, pl : String, pr : String, b : double)
* setFaciliteit(f : Faciliteit) : void
* setHuis(h : Huis) : void
* toString() : String

Faciliteit
* Faciliteit(t : String, n : String)
* toString() : String

Huis
* Huis(t : String, pPN : int, o : int, aS : int, aV : int, ve : boolean, w : boolean, va : boolean, k : boolean, aG : int, aB : int, f : boolean, s : boolean, z : boolean)
* setHuurder(h : Klant) : void
* getHuurder() : String
* toString() : String

Klant
* Klant(n : String, s : String, h : int, p : String, w : String, gb : String, t : String, e : String, gs : char, kP : double)
* getKorting() : double
* toString() : String


## UML klassendiagram
![image](https://user-images.githubusercontent.com/74547189/115900079-d2c66d80-a45f-11eb-80e7-82aa3a4e67a8.png)
