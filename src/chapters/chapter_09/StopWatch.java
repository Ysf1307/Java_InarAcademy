package chapters.chapter_09;

public class StopWatch {

    private static long startTime = System.currentTimeMillis();
    private static long endTime = System.currentTimeMillis();

    public static void start(){
        startTime = System.currentTimeMillis();
    }
    public static void end(){
        endTime = System.currentTimeMillis();
    }
    public static long getElapsedTime(){
        return endTime - startTime;
    }
}
