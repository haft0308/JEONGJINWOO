package today2022_04_21_2;

public class overraid {

	public static void main(String[]args) {
		parent p=new parent();
		p.name="�� ũ���̾�";
		p.printInfo();
		System.out.println("------------");
		child c=new child();
		c.name= "child";
		c.setHobby("���ο� ����ȸ�� �����ϱ�");
		c.printInfo();
	}
}
class parent 
{
	protected String name;
	
	public void printInfo() {
		System.out.println(name);
	}
}
class child extends parent{
	private String hobby;
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(hobby);
	}
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	public String getHobby() {
		return hobby;
	}
}