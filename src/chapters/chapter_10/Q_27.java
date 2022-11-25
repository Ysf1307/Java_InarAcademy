package chapters.chapter_10;

public class Q_27 {
    public static void main(String[] args) {

        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("Yusuf");

        System.out.println(myStringBuilder1.toString());
        myStringBuilder1.append(new MyStringBuilder1(" Ertürk "));
        System.out.println(myStringBuilder1.toString());
        myStringBuilder1.append(5107);
        System.out.println(myStringBuilder1.toString());
        System.out.println("Length: " + myStringBuilder1.length());
        System.out.println("charAt: " + myStringBuilder1.charAt(3));
        myStringBuilder1 = myStringBuilder1.toLowerCase();
        System.out.println("toLowerCase: " + myStringBuilder1.toString());
        System.out.println("subString: " + myStringBuilder1.subString(2,5).toString());

    }
}
