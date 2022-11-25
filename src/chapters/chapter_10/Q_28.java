package chapters.chapter_10;

public class Q_28 {
    public static void main(String[] args) {

        String name = "Yusuf";
        String surname = " Ertürk";
        MyStringBuilder2 str1 = new MyStringBuilder2(name);
        MyStringBuilder2 str2 = new MyStringBuilder2(surname);

        System.out.println(str1.toString());
        System.out.println(str2.toString());
        MyStringBuilder2 str3 = str1.insert(5,str2);
        System.out.println(str3.toString());
        MyStringBuilder2 str4 = str1.reverse();
        System.out.println(str3.toString());
        MyStringBuilder2 str5 = str1.substring(2);
        System.out.println(str5.toString());
        MyStringBuilder2 str6 = str1.toUpperCase();
        System.out.println(str6.toString());
    }
}
