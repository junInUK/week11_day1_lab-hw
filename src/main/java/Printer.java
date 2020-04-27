public class Printer {

    private int sheetsLeft;
    private int tonerLeft;

    public Printer(int sheets,int toner) {
        this.sheetsLeft = sheets;
        this.tonerLeft = toner;
    }

    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public int getTonerLeft(){
        return this.tonerLeft;
    }

    public void print(int numPages,int numCopies){
        int totalPages = numPages * numCopies;
        if(totalPages <= this.sheetsLeft && this.tonerLeft != 0){
            this.sheetsLeft -= totalPages;
            this.tonerLeft -= 1*totalPages;
        }
    }
}
