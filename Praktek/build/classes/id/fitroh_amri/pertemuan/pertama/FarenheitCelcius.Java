	import java.util.Scanner;
	
	/* PROGRAM FarenheitCelcius */
	/* Program untuk mencetak tabel Farenheit-Celcius dari x sampai y
	dengan kenaikan sebesar step. Masukan program ini adalah suhu awal, 
	suhu akhir, step, dan keluarannya adlah table konversi suhu dalam C dan F */

	public class FarenheitCelcius{
		public static void main (String[]args){
	
		/*DEKLARASI*/
		float F, C;
		int x, y, step;

		/* ALGORITMA */
		Scanner in = new Scanner (System.in);
			x = in.nextInt();
			y = in.nextInt();
			step = in.nextInt();

			F = x;
			while (F <= y) {
				System.out.print("5/9 ; " + 5/9);
				//C = (5 / 9) * (F - 32);
				C = (float) (5.0 /9.0) * (F - 32);
				//C = 5 * (F - 32) /9;
				System.out.printf("%3.0f  %6.1f \n", F, C);
				F = F + step;
			}
		}
	}


 