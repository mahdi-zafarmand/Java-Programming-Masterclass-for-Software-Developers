
public class MyLinkedList implements NodeList{
	private ListItem root;
	
	public MyLinkedList(ListItem root) {
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem item) {
		if(item == null) {
			return false;
		}
		if(this.root == null) {
			this.root = item;
			return true;
		}
		ListItem currentItem = this.root;
		while(currentItem != null) {
			if(currentItem.compareTo(item) > 0) {
				if(currentItem.previous() == null) {
					currentItem.setPrevious(item);
					item.setNext(currentItem);
					this.root = item;
				} else {
					item.setNext(currentItem);
					item.setPrevious(currentItem.previous());
					currentItem.previous().setNext(item);
					currentItem.setPrevious(item);
				}
				return true;					
			} else if(currentItem.compareTo(item) < 0) {
				if(currentItem.next() == null) {
					currentItem.setNext(item);
					item.setPrevious(currentItem);
					return true;
				} else {
					currentItem = currentItem.next();
				}
			} else {
				System.out.println(item.getValue() + " is already present, not added.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if(this.root == null || item == null) {
			return false;
		}
		ListItem currentItem = this.root;
		while(currentItem.next() != null) {
			if(currentItem.getValue() == item.getValue()) {
				if(currentItem.previous() == null) {
					this.root = currentItem.next();
				} else {
					currentItem.previous().setNext(currentItem.next());
					currentItem.next().setPrevious(currentItem.previous());					
				}
				return true;
			}
			currentItem = currentItem.next();
		}
		if(currentItem.getValue() == item.getValue()) {
			if(currentItem.previous() == null) {
				this.root = null;
				return true;
			}
			currentItem.previous().setNext(null);
			return true;
		}
		return false;
	}

	@Override
	public void traverse(ListItem item) {
		if(item == null) {
			System.out.println("The list is empty");
			return;
		}
		while(item != null) {
			System.out.println(item.getValue());
			item = item.next();
		}
	}
	
//	public static void main(String[] args) {
//		Node root = new Node(53);
//		MyLinkedList ll = new MyLinkedList(root);
//		ll.traverse(root);
//		ll.removeItem(root);
//		System.out.println(ll.getRoot());
//	}
}
