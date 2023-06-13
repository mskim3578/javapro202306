package ch11_exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("text.txt"))){
			
			while(true) {
			System.out.println(sc.nextLine());
			}
	
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("FileNotFoundException");
		} catch (NoSuchElementException e) {
			//e.printStackTrace();
			System.out.println("end file");
		}
		
		
	}
}