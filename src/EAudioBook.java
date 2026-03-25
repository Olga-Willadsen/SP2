public class EAudioBook extends NetTitle implements IAudioBook {

    private int durationInMinutes;

    EAudioBook (String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes=durationInMinutes;
    }

    protected double calculatePointes(){
        return 0.0;
    }


    @Override
    public int getDurationsInMinutes() {
        return 0;
    }

    @Override
    protected double calculatePoints() {
        return 0;
    }
}

//class EAudioBook extends NetTitle implements IAudioBook {
//- int durationInMinutes
//+ EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes)
//# double calculatePoints()
//}