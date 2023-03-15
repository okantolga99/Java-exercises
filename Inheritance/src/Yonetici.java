public class Yonetici extends Calisan{
    int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    @Override
    void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : "+sorumlu_kisi_sayisi);
    }
    void zamYap(int zamMiktarı){
        System.out.println(this.ad +" "+this.soyad +" " + "çalışanlara " + zamMiktarı + "tl kadar zam yapıyor.");
    }
}
