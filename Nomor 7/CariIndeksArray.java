//Eneng Elsa Amelia
//20200040060
//TI20A

import java.util.Scanner;

public class CariIndeksArray {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int n,z = 0;
        int cari;
        int[] x;
        boolean found = false;
        
        System.out.print("Masukkan jumlah N: ");
        n  = s.nextInt();
        x = new int[n];
        
        for(int index=0; index<n; index++)
        {
            System.out.print("Masukkan angka ke-"+ (index+1) + ": ");
            x[index] = s.nextInt();
        }
        
        System.out.print("Masukkan data yang dicari: ");
        cari = s.nextInt();
        
        for(int index=0; index<n; index++)
        {
            if(x[index] == cari)
            {
                found = true;
                z=index+1;
                System.out.println("Data ditemukan di Index ke :"+ z);
            }
        }
        
        if(found == false)
        {
            System.out.println("Data tidak ditemukan");
        }
    }
}
