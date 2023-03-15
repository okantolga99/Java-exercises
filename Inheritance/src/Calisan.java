public class Calisan {
    String ad;
    String soyad;
    int id;

    Calisan(String ad, String soyad, int id){
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }
    void bilgileriGoster(){
        System.out.println("Çalışan bilgileri :");
        System.out.println("Ad : "+ this.ad);
        System.out.println("Soyad : "+ this.soyad);
        System.out.println("Id : "+ this.id);
    }
}
