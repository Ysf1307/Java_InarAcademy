package chapters.chapter_07;

import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        double[] roots = new double[2];

        System.out.println("Enter a, b and c values respectly");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        int numberOfRealRoots = solveQuadratic(eqn, roots);
        double delta = (Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]));

        if (numberOfRealRoots == 2) {
            roots[0] = (-eqn[1] + Math.pow(delta, 0.5) / (2 * eqn[0]));
            roots[1] = (-eqn[1] - Math.pow(delta, 0.5) / (2 * eqn[0]));
            System.out.println("There are 2 roots:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
        else if (numberOfRealRoots == 1) {
            roots[0] = (-eqn[1] + Math.pow(delta, 0.5) / (2 * eqn[0]));
            roots[1] = 0;
            System.out.println("There is 1 root:");
            System.out.println("Root: " + roots[0]);
        } else if (numberOfRealRoots == 0) {
            System.out.println("The equation has no real roots!");
        }
    }
        public static int solveQuadratic ( double[] eqn, double[] roots){
            double delta = (Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]));
            int numberOfRealRoots = 0;

            if (delta > 0) {
                numberOfRealRoots = 2;
            } else if (delta == 0) {
                numberOfRealRoots = 1;
            }
            return numberOfRealRoots;
        }
    }

