package nyp_donem_projesi;

import java.util.Random;

public class KrediKarti {
    //Degiskenler
    Random rnd = new Random();
    private long kartNumarasi;
    private double limit;
    private double guncelBorc;
    private int kullanilabilirLimit;
    //Constractor metodu
    public KrediKarti(double limit,double guncelBorc){
        this.limit=limit;
        this.guncelBorc=guncelBorc;
        kartNumarasi = rnd.nextInt(1000000000);
    }
    //Get ve Set metodlari
    public long getKartNumarasi(){
        return kartNumarasi;
    }
    public void setLimit(double limit){
        this.limit=limit;
    }
    public double getLimit(){
        return limit;
    }
    
    public void setGuncelBorc(double guncelBorc){
        this.guncelBorc=guncelBorc;
    }
    public double getGuncelBorc(){
        return guncelBorc;
    }
    
    public void setKullanilabilirLimit(int kullanilabilirLimit){
        this.kullanilabilirLimit=kullanilabilirLimit;
    }
    public int getKullanilabilirLimit(){
        return kullanilabilirLimit;
    }
    //toString metodu
    @Override
    public String toString(){
        return (super.toString()+"\n Kart Numarasi: "+kartNumarasi+"\n Limit: "+limit+"\n Guncel Borc: "+guncelBorc+"\n Kullanilabilir Limit: "+kullanilabilirLimit);
    }
}
