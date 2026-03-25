public class AudioBook extends PhysicalTitle implements IAudioBook{

    private int durationMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationMinutes=durationInMinutes;
    }

    protected double calculatePoints(){
        return (durationMinutes*0.5)*convertLiteratureType()*copies;
        //(varighed i minutter × 0.5) × litteraturtype × eksemplarer
        //(192 × 0.5) × 1,7 × 140 = 22848 point
    }


    @Override
    public int getDurationsInMinutes() {
        return durationMinutes;
    }
}

//class AudioBook extends PhysicalTitle implements IAudioBook {
//- int durationInMinutes
//+ AudioBook(String title, String literatureType, int copies, int durationInMinutes)
//# double calculatePoints()
//}
