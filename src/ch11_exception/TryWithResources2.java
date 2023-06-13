package ch11_exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("text.txt"))){
			while(true) {
				System.out.println(sc.nextLine());
			}
	
		} catch (Exception e) {
			System.out.println("file end");
			//e.printStackTrace();
		}
		
		
	}
}