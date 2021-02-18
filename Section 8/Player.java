import java.util.*;

public class Player implements ISaveable{

	private String name, weapon;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	private int hitPoints, strength;
	
	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String toString() {
        return "Player{" +"name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
	}
	
	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add(this.name);
		list.add(Integer.toString(this.hitPoints));
		list.add(Integer.toString(this.strength));
		list.add(this.weapon);
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
				this.weapon = list.get(3);							
			}
		}
	}
}
