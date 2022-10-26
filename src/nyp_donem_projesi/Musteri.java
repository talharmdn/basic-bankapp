package nyp_donem_projesi;

import java.util.ArrayList;
import java.util.Random;


public class Musteri extends Kisi{
    //Degiskenler
    Random rnd = new Random();
    private int musteriNumarasi = rnd.nextInt(1000);
    private ArrayList <BankaHesabi> hesaplar;
    private ArrayList <KrediKarti> krediKartlari;
    //Constractor metodu
    public Musteri(String ad, String soyad, String email, String telefonNumarasi){
        super(ad,soyad,email,telefonNumarasi);
        hesaplar= new ArrayList <BankaHesabi> ();
        krediKartlari= new ArrayList <KrediKarti> ();
        
    }
    //Set ve get metodlari
    public int getMusteriNumarasi(){
        return musteriNumarasi;
    }
    
    public void hesapEkle(int sayi){
        //Eger vadesiz veya yatirim hesabi icin secim olursa diye if ile yapildi
        if(sayi == 0){
            VadesizHesap vd = new VadesizHesap(0);
            hesaplar.add(vd);
        }else{
            YatirimHesabi ytr = new YatirimHesabi(0);
            hesaplar.add(ytr);
        }
    }
    public void hesapSil(BankaHesabi hesap){
        //Eger banka hesabinda para var ise icerideki para yanmamasi icin bir if blogu
        if(hesap.getBakiye() > 0){
            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        }else{
            hesaplar.remove(hesap);
        }
            
    }
    //Diger metodlar
    public void krediKartiEkle(){
        KrediKarti kart = new KrediKarti(5000 , 0);
        krediKartlari.add(kart);
        NYP_Donem_Projesi.butunKartlar.add(kart);
    }
    public void krediKartiSil(KrediKarti kredikarti){
        //Kredi karti borcu olan kisi kredi kartini silmemesi icin yazilan bir if blogu
        if(kredikarti.getGuncelBorc() > 0){
            System.out.println("Lütfen öncelikle borç ödemesi yapınız");
        }else{
            krediKartlari.remove(kredikarti);
            NYP_Donem_Projesi.butunKartlar.remove(kredikarti);
        }
    }
    //toString metodu
    @Override
    public String toString(){
        return (super.toString()+"\n Musteri Numarasi: "+musteriNumarasi+"\n Hesaplar: "+hesaplar+"\n Kredi Kartlari: "+krediKartlari);
    }
}
