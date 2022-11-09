package chapters.chapter_09;
import java.util.Scanner;
public class Location {
    public static Scanner input = new Scanner(System.in);
    private int row;
    private int column;
    private double maxValue;
    private double[][] array;

    Location(){
    }
    Location(int row, int column){
        this.row = row;
        this.column = column;
        this.array = new double[row][column];
    }

    public double[][] fillTheArray(double[][] array){
        System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
    public double getMaxValue(double[][] array){
        double maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue){
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }
    public int[] getMaxValueIndice(double[][] array){
        double maxValue = Integer.MIN_VALUE;
        int[] indices = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue){
                    maxValue = array[i][j];
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }
    public String printArray(double[][] array){
        String output = "The location of the largest element is "
                + getMaxValue(array) + " at ( " + getMaxValueIndice(array)[0] + ", " + getMaxValueIndice(array)[1] + " )";
        return output;
    }
}
