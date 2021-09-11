import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        parent parent1=new parent();
        child child1= (child) parent1;

    }

}
class parent{
    public parent() {
        System.out.println("parent");
    }
}

class child extends parent{
    public child(){
        System.out.println("child");
    }
}