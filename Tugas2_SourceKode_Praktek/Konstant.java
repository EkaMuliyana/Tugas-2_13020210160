/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/*Membaca jari-jari, menghitung luas lingkaran */
/*Latihan pemakaian Konstanta */
public class Konstant {

/**
 * @param args
 */
public static void main (String[] args) {
	// TODO Auto-gerated method stub
	/* kamus */
		final float PHI = 3.1415f;
		float r;
		Scanner masukan=new Scanner (System.in);
	/* program */ /* baca data */

		System.out.print ("Jari-jari lingkaran =");
		r = masukan.nextFloat();
	/* Hitung dan tulis hasil */
		System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
		System.out.print ("Akhir program \n");
	}
	}