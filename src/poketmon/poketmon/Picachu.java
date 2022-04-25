package poketmon;
import java.util.Scanner;
public class Picachu extends character{
	static Scanner scan=new Scanner(System.in);
	Picachu(){
		name="Picachu";
		hp=30;
		energy=50;
		printInfo();
	}
	public void eat() {
		System.out.println(name+"is eatting now (porketFood!)");
		energy=energy+10;
		System.out.println("now energy->"+energy);
		scan.next();
	}
	public void sleep() {
		System.out.println(name+"is sleeping now ");
		System.out.println("good night"+name+"for tomorrow");
		energy=energy+5;
		System.out.println("energy->"+energy);
		scan.next();
	}
	public boolean train() {
		System.out.println(name+"training now");
		System.out.println("fight! fight! nice form!");
		energy=energy-15;
		hp=hp+20;
		System.out.println("energy->"+energy+"\r hp->"+hp);
		levelup();
		scan.next();
		return checkEnergy();
	}
	public boolean play() {
		System.out.println(name+"is now playing fight another poketmon");
		energy=energy-20;
		hp=hp+5;
		System.out.println("energy-->"+energy+"hp-->"+hp);
		levelup();
		scan.next();
		return checkEnergy();
	}
	public void levelup() {
		if(hp>=40) {
			level++;
			hp=hp-40;
			System.out.println(name+"is Level UP!["+level+"]");
			scan.next();
		}
	}
}