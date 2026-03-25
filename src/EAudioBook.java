public class EAudioBook extends NetTitle implements IAudioBook {

    private int durationInMinutes;

    EAudioBook (String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes=durationInMinutes;
    }

    @Override
    public int getDurationsInMinutes() {
        return 0;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes/2.0)*convertLiteratureType()*((getReach()*5)+(getAvailability()*0.5)+getUse());
    }
}

//class EAudioBook extends NetTitle implements IAudioBook {
//- int durationInMinutes
//+ EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes)
//# double calculatePoints()
//}