import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList <Title> titles;

    Author (String name){
        this.name=name;
        titles=new ArrayList<>();
    }


public void addTitle(Title title){
        titles.add(title);
}
public double calculateRoyalties(){
       double total=0.0;
        for (Title t:titles){
            total+=t.calculateRoyalties();
       }
        return Math.round(total*100.0)/100.0;
        //gennemløb arraylist og læg alle royalties sammen
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