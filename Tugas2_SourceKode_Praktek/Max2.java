/*13020210160*/
/*EKA MULIYANA*/
/*Rabu,22 Maret 2023*/

import java.util.Scanner;

/*Maksimum dua bilangan yang dibaca */
public class Max2 {

/**
 * @param args
 */
public static void main (String[] args) {
	// TODO Auto-gerated method stub
	/* kamus */
	int a, b;
	Scanner masukan=new Scanner(System.in);
	/* Program */
	System.out.print ("Maksimum dua bilangan : \n");
	System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
	a=masukan.nextInt ();
	b=masukan.nextInt ();
	System.out.println ("ke dua bilangan : a = "+ a+" b = "+b);
	if (a >= b) {
		System.out.println ("Nilai a yang maksimum : "+ a);
	}else /* a > b */ {
		System.out.println ("Nilai b yang maksimum : "+ b);
	}
}
}