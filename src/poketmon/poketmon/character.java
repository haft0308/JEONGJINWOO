package poketmon;

public abstract class character {
	protected String name;
	protected int hp;
	protected int energy;
	protected int level;

	public abstract void eat();
	public abstract void sleep();
	public abstract  boolean train();
	public abstract  boolean play();
	public abstract  void levelup();
	
	public boolean checkEnergy() {
		if(energy<=0) {
			System.out.println("my\s"+name+"\sis gone a way.. bye bye.. your.. murder");
			return poketmon_base.Stop=false;
		}else {
			return poketmon_base.Stop=true;
		}
		
	}
	public void printInfo() {
		System.out.println("my"+name+"-imformation");
		System.out.println("hp-->"+hp);
		System.out.println("energy-->"+energy);
		System.out.println("level-->"+level);
	
}
}