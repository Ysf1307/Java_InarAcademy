package chapters.chapter_12;

public class Q_07 {
    public static void main(String[] args) {
        String bin1 = "1010011";
        String bin2 = "10120011";

        try {
            System.out.println("Binary Number: " + bin1 + " converted to decimal is " + bin2Dec(bin1));
        }
        catch (NumberFormatException ex){
            System.out.println("Exception Caught: " + ex.getMessage());
        }

        try {
            System.out.println("Binary Number: " + bin2 + " converted to decimal is " + bin2Dec(bin2));
        }
        catch (NumberFormatException ex){
            System.out.println("Exception Caught: " + ex.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws NumberFormatException{
        int decimalValue = 0;
        if (!checkBinaryChars(binaryString)){
            throw new NumberFormatException("Binary String contains invalid characters");
        }
        char[] binaryChars = binaryString.toCharArray();

        for (int i = binaryChars.length - 1, binaryIndex = 0; i >= 0; i--, binaryIndex++){
            decimalValue += getBinaryValue(binaryChars[i], binaryIndex);
        }
        return decimalValue;
    }

    public static boolean checkBinaryChars(String binaryString){
        char[] binaryValues = binaryString.toCharArray();
        for (int i = 0; i < binaryValues.length; i++) {
            if (binaryValues[i] != '0' && binaryValues[i] != '1'){
                return false;
            }
        }
        return true;
    }

    public static int getBinaryValue(char binaryChar, int index){
        int weight = (int) Math.pow(2,index);
        if (binaryChar == '1') {
            return weight;
        }
        return '0';
    }
}