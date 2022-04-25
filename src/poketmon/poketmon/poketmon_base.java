package poketmon;
import java.util.Scanner;

public abstract class poketmon_base {
	static Scanner scan=new Scanner(System.in);
	public String player;
	static int no=0;
	public static boolean Stop;

	public static int readint(String line,int choice) {
		int input;
		
		do {
			System.out.println(line);
			try{
				input=Integer.parseInt(scan.next());
			}catch(Exception e) {
				input=-1;
				System.out.println("plese press Integer");
			}		
		}while(input<1||input>choice); 
		return input;		
	}
	public static void C_clear() {
		for(int i=0; i<100; i++) {
			System.out.println();
		}
	}
	public static void C_line(int count) {
		System.out.println();
		for(int i=0;i<count;i++) {
			System.out.print("-");
		}System.out.println();
	}
		
	public static void gamestart(){
		String name;
		boolean S1=true;
		int input=0;
		System.out.println("All skip key = [e]");
		System.out.print("game start--> ");
		scan.next();
		do {
			C_clear();
		System.out.println("what your name");		
		System.out.print("-->");
		name=scan.next();
		System.out.println("your name:"+name+"is ture?");
		System.out.println("(1) no");
		System.out.println("(2) yes");
		input=readint("-->", 2);
		}while(input==1);
		do {
			C_clear();
		System.out.println("all right\s"+name+"\snow pick up you poketmon!");
		System.out.println("(1)-Picachu-");
		System.out.println("(2)-GGobook-");
		System.out.println("(3)-Pairy-");
		input=readint("-->",3);
		if (input==1) {
			System.out.println("did you pick up Picachu?");
			System.out.println("(1) no");
			System.out.println("(2) yes");
			input=readint("-->", 2);
			if(input==1) {C_clear();
				System.out.println("one more pick up poketmon");
			}
			else if(input==2) {C_clear();
				System.out.println("ok! let's go playing game!");
				no=1;
				S1=false;
			}
		}
		else if(input==2) {C_clear();
			System.out.println("did you pick up GGobook?");
			System.out.println("(1) no");
			System.out.println("(2) yes");
			input=readint("-->", 2);
			if(input==1) {C_clear();
				System.out.println("one more pick up poketmon");
			}
			else if(input==2) {C_clear();
				System.out.println("ok! let's go playing game!");
				no=2;
				S1=false;
			}
		}
		else if(input==3) {C_clear();
			System.out.println("did you pick up Pairy?");
			System.out.println("(1) no");
			System.out.println("(2) yes");
			input=readint("-->", 2);
			if(input==1) {C_clear();
				System.out.println("one more pick up poketmon");
			}
			else if(input==2) {C_clear();
				System.out.println("ok! let's go playing game!");
				no=3;
				S1=false;
			}
		}
		}while(S1==true);
		menu();
		
	}
	public static void menu() {
		int input=0;
		Stop=true;
		character po=null;
		switch(no) {
		case 1:
			po=new Picachu();
			break;
		case 2:
			po=new GGobook();
			break;
		case 3:
			po=new Pairy();
			break;
		}
		do {
		C_clear();
		System.out.println("-choice Action-");
		C_line(30);
		System.out.println("(1)\t -Play-");
		System.out.println("(2)\t -Training-");
		System.out.println("(3)\t -sleep-");
		System.out.println("(4)\t -eat-");
		System.out.println("(5)\t -Show Info-");
		System.out.println("(6)\t -EXIT-");
		C_line(30);
		input=readint("-->", 6);
		if(input==1) {
			C_clear();
			po.play();
		}
		else if(input==2) {
			C_clear();
			po.train();
		}
		else if(input==3) {
			C_clear();
			po.sleep();
		}
		else if(input==4) {
			C_clear();
			po.eat();	
		}
		else if(input==5) {
			C_clear();
			po.printInfo();
		}
		else if(input==6) {
			System.out.println("time lose night plese come back our");
			Stop=false;
		}
		
		}while(Stop==true);
	}
	
}
