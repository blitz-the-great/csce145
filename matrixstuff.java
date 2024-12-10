//wtritten by isaiah impson
package matrixstuff;

import java.util.Scanner;

public class matrixstuff {

	public static void main(String[] args) 
	{


		System.out.println("Welcome to the matrix adder program! Please enter the length and width of the first matrix ");
		Scanner keyboard1 = new Scanner(System.in);
		int length = keyboard1.nextInt();
		int width = keyboard1.nextInt();
		int[][] matrix1 = new int[length][width];
		for (int k = 0;k<width;k++) { //fills left to right

			for(int i=0;i<length;i++)
			{
				System.out.println("input value at index" + i + k);
				Scanner keyboard2 = new Scanner(System.in);
				int userinput = keyboard1.nextInt();
				matrix1[i][k]= userinput;

			}
		}
		for (int kprint = 0;kprint<width;kprint++) { //https://www.tutorialspoint.com/print-a-2d-array-or-matrix-in-java

			for(int iprint =0;iprint<length;iprint++)   //this was the hardest part trying to fill the array was complicated i figured it out but used the link above to refine
			{
				System.out.print(matrix1[iprint][kprint]+" ");

			}
			System.out.println();


		}
		System.out.println("Please enter the length and width of the second matrix "); //I know i probobly could of done this with a for loop but i was not sure how to save the created arrays outside of the loop but this works
		Scanner keyboard2 = new Scanner(System.in);
		int length1 = keyboard2.nextInt();
		int width1 = keyboard2.nextInt();
		int[][] matrix2 = new int[length1][width1];
		for (int k = 0;k<width1;k++) {

			for(int i=0;i<length1;i++)
			{
				System.out.println("input value at index" + i + k);
				Scanner keyboard3 = new Scanner(System.in);
				int userinput = keyboard2.nextInt();
				matrix2[i][k]= userinput;

			}
		}
		for (int kprint = 0;kprint<width1;kprint++) { //https://www.tutorialspoint.com/print-a-2d-array-or-matrix-in-java

			for(int iprint =0;iprint<length1;iprint++)
			{
				System.out.print(matrix2[iprint][kprint]+" ");

			}
			System.out.println();


		}
		if(length==length1&&width==width1) {                    //insures that the matrices are  the same size
			System.out.println("the value of the added matrices is: ");
			int[][] summatrix = new int[length][width];
			for (int k = 0;k<width;k++) {

				for(int i=0;i<length;i++)
				{
					summatrix[k][i] = matrix1[k][i]+matrix2[k][i];

				}
			}
			for (int kprint = 0;kprint<width;kprint++) { //https://www.tutorialspoint.com/print-a-2d-array-or-matrix-in-java

				for(int iprint =0;iprint<length;iprint++)
				{
					System.out.print(summatrix[iprint][kprint]+" ");

				}
				System.out.println();
			}}
		else{System.out.print("invalid input please create matrices that are the same size");//error for diffrent sized matrices

		}
	}}

