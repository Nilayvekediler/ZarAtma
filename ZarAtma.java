import java.util.*;

public class ZarAtma
{
    public static void main(String [] args)
    {

        int kacKere;
        int zar;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Zar atma sayısı:");
        kacKere = klavye.nextInt();

        for (int i = 0; i < kacKere; i++)
        {
            zar = ((int)(Math.random() * 6 ) +1 );
            /* Math sınıfından olan random metodu 0-1 arası random sayılar üretir fakat 0 ve 1 üretemez. Bunlardan min sayı 0,.. max sayı 5,... gibi bir değer olur.İnt de bunu
             0 ve 5 alır. Yani "Math.random() * 6"den 0 1 2 3 4 5 değerleri çıkabilir. Zar üzerindeki 1 2 3 4 5 6 değerlerini elde etmek için buna 1 eklemek yeterlidir. Bu sebeple
             +1 eklenmiştir. */
            System.out.println(zar);
        }
    }
}
