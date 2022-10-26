package nyp_donem_projesi;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi {
    //Degiskenler
    Random rnd = new Random();
    private int personelID = rnd.nextInt(1000);
    private ArrayList <Musteri> musteriler;
    
    //Constractor metodu
    public BankaPersoneli(String ad, String soyad, String email, String telefonNumarasi, int personelID){
        super(ad,soyad,email,telefonNumarasi);
        this.personelID=personelID;
        musteriler= new ArrayList <Musteri> ();
    } 
    
    
       
    //Bu sinifin get ve set metodlari
    public int getPersonelID(){
        return personelID;
    }
    public void setPersonelID(int personelID){
        this.personelID=personelID;
    }
    
    public void musteriEkle(Musteri musteriNumarasi){
        musteriler.add(musteriNumarasi);
    }
    //toString metodu
    @Override
    public String toString(){
        return (super.toString()+"\n Personel ID: "+personelID+"\n Musteriler: "+musteriler);
    }
}
