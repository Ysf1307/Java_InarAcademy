package chapters.chapter_10;

public class MyCharacter {
    private char ch;


    public MyCharacter(){

    }
    public MyCharacter(char ch){
        this.ch = ch;
    }


    public static int valueOf(char c){
        return (int) c;
    }
    public static MyCharacter valueOf(int i){
        return new MyCharacter((char) i);
    }
    public char charValue() {
        return ch;
    }
    public static boolean isLowerCase(char ch){
        return ((int)ch) > 96 && ((int)ch) < 123;
    }
    public static boolean isDigit(char ch){
        return ((int)ch) > 47 && ((int)ch) < 58;
    }
    public static boolean isUpperCase(char ch){
        return ((int)ch) > 64 && ((int)ch) < 91;
    }
    public static boolean isLetter(char ch){
        return ((int)ch) > 64 && ((int)ch) < 123;
    }
    public static boolean isLetterOrDigit(char ch){
        return isLetter(ch) || isDigit(ch);
    }
    public static char toLowerCase(char ch){
        return Character.toLowerCase(ch);
    }
    public static char toUpperCase(char ch){
        return Character.toUpperCase(ch);
    }
    public static int compare(char a, char b){
        return a - b;
    }
}