import java.util.Scanner;
public class Kalkulator{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num1, num2, pilih, hasil = 0;
        System.out.println("== Kalkulator Sederhana ==");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Sisa Bagi");
        System.out.println("===========================");
        
        //input number
        System.out.print("Masukan angka pertama: ");
        num1 = input.nextInt();
        System.out.print("Masukan angka kedua: ");
        num2 = input.nextInt();

        //Input pilihan operasi
        System.out.print("Pilih Operasi Yang Akan Digunakan: ");
        pilih = input.nextInt();

        switch(pilih){
            case 1 : hasil = num1 + num2; break;
            case 2 : hasil = num1 - num2; break;
            case 3 : hasil = num1 * num2; break;
            case 4 : hasil = num1 / num2; break;
            case 5 : hasil = num1 % num2; break;
            default : System.out.println("Silahkan pilih operasi yg ada dengan benar!!");
        }
        System.out.println("Hasilnya: " + hasil);
    }
}
