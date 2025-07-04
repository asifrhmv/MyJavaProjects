package Loops;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for(int i=1;i<=50;i++) {
		// System.out.println(i);
		// }
		//

		// Scanner scan=new Scanner(System.in);
		// System.out.println("Bir eded daxil edin:");
		// int eded=scan.nextInt();
		// int i=1;
		// while(i<=eded) {
		// System.out.println(i);
		// i++;
		// }
		//
		// int toplam=0;
		// for(int i=1;i<=100;i++) {
		// if(i%2==0) {
		// toplam=toplam+i;
		// }
		//
		// }
		// System.out.println(toplam);
		//

		// Scanner scan=new Scanner(System.in);
		// int toplam=0;
		// while(true) {
		// System.out.println("Eded daxil edin:");
		// int eded=scan.nextInt();
		// if(eded==0) {
		// break;
		// }
		// toplam=toplam+eded;
		// }
		// System.out.println("Ededlerin cemi:"+toplam);
		//
		//

		// Scanner scan=new Scanner(System.in);
		// int i=1;
		// int toplam=0;
		// while(i<=10) {
		// System.out.println(i+"ci ededi daxil edin:");
		// int eded=scan.nextInt();
		// toplam+=i;
		// i++;
		//
		// }
		// double ortalama=toplam/10;
		// System.out.println("Ortalama:"+ortalama);
		//
		//
		// int i=0;
		// int a=0;
		// int b=1;
		// while(i<15) {
		// System.out.print(a+" ");
		// int c=a+b;
		// a=b;
		// b=c;
		// i++;
		// }

		// Verilmish ededin reqemleri cemini tapma :

		// Scanner scan=new Scanner(System.in);
		// System.out.print("Eded daxil edin :");
		// int eded=scan.nextInt();
		// int toplam=0;
		// while(eded>0) {
		// int sonReqem=eded%10;
		// toplam+=sonReqem;
		// eded=eded/10;
		//
		// }
		// System.out.print("Ededin reqemleri cemi:"+toplam);
		//
		//
		// Verilmish ededin tersini yazma:

		// Scanner scan=new Scanner(System.in);
		// System.out.println("Ededi daxil edin:");
		// int eded=scan.nextInt();
		// int netice=0;
		// while(eded>0) {
		// int sonReqem=eded%10;
		// netice=(netice*10)+sonReqem;
		// eded=eded/10;
		//
		// }
		//
		// System.out.println(netice);
		//

		//
		// Scanner scan=new Scanner(System.in);
		//
		// int i=10;
		// int a;
		// int b;
		// while(i<100) {
		// a=i%10;
		// b=(i/10)%10;
		// if(a+b==3) {
		// System.out.println(i);
		// }
		// i++;
		// }
		//
		// -------------------- -------------------- --------------------
		// 1-1000 arasi palindrom ededleri ekrana chixarma

//			int i=1;
//			while(i<1000) {
//				int original=i;
//				int reverse=0;
//				int temp=i;
//				
//				while(temp>0) {
//					int sonreqem=temp%10;
//					reverse=(reverse*10)+sonreqem;
//					temp=temp/10;
//				}
//				
//				if(reverse==original) {
//					System.out.println(original);
//				}
//				i++;
//			}
//		--------------------	--------------------	--------------------	

//			Scanner scan = new Scanner(System.in);
//			System.out.print("Ədədi daxil et: ");
//			int num = scan.nextInt();
//
//			int previousDigit = num % 10;
//			num /= 10;
//
//			boolean isDecreasing = true;
//
//			while (num > 0) {
//			    int currentDigit = num % 10;
//
//			    if (currentDigit < previousDigit) {
//			        previousDigit = currentDigit;
//			        num /= 10;
//			    } else {
//			        isDecreasing = false;
//			        break;
//			    }
//			}
//
//			if (isDecreasing) {
//			    System.out.println("Ədəd azalan sıradadır.");
//			} else {
//			    System.out.println("Ədəd azalan sırada deyil.");
//			}

//----------------------------------------------------------------				
//		Ededdeki tek ededleri cemlemek 

//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int toplam=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			eded=eded/10;
//			if(sonreqem%2==1) {
//				toplam=toplam+sonreqem;
//			}
//			
//		}
//		
//		System.out.println("Tek ededlerin cemi:"+toplam);
//		
//		
//	--------------------	--------------------	--------------------		
//		

//		Verilen ededin en boyuk reqemini tapmaq
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Eded daxil edin:");
//		int eded=scan.nextInt();
//		int maxreqem=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			eded=eded/10;
//			if(sonreqem>maxreqem) {
//				maxreqem=sonreqem;
//			}
//			
//			
//			
//		}
//		System.out.println("Reqemlerden en boyuyu:"+maxreqem);
//		
//		--------------------	--------------------	--------------------		

//		Verilen edede qeder polindrom ededleri cap etme
//	

//	
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int i=1;
//		
//		while(i<eded) {
//			int temp=i;
//			int original=i;
//			int reverse=0;
//			while(temp>0) {
//				int sonreqem=temp%10;
//				reverse=(reverse*10)+sonreqem;
//				temp/=10;
//			}
//			if(reverse==original) {
//			System.out.println(original);
//			}
//			
//			i++;
//		}
//		--------------------	--------------------	--------------------		
		// 1-100 arasi qosha seriya cut ededleri tapmaq

//		int i=1;
//		while(i<100) {
//			int a=i%10;
//			int b=(i/10)%10;
//			if(i%2==0) {
//				if(a==b) {
//					System.out.println(i);
//				}
//			}
//			i++;
//		}
//		
//		--------------------	--------------------	--------------------		

//		Scanner scan = new Scanner(System.in);
//		
//		int i=1;
//		while(i<=100) {
//			int j=0;
//			int count=0;
//			while(j<=i) {
//				
//				double bolen=i-j;
//				double netice=(i/bolen);
//				if(i%bolen==0) {
//					count++;
//				}
//				
//				j++;
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
//				i++;
//			
//		}
//		

//-----------------------------------------------------------------------------------
//---------------------------------------------------------------------------------
//---------------------------------------------------------------------------------
//---------------------------------------------------------------------------------

		// 1

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Eded daxil edin:");
//		int eded=scan.nextInt();
//		int toplam=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			toplam=toplam+sonreqem;
//			eded/=10;
//		}
//		
//		System.out.println("Ededin reqemleri cemi:"+toplam);
//		
//		
//		

		// 2

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Eded daxil edin:");
//		int eded=scan.nextInt();
//		int reverse=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			reverse=(reverse*10)+sonreqem;
//			eded/=10;
//		}
//		System.out.println("Ededin tersi:"+reverse);
//		

		// 3
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Polindrom yoxlanacaq ededi daxil edin:");
//		int eded=scan.nextInt();
//		int reverse=0;
//		int original=eded;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			reverse=(reverse*10)+sonreqem;
//			eded=eded/10;
//		}
//			if(reverse==original) {
//				System.out.println("Eded polindromdur !");
//			}
//			else {
//				System.out.println("Eded polindrom deyil !");
//			}
//		

		// 4

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int max=0;
//		int min=eded%10;
//		
//		while(eded>0) {
//			int sonreqem=eded%10;
//			eded=eded/10;
//			if(sonreqem>max) {
//				max=sonreqem;
//			}
//			if(min>sonreqem) {
//				min=sonreqem;
//			}
//			
//		}
//		
//		System.out.println("Ededlerden en boyuyu:"+max);
//		System.out.println("Ededlerden en kichiyi:"+min);
//		

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
		
		
		// 5

//		int a=0;
//		int b=1;
//		int i=0;
//		while(i<eded) {
//		
//			int c=a+b;
//			System.out.print(a+" ");
//			a=b;
//			b=c;
//			
//			i++;
//		}
//		
//		

		// 6

//		int i=1;
//		int count=0;
//		while(i<=eded) {
//			if(eded%i==0) {
//				count++;
//			}
//			i++;
//		}
//		
//		if(count==2) {
//			System.out.println("Bu eded sadedir !");
//		}
//		else {
//			System.out.println("Bu eded sade deyil !");
//		}
//		

		// 7

//	
//		int i = 2;
//		while (i < 20) {
//			int count = 0;
//			int j = 1;
//			while (j <= i) {
//				if (i % j == 0) {
//					count++;
//				}
//				j++;
//			}
//			if (count == 2) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		
		
	// 8
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//        int toplam=0;
//		int i=1;
//		while(i<eded) {
//			if(eded%i==0) {
//				toplam=toplam+i;
//			}i++;
//		}
//		
//		
//		if(toplam==eded) {
//			System.out.println("Bu eded mukemmel ededdir !");
//		}
//		else {
//			System.out.println("Bu eded mukemmel deyil !");
//		}
//		
		
		//9
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//        int sonreqem=eded%10;
//        while(eded>0) {
//        	int yoxla=sonreqem;
//        	while(yoxla>0) {
//        		eded=eded/10;
//            	sonreqem=eded%10;
//            	if(yoxla==sonreqem) {
//            		System.out.println("Tekrarlanan reqem var !");
//            		break;
//            	}
//        	}
//        }
//		
		//-----------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------

		
//                               ARRAYLAR		         
		
		
		//1.
//		
//		int[] arr = {2, 4, 6, 8, 10};
//		int i=0;
//		int toplam=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		System.out.println(toplam);


		
		//2.
		
		
//		int[] arr = {12, 5, 7, 25, 1};
//		int max=arr[0];
//		int i=1;
//		while(i<arr.length) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}i++;
//		}
//		System.out.println(max);
//		
		
//		int[] arr = {12, 5, 7, 25, 1};
//		int min=arr[0];
//		int i=1;
//		while(i<arr.length) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}i++;
//		}
//		System.out.println(min);
//		
		
		//3.
		
		
//		int[] arr = {1, 2, 3, 4, 5};
//		int i=0;
//		while(i<arr.length) {
//			if(arr[i]%2==1) {
//				System.out.print(arr[i]+",");
//			}i++;
//		}
		
		
		//4.
		
//		int[] arr = {1, 2, 3, 4, 5};
//		int i=arr.length-1;
//		while(i>=0) {
//			System.out.print(arr[i]+",");
//			i--;
//		}
		
		
		
		
//		
//		//5.
		
		
//	boolean tekrar=false;
//		int[] ededler= {1,5,7,2,4,5};
//		int i=0;
//		while(i<ededler.length) {
//			int j=i+1;
//			while(j<ededler.length) {
//				if(ededler[i]==ededler[j]) {
//				tekrar=true;
//					break;
//				}j++;
//			}if(tekrar) {
//				break;
//			}i++;
//		}
//		if(tekrar) {
//			System.out.println("Tekrar var !");
//		}
//		else {
//			System.out.println("Tekrar yoxdur !");
//		}
//		
		
		
		
//		int[] ededler = {1,3,5,8,2,};
//		int i=ededler.length-1;
//		while(i>=0) {
//			System.out.print(ededler[i]+",");
//			i--;
//		}
//		
//		
//		
//		
//		int[]arr= {2,3,4,5,3};
//		int i=0;
//		int toplam=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		
//		System.out.println(toplam);
//		
		
		
//		int[]arr= {2,3,4,5,3,15,6,7,8};
//		int i=1;
//		int max=arr[0];
//		while(i<arr.length) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}i++;
//		}
//		
//		System.out.println(max);
//		
		
		
//		int[]arr= {2,3,4,5,3,15,6,7,8};
//		int i=1;
//		int min=arr[0];
//		while(i<arr.length) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}i++;
//		}
//		
//		System.out.println(min);
		
		
//		int[]arr= {2,3,4,5,3,15,6,7,8};
//		int i=0;
//		int count=0;
//		while(i<arr.length) {
//			if(arr[i]%2==1) {
//				count++;
//			}i++;
//		}
//		
//		System.out.println(count);
//		
//		
//		boolean tekrar=false;
//		int[]arr= {2,4,5,3,15,6,7,8};
//		int i=0;
//		while(i<arr.length) {
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[j]==arr[i]) {
//				tekrar=true;
//					break;
//				}j++;
//			}if(tekrar) {
//				break;
//			}i++;
//		}
//		if(tekrar) {
//			System.out.println("Tekrarlanan eded var !");
//		}
//		else {
//			System.out.println("Tekrarlanan eded yoxdur !");
//		}
		
//		
//		int[]arr= {2,4,5,3,15,6,7,8};
//		int i=arr.length-1;
//		while(i>=0) {
//			System.out.print(arr[i]+",");
//			i--;
//		}
//		
		
		
//		
//		int[]arr= {2,4,5,3,15,6,7,8};
//		int toplam=0;
//		int i=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		double ortalama=toplam/arr.length;
//	int j=0;
//		while(j<arr.length) {
//			if(arr[j]>ortalama) {
//				System.out.print(arr[j]+",");
//			}j++;
//				
//		}
//		
		
//		int[]arr= {2,4,5,3,15,6,7,8};
//       Arrays.sort(arr);
//       System.out.println(Arrays.toString(arr));
//		
		
		
//-----------------------------------------------------------------------------------
		
		
//	int[] ededler= {1,2,3,5,6};
//	int i=0;
//	while(i<ededler.length) {
//		System.out.print(ededler[i]+",");
//		i++;
//	}
//		
		
		
//		int[] arr = {3, 7, 2, 5, 10};
//		int i=0;
//		int toplam=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		
//		System.out.println("Arraydaki edelerin cemi :"+toplam);
//		
		
		
		
//		int[] arr = {8, 3, 15, 6, 4};
//		int max=arr[0];
//		int i=1;
//		while(i<arr.length) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}i++;
//		}
//		
//		System.out.println(max);
//		
//	
		
//		int[] arr = {8, 3, 15, 6, 4};
//		int min=arr[0];
//		int i=1;
//		while(i<arr.length) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}i++;
//		}
//		
//		System.out.println(min);
		
//		int[] arr = {8, 3, 15, 6, 4};
//		int i=0;
//		int count=0;
//		while(i<arr.length) {
//			if(arr[i]%2==0) {
//				count++;
//			}i++;
//		}
//		
//		System.out.println(count);
//		
//		boolean tekrar=false;
//		
//		int[] arr = {4, 6, 2, 8, 4, 9};
//		int i=0;
//		while(i<arr.length) {
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[j]==arr[i]) {
//				tekrar=true;
//				break;
//				}j++;
//			}if(tekrar) {
//				break;
//			}i++;
//		}
//		if(tekrar) {
//			System.out.println("Tekrarlanan eded var !");
//		}
//		else {
//			System.out.println("Tekrarlanan eded yoxdur !");
//		}
	
		
		
//		int[] arr = {4, 6, 2, 8, 4, 9};
//		int i=arr.length-1;
//		while(i>=0) {
//			System.out.print(arr[i]+",");
//			i--;
//		}
//		
		
//		int[] arr = {4, 6, 2, 8, 4, 9};
//		int i=0;
//		int toplam=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		
//		double ortalama=(double)toplam/arr.length;
//		
//		int j=0;
//		while(j<arr.length) {
//			if(arr[j]>ortalama) {
//				System.out.print(arr[j]+",");
//				
//			}j++;
//		}
//		
//-----------------------------------------------------------------------------------
		
//		int[] arr = {3, 5, 6, 3, 7, 6, 8, 5};
//		int i=0;
//		while(i<arr.length) {
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[j]==arr[i]) {
//					System.out.println(arr[i]+",");
//				}j++;
//			}i++;
//				
//		}
//	
//		int[] arr = {4, 7, 1, 3, 9};
//		int i=0;
//		int toplam=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		System.out.println(toplam);

		
//		int[] arr = {5, 12, 3, 21, 9};
//		int max=arr[0];
//		int i=1;
//		while(i<arr.length) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}i++;
//		}
//		
//		System.out.println(max);
//		
		
		
//		int[] arr = {8, 4, 15, 1, 10};
//		int min=arr[0];
//		int i=1;
//		while(i<arr.length) {
//			if(min>arr[i]) {
//				min=arr[i];
//			}i++;
//		}
//		
//		System.out.println(min);
//		
	
		
		
		
		
//		int[] arr = {2, 5, 7, 8, 9};
//		int toplam=0;
//		int i=0;
//		while(i<arr.length) {
//			if(arr[i]%2==1) {
//				toplam=toplam+arr[i];
//			}i++;
//		}
//		System.out.println(toplam);
//		
//		
		
		
//		int[] arr = {3, 6, 1, 9};
//		int i=arr.length-1;
//		while(i>=0) {
//			System.out.print(arr[i]+",");
//			i--;
//		}
//		
//		
		
//		int[] arr = {3,6,9,12,14,7};
//		int i=0;
//		int toplam=0;
//		while(i<arr.length) {
//			toplam=toplam+arr[i];
//			i++;
//		}
//		
//		double ortalama=(double)toplam/arr.length;
//		
//		int j=0;
//		while(j<arr.length) {
//			if(arr[j]>ortalama) {
//				System.out.print(arr[j]+",");
//			}j++;
//		}
		
		
//		int[] arr = {3,6,3,9,12};
//		int i=0;
//		boolean tekrar=false;
//		while(i<arr.length) {
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[j]==arr[i]) {
//					tekrar=true;
//					break;
//				}j++;
//			}if(tekrar) {
//				break;
//			}i++;
//		}
//		
//		if(tekrar) {
//			System.out.println("Tekrar eded var !");
//		}
//		else {
//			System.out.println("Tekrar eded yoxdur !");
//		}
//		
//		
//		
//		
		
		
//		int[] arr = {2, 4, 5};
//		int i=0;
//		while(i<arr.length) {
//			System.out.print((arr[i]*arr[i])+",");
//			i++;
//		}
//		
//		
//		
//		int[] arr = {2, 5, 2, 13, 13,5, 5,13};
//		int countmax=0;
//		int freq=arr[0];
//		
//		int i=0;
//		while(i<arr.length) {
//			int count=1;
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[j]==arr[i]) {
//					count++;
//				}
//				if(count>countmax) {
//					countmax=count;
//					freq=arr[i];
//				}j++;
//			}i++;
//		}
//		
//		System.out.println(freq);
//		
		
		
		
//		int[] ededler= {1,2,3,4,5,6,7,8};
//		int i=0;
//		int count=0;
//		while(i<ededler.length) {
//			if(ededler[i]%2==0) {
//				count++;
//			}i++;
//		}
//		
//		int[] yeni= new int[count];
//		int yenindex=0;		
//		int j=0;
//		while(j<ededler.length) {
//			if (ededler[j]%2==0) {
//			yeni[yenindex]=ededler[j];
//			yenindex++;
//			}
//			j++;
//		}
//		
//		int f=0;
//		while(f<yeni.length) {
//			System.out.print(yeni[f]+",");
//			f++;
//		}
//		
//-----------------------------------------------------------------------------		
	
		
		
//		Scanner scan=new Scanner(System.in);
//	System.out.println("Ededi daxil edin:");
//	int eded=scan.nextInt();
//	int toplam=0;
//	while(eded>0) {
//		int sonreqem=eded%10;
//		toplam=toplam+sonreqem;
//		eded=eded/10;
//	}
//		System.out.println(toplam);
		
		
//		Scanner scan=new Scanner(System.in);
//	System.out.println("Ededi daxil edin:");
//	int eded=scan.nextInt();	
//		
//	int reverse=0;
//	while(eded>0) {
//		int sonreqem=eded%10;
//		reverse=(reverse*10)+sonreqem;
//		eded=eded/10;
//	}
//		System.out.println(reverse);
//		
		
		
//		Scanner scan=new Scanner(System.in);
//	System.out.println("Ededi daxil edin:");
//	int eded=scan.nextInt();	
//		int original=eded;
//	int reverse=0;
//	while(eded>0) {
//		int sonreqem=eded%10;
//		reverse=(reverse*10)+sonreqem;
//		eded=eded/10;
//	}
//if(reverse==original) {
//	System.out.println("Eded palindromdur ! ");
//}
//else {
//	System.out.println("Eded palindrom deyil !");
//}
		
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		
//		int max=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			if(sonreqem>=max){
//				max=sonreqem;
//			}eded=eded/10;
//			}
//		
//		
//		System.out.println(max);
		
		
//	int[] ededler= {2,3,4,7,8,9};
//		
//		int max=ededler[0];
//		int i=0;
//		while(i<ededler.length) {
//			if(ededler[i]>max) {
//				max=ededler[i];
//			}i++;
//		}
//		System.out.println(max);
//		
		
	
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Sozu daxil edin:");
//		String soz=scan.nextLine();
//		
//		
//		String result="";
//		int i=0;
//		
//		while(i<soz.length()) {
//			int j=0;
//			
//			while(j<soz.length()) {
//				int count=0;
//				if(soz.charAt(i)==soz.charAt(j))
//					count++;
//				if(count>1 && count<=2) {
//					result+=soz.charAt(j);
//							break;
//				}j++;
//			}i++;
//		
//		}
//		System.out.println(result);
		
		
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scanner.nextInt();
//		while(eded>=10) {
//			int toplam=0;
//			while(eded>0) {
//				int son=eded%10;
//				toplam+=son;
//				eded=eded/10;
//			}
//			eded=toplam;
//		}
//		
//		
//		System.out.println(eded);
		
		
		
//		ArrayList<Integer>tekler=new ArrayList<Integer>();
//		ArrayList<Integer>cutler=new ArrayList<Integer>();
//		ArrayList<Integer>ededler= new ArrayList<Integer>(List.of(1,2,3,4,5,6));
//		
//		int i=0;
//		while(i<ededler.size()) {
//			if(ededler.get(i)%2==0) {
//				cutler.add(ededler.get(i));
//			}
//			else {
//				tekler.add(ededler.get(i));
//			}i++;
//		}
//		
//		System.out.println("Tek ededler"+tekler);
//		System.out.println("Cut ededler"+cutler);

		
		
		Random rnd=new Random();
		Scanner scan=new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}