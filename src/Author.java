import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList <Title> titles =new ArrayList<>();

    Author (String name){
        this.name=name;
        this.titles=titles;
    }


public void addTitle(Title title){
        titles.add(title);
}
public double calculateRoyalties(){
        return 0.0;
}

public String getName() {
        return name;
    }


}


//class Author {
//-String name
//-ArrayList <Title>titles
//+Author(<string name)
//+void addTitle(Title title)
//+double calculateRoyalties()
//+String getName
//}