public abstract class Title {

    private String title;
    private String literatureType;
    private double rate;

    public Title(String title, String literatureType){
        this.title=title;
        this.literatureType=literatureType;
    }

    public double calculateRoyalties (){
        return 0.0;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        return 0.0;
    }




}



//class Title {
//-String titles
//-String literatureType
//#double rate
//+Title (String title, String literatureType)
//+ double calculateRoyalty()
//# {abstract} double calculatePoints()
//# double convertLiteratureType()
//}
