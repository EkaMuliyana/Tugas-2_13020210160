/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/


/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif*/

import java.util.Scanner;


public class If1 {

/**
 * @param args
 */
public static void main (String[] args) {
	// TODO Auto-gerated method stub
	/* kamus */
	Scanner masukan=new Scanner(System.in);
	int a;
	/* Program */

	System.out.print ("contoh IF satu kasus \n");
	System.out.print ("Ketikkan suatu nilai integer : ");
	a = masukan.nextInt();
	if (a >= 0)
	System.out.print ("\nNilai a positif "+ a);
}
}