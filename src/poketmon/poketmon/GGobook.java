package poketmon;

import java.util.Scanner;

public class GGobook extends character{
	static Scanner scan=new Scanner(System.in);
	GGobook(){
		name="GGobook";
		hp=40;
		energy=50;
		printInfo();
	}
	public void eat() {
		System.out.println(name+"is eatting now (porketFood!)");
		energy=energy+15;
		System.out.println("now energy->"+energy);
		scan.next();
	}
	public void sleep() {
		System.out.println(name+"is sleeping now ");
		System.out.println("good night"+name+"for tomorrow");
		energy=energy+10;
		System.out.println("energy->"+energy);
		scan.next();
	}
	public boolean train() {
		System.out.println(name+"training now");
		System.out.println("fight! fight! nice form!");
		energy=energy-20;
		hp=hp+30;
		System.out.println("energy->"+energy+"\r hp->"+hp);
		levelup();
		scan.next();
		return checkEnergy();
	}
	public boolean play() {
		System.out.println(name+"is now playing fight another poketmon");
		energy=energy-30;
		hp=hp+15;
		System.out.println("energy-->"+energy+"hp-->"+hp);
		levelup();
		scan.next();
		return checkEnergy();
	}
	public void levelup() {
		if(hp>=50) {
			level++;
			hp=hp-50;
			System.out.println(name+"is Level UP!["+level+"]");
			scan.next();
		}
	}
}