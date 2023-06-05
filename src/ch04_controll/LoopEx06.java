package ch04_controll;
/*

*****
*****
*****
*****

*/
public class LoopEx06 {

	public static void main(String[] args) {
		int row = (int)(Math.random()*10)+1;
		int col = (int)(Math.random()*10)+1;
		System.out.println("row:"+row+",  col:"+col);
		
		for (int i = 0 ; i < row ; i++) {
			
			for (int j = 0 ; j < col ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
