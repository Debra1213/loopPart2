import java.io.*;
import java.util.*;
public class loopPart2 {
	public static void main(String[] args) {
		int sum = 0;
        int[ ] power = {1,5,7,12,4,3};

		for(int i = 0; i<power.length; i++) {
			sum += power[i];
		}
		System.out.println("sum"+sum);
		
		
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;

             }

        }

        System.out.println(index);
        int[] b = toPower(4,2);
        for(int i = 0; i<b.length; i++) {
        	System.out.print(b[i] +" ");
        }
	}
	public static int[] toPower(int size,int power) {
		int[] hello = new int [size];
		for (int i = 0; i<hello.length; i++) {
			hello[i]= i * i;
		}
		return hello; 
	}
}