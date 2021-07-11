import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Eneng Elsa Amelia
//20200040060
//TI20A

public class VokalKonsonan {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukan kata:");
        String a = userInput.nextLine();

        int panjangKata = a.length();
        int jumlahKata = 1;
        int jumlahKarakter = 0;
        Map jumlahVokal = new HashMap<>();
        Map jumlahKonsonan = new HashMap<>();

        char[] vokal = {'A', 'I', 'U', 'E', 'O'};
        char[] konsonan = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};


        a = a.toUpperCase();
        for (int i = 0; i < panjangKata; i++) {
            char k = a.charAt(i);

            for (int j = 0; j < vokal.length; j++) {
                if (k == vokal[j]) {
                    if (jumlahVokal.containsKey(k)) {
                        int jumV = (int) jumlahVokal.get(k);
                        jumV++;
                        jumlahVokal.put(k, jumV);
                    } else {
                        jumlahVokal.put(k, 1);
                    }
                }
            }

            for (int l = 0; l < konsonan.length; l++) {
                if (k == konsonan[l]) {
                    if (jumlahKonsonan.containsKey(k)) {
                        int jumK = (int) jumlahKonsonan.get(k);
                        jumK++;
                        jumlahKonsonan.put(k, jumK);
                    } else {
                        jumlahKonsonan.put(k, 1);
                    }
                }
            }


            //Menentukan Jumlah Kata
            if (k == ' ' || k == '.' || k == '?' || k == '!') {
                jumlahKata++;
            } else {
                jumlahKarakter++;
            }
        }

        System.out.println("Jumlah huruf dan karakter: " + jumlahKarakter);
        System.out.println("Jumlah kata: " + jumlahKata + " kata.");
        System.out.println();
        System.out.println("JUMLAH HURUF VOKAL");
        int totV = 0;
        for (int j = 0; j < vokal.length; j++) {
            int jumV = 0;
            if (jumlahVokal.get(vokal[j]) != null) {
                jumV = (int) jumlahVokal.get(vokal[j]);
            }
            System.out.print(vokal[j] + " = " + jumV + ", ");
            totV += jumV;
        }
        System.out.println();
        System.out.println("TOTAL HURUF VOKAL: " + totV + " HURUF");
        
        //konsonan
        System.out.println();
        System.out.println("JUMLAH HURUF KONSONAN");
        int totK = 0;
        for (int j = 0; j < konsonan.length; j++) {
            int jumK = 0;
            if (jumlahKonsonan.get(konsonan[j]) != null) {
                jumK = (int) jumlahKonsonan.get(konsonan[j]);
            }
            System.out.print(konsonan[j] + " = " + jumK + ", ");
            totK += jumK;
        }
        System.out.println();
        System.out.println("TOTAL HURUF KONSONAN: " + totK + " HURUF");
    }
}
