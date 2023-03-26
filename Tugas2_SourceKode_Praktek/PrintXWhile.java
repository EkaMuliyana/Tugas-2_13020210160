/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE  */

public class PrintXWhile {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int Sum;
		int x;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		Sum = 0; /* Inisialisasi */

		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();	/* First Elmt */
		while (x != 999)	/* Kondisi berhenti */ {
			Sum = Sum + x; /*proses*/
			System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();	/*First Elmt*/
		}
		System.out.println ("Hasil penjumlahan = "+ Sum);
	/* terminasi */
	}
}

