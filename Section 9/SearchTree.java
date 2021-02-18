
public class SearchTree implements NodeList{

	private ListItem root;
	
	public SearchTree(ListItem item) {
		this.root = item;
	}
	
	@Override
	public ListItem getRoot() {
		return this.root;
	}
	
	@Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present");
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
		ListItem parentItem = currentItem;
		while(currentItem != null) {
			if(currentItem.compareTo(item) > 0) {
				parentItem = currentItem;
				currentItem = currentItem.previous();
			} else if(currentItem.compareTo(item) < 0) {
				parentItem = currentItem;
				currentItem = currentItem.next();				
			} else {
				this.performRemoval(currentItem, parentItem);
				return true;
			}
		}
		return false;
	}
	
	private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftMostParent == item) {
                item.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }
        }
    }

	
	@Override
	public void traverse(ListItem item) {
		if(item == null) {
			System.out.println("The list is empty");
			return;
		}
		if(item.leftLink != null) {
			traverse(item.leftLink);
		}
		System.out.println(item.getValue());
		if(item.rightLink != null) {
			traverse(item.rightLink);
		}
	}
}
