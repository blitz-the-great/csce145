package triangle.maker;
import java.util.Scanner;
//Isaiah impson
public class trianglemaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the triangle maker!!!");
		System.out.println("pleaase input side lenght of your triangle: ");
		Scanner keyboard = new Scanner(System.in);
		String sidelenght = keyboard.nextLine();
		int sidestar=Integer.parseInt(sidelenght);
		
		int i=0; //i = amount of * but also a counter for while loops`1325466
		while(i<=sidestar) { //once i =  the number we put in for side lenght then we can start the decreasing functions 
			System.out.println("*".repeat(i));
			i=(i+1); 
			//System.out.println(i); for testing purposes
			}
	
		while(i>1) { // originaly was i>0 but was causing issiues when because i could = -1
			i=(i-1);
			System.out.println("*".repeat(i-1));  // the i-1 insures that we dont have a two wide peak
			
		}
		
		
	}

}
