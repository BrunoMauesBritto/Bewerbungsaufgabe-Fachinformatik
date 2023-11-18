package anwendung;

import java.util.ArrayList;
import java.util.List;

import gerät.KonkretScanner;
import objekt.Karte;

public class Programm {

	public static void main(String[] args) {

		boolean scannerAn = true;
		KonkretScanner s = new KonkretScanner("2003");

		List<Karte> kartenList = new ArrayList<>();
		
		//Dieser Code scannt die Karten entsprechend der Anzahl der eingelegten Karten.
		/*int kartenAnzahl = 2;

		for (int i = 0; i < kartenAnzahl; i++) {
			String name = "Hansel";
			String herkunftsland = "Deutschland";
			int angriffswert = 300;
			int verteidigungswert = 150;
			int farbNummer = 4;

			kartenList.add(new Karte(name, herkunftsland, angriffswert, verteidigungswert, farbNummer));
		}*/
		
		//Code nach dem vorgegebenen Beispiel erstellt
		kartenList.add(new Karte("Ogeron der Zerströrer", "Ödland von Blorch", 1000, 300, 1));
		kartenList.add(new Karte("Agrina die Drachenreiterin", "Ebenen von Sarbia", 700, 500, 2));
		kartenList.add(new Karte("Gerald der Schöne", "Hochland von Agadirien", 55, 300, 3));

		if (scannerAn) {
			s.processDoc("doc");
			System.out.println("Scan result: " + s.scan());
			holeKartenVonScanner(kartenList);
			System.out.println(ausgabe(kartenList));
		}
	}

	public static void holeKartenVonScanner(List kartenList) {
		kartenList.stream().forEach(System.out::println);
		}

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
			if (kartenList.get(i).getFarbeNummer() == 2){
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
		String roteKarten = Integer.toString(roteKartenAnzahl) + " rote Karten" ;
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
}
