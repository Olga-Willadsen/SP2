public class PrintedBook extends PhysicalTitle{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages=pages;
    }

    protected double calculatePoints(){
        return 0.0;
    }





}
//class PrintedBook extends PhysicalTitle {
//- int pages
//+ PrintedBook(String title, String literatureType, int copies, int pages)
//# double calculatePoints()
//}