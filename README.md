# Bewerbungsaufgabe-Fachinformatik

Hiermit lege ich die Dokumentation über den Code vor, der gemäß den Anweisungen in dem Dokument "BewerbungsaufgabeFachinformatik" entwickelt wurde.

## 1. Programm

Beim Start des Programms wird der Scanner gestartet, eine Instanz der Klasse Scanner instanziert und die Liste der Karten erstellt.

```
    boolean scannerAn = true;
		KonkretScanner s = new KonkretScanner("2003");

		List<Karte> kartenList = new ArrayList<>();
```

Mit dem folgenden Code können Sie die Kartendaten entsprechend einer bestimmten Anzahl von in den Scanner eingelegten Karten scannen. Die Informationen für jede Karte werden in der Karteklasse gespeichert und organisiert und direkt in die Liste der Karten aufgenommen.

```
    int kartenAnzahl = 2;
		for (int i = 0; i < kartenAnzahl; i++) {
			String name = "Hansel";
			String herkunftsland = "Deutschland";
			int angriffswert = 300;
			int verteidigungswert = 150;
			int farbeNummer = 4;

			kartenList.add(new Karte(name, herkunftsland, angriffswert, verteidigungswert, farbNummer));
		}
```

## 2. Scanner Inteface und KonkretScanner

Die Klasse Konkretscanner wurde erstellt, um die Methoden der "Scannerinterface" zu implementieren. Obwohl sie in der Übung nicht benötigt wurde, hielt ich es für eine gute Idee, diese Klasse hinzuzufügen, um das Programm mit Hilfe der objektorientierten Programmierung der Realität näher zu bringen. Das Scannerinterface enthält die Methoden, die von der Scannerklasse implementiert werden sollen. Die Verwendung dieser Interface macht das Hinzufügen, Entfernen und Ändern von Methoden einfacher und leichter.


## 3. Karte Klasse

Die Klasse Karte folgt den OOP-Standards, mit Konstruktoren, Getters/Setters, gekapselten Attributen und der für die Übung  erforderlichen Methode "farbeÜbersetzung".


## Aufgabe 1

Die Methode "farbeÜbersetzung" ist in der Kartenklasse zu finden. Diese Methode verwendet die Map-Klasse, um eine Nummer entsprechend ihrem Namen zu konvertieren. Die Klasse Map verwendet das Key- und Value-Modell <FarbeNummer, FarbeName>. Wenn die eingegebene Zahl unbekannt ist, gibt die Methode die Mitteilung "Unbekannte Farb" zurück.

```
public static String farbeÜbersetzung(int farbNummer) {
	
		if (farbeNummer >= 1 && farbeNummer <= 5) {
		Map<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "Grün");
		myMap.put(2, "Rot");
		myMap.put(3, "Weiss");
		myMap.put(4, "Schwarz");
		myMap.put(5, "Blau");
		
		return myMap.get(farbeNummer);
		}
		else {
			return "Unbekannte Farb";
		}
	}
 ```

## Aufgabe 2

Die Funktion "ausgabe" liefert eine Liste von Strings mit dem Namen und der Anzahl jeder Karte nach Farbe. Diese Funktion prüft die Nummer einer Karte und speichert sie in einer von 5 Variablen entsprechend den für jede Variable definierten Parametern.

```
public static List ausgabe(List<Karte> kartenList) {

		List<String> farben = new ArrayList<String>();
		int grüneKartenAnzahl = 0;
		int roteKartenAnzahl = 0;
		int weisseKartenAnzahl = 0;
		int scharzweKartenAnzahl = 0;
		int blaueKartenAnzahl = 0;

		for (int i = 0; i < kartenList.size(); i++) {
			if (kartenList.get(i).getFarbeNummer() == 1) {
				grüneKartenAnzahl += 1;
			}
			if (kartenList.get(i).getFarbeNummer() == 2) {
				roteKartenAnzahl += 1;
			}
			if (kartenList.get(i).getFarbeNummer() == 3) {
				weisseKartenAnzahl += 1;
			}
			if (kartenList.get(i).getFarbeNummer() == 4) {
				scharzweKartenAnzahl += 1;
			}
			if (kartenList.get(i).getFarbeNummer() == 5) {
				blaueKartenAnzahl += 1;
			}
		}
		String grüneKarten = Integer.toString(grüneKartenAnzahl) + " grüne Karten";
		String roteKarten = Integer.toString(roteKartenAnzahl) + " rote Karten";
		String weisseKarten = Integer.toString(weisseKartenAnzahl) + " weisse Karten";
		String schwarzeKarten = Integer.toString(scharzweKartenAnzahl) + " schwarze Karten";
		String blaueKarten = Integer.toString(blaueKartenAnzahl) + " blaue Karten";

		farben.add(grüneKarten);
		farben.add(roteKarten);
		farben.add(weisseKarten);
		farben.add(schwarzeKarten);
		farben.add(blaueKarten);
		return farben;
	}
```

## Aufgabe 3

Die Funktion "holeKartenVonScanner" ist ein Stream von der List KartenList, der die Liste der Karten mit allen Informationen auf der Konsole anzeigt.

```
public static void holeKartenVonScanner(List kartenList) {
		kartenList.stream().forEach(System.out::println);
	}
```

Die in der Klasse karte enthaltene Funktion "toString" zeigt alle Attribute der Klasse in geordneter Weise an. Die Funktion ruft auch die Methode "farbeÜbersetzung" auf, um die Farbe der Karte anzuzeigen.

```
@Override
	public String toString() {
		return "Karte Name: " + name + ", Herkunftland: " + herkunftland + ", Angriffswert: " + angriffswert
				+ ", Verteidigungswert: " + verteidigungswert + ", Farbenummer: " + farbeNummer +  ", Farbe: " + farbeÜbersetzung(farbeNummer);
	}
```
