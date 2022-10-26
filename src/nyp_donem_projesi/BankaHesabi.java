package nyp_donem_projesi;

import java.util.Random;

public class BankaHesabi {
    //Degiskenler
    Random rnd = new Random();
    private int iban;
    private double bakiye;
    //Constractor metodu
    public BankaHesabi(double bakiye ){
        this.bakiye=bakiye;
        iban = rnd.nextInt(1000000000);
    }
    //Get ve Set metodlari
    public int getIban(){
        return iban;
    }
    
    public void setBakiye(double bakiye){
        this.bakiye=bakiye;
    }
    public double getBakiye(){
        return bakiye;
    }
    //toString metodu
    @Override
    public String toString(){
        return (super.toString()+"\n IBAN: "+iban+"\n Bakiye: "+bakiye);
    }
}
