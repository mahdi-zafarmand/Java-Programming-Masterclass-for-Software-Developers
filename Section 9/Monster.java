import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

	private String name;
	private int hitPoints, strength;
	
	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public String toString() {
        return "Player{" +"name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
	}
	
	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add(this.name);
		list.add(Integer.toString(this.hitPoints));
		list.add(Integer.toString(this.strength));
		return list;
	}

	@Override
	public void read(List<String> list) {
		// TODO Auto-generated method stub
		if(list != null) {
			if(list.size() > 0) {
				this.name = list.get(0);
				this.hitPoints = Integer.parseInt(list.get(1));
				this.strength = Integer.parseInt(list.get(2));
			}
		}
	}
}
