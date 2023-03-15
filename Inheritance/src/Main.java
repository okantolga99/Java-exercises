import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz.");
        int islemler;
        while (true){
            System.out.println("1-Yazılımcı işlemleri\n2-Yönetici işlemleri\n3-Çıkış yap");
            System.out.println("İşlemi seçiniz");
            islemler = scanner.nextInt();
            scanner.nextLine();
            if (islemler == 3){
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else if(islemler == 1){
                Yazilimci yazilimci = new Yazilimci("Okan Tolga","Kızıllıoğlu",1999,"Java,Phyton");
                int yazilimci_islem;
                System.out.println("1-Format At\n2-Bilgileri Göster\n3-Çıkış");
                while (true){
                    System.out.println("İşlemi seçiniz");
                    yazilimci_islem = scanner.nextInt();
                    scanner.nextLine();
                    if (yazilimci_islem == 3){
                        break;
                    }else if(yazilimci_islem == 1){
                        System.out.println("İşletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }else if(yazilimci_islem == 2){
                        yazilimci.bilgileriGoster();
                    }else System.out.println("Hatalı seçim yaptınız.");
                }

            } else if (islemler == 2) {
                Yonetici yonetici = new Yonetici("Charlie","Frey",1967,120);
                int yonetici_islem;
                System.out.println("1-Bilgileri göster\n2-Zam yap\n3-Çıkış");
                while (true){
                    System.out.println("İşlemi seçiniz");
                    yonetici_islem = scanner.nextInt();
                    scanner.nextLine();
                    if (yonetici_islem == 3){
                        break;
                    } else if (yonetici_islem == 1){
                        yonetici.bilgileriGoster();
                    }else if (yonetici_islem == 2){
                        System.out.println("Zam miktarını giriniz");
                        int zamMiktarı = scanner.nextInt();
                        yonetici.zamYap(zamMiktarı);
                    }else System.out.println("Hatalı seçim yaptınız.");
                }

            }else {
                System.out.println("Geçersiz işlem");
            }
        }

    }
}