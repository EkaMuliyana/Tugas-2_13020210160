/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* Baca N, print i = 1 s/d N dengan WHILE */
public class PrintWhile {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		/* Program */

		System.out.print ("Nilai N >0 = "); /* Inisialisasi */
		N = masukan.nextInt();
		i = 1;	/* First Elmt */

		System.out.print ("print i dengan WHILE: \n");
		while (i <= N) /*kondisi pengulangan */
		{
		System.out.println (i);
		i++; /*Next Elmt*/
		}; /* (i > N) */
	}
}