package chapters.chapter_12;

public class Q_09 {
    public static void main(String[] args) {
        String binaryValue1 = "1010011";
        String binaryValue2 = "1010211";

        try {
            System.out.println("Binary Number " + binaryValue1 + " converted to decimal: " + bin2Dec(binaryValue1));
            System.out.println("Binary Number " + binaryValue1 + " converted to decimal: " + bin2Dec(binaryValue1));
        }
        catch (NumberFormatException ex){
            System.out.println(ex);
        }
    }
    public static int bin2Dec(String binaryString){
        int decimalValue = 0;
        if (!checkBinaryChars(binaryString)){
            throw new BinaryFormatException(binaryString);
        }
        char[] binaryChars = binaryString.toCharArray();
        for (int i = binaryChars.length - 1, binaryIndex = 0; i >= 0; i--, binaryIndex++){
            decimalValue += getBinaryValue(binaryChars[i], binaryIndex);
        }
        return decimalValue;
    }
    public static boolean checkBinaryChars(String binaryString){
        char[] chars = binaryString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' || chars[i] != '1'){
                return false;
            }
        }
        return true;
    }
    public static int getBinaryValue(char binaryChar, int index){
        int weight = (int) Math.pow(2,index);
        if (binaryChar == '1'){
            return weight;
        }
        return 0;
    }
}
