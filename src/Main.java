import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> llist1 = new LinkedList<>();

        llist1.add("Red");
        llist1.add("Green");
        llist1.add("Black");
        llist1.add("White");
        llist1.add("Pink");

        //System.out.println(llist1);

        LinkedList<String> llist2 = new LinkedList<>();

        llist2.add("Red");
        llist2.add("Green");
        llist2.add("Black");
        llist2.add("Pink");

        //System.out.println(llist2);

        LinkedList<String> llist = new LinkedList<>();
        llist.addAll(llist1);
        llist.addAll(llist2);

        System.out.println(llist);
    }
}