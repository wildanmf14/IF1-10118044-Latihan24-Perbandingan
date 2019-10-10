package latihan.perbandingan;
import java.util.Scanner;

public class Perbandingan {

	public static void main(String[] args) {
		System.out.println("=========Program Perbandingan Nilai=========");
		Scanner reader = new Scanner(System.in);
		String status;
		do {
			System.out.print("Masukan nilai pertama : ");
			int a = reader.nextInt();
			System.out.print("Masukan nilai kedua : ");
			int b = reader.nextInt();
			System.out.println("Hasil : "+ a + ((a>b) ? " Lebih besar dari " : (a<b) ? " Lebih kecil " : " Sama dengan ") + b);
			System.out.println("");
			System.out.print("Ulangi Aktivitas ? (Ya/Tidak) ");
			
			status = reader.next();
		}while(status.equals("Ya"));
		reader.close();
	}

}
