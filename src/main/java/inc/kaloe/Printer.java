package inc.kaloe;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagePrinted, boolean isDuplex) {
        if (tonerLevel<0){
            this.tonerLevel=0;
        } else {
            this.tonerLevel = tonerLevel;
        }

        if (pagePrinted<0) {
            this.pagePrinted=0;
        } else {
            this.pagePrinted = pagePrinted;
        }

        this.isDuplex = isDuplex;
    }

    public void fillToner (int toner) {
        this.tonerLevel += toner;
        if (this.tonerLevel>100) {
            this.tonerLevel = 100;
        }
    }

    public void print (int pages) {
        if(pages<0) {
            pages = 0;
        }

        if (isDuplex) {
            pages = (pages/2) + (pages%2);
            this.pagePrinted += pages;
        } else {
            this.pagePrinted += pages;
        }

    }
}
