import java.util.Scanner;

public class us {



    static int usslu(int alt, int ust){
        if ((alt == 1) && (ust == 0))
            return 1;
        if ((ust == 1 ))
            return alt;

        return alt*usslu(alt,ust-1);
    }
    public static void main(String[]args){
        int alt , ust ,sonuc ;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        alt = keyboard.nextInt();
        System.out.print("Üs değeri giriniz :");
        ust = keyboard.nextInt();
        sonuc = usslu(alt,ust);
        System.out.println("Sonuç :" + sonuc);


















    }
}
