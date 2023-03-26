/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-gerated method stub
		/* kamus */
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		N = masukan.nextInt();

		i = 1;	/* First Elmt */
		System.out.print ("print i dengan ITERATE : \n");
		for (;;){
			System.out.println(i); /* proses */
			if (i == N)
				/* Kondisi Berhenti */ break;
			else {
				i++; /*Next Elmt */
			}
		} /* (i == N) */
	}
}