/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* Baca N, print 1 s/d N dengan FOR */
public class PriFor {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int i,N;
		Scanner masukan=new Scanner (System.in);
		/* Program */
		/* Program */

		System.out.print ("Baca N, print 1 s/d N ");
		System.out.print ("N = ");

		N=masukan.nextInt();

		for (i = 1; i <= N; i++ ) {
		System.out.println (i); };
		System.out.println ("Akhir program \n");
	}
}