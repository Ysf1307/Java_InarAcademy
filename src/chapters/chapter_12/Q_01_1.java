package chapters.chapter_12;

public class Q_01_1 {
    public static void main(String[] args) {

        // Exercise 12.1 Without Exception Handler

        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        testDigit(args[0]);
        testDigit(args[2]);
        int result = 0;

        switch (args[1].charAt(0)){
            case '+' : result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            break;
            case '-' : result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*' : result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/' : result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }

    private static void testDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                System.out.println("Wrong input: " + str);
                System.exit(0);
            }
        }
    }
}
