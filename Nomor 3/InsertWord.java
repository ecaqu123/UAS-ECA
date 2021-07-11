//Eneng Elsa Amelia
//20200040060
//TI20A

public class InsertWord {
    public static void main(String[] args){
        //Mendefinisikan Objek dan Nilainya
        StringBuffer data = new StringBuffer("Saya belajar struktur data");
        
        //Menyisipkan Karakter pada Objek StringBuffer
        data.insert(4, " sedang");
        //Menampilkan Output
        System.out.println(data);
    }
}
