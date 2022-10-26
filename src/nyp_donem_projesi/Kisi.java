package nyp_donem_projesi;


public class Kisi {
    //Degiskenler
    private String ad;
    private String soyad;
    private String email;
    private String telefonNumarasi;
    //Constractor metodu
    public Kisi(String ad, String soyad, String email, String telefonNumarasi){
        this.ad=ad;
        this.soyad=soyad;
        this.email=email;
        this.telefonNumarasi=telefonNumarasi;
    }
    //Butun bilgiler icin get ve set metodlari
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getAd(){
        return ad;
    }
    
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getSoyad(){
        return soyad;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    
    public void setTelefonNumarasi(String telefonNumarasi){
        this.telefonNumarasi=telefonNumarasi;
    }
    
    public String getTelefonNumarasi(){
        return telefonNumarasi;
    }
    //toString metodu;
    @Override
    public String toString(){
        return (" Ad: "+ad+"\n Soyad: "+soyad+"\n Email:"+email+"\n Telefon No:"+telefonNumarasi);
    }
}
