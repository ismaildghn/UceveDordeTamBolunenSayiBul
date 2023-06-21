import java.util.Scanner;

public class UceveDordeTamBolunenSayiBul {
    public static void main(String[] args) {

        int k, toplam = 0, sayiAdet = 0;

        Scanner imp = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        k = imp.nextInt();

        for(int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam+=i;
                sayiAdet++;
                System.out.println(" 3 ve 4 e tam bölünebilen sayılar : " + i);
            }
        }
        System.out.println("Sayıların ortalaması : "+ toplam/sayiAdet);
    }
}