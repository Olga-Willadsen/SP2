public class LibraryRoyaltyCalculator {


    static  Author author1 = new Author("Olga Ravn");
    static Author author2 = new Author("Stephen King");


    public static void main (String[] args){


        setUpLibrary();

        System.out.println(author1.calculateRoyalties());






    }




    static void setUpLibrary (){

        author1.addTitle(new PrintedBook("Mit arbejde", "SKØN", 430, 429));
        author1.addTitle(new AudioBook("De ansatte", "SKØN", 30, 139));
        author1.addTitle(new PrintedBook("Min barsel", "FAG", 5965,168));

        author2.addTitle(new PrintedBook("The Institute", "SKØN", 42000, 496));
        author2.addTitle(new EAudioBook("IT", "SKØN", 95, 50, 22, 13000));
        author2.addTitle(new EBook("Misery", "SKØN", 55, 65, 77, 89543, true));

    }



}
