package today2022_04_21_1;
import java.util.Scanner;
public class averageSeason {
static void line() {
	System.out.println("----------------");
}

public static void main(String[]args) {
	student s=new student("����������","22�й�");
	s.myself("�� ���ǿ콺", "17��", "�̽��׸�� ��3���� �޸��ǽ�Ʈ ���� �� �����׾�32-1");
	s.show();
}
}
class person{
	String name;
	String age;
	String address;
	person(){
		
	}
}
class student extends person{
	String subname;
	String SYnumber;
	double []season =new double[8];
	student(String subname,String SYnumber) {
	this.subname=subname;
	this.SYnumber=SYnumber;
	}
	void myself(String name,String age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	double average() {
		double temp=0;
		Scanner scan= new Scanner(System.in);
		for(int i=0; i<8; i++) {
			System.out.println();
			System.out.print((i+1)+"�б� ����->");
			season[i]= scan.nextDouble();
			temp=temp+season[i];
		}
		double Aver=temp/8;
		System.out.println("�������:"+Math.round(Aver*10)/10);
		return Aver;
	}
	void show() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		System.out.println("�ּ�:"+address);
		System.out.println("�а�:"+subname);
		System.out.println("�й�:"+SYnumber);
		averageSeason.line();
		average();
		
	}
}