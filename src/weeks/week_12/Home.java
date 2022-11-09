package weeks.week_12;

public class Home {
    private double yuzOlcumu;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajiVar;
    private double ucret;
    private double kiraUcreti;
    private String cephesi;
    private int yil;

    public Home(){

    }
    public Home(double yuzOlcumu, int banyoSayisi, int odaSayisi, boolean garajiVar, double ucret, double kiraUcreti, String cephesi, int yil){
        this.yuzOlcumu = yuzOlcumu;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajiVar = garajiVar;
        this.ucret = ucret;
        this.kiraUcreti = kiraUcreti;
        this.cephesi = cephesi;
        this.yil = yil;
    }

    public boolean garajiVarMi() {
        return this.garajiVar;
    }

    public double getKiraUcreti() {
        return this.kiraUcreti;
    }

    public double getUcret() {
        return this.ucret;
    }

    public double getYuzOlcumu() {
        return this.yuzOlcumu;
    }

    public int getBanyoSayisi() {
        return this.banyoSayisi;
    }

    public int getOdaSayisi() {
        return this.odaSayisi;
    }

    public int getYil() {
        return this.yil;
    }

    public String getCephesi() {
        return this.cephesi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public void setCephesi(String cephesi) {
        this.cephesi = cephesi;
    }

    public void setGarajiVar(boolean garajiVar) {
        this.garajiVar = garajiVar;
    }

    public void setKiraUcreti(double kiraUcreti) {
        this.kiraUcreti = kiraUcreti;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void setYuzOlcumu(double yuzOlcumu) {
        this.yuzOlcumu = yuzOlcumu;
    }
    public void print(){
        String output = "";
        output += "Yüzölçümü: " + getYuzOlcumu();
        output += "\nBanyo sayısı: " + getBanyoSayisi();
        output += "\nOda Sayısı: " + getOdaSayisi();
        if (garajiVarMi()){
            output += "\nGarajı Var";
        }else output += "\nGarajı Yok";
        output += "\nÜcreti: " + getUcret();
        output += "\nKira Bedeli: " + getKiraUcreti();
        output += "\nCephesi: " + getCephesi();
        output += "\nYılı: " + getYil();
        System.out.println(output);

    }
}
