package Arrays;
import java.util.Scanner;
public class ArraysHarmonikAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan dizinin boyutu alınır
        System.out.println("Kaç elemanlı bir dizi oluşturmak istiyorsunuz: ");
        int n = input.nextInt();

        //Dizi oluşturulur
        int[] dizi = new int[n];


        //Dizinin elemanları alınır
        for (int i = 0 ; i < n ; i++){
            System.out.println("Dizinin " + (i + 1) + ". elemanını girin: ");
            dizi[i] = input.nextInt();

            //Eleman sıfır ise
            if (dizi[i] == 0) {
                System.out.println("Eleman 0 olamaz.Lütfen farklı bir değer gir: ");
                dizi[i] = input.nextInt();
            }
        }


        //Harmonik seri toplamını hesapla
        double harmonikToplam = 0;
        for(int i = 0; i < n ; i++){
            harmonikToplam += 1.0/dizi[i];
        }

        //Harmonik ortalama hesaplama
        double average = n / harmonikToplam  ;

        // Sonucu ekrana yazdır
        System.out.println("Dizinin harmonik ortalaması: " + average);

        // Scanner'ı kapat
        input.close();


    }
}
