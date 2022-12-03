package chapters.chapter_12;

public class Q_08 {
    public static void main(String[] args) {
        String hex1 = "A7C9";
        String hex2 = "A7CZ";

        System.out.println("Decimal value of " + hex1 + " : " + hexToDecimal(hex1));
        System.out.println("Decimal value of " + hex2 + " : " + hexToDecimal(hex2));
    }
    public static int hexToDecimal(String hex){
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (checkHexChar(hexChar)){
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } else throw new HexFormatException(hex);
        }
        return decimalValue;
    }
    public static boolean checkHexChar(char ch){
        return ch >= '0' && ch <= 'F';
    }
    public static int hexCharToDecimal(char ch){
        if (ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        } else return ch - '0';
    }
}
