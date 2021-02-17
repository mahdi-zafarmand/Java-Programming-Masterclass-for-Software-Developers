
public class Printer {

	private int tonerLevel, pagesPrinted;
	
	private boolean duplex;
	
	public Printer(int _tonerLevel, boolean _duplex) {
		tonerLevel = (_tonerLevel > -1 && _tonerLevel <= 100) ? _tonerLevel : -1;
		duplex = _duplex;
		pagesPrinted = 0;
	}
	
	public int addToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (tonerLevel + tonerAmount > 100) {
				return -1;
			} else {
				tonerLevel += tonerAmount;
				return tonerLevel;
			}
		}
		return -1;
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if (duplex == true) {
			System.out.println("The printer is printing in  duplex mode.");
			pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
		}
		pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(50, true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

	}
}
