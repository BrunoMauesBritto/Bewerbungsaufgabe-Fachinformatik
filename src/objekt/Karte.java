package objekt;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Karte {

	private String name;
	private String herkunftland;
	private Integer angriffswert;
	private Integer verteidigungswert;
	private Integer farbeNummer;
	
	public Karte() {	
	}
	
	public Karte(String name, String herkunftland, Integer angriffswert, Integer verteidigungswert, Integer farbeNummer) {
		this.name = name;
		this.herkunftland = herkunftland;
		this.angriffswert = angriffswert;
		this.verteidigungswert = verteidigungswert;
		this.farbeNummer = farbeNummer;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHerkunftland() {
		return herkunftland;
	}

	public void setHerkunftland(String herkunftland) {
		this.herkunftland = herkunftland;
	}

	public Integer getAngriffswert() {
		return angriffswert;
	}

	public void setAngriffswert(Integer angriffswert) {
		this.angriffswert = angriffswert;
	}

	public Integer getverteidigungswert() {
		return verteidigungswert;
	}

	public void setverteidigungswert(Integer verteidigungswert) {
		this.verteidigungswert = verteidigungswert;
	}

	public Integer getFarbeNummer() {
		return farbeNummer;
	}

	public void setFarbeNummer(Integer farbeNummer) {
		this.farbeNummer = farbeNummer;
	}
	

	public static String farbeÜbersetzung(int farbeNummer) {
	
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
			return "Unbekannte Farbe";
		}
	}

	@Override
	public String toString() {
		return "Karte Name: " + name + ", Herkunftland: " + herkunftland + ", Angriffswert: " + angriffswert
				+ ", Verteidigungswert: " + verteidigungswert + ", Farbenummer: " + farbeNummer +  ", Farbe: " + farbeÜbersetzung(farbeNummer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(verteidigungswert, angriffswert, farbeNummer, herkunftland, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Karte other = (Karte) obj;
		return Objects.equals(verteidigungswert, other.verteidigungswert)
				&& Objects.equals(angriffswert, other.angriffswert) && Objects.equals(farbeNummer, other.farbeNummer)
				&& Objects.equals(herkunftland, other.herkunftland) && Objects.equals(name, other.name);
	}
}

