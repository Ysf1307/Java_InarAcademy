package chapters.chapter_09;

public class Stock {
    String symbol;
    String name;
    public static double previousClosingPrice;
    public static double currentPrice;

    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
