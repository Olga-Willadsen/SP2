public class AudioBook extends PhysicalTitle implements IAudioBook{

    private int durationMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationMinutes=durationInMinutes;
    }

    protected double calculatePoints(){
        return 0.0;
    }


    @Override
    public int getDurationsInMinutes() {
        return 0;
    }
}

//class AudioBook extends PhysicalTitle implements IAudioBook {
//- int durationInMinutes
//+ AudioBook(String title, String literatureType, int copies, int durationInMinutes)
//# double calculatePoints()
//}
