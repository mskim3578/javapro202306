package ch03_op;
/*
 * 비트연산자 : &(and),|(or),^(XOR),~(not) : 
 */
/*
 *  6 : 0110
 *  3 : 0011
 *  --------
 *  &   0010  : 2
 */
/*
 *  6 : 0110
 *  3 : 0011
 *  --------
 *  | : 0111  : 7  
 */
/*  같으면 0, 다르면 1
 *  6 : 0110
 *  3 : 0011
 *  --------
 *  ^ : 0101  : 5  
 */
/* 
 * 10 : 00001010
 * ---------------
 * ~  : 11110101   : ?
 * 
 *
 */
public class OpEx06 {
	public static void main(String[] args) {
		System.out.println("6 & 3 = "+(6 & 3));
		/*  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  &(and)   0010  : 2 */
		System.out.println("6 | 3 = "+(6 | 3));
		/*  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  |(or) : 0111  : 7 */
		System.out.println("6 ^ 3 = "+(6 ^ 3));
		/*  같으면 0, 다르면 1
		 *  6 : 0110
		 *  3 : 0011
		 *  --------
		 *  ^(xor) : 0101  : 5  
		 */
		System.out.println("~10 =" + ~10); //-11
		/* 
		 * 10 : 00001010
		 * ---------------
		 * ~(not)  : 11110101   : ?
		 * 
		 */	}
	
}

