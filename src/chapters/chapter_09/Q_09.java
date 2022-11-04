package chapters.chapter_09;

public class Q_09 {
    public static void main(String[] args) {

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4 , 5.6, 7.8);

        polygon1.printPolygon();
        System.out.println("-----------");
        polygon2.printPolygon();
        System.out.println("-----------");
        polygon3.printPolygon();
    }
}
