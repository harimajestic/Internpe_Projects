package super_keyword;

public class son extends parent {
    String name="BABUUU";

    void display(){
        System.out.println("THE SON NAME " +name);
        System.out.println("THE FATHER NAME " +super.name);

        // this is used to call the display fun of the parent class using super keyword
        super.display();

    }
}
