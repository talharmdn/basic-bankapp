package nyp_donem_projesi;


public class VadesizHesap extends BankaHesabi{
    private String hesapTuru;
    //Constractor metodu
    public VadesizHesap(double bakiye){
        super(bakiye);
    }
    //Eger transfer edilecek miktar kadar bakiye olmazsa para transferi olmaz
    public void paraTransferi(BankaHesabi aliciHesap, BankaHesabi gonderenHesap, double miktar){
        if(gonderenHesap.getBakiye() > miktar){
            gonderenHesap.setBakiye(gonderenHesap.getBakiye()-miktar);
            aliciHesap.setBakiye(aliciHesap.getBakiye()+miktar);
        }else{
            System.out.println("Istediginiz miktari gonderecek bakiyeniz yok");
        }
    }
    //Eger kisinin 1den fazla kredi karti varsa o numaradaki kredi kartinin borcunu oder
    public void krediKartiBorcOdeme(int kartNumarasi ,int miktar){
        for(int i=0;i<NYP_Donem_Projesi.butunKartlar.size();i++){
            if(NYP_Donem_Projesi.butunKartlar.get(i).getKartNumarasi() == kartNumarasi){
                NYP_Donem_Projesi.butunKartlar.get(i).setGuncelBorc(NYP_Donem_Projesi.butunKartlar.get(i).getGuncelBorc()-miktar);
            }
        }
    }
    //toString metodu
    @Override
    public String toString(){
        return (super.toString()+"\n Hesap Turu: "+hesapTuru);
    }
}
