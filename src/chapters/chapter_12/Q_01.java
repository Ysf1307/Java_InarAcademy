package chapters.chapter_12;

public class Q_01 {
    public static void main(String[] args) throws NumberFormatException {

// Exercise 12.1 With Exception Handler

        if (args.length != 3) {
            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(0);
        }
        int result = 0;

        try {
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;
            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        }
        catch (NumberFormatException ex){
            System.out.println("Wrong input " + ex.getMessage().substring(ex.getMessage().indexOf("\"")
                    + 1,ex.getMessage().lastIndexOf("\"")));
        }

    }
}
