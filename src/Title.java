public abstract class Title {

    private String title;
    private String literatureType;
    protected static final double RATE= 0.067574;

    public Title(String title, String literatureType){
        this.title=title;
        this.literatureType=literatureType;
    }

    public double calculateRoyalties (){
        return calculatePoints()*RATE;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(){
        double convertedLiteratureType=0.0;
        switch (literatureType) {//“BI”, “TE”, “LYRIK”, “SKØN”, “FAG”
            case "BI":
            case "TE": convertedLiteratureType += 3.0;
                break;
            case "LYRIK":convertedLiteratureType+= 6.0;
                break;
            case "SKØN":convertedLiteratureType += 1.7;
                break;
            case "FAG":convertedLiteratureType += 1.0;
                break;
        }
        return convertedLiteratureType;
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
