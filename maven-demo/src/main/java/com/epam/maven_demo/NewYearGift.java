package com.epam.maven_demo;
import java.util.Scanner;

public class NewYearGift{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Happy New Year : )");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100]; 
		int k=0,op1;
		int op;
		do {
			System.out.println("Choose 1 for chocolate and 2 for sweets and if done select 0");
			op = sc.nextInt();
			if(op==1) {
				chocolate c = new chocolate();
				System.out.println("Choose 1 for dark chocolate and 2 for milk chocolate");
				op1=sc.nextInt();
				if(op1==1) {
					dark_c d = new dark_c();
					System.out.println("Dark chocolate is added in the gift");
					arr[k]=d.weight;k++;
				}
				else if(op1==2) {
					milk_c m = new milk_c();
					System.out.println("Milk chocolate is added in the gift");
					arr[k]=m.weight;k++;
				}
			}else if(op==2) {
				sweets s = new sweets();
				System.out.println("Choose 3 for caremell sweet and 4 for nogut sweet");
				op1=sc.nextInt();
				if(op1==3) {
					caramels cs = new caramels();
					System.out.println("Caramel sweet is added in the gift");
					arr[k]=cs.weight;k++;
				}
				else if(op1==4) {
					noguts ng = new noguts();
					System.out.println("Nogut sweer is added in the gift");
					arr[k]=ng.weight;k++;
				}
			}
		}while(op!=0);
		
		for(int j=0;j<k;j++)
		{
			System.out.print("\t arr[j]="+arr[j]);
		}
		
		for (int i = 0; i < k-1; i++)
            for (int j = 0; j < k-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	
		System.out.println();
		System.out.println("After sorting the weights of the items in the gift:");
		for(int j=0;j<k;j++)
		{
			System.out.print("\t arr[j]="+arr[j]);
		}

     }
}
	
class chocolate{
	chocolate() {
		System.out.println("This is from chocolate");
		//System.out.println("Select 1 for dark or 2 for milk chocolate and if done select 0:");
		//int op1 = sc.nextInt();
		
	}
}

class dark_c extends chocolate {
	int weight = 100;

	dark_c() {
		System.out.println("The weight of dark chocolate is :" + weight);
	}
}

class milk_c extends chocolate {
	int weight = 50;

	milk_c() {
		System.out.println("The weight of milk chocolate is :" + weight);
	}
}

class sweets{
	sweets() {
		System.out.println("This is from sweets");
		//System.out.println("Select 1 for caremels or 2 for nogut sweets and if done select 0:");
		//int op2 = sc.nextInt();
		
	}

}

class caramels extends sweets {
	int weight = 120;

	caramels() {
		System.out.println("The weight of caramel sweet is :" + weight);
	}
}

class noguts extends sweets {
	int weight = 110;

	noguts() {
		System.out.println("The weight of nogut sweet is :" + weight);
	}
}