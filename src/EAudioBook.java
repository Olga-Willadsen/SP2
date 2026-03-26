public class EAudioBook extends NetTitle implements IAudioBook {

    private int durationInMinutes;

    public EAudioBook (String title, Literaturtype literaturType, int availability, int reach, int use, int durationInMinutes){
        super(title, literaturType, availability, reach, use);
        this.durationInMinutes=durationInMinutes;
    }

    @Override
    public int getDurationsInMinutes() {
        return durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes/2.0)*convertLiteratureType()*(getPseudoCopies());
    }
}

//class EAudioBook extends NetTitle implements IAudioBook {
//- int durationInMinutes
//+ EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes)
//# double calculatePoints()
//}