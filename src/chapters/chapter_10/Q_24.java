package chapters.chapter_10;

public class Q_24 {
    public static void main(String[] args) {


        System.out.println("valueOf(char): " + MyCharacter.valueOf('Y'));
        System.out.println("valueOf(int): " + MyCharacter.valueOf(99).charValue());
        System.out.println("isLowerCase: " + MyCharacter.isLowerCase('s'));
        System.out.println("isDigit: " + MyCharacter.isDigit('7'));
        System.out.println("isUpperCase: " + MyCharacter.isUpperCase('S'));
        System.out.println("isLetter: " + MyCharacter.isLetter('-'));
        System.out.println("isLetterOrDigit: " + MyCharacter.isLetterOrDigit('7'));
        System.out.println("toLowerCase: " + MyCharacter.toLowerCase('R'));
        System.out.println("toUpperCase: " + MyCharacter.toUpperCase('f'));
        System.out.println("compare: " + MyCharacter.compare('f', 'R'));
    }
}
