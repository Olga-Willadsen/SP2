public class PrintedBook extends PhysicalTitle{

    private int pages;

    public PrintedBook(String title, Literaturtype literaturType, int copies, int pages){
        super(title, literaturType, copies);
        this.pages=pages;
    }
    @Override
    protected double calculatePoints(){
        return pages*convertLiteratureType()*copies;

        //Sider × litteraturtype × eksemplarer
        //166 × 1,7 × 140 = 39508 point
    }






}
//class PrintedBook extends PhysicalTitle {
//- int pages
//+ PrintedBook(String title, String literatureType, int copies, int pages)
//# double calculatePoints()
//}