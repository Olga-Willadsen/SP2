public class EBook extends NetTitle{

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use);
        this.characters=characters;
        this.illustrated=illustrated;
    }

    private double calculatePages(){
        if(illustrated){
        return ((characters/1800.0)+20.0)*1.1;
        } else return ((characters/1800.0)+20.0);
    }

    @Override
    protected double calculatePoints(){
        return calculatePages()*convertLiteratureType()*((getReach()*5)+(getAvailability()*0.5)+getUse());


        //Beregnede sider × litteraturtype × ((udbredelse × 5) + (tilgængelighed × 0,5) + anvendelsesfaktor)
        //220 sider × 1 × ((50 × 5) + (97 × 0,5) + 205) = 110770 point
    }





}

//class EBook extends NetTitle {
//- int characters
//- boolean illustrated
//+ EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated)
//- double calculatePages()
//# double calculatePoints()
//}
