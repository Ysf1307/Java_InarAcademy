package chapters.chapter_08;

public class Q_10 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        matrix = fillMatrix(matrix);
        printList(matrix, findLargestRow(matrix), findLargestColumn(matrix));

    }
    public static int[][] fillMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        return matrix;
    }
    public static int findLargestRow(int[][] matrix){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxValue){
                maxValue = sum;
            }
        }
        return maxValue;
    }
    public static int findLargestColumn(int[][] matrix){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxValue){
                maxValue = sum;
            }
        }
        return maxValue;
    }
    public static void printList(int[][] matrix, int maxRow, int maxColumn){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxColumn);
    }
}
