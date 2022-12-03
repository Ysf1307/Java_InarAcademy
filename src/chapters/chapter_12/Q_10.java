package chapters.chapter_12;

public class Q_10 {
    public static void main(String[] args) throws Exception{
        try {
            long[] testHeap = new long[50];
            for (int loop = 0; ;loop++){
                testHeap = new long[testHeap.length * 4];
            }
        }
        catch (OutOfMemoryError ex){
            System.out.println(ex);
        }
    }
}
