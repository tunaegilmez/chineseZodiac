import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili , sonuc ;

        Scanner scn = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Girin : ");
        dogumYili = scn.nextInt();

        sonuc = dogumYili % 12 ;

        switch (sonuc){
            case 0 :
                System.out.println("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1 :
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2 :
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3 :
                System.out.println("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4 :
                System.out.println("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5 :
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6 :
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7 :
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8 :
                System.out.println("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9 :
                System.out.println("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10 :
                System.out.println("Çin Zodyağı Burcunuz : At");
                break;
            default :
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
                break;
        }
    }
}
