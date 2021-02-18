
public abstract class ListItem {
	protected ListItem rightLink, leftLink;
	protected Object value;
	
	public ListItem(Object obj) {
		this.value = obj;
		this.rightLink = null;
		this.leftLink = null;
	}

	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	abstract int compareTo(ListItem item);
	
	public Object getValue() {
		return this.value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
}
