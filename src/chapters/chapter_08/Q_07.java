package chapters.chapter_08;

public class Q_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        double distance = 0;
        int a = -1;
        double nearestDistance = Integer.MAX_VALUE;

        for (int i = 0; i < points.length - 1; i++) {
            double x1 = points[i][0];
            double y1 = points[i][1];
            double z1 = points[i][2];
            double x2 = points[i+1][0];
            double y2 = points[i+1][1];
            double z2 = points[i+1][2];
            distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
            if (distance < nearestDistance){
                nearestDistance = distance;
                a = i;
            }
        }
        System.out.println("The nearest distance is " + nearestDistance + " between points " + a + " and " + (a+1));
    }
}
