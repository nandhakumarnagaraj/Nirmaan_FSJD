package Sample;

import java.util.Scanner;

import Day_04.scanner;

public class even {
// public static void main(String[] args) {
//      System.out.println("enter the number");
//     Scanner sc= new Scanner(System.in);
//     int a=sc.nextInt();
//     if(a%2==0){
//         System.out.println("Given number is even");
//     }else{
//         System.out.println("Given number is odd");
//    
//     }
// }

//	public static void main(String[] args) {
//		int l;
//		int b;
//		int area;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the length");
//		l=sc.nextInt();
//		System.out.println("enter the breath");
//		b=sc.nextInt();
//		area=l*b;
//		System.out.println("area of rectangle is "+ area);
//		
//	}
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int year=sc.nextInt();
//		if(year%4==0 && year%100!= 0 && year %400 ==0) {
//			System.out.println("given year is leap year");
//		}
//		else {
//			System.out.println("given year is not leap year");
//		}
//	}
//	public static void main(String[] args) {
//		
//		Scanner sc= new Scanner(System.in);
//		int fact = 0;
//		int n=sc.nextInt();
//		for (int i=1;i<=n;i++) {
//				if(i%2==0) {
//			fact=fact+i;
//			}
//		}
//		System.out.println(fact);
//	}
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		int first=0;
//		int second=1;
//		int third=0;
//		for(int i=0;i<=n;i++) {
//			third=first+second;
//			first=second;
//			second=third;
//		}
//		System.out.println(third);
//	}
//	public static void main(String[] args) {
//		int first=3;
//		for(int i=1;i<=10;i++) {
//			System.out.println(first +"*"+i +"=" + first*i);
//		}
//	}
//	public static void main(String[] args) {
//		 int i, j;
//	        // outer loop to handle number of rows
//	        for (i = 0; i < 6; i++) {
//	            //  inner loop to handle number of columns
//	            for (j = 0; j < 6; j++) {
//	                // star will print only when  it is in first
//	                // row or last row or first column or last
//	                // column
//	                if (i == 0 || j == 0 || i == 6 - 1 
//	                    || j == 6 - 1) {
//	                    System.out.print("* ");
//	                }
//	                // otherwise print space only.
//	                else {
//	                    System.out.print("  ");
//	                }
//	            }
//	            System.out.println();
//	        }
//	    System.out.println("fghj");
//	}
	public static void main(String[] args) {
		int a=100;
		int b=90;
		int c=80;
		int d=85;
		int e=99;
		int total=a+b+c+d+e;
		double per=total/5;
		System.out.println(total);
		System.out.println(per);
	}

}
