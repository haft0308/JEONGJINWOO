package study_2022_03_30;
import java.util.Scanner;
public class review_1 {
static Scanner scan =new Scanner(System.in);
public static int a=0, b=0;
	public static void main(String[]args) {
		re9();
	}
	public static void random_null(int p) {
		int[] L=new int[p];
		int w;
		int k;
		
		for(int i=0; i<p; i++) {
			int temp=(int) (Math.random()*p)+1;
			L[i]=temp;
			for(int j=0; j<i;j++) {
				if(L[j]==temp) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<p; i++) {
			System.out.println(L[i]);
		}
	}
	public static void consol_c() {
		for(int i=0; i<100; i++) {
			System.out.println();
		}
	}
	public static void re1() {
		System.out.println("enter number (5)");
		int a=scan.nextInt();
		int p;
		int[] s=new int [a];
		for(int i=0; i<a; i++) {
			System.out.println("enter value");
			p=scan.nextInt();
			s[i]=p;
		}
		int k;
		int j;
		int num;
		System.out.println("while can count");
		j=scan.nextInt();
		for(int w=0; w<j;w++) {
			System.out.println("press change value to number");
			k=scan.nextInt();
			System.out.println("press value");
			num=scan.nextInt();
			s[k-1]=num;
		}
		for(int i=0; i<a; i++) {
			System.out.println((i+1)+"��°:"+s[i]);
		}
		
	}
	public static void re2() {
		int a=10;
		int sum=0;
		int t=0;
		int val;
		int max=0;
		int min=0;
		
		int[] array=new int [a];
		min=array[0];
		for(int i=0; i<a; i++) {
			System.out.println("enter the t value");
			t=scan.nextInt();
			array[i]=t;
			sum=sum+t;
			}
		min=array[0];
		max=array[0];
		for(int i=0; i<a; i++)
		{
			if(array[i]>max) {
				max=array[i];
			}
		    if(array[i]<min) {
				min=array[i];	
		    }
		}
		float mew=sum/a; 
		System.out.println("���� ū ����:"+max+"���� ���� ����:"+min+"������:"+sum+"�����:"+mew);
}
	public static void re3() {
	int a=10;
	int b;
	int[] ar=new int [a];
	System.out.println("you want a find value to number1~10");
	b=scan.nextInt();

	for(int i=0;i<a;i++) {
		ar[i]=((int)(Math.random()*a));
		if(ar[i]==b) {
			System.out.println("�ε���"+i+"���� �˻�");
		}
	}
	}
	public static void re4() {
		a=45;
		int[] arr=new int [a];
		for(int i=0; i<a; i++) {
			int temp=((int)(Math.random()*a)+1);
			arr[i]=temp;
			for(int j=0; j<i; j++) {
				if(temp==arr[j]) {
					i--;
					break;
				}
			}	
		}
		System.out.println("�ε��� 0~44�� ����ּ���");
		System.out.println("10�� arr�� ���� ��ü�մϴ�.");
		for(int i=0; i<10; i++) {
			System.out.println("�ٲ� ���� ������ �ε��� ��ȣ�� �Է����ֽʽÿ�.");
			int fir=scan.nextInt();
			System.out.println(fir+"���� ����"+arr[fir]+"�Դϴ�.");
			System.out.println("�ٲ� ���� ��ǥ �ε��� ��ȣ�� �Է����ֽʽÿ�");
			int sec=scan.nextInt();
			System.out.println(sec+"���� ����"+arr[sec]+"�Դϴ�.");
			System.out.println("���� ���� �ٲٰڽ��ϴ�.");
			System.out.println("----------------------");
			int temp= arr[sec];
			arr[sec]=arr[fir];
			arr[fir]=temp;
			System.out.println("arr["+fir+"]��"+arr[fir]+"/ arr["+sec+"]��"+arr[sec]);
			System.out.println("�������� ���Ƿ��� ������ �����ּ���");
			int next= scan.nextInt();
			consol_c();
		}
	}
	public static void re5() {
		a=3;
		b=3;
		int temp=0;
		int[][] student=new int [a][b];
		int[] sum=new int[a];
		for(int i=0; i<a; i++) {
			consol_c();
			System.out.println(i+"��°�� �л��� ���� �Է�");
			for(int j=0; j<b; j++) {
				if(j==0) {
					System.out.println("���� ����:");
				}
				else if(j==1) {
					System.out.println("���� ����:");
				}
				else if(j==2) {
					System.out.println("���� ����:");
				}
				student[i][j]=scan.nextInt();
				temp=student[i][j]+temp;
				sum[i]=temp;
				
			}temp=0;
			
		}
		
		System.out.println("\t ����\t ����\t ����\t ����");
		System.out.println("1�� �л�"+"\t"+student[0][0]+"\t"+student[0][1]+"\t"+student[0][2]+"\t"+sum[0]);
		System.out.println("2�� �л�"+"\t"+student[1][0]+"\t"+student[1][1]+"\t"+student[1][2]+"\t"+sum[1]);
		System.out.println("3�� �л�"+"\t"+student[2][0]+"\t"+student[2][1]+"\t"+student[2][2]+"\t"+sum[2]);
	}
	public static void re6() {
		System.out.println("�Ž������� �Է�����");
		int pay=scan.nextInt();
		int [] arr=new int [4];
		int p=0;
		for(int i=0; i<4; i++) {
			if(i==0) {
				p=500;
			}
			else if(i==1) {
				p=100;
			}
			else if(i==2) {
				p=50;
			}
			else if(i==3) {
				p=10;
			}
				
			arr[i]=pay/p;
			pay=pay%p;
		}
		
		System.out.println("500������ ������"+arr[0]);
		System.out.println("100������ ������"+arr[1]);
		System.out.println("50������ ������"+arr[2]);
		System.out.println("10������ ������"+arr[3]);
		
	}
	public static void re7() {
		System.out.println("������ ���鲨��?");
		a=scan.nextInt();
		
		String [][]answer=new String[a][];
		for(int i=0; i<a; i++) {
			System.out.println("answer["+(i+1)+"]�࿡�� ��� ���鲨��?");
			 answer[i]=new String[scan.nextInt()];
			 for(int j=0; j<answer[i].length; j++) {
					answer[i][j]="*";
					System.out.print(answer[i][j]);
			}System.out.println();
		}
	}
	public static void re8() {
		char[][] star= {
				{'*','*',' ',' ',' ',},
				{'*','*',' ',' ',' ',},
				{'*','*',' ',' ',' ',},
				{'*','*','*','*','*',},
				{'*','*','*','*','*',}
		};
		char[][] temp=new char [5][5];
		//x=5 y=4
		//x=4 y=5 right
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				temp[i][j]=star[i][j];
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0; j<5; j++) {
				if(i==0) {
					star[i][j]=temp[j][0];
				}
				if(i==1) {
					star[i][j]=temp[j][1];
				}
				if(i==2) {
					star[i][j]=temp[i][j];
				}
				if(i==3) {
					star[i][j]=temp[1][j];
				}
				if(i==4) {
					star[i][j]=temp[0][j];
				}
				System.out.print(star[i][j]);
			}
		}
	}
	public static void re9() {
		String str="`~!@#$%^&*()-_+=|[]{};:,./qwertyuiop";
		String stl="abcdefghijklmnopqrstuvwxyz0123456789";
		a=2;
		b=36;
		char[][] re9=new char[a][b];
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				
				if(i==0) {
					re9[i][j]=str.charAt(j);
				}
				if(i==1) {
					re9[i][j]=stl.charAt(j);
				}
		}
		}
		System.out.print("src:");
		String k=scan.next();
		System.out.print(k);
		System.out.println();
		int PL=k.length();
		char[] player= new char[PL];
		for(int i=0; i<PL;i++) {
			player[i]=k.charAt(i);
		}
		System.out.print("result:");
		for(int t=0; t<PL;t++) {
			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					if(re9[i][j]==player[t]) {
						if(true) {	
							System.out.print(re9[i-1][j]);
						}
					}
				}
			}
		}
		
	}
	
}
