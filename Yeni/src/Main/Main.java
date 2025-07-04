package Main;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		
//2.	
		
//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		
//3.
		
//		int i=1;
//		while(i<=100) {
//			if (i%2==0) {
//				System.out.println(i);
//				
//			}
//			i++;
//		}
		
//4.
//		int i=1;
//		while(i<=100) {
//			if (i%2==1) {
//				System.out.println(i);
//				
//			}
//			i++;
//		}

//5.
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("Bir eded daxil edin:");
//		int eded=scan.nextInt();
//		int i=1;
//		int toplam=0;
//		
//		while(i<=eded) {
//			toplam=toplam+i;
//			i++;
//		}
//			System.out.println(toplam);
//		
		
//6.
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Eded daxil edin:");
//		int eded=scan.nextInt();
//		int i=1;
//		int toplam=0;
//		while(i<=eded) {
//			if (i%2==0) {
//				toplam=toplam+i;
//			}
//			i++;
//		}
//		System.out.println(toplam);
		
//7.
		
		
//		int toplam=0;
//		while(true) {
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Eded daxil edin:");
//			int eded=scan.nextInt();
//			if(eded<0) {
//				break;
//			}
//			toplam=eded+toplam;
//		}
//		
//		System.out.println(toplam);
		
//8.
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i*i);
//			i++;
//		}
		
//9.
		
//		int i=1;
//		while(i<=100) {
//			if(i%5==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		
//10.
		
//	int i=1;
//	int hasil=1;
//	while(i<=10) {
//		hasil=hasil*i;
//		i++;
//	}
//		System.out.println(hasil);
//		
		
//11.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int toplam=0;
//	while(eded>0) {
//		int sonreqem=eded%10;
//		toplam=toplam+sonreqem;
//		eded=eded/10;
//	}
//	
//	System.out.println(toplam);
	
//12.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int toplam=1;
//	while(eded>0) {
//		int sonreqem=eded%10;
//		toplam=toplam*sonreqem;
//		eded=eded/10;
//	}
//	
//	System.out.println(toplam);
	
//13.
//		Scanner scan=new Scanner(System.in);
//	int say=0;
//	int toplam=0;
//	while(say<5) {
//		System.out.println((say+1)+" "+"-ci ededi daxil edin:");
//		int eded=scan.nextInt();
//		toplam=toplam+eded;
//		say++;
//	}
//	double netice=(double) toplam/5;
//	
//	System.out.println(netice);
	
//14.
//		int say=0;
//		int i=1;
//		while(i<=100) {
//			if(i%7==0) {
//				say++;
//			}
//			i++;
//		}
//		
//		System.out.println(say);
//		
		
//15.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int reverse=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			reverse=reverse*10+sonreqem;
//			eded=eded/10;
//		}
//		
//		System.out.println(reverse);
//		
	
//16.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int original=eded;
//		int reverse=0;
//		while(eded>0) {
//			int sonreqem=eded%10;
//			reverse=reverse*10+sonreqem;
//			eded=eded/10;
//		}
//		
//if(original==reverse) {
//	System.out.println("Bu eded palindromdur!");
//}
//else {
//	System.out.println("Bu eded palindrom deyil !");
//}
//		
//		
		
//17.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int i=1;
//		while(i<=100) {
//			if(i%3==0 && i%5==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		
//		
		
//19.
		
//		Scanner scan=new Scanner(System.in);
//		
//		int max=1;
//		int eded;
//		while(true) {
//			System.out.println("Eded daxil edin:");
//			eded=scan.nextInt();
//			if(eded==0) {
//				break;
//			}
//				if(eded>max) {
//					max=eded;
//				}
//		}
//		
//		System.out.println("En boyuk eded:"+" "+max);
//		
		
//20.
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Eded daxil edin:");
//		int eded=scan.nextInt();
//	    int i=1;
//	    int netice=1;
//	    while(i<=eded) {
//	    	netice=netice*i;
//	    	i++;
//	    }
//	
//		System.out.println(netice);
//		
//		
//		
		
//		
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Ededi daxil edin:");
//	int eded=scan.nextInt();
//	int i=1;
//	while(i<eded) {
//		if(eded%i==0) {
//			System.out.print(i+",");
//		}i++;
//	}
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int i=eded;
//		int count=0;
//		while(i>0) {
//			if(eded%i==0) {
//				count++;
//			}i--;
//		}
//		
//		if(count==2) {
//			System.out.println("Eded sadedir !");
//		}
//		else {
//			System.out.println("Sade deyil !");
//		}
//		
//		
		
	
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int i=2;
//		while(i<=eded) {
//			int j=i;
//			int count=0;
//			while(j>0) {
//				if(i%j==0) {
//					count++;
//				}j--;
//			}if(count==2) {
//				System.out.print(i+" ");
//			}i++;
//		}
//		
//		
//		
		
		
		
//		int i=1;
//		while(i<=100) {
//			if(i%3==0 && i%5==0) {
//				System.out.println(i);
//			}i++;
//		}
//			
//			
//			
			
			
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		
//	
//		int i=eded;
//		int netice=1;
//		while(i>0) {
//			netice=netice*i;
//			i--;
//		}
//		System.out.println(netice);
//		
//		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		
//		int i=1;
//		int toplam=0;
//		while(i<=eded) {
//			if(i%2==1) {
//			toplam=toplam+i;	
//			}i++;
//		}
//		System.out.println(toplam);
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Ededi daxil edin:");
//		int eded=scan.nextInt();
		
		
//		int i=1;
//		int toplam=0;
//		while(i<eded) {
//			if(eded%i==0) {
//				toplam=toplam+i;
//			}i++;
//		}
//		if(eded==toplam) {
//			System.out.println("Mukemmel ededdir");
//		}
//		else {
//			System.out.println("Mukemmel deyil !");
//		}
//		
//		
//	
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Ededi daxil edin:");
//		int eded=scan.nextInt();		
//		
//		int i=1;
//		while(i<eded) {
//			int j=1;
//			int toplam=0;
//			while(j<i) {
//				if(i%j==0) {
//					toplam+=j;
//				}j++;
//			}if(toplam==i) {
//				System.out.println(i);
//			}i++;
//		}
//		
//		
//		
		
		
//		int[] arr = {5, 1, 4, 2, 3};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		
//		
//		
//		int[] a = {1, 2, 3};
//		int[] b = {1, 2, 3};
//		System.out.println(Arrays.equals(a,b));
//		
		
//		int[] arr=new int[6];
//		Arrays.fill(arr, 99);
//		System.out.println(Arrays.toString(arr));
//		
		
//		int[] arr = {1, 3, 5, 3, 7, 1, 9, 5};
//		
//		int i=0;
//		while(i<arr.length) {
//			int j=i+1;
//			while(j<arr.length) {
//				if(arr[i]==arr[j])
//					System.out.println(arr[j]);
//				j++;
//			}i++;
//		}
//		
//		
		
		
//int[] arr = {1, 3, 5, 3, 7, 1, 9, 5};
//		
//	int i=0;
//	while(i<arr.length) {
//		int count=0;
//		int j=0;
//		while(j<arr.length) {
//			if(arr[i]==arr[j]) {
//				count++;
//			}j++;
//		}if(count==1) {
//			System.out.print(arr[i]+" ");
//		}i++;
//	}
//		
//		
		
//	int [][] matris= {
//			{10,20,30},
//			{40,50,60},
//			{70,80,90}
//	};
//		int i=0;
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				System.out.print(matris[i][j]+",");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//		
	
//		
//		int [][] matris= {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};	
//		
//		
//		
//		int i=0;
//		while(i<matris.length) {
//			int toplam=0;
//			int j=0;
//			while(j<matris[i].length) {
//				toplam=toplam+matris[i][j];
//				j++;
//			}
//			System.out.println("Setir:"+i+",Cem:"+toplam);
//			i++;
//		}
//		
		
		
		

		
//		int [][] matris= {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};	
//		int toplam=0;
//	int i=0;
//	while(i<matris.length) {
//		int j=0;
//		while(j<matris[i].length) {
//			toplam=toplam+matris[i][j];
//			j++;
//		}i++;
//	}
//		
//		
//		double ortalama=(double)toplam/(matris.length*matris[0].length);
//		System.out.println(ortalama);

		
		
//		int [][] matris= {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};	
//		
//		int i=0;
//		int max=matris[0][0];
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]>max) {
//					max=matris[i][j];
//				}j++;
//			}i++;
//		}
//		
//		System.out.println(max);
//		
		
//		
//		int [][] matris= {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};	
//		
//		int i=0;
//		int min=matris[0][0];
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]<min) {
//					min=matris[i][j];
//				}j++;
//			}i++;
//		}
//		
//		System.out.println(min);
//		
//		
//		
		
//		int [][] matris= {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};	
//		int i=0;
//		int count=0;
//		while (i<matris.length){
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]%2==0) {
//					System.out.print(matris[i][j]+",");
//					count++;
//				}j++;
//			}i++;
//		}
//		System.out.println("\n"+count+" eded cut eded var !");
//		
//		
		
//		int [][] matris= {
//				{10,20,30},
//				{40,50,60},
//				{70,80,90}
//		};	
//		
//		int i=0;
//		int max=Integer.MIN_VALUE;
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]%2==0 && matris[i][j]>max) {
//					max=matris[i][j];
//				}j++;
//			}i++;
//		}
//		
//		if(max==Integer.MIN_VALUE) {
//			System.out.println("Massivde cut eded yoxdur !");
//		}
//		else {
//			System.out.println("Massivdeki en boyuk cut eded:"+max);
//		}
//		
//		
//		
		
//		String[] sozler = {"alma", "armud", "banan", "ananas", "nar"};
//		for(String soz:sozler) {
//			if(soz.startsWith("a")) {
//				System.out.print(soz+",");
//			}
//		}
//		
//		
		
//		String[] sozler = {"alma", "aya", "qaya", "salam", "dava"};
//		for(String soz:sozler) {
//			if(soz.endsWith("a")) {
//				System.out.print(soz+",");
//			}
//		}
		
//		int[][] matris = {
//			    {5, 10, 15},
//			    {20, 25, 30},
//			    {35, 40, 45}
//			};
//		int i=0;
//		int toplam=0;
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				toplam=toplam+matris[i][j];
//				j++;
//			}i++;
//		}
//		
//		double ortalama=(double)toplam/(matris.length*matris[0].length);
//		System.out.println(ortalama);
//		
		
//		int[][] matris = {
//			    {5, 10, 15},
//			    {20, 25, 30},
//			    {35, 40, 45}
//			};
//		int i=0;
//		int max=matris[0][0];
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]>max) {
//					max=matris[i][j];
//				}j++;
//			}i++;
//		}
//		
//		System.out.println("En boyuk eded:"+max);
//		
		
		
//		int[][] matris = {
//			    {5, 10, 15},
//			    {20, 25, 30},
//			    {35, 40, 45}
//			};
//		int i=0;
//		int min=matris[0][0];
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]<min) {
//					min=matris[i][j];
//				}j++;
//			}i++;
//		}
//		
//		System.out.println("En kicik eded:"+min);
//		
		

//		int[][] matris = {
//			    {5, 10, 15},
//			    {20, 25, 30},
//			    {35, 40, 45}
//			};
//		
//		
//		int count=0;
//		int i=0;
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]%2==0) {
//					System.out.print(matris[i][j]+",");
//					count++;
//				}j++;
//			}i++;
//		}
//		
//		System.out.println("\nSayi:"+count);

		
		
//		int[][] matris = {
//			    {5, 10, 15},
//			    {20, 25, 30},
//			    {35, 40, 45}
//			};
//		
//		int count=0;
//		int i=0;
//		int max=Integer.MIN_VALUE;
//		while(i<matris.length) {
//			int j=0;
//			while(j<matris[i].length) {
//				if(matris[i][j]%2==0 && matris[i][j]>max) {
//				max=matris[i][j];
//				}j++;
//			}i++;
//		}
//		
//		
//		if(max==Integer.MIN_VALUE) {
//			System.out.println("Cut eded yoxdur !");
//		}
//		else {
//			System.out.println("En boyuk cut eded:"+max);
//		}
//		
		
		
//		String[] sozler = {"alma", "armud", "banan", "ananas", "nar"};
//		for(String soz:sozler) {
//			if(soz.startsWith("a")) {
//				System.out.print(soz+",");
//			}
//		}
//		
		
		
		
//		String[] sozler = {"alma", "aya", "qaya", "salam", "dava"};
//		for(String soz:sozler) {
//			if(soz.endsWith("a")) {
//				System.out.print(soz+",");
//			}
//		}
		
		
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Cumleni daxil edin:");
//		String cumle=scan.nextLine();
//		System.out.println("Cumledeki simvollarin sayi:"+cumle.length());
//		
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("Sozu daxil edin:");
//		String soz=input.nextLine();
//		char ilk=soz.charAt(0);
//		char son=soz.charAt(soz.length()-1);
//	System.out.println("Ilk herf:"+ilk+"\nSon herf:"+son);
//		
		
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("Sozu daxil edin:");
//		String sozString=input.nextLine();
//				
//		System.out.println(sozString.toLowerCase());
//		System.out.println(sozString.toUpperCase());
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Cumleni daxil edin:");
//		String cumle=scan.nextLine();
//		int say=0;
//		int i=0;
//		while(i<cumle.length()) {
//			if(cumle.charAt(i) == 'a'|| cumle.charAt(i)=='A') {
//				say++;
//			}i++;
//		}
//		
//		System.out.println("Cumlede "+say+" defe 'a' herfi kechir !");
//		
//		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Sozu daxil edin:");
//		String soz=scan.nextLine();
//		
//		String reverse="";
//		int i=soz.length()-1;
//		while(i>=0) {
//			reverse=reverse+soz.charAt(i);
//			i--;
//		}
//		System.out.println("Sozun tersi:"+reverse);
		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Sozu daxil edin:");
//		String sozString=scan.nextLine();
//		
//		System.out.println("Cumledeki 2-4 araligindaki herfler: "+sozString.substring(1,4));
//		

		
//	Scanner scan=new Scanner(System.in);
//	ArrayList<Integer> ededler=new ArrayList<>();
//		int i=0;
//		System.out.println("Ededleri daxil edin:");
//		while(i<5) {
//	int eded=scan.nextInt();
//	ededler.add(eded);
//	i++;
//		}
//		
//		
//		int j=0;
//		while(j<ededler.size()) {
//			if(ededler.get(j)%2==0) {
//				System.out.println(ededler.get(j));
//			}j++;
//		}
//		
//----------------------------------------------------------------------		
//----------------------------------------------------------------------		
//----------------------------------------------------------------------		
	
		
		
//Scanner scan=new Scanner(System.in);
//System.out.println("5 eded daxil edin !");
//ArrayList<Integer>ededler=new ArrayList<>();
//int i=0;
//while(i<5) {
//	int eded=scan.nextInt();
//	ededler.add(eded);
//	i++;
//		
//}	
//		
//		System.out.println("Daxil edilen ededler:"+ededler);
		
		
		
//	ArrayList<Integer> ededler=new ArrayList<>();
//	
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(14);
//		ededler.add(16);
//		ededler.add(41);
//		ededler.add(18);
//		
//		
//		int i=0;
//		while(i<ededler.size()) {
//			if(ededler.get(i)%2==0) {
//				System.out.print(ededler.get(i));
//			}i++;
//		}
//		
		
//		ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(14);
//		ededler.add(16);
//		ededler.add(41);
//		ededler.add(18);
//		
//		int max=ededler.get(0);
//		int i=1;
//		while(i<ededler.size()) {
//			if(ededler.get(i)>max) {
//				max=ededler.get(i);
//			}i++;
//		}
//		
//		
//		System.out.println(max);
		
//	

		
//	ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(14);
//		ededler.add(16);
//		ededler.add(41);
//		ededler.add(18);
//		
//		
//		int i=0;
//		int toplam=0;
//		while(i<ededler.size()) {
//			toplam=toplam+ededler.get(i);
//			i++;
//		}
//		
//	double ortalama=(double)toplam/ededler.size();
//		
//		System.out.println(ortalama);
		
//		
//	ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(14);
//		ededler.add(16);
//		ededler.add(41);
//		ededler.add(18);
//		
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		if(ededler.contains(eded)) {
//			System.out.println("Bu eded arraylistde var !");
//		}
//		else {
//			System.out.println("Bu eded arraylistde yoxdur !");
//			
//		}
		
		
//		
//		ArrayList<Integer> ededler=new ArrayList<>();
//			
//			ededler.add(11);
//			ededler.add(12);
//			ededler.add(23);
//			ededler.add(14);
//			ededler.add(16);
//			ededler.add(41);
//			ededler.add(18);	
//		
//		
//	Collections.sort(ededler);
//		
//		int i=ededler.size()-1;
//		while(i>=0) {
//			System.out.println(ededler.get(i));
//			i--;
//		}
		
		
		
		
//		ArrayList<Integer> ededler=new ArrayList<>();
//			
//			ededler.add(11);
//			ededler.add(12);
//			ededler.add(23);
//			ededler.add(12);
//			ededler.add(16);
//			ededler.add(41);
//			ededler.add(41);	
//		
//		int i=0;
//		while(i<ededler.size()) {
//			int j=i+1;
//			while(j<ededler.size()) {
//				if(ededler.get(i)==ededler.get(j)) {
//					ededler.remove(ededler.get(j));
//				}j++;
//			}i++;
//		}
//		
//		
//		System.out.println(ededler);
//		
		
		
		
//		ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(13);
//		ededler.add(16);
//		ededler.add(41);
//		ededler.add(28);	
//		
//		
//		int i=ededler.size()-1;
//		while(i>=0) {
//			System.out.println(ededler.get(i));
//			i--;
//		}
//		
		
//------------------------------------------------------------------------------------		
//		ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(13);
//		ededler.add(31);
//		ededler.add(41);
//		ededler.add(28);
//		
//		
//	int max=ededler.get(0);
//	int i=1;
//	while(i<ededler.size()) {
//		if(ededler.get(i)>max) {
//			max=ededler.get(i);
//		}i++;
//	}
//	
//		int max2=0;
//		int j=1;
//		while(j<ededler.size()) {
//			if(ededler.get(j)>max2 && ededler.get(j)<max) {
//				max2=ededler.get(j);
//			}j++;
//		}
//		
//		
//		System.out.println(max2);
		
		
		
		
//		ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(13);
//		ededler.add(31);
//		ededler.add(41);
//		ededler.add(28);
//		
//		int i=0;
//		int toplam=0;
//		while(i<ededler.size()) {
//			if(ededler.get(i)%2==0) {
//				toplam=toplam+ededler.get(i);
//			}i++;
//		}
//	
//		System.out.println(toplam);
		
//ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(13);
//		ededler.add(31);
//		ededler.add(41);
//		ededler.add(28);
//		
//		int i=0;
//		int toplam=0;
//		while(i<ededler.size()) {
//			if(ededler.get(i)%2==1) {
//				toplam=toplam+ededler.get(i);
//			}i++;
//		}
//	
//		System.out.println(toplam);
//		

//		ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(13);
//		ededler.add(31);
//		ededler.add(41);
//		ededler.add(28);
//		
//		int i=1;
//		while(i<ededler.size()) {
//			System.out.println(ededler.get(i));
//			i=i+2;
//		}
		
//		ArrayList<Integer> ededler=new ArrayList<>();
//		
//		ededler.add(11);
//		ededler.add(12);
//		ededler.add(23);
//		ededler.add(13);
//		ededler.add(31);
//		ededler.add(41);
//		ededler.add(28);
//		
//		int i=0;
//	while(i<ededler.size()) {
//		
//		System.out.println(ededler.get(i)*ededler.get(i));
//		i++;
//	}
		
//		ArrayList<Integer> ededler=new ArrayList<Integer>();
//		ededler.add(12);
//		ededler.add(13);
//		ededler.add(14);
//		ededler.add(15);
//		ededler.add(16);
//		ededler.add(17);
//		
//		
//		for(int eded : ededler) {
//			if(eded%2==0) {
//				System.out.println(eded);
//			}
//		}
//		
		
//ArrayList<Integer>ededler=new ArrayList<>();		
//		
//		ededler.add(11);
//		ededler.add(14);
//		ededler.add(16);
//		ededler.add(17);
//		ededler.add(23);
//		ededler.add(21);
//		ededler.add(24);
//		ededler.add(19);
//		ededler.add(12);
//		ededler.add(13);
		
//		for(int eded:ededler) {
//			if(eded%2==0) {
//				System.out.println(eded);
//			}
//		}
//		
//		int max=ededler.get(0);
//				
//		for(int eded:ededler) {
//			if(eded>max) {
//				max=eded;
//			}
//		}
//		System.out.println(max);
//		
		
		
//		int min=ededler.get(0);
//		
//		for(int eded:ededler) {
//			if(eded<min) {
//				min=eded;
//			}
//		}
//		System.out.println(min);
//		
		
//		int toplam=0;
//		for(int eded:ededler) {
//			if(eded%2==1) {
//				toplam+=eded;
//			}
//		}
//		System.out.println(toplam);
		
		
		
//		int max=ededler.get(0);
//		for(int eded:ededler) {
//			if(eded>max) {
//				max=eded;
//			}
//		}
//		int max2=ededler.get(0);
//		for(int eded:ededler) {
//			if(eded>max2 && eded<max) {
//				max2=eded;
//			}
//		}
//		System.out.println(max2);
//		
		
//	int i=1;
//	while(i<ededler.size()) {
//		System.out.println(ededler.get(i));
//		i+=2;
//	}
//		
//		
	
//		
//		for(int eded:ededler) {
//			System.out.println(eded*eded);
//		}
//		
		
//		boolean var=false;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Ededi daxil edin:");
//		int eded=scan.nextInt();
//		int i=0;
//		while(i<ededler.size()) {
//			if(ededler.get(i)==eded){
//				var=true;
//				break;
//			}i++;
//		}
//			if(var) {
//				System.out.println("Eded arrayda var !");
//			}
//			else {
//				System.out.println("Eded arrayda yoxdur !");
//			}
//		
	
		
//		int i=0;
//		while(i<ededler.size()) {
//			int j=i+1;
//			while(j<ededler.size()) {
//				if(ededler.get(i)==ededler.get(j)) {
//					ededler.remove(j);
//				}j++;
//			}i++;
//		}
//		
//		System.out.println(ededler);
//		
		
		
//		ededler.sort(null);
//		int i=ededler.size()-1;
//		while(i>=0) {
//			System.out.println(ededler.get(i));
//			i--;
//		}
//		
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("5 eded daxil edin:");
//		int i=0;
//		int toplam=0;
//		while(i<5) {
//			int eded=scan.nextInt();
//			toplam+=eded;
//			i++;
//		}
//		double ortalama=(double)toplam/5;
//		System.out.println(ortalama);
//		
		
		
//		evenNumbers(ededler);
//		System.out.println("--");
//		System.out.println(maxNumber(ededler));
//		System.out.println("--");
//		System.out.println(average(ededler));
		
		
		
//		System.out.println(sum(3,5));
//		System.out.println(tekcut(4));
ArrayList<Integer>ededler=new ArrayList<>();		
		
		ededler.add(11);
		ededler.add(14);
		ededler.add(16);
		ededler.add(17);
		ededler.add(23);
		ededler.add(21);
		ededler.add(24);
		ededler.add(19);
		ededler.add(12);
		ededler.add(13);
		
//		
//		kvadratCemi2(ededler);
//        System.out.println(kvadratCemi(ededler));	
		
//		tekcutSayi(ededler);
		
//		boyuk20(ededler);
		
//		mesajYaz();
//		int eded=sabitEded();
//		System.out.println(eded);
//		System.out.println(motivasiya());
	
		
//	System.out.println(topla(2, 3));
//	System.out.println(topla(2,3,4));
//	System.out.println(topla(2.3,4.2));
//		
		
//	System.out.println(kubcemi(2, 3));	
		System.out.println(sadedirmi(35));
		
		
		
}

//public static void evenNumbers(ArrayList<Integer>list) {
//	for(int eded:list) {
//		if(eded%2==0) {
//			System.out.println(eded);
//		}
//	}
//}
//
//
//public static int maxNumber(ArrayList<Integer>list) {
//	int max=list.get(0);
//	
//	for(int eded:list) {
//		if(eded>max) {
//			max=eded;
//		}
//	}
//	
//	return max;
//}
//	
//public static double average(ArrayList<Integer>list) {
//	int i=0;
//	int toplam=0;
//	while(i<list.size()) {
//		toplam+=list.get(i);
//		i++;
//	}
//	
//	double ortalama=(double)toplam/list.size();
//	return ortalama;
//	
//}
//	
	
//	public static int sum(int a,int b) {
//		int netice=a+b;
//		return netice;
//	}
//	
//	public static String tekcut(int a) {
//		if(a%2==0) {
//			return "Eded cut ededdir";
//		}
//		else {
//			return "Eded tek ededdir";
//		}
//	}
	
//	
//	public static int maxNumber(ArrayList<Integer>list) {
//		int max=list.get(0);
//		int i=1;
//		while(i<list.size()) {
//			if(max<list.get(i)) {
//				max=list.get(i);
//			}i++;
//		}
//		return max;
//	}
	
	public static int kvadratCemi(ArrayList<Integer>list) {
		int i=0;
		int toplam=0;
		while(i<list.size()) {
			int kvadrat=list.get(i)*list.get(i);
			toplam+=kvadrat;
			i++;
		}return toplam;
	}
	
	
	public static void kvadratCemi2(ArrayList<Integer>list) {
	int toplam=0;
		for(int eded:list) {
		int kv=eded*eded;
		toplam+=kv;
		}
		System.out.println(toplam);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void tekcutSayi(ArrayList<Integer>list) {
		int i=0;
		int count1=0;
		int count2=0;
		while(i<list.size()) {
			if(list.get(i)%2==0) {
				count2++;
			}
			else {
				count1++;
			}i++;
		}System.out.println("Tek ededlerin sayi:"+count1+"\n"+"Cut ededlerin sayi:"+count2);
	}
	
	public static void boyuk20(ArrayList<Integer>list) {
		int i=0;
		while(i<list.size()) {
			if(list.get(i)>20) {
				System.out.println(list.get(i));
			}i++;
		}
	}
	
//	public static void mesajYaz() {
//		System.out.println("Java oyrenmek guclendirir !");
//	}
//	public static int sabitEded() {
//		return 42;
//	}
//	
//	public static String motivasiya() {
//		return "Sen bunu bacararsan !";
//	}
//	
	public static int cix(int a,int b) {
		return a-b;
	}
	
	public static int cix(int a,int b,int c) {
		return a-b-c;
	}
	
	public static double cix(double a,double b) {
		return a-b;
	}
	
	
	public static int kub(int a) {
		return a*a*a;
	}
	
	public static int kubcemi(int a,int b) {
		return kub(a)+kub(b);
	}
	public static int tekKubCemi(ArrayList<Integer>list) {
		int i=0;
		int toplam=0;
		
		while(i<list.size()) {
			if(list.get(i)%2==1) {
				toplam+=kub(list.get(i));
			}i++;
		}return toplam;
	}
	
	public static boolean sadedirmi(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}return true;
	}
	
	
	
	
	
	
	
	
	
}
