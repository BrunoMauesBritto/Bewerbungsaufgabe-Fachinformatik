package gerät;

public class KonkretScanner implements Scanner {

	public String serialunmber;
	
	public KonkretScanner(String serialunmber) {
		super();
		this.serialunmber = serialunmber;
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
}
