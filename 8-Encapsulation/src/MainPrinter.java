public class MainPrinter {
    public static void main(String[] args) {
      Printer printer=new Printer(100,true);
        System.out.println("Toner Level is "+printer.getTonerlevel());
        System.out.println("Initial page count= "+ printer.getNumberofpagesprinted());
        int pagesprinted= printer.printingPage(4);
        System.out.println("Pages printed was "+pagesprinted+" new total print count for printer = "+printer.getNumberofpagesprinted());
        pagesprinted=printer.printingPage(2);
        System.out.println("Pages printed was "+pagesprinted+" new total print count for printer = "+printer.getNumberofpagesprinted());

    }
    }
