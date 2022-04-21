package Animalmain;

public class Animalmain {

	public static void main(String[] args) {
	AnimalAction a=new AnimalAction();
	Dog d=new Dog();
	d.name="������";
	a.action(d);
	
	System.out.println("-----------");
	Cat c=new Cat();
	c.name="�����";
	a.action(c);
	}

}
class Animal{
	protected String name;
	public void cry() {
		System.out.println(name+"�� �Ҹ�����.");
	}
}
class Dog extends Animal
{
	public void cry() {
		super.cry();
		System.out.println("��,��,��,��");
	}
	public void run() {
		System.out.println(name+"�� �ڴ�");
	}
}
class Cat extends Animal
{
	public void cry() {
		super.cry();
		System.out.println("�ֿ�,�ֿ� ����,�ֿ�");
	}
	public void grooming() {
		System.out.println("�׷���� �Ѵ�");
	}
}
class AnimalAction {
	void action(Animal animal) {
		animal.cry();
		if(animal instanceof Dog) {
			((Dog)animal).run();
		}else if(animal instanceof Cat) {
			((Cat)animal).grooming();
		}
	}
}