public class Printer {
    private int tonerlevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerlevel,  boolean duplex) {
        if(tonerlevel>=0 && tonerlevel <=100) {
            this.tonerlevel = tonerlevel;
        }
        else{
            this.tonerlevel=-1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerlevel>0 && tonerlevel <100){
            if(this.tonerlevel + tonerAmount < 100){
                this.tonerlevel += tonerAmount;
            }
        else {
                return -1;
            }
        }
        return this.tonerlevel;
    }
    public int Printpages(int pages){
        int PagestoPrint = pages;
        if(this.duplex){
            PagestoPrint = (pages/2) + (pages%2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += PagestoPrint;
        return PagestoPrint;
    }

    public int getTonerlevel() {
        return tonerlevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
