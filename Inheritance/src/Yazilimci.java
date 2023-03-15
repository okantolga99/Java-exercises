public class Yazilimci extends Calisan{
    String diller;

    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    void formatAt(String isletim_sistemi){
        System.out.println(this.ad + isletim_sistemi + "ni yüklüyor.");
    }
    @Override
    void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller : " +diller);
    }
}
