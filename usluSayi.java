package patikadev;
import java.util.Scanner;
public class usluSayi {

    static int pow(int base,int exp)
    {
        int result =1;
        for (int i=1;i<=exp;i++)
        {
         result *= base;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,exp;
        System.out.print("taban değerini giriniz:");
        base = input.nextInt();
        System.out.print("üs değerini giriniz:");
        exp = input.nextInt();
        System.out.println("sonuç:"+pow(base,exp));
    }
}
