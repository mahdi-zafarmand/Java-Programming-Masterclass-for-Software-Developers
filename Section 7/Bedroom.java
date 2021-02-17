
public class Bedroom {

	private String name;
	private Wall wall1, wall2, wall3, wall4;
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	
	public Bedroom(String _name, Wall _wall1, Wall _wall2, Wall _wall3, Wall _wall4, Ceiling _ceiling, Bed _bed, Lamp _lamp) {
		name = _name;
		wall1 = _wall1;
		wall2 = _wall2;
		wall3 = _wall3;
		wall4 = _wall4;
		ceiling = _ceiling;
		bed = _bed;
		lamp = _lamp;
	}
	
	public Lamp getLamp() {
		return lamp;
	}
	
	public void makeBed() {
		System.out.println("The bed is beding made.");
		bed.make();
	}
}
