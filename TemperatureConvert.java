/*
/*Azahra Kartika-1301154460-IF-39-12
 */
package primernumber;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class Temperature {
    public static void main (String[] args){
        Scanner cin = new Scanner (System.in);
        
        System.out.print("Masukkan suhu = ");
        int suhu = cin.nextInt();
        
        System.out.println("1. Reamur ");
        System.out.println("2. Fahrenheit ");
        System.out.println("3. Kelvin ");
        System.out.println("Convert ke =  ");
        int pil = cin.nextInt();
        double hasil;
        hasil =0;
        if(pil == 1)
        {
            hasil = 0.8 *suhu;
            System.out.print("Hasil ="+hasil+"Reamur");
        }
        else if (pil == 2)
        {
            hasil = (9/5*suhu)+32;
            System.out.print("Hasil = "+hasil+"Fahrenheit");
        }
        else
        {hasil = 273+suhu;
        System.out.print("Hasil = "+hasil+"Kelvin");
        }
    }
}
