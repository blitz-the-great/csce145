package wetherthing2;

import java.util.Scanner;

public class wetherthing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the below avrage temperature tester: ");
		double[] alldays = new double[11];
		for(int i =1; i<11;i++)											//this for loop finds takes in the temps for the user and logs them
				{
				System.out.println("input wether for day "+ i + ":");
				Scanner keyboard1 = new Scanner(System.in);
				double weatherday = keyboard1.nextDouble();
				alldays[i]=weatherday;
				}
		//System.out.println(alldays[1]);
			double tempavrage = 0.0;									// counts up the total temp so we can devide later and find avrage		
					for(int i =1; i<11;i++)
					{
						tempavrage+= alldays[i];
					}
						tempavrage/=10;
					
		System.out.println("your average tempature was: " + tempavrage);
		int j = 0;				//sets the amount of slots we will need in array "lessthan avrage temp" and is kept track of with j
		for(int i =1; i<11;i++)
		{
	
			if(tempavrage>alldays[i])
				{
				j++;
				};
				
			}
				
		double[] lessthanaveragetemp = new double[j];
		int k=0;									// k allows us set the number of slots in lessthanavrgetemp to the exact amount
		for(int i =1; i<11;i++)
			{
		
				if(tempavrage>alldays[i])
				{
					
					lessthanaveragetemp[k]= alldays[i];
					k++;
					
				}
			}
		System.out.println("the tempatures below average are as follows: " );
			for(int i =0; i<k;i++)						// i<k insures that we dont try to print over the the amount of slots in the lessthanavrage array
			{
			System.out.println(lessthanaveragetemp[i]);
			}
		
		
	}
	
	
}
