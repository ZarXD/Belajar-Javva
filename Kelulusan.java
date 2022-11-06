import java.util.Scanner;
public class Kelulusan{
  public static void main(String[] args){
    //variabel dan Scanner
    int nilai;
    String nama;
    Scanner scan = new Scanner(System.in);

    //input nama dan nilai
    System.out.print("Nama:");
    nama = scan.nextLine();
    System.out.print("Nilai:");
    nilai = scan.nextInt();

    //ini percabangan
    if (nilai >= 75){
      System.out.println("Selamat!! " + nama + " kamu lulus deck, dengan nilai:" + nilai);
    } else {
      System.out.println("Yahaha " + nama + " Kamu gagal deck, nilai kamu:" + nilai);
    }
  }
}
