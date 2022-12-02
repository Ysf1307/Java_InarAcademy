package chapters.chapter_12;

public class Hex2Dec {

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (checkHexChar(hexChar)) {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } else throw new NumberFormatException(hex);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else { // ch is '0', '1', ..., or '9'
            return ch - '0';
        }
    }

    static boolean checkHexChar(char ch) {
        return ch >= '0' && ch <= 'F';
    }
}
