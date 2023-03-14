import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
      //  list.add(32); // this line will cause a compilation error
        String s = list.get(0);
        System.out.println(s);
    }
}

