import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (/* 
                int i;
        
                for(i=1;i<=100;i++)
                {
        
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }
                }
        */
                /* 
                try (Scanner girdi = new Scanner(System.in)) {
                    int a,toplam=0;
        
        
              while(true)
              {
        
                    System.out.println("Bir sayi giriniz.");
                    a=girdi.nextInt();
                    if(a<0)
                    {
                        System.out.println("Negatif bir sayi girdiniz");
                        break;
                    }
        
                    if(!(a%2==0))
                    {
                    toplam= toplam+a;
                    }
              }
              System.out.println("Girilen tek sayıların toplami:"+toplam);
                } 
                */
        Scanner girdi = new Scanner(System.in)) {
            int üs,iki=1;

            System.out.println("2'nin kaçıncı üssünü almak istiyorsanız");

            üs=girdi.nextInt();

            if(üs==0){
                System.out.println("1");
            }

            for(int i=1;i<=üs;i++)
            {
                iki=iki*2;
            }
            System.out.println("Cevap: "+iki);

        }














    }
}
