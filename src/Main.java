
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main{
    // Ramazan Pidesi Uygulaması
    
    // Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi almaya çalışacak.
    
    

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulaması....");
        Random random = new Random();
        //kac tane pide ciktigini random olarak alıyorum
        
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        pide_kuyrugu.offer("Asude");
        pide_kuyrugu.offer("Emre");
        pide_kuyrugu.offer("Zehra");
        pide_kuyrugu.offer("Berna");
        pide_kuyrugu.offer("Fatih");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Azer"); 
        
        int pide_sayisi = 1 + random.nextInt(10);
        //kisi sayısına gore max kac kisi pide alabilecekse o sayiya kadar random sayi uretilecek

        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : " + pide_sayisi);
        //yapılan uygulamalardan sonra programın 3 saniye beklemesini istiyorum
        Thread.sleep(3000);

        
        while (pide_sayisi != 0) {
            //pideler tukenene kadar dongu devam edecek
            
            System.out.println(pide_kuyrugu.poll() + " pideyi aldı...");
            pide_sayisi--;
            Thread.sleep(1000);
            
        }
        
        System.out.println("Pide kalmadı...");
        
        
        
}
}