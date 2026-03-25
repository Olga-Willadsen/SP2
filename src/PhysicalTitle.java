public abstract class PhysicalTitle extends Title{

    protected int copies;

    public PhysicalTitle(String title, String literatureType, int copies){
        super(title, literatureType);
        this.copies=copies;
    }






}


//abstract class PhysicalTitle extends Title {
//# int copies
//+ PhysicalTitle(String title, String literatureType, int copies)
//  }