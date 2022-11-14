package chapters.chapter_10;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    public boolean isEven(){
        if (value % 2 == 0){
            return true;
        }else return false;
    }
    public boolean isOdd(){
        if (value % 2 != 0){
            return true;
        }else return false;
    }
    public boolean isPrime(){
        for (int i = 2; i < value; i++) {
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int a){
        if (a % 2 == 0){
            return true;
        }else return false;
    }
    public static boolean isOdd(int a){
        if (a % 2 != 0){
            return true;
        }else return false;
    }
    public static boolean isPrime(int a){
        for (int i = 2; i < a; i++) {
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger b){
        return b.isEven();
    }
    public static boolean isOdd(MyInteger b){
        return b.isOdd();
    }
    public static boolean isPrime(MyInteger b){
        return b.isPrime();
    }
    public boolean equals(int a) {
        return (value == a);
    }
    public boolean equals(MyInteger b) {
        return (b.equals(value));
    }
    public static int parseInt(char[] chars){
        int result = 0;
        String str = String.valueOf(chars);

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }
}
