package chapters.chapter_12;

public class BinaryFormatException extends NumberFormatException{
    public BinaryFormatException(String binaryString){
        System.out.println("Invalid Binary Input: " + binaryString);
    }
}
