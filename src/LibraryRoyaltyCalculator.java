public class LibraryRoyaltyCalculator {


    static  Author author1 = new Author("Olga Ravn");
    static Author author2 = new Author("Stephen King");


    public static void main (String[] args){


        setUpLibrary();

        System.out.println(author1.getName()+": "+author1.calculateRoyalties()+"kr.");






    }




    static void setUpLibrary (){

        author1.addTitle(new PrintedBook("Mit arbejde", Literaturtype.SKON, 430,429));
        author1.addTitle(new AudioBook("De ansatte", Literaturtype.SKON, 30, 139));
        author1.addTitle(new PrintedBook("Min barsel", Literaturtype.FAG, 5965,168));

        author2.addTitle(new PrintedBook("The Institute", Literaturtype.SKON, 42000, 496));
        author2.addTitle(new EAudioBook("IT", Literaturtype.SKON, 95, 50, 22, 13000));
        author2.addTitle(new EBook("Misery", Literaturtype.SKON, 55, 65, 77, 89543, true));

    }



}
