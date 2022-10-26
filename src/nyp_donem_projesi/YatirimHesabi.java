package nyp_donem_projesi;


public class YatirimHesabi extends BankaHesabi{
    private String hesapTuru;
    //Constractor metodu
    public YatirimHesabi(double bakiye){
        super(bakiye);
    }
    //Diger metodlar
    public void paraEkle(double miktar){
        super.setBakiye(super.getBakiye()-miktar);
    }
    public void paraSil(double miktar){
        super.setBakiye(super.getBakiye()+miktar);
    }
    //toString metodu
    @Override
    public String toString(){
        return (super.toString()+"\n Hesap Turu: "+hesapTuru);
    }
}
