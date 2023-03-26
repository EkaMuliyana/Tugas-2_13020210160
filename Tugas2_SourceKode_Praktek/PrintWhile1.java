/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* Baca N, */
/* print i = 1 s/d N dengan WHILE (ringkas) */
public class PrintWhile1 {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int N;
		int i = 1;
		Scanner masukan=new Scanner(System.in);
		/* Program */

		System.out.print ("Nilai N >0 = "); 
		N = masukan.nextInt();
		System.out.print ("print i dengan WHILE (ringkas: \n");
		while (i <= N){
			System.out.println (i++);
		} /* (i > N) */
	}
}
