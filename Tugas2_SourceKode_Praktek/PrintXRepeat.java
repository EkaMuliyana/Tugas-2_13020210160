/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE  */

public class PrintXRepeat {

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

		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt();	/* First Elmt */

		if (x == 999) {
			System.out.print ("Kasus Kosong \n");
		}else{	/*Minimal ada satu data yang dijumlahkan*/

		Sum = 0;	/* Inisialisasi; invariant !! */
		do{
			Sum = Sum + x; /*proses*/
			System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
			x = masukan.nextInt();	/*Next Elmt*/
		} while (x != 999);	/*kondisi pengulangan*/
		System.out.println ("Hasil penjumlahan = "+Sum);
	/* terminasi */
		}
	}
}