public abstract class NetTitle extends Title {

    private int availability;
    private int reach;
    private int use;

    public NetTitle (String title, Literaturtype literaturType, int availability, int reach, int use){
        super(title, literaturType);
        this.availability=availability;
        this.reach=reach;
        this.use=use;
    }

    protected double getPseudoCopies(){
        return (getReach()*5)+(getAvailability()*0.5)+getUse();
    }
    private int getUseFactor(){
        return 0;
    }


    public int getAvailability() {
        return availability;
        //(availability): antal kommuner, der har bogen til udlån
    }

    public int getReach() {
        return reach;
        //(reach): antal kommuner, der har udlånt bogen
    }

    public int getUse() {
        return use;
        //(use): antal udlån
        //altid højere eller samme som availability
    }
}

//abstract class NetTitle extends Title {
//- int availability
//- int reach
//- int use
//+ NetTitle(String title, String literatureType, int availability, int reach, int use)
//# double getPseudoCopies()
//- int getUseFactor()
//  }