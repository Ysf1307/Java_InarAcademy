package chapters.chapter_11;

import java.util.ArrayList;
import java.util.Date;

public class Q_06 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new String("Yusuf"));
        list.add(new Circle());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
