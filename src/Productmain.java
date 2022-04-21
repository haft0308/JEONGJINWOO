package Animalmain;

public class Productmain {

	public static void main(String[] args) {
		//������ ��ü ����
		Buyer b=new Buyer();
		//��ǰ�� ��ü����
		Product[] p=new Product[3];
		//���ɽ���
		p[0]=new TV();
		p[1]=new Computer();
		p[2]=new Audio();

		for(int i=0; i<3; i++) {
			//������� ���Ǳ��� �ݺ� 3��
			b.buy(p[i]);
		}
		//������� ������ ���
		b.print();
	}

}
//�⺻��
class Product{
	int price;
	int bonusPoint;
}
class TV extends Product{
	int channel;
	int volume;
	TV(){
		price=100;
		bonusPoint=100;
	}
}
class Computer extends Product{
	int cpu;
	int ram;
	Computer() {
	price=200;
	bonusPoint=200;
	}
}
class Audio extends Product{
	int volume;
	int speaker;
	Audio(){
		price=50;
		bonusPoint=50;
	}
}
class Buyer{

	int money=10000;
	int bonusPoint=0;
	// ��������ŭ ���� ���� ����Ʈ�� ����
	void buy(Product p) {
		money=money-p.price;
		bonusPoint=bonusPoint+p.bonusPoint;
	}
	void print() {
		System.out.println("money="+money);
		System.out.println("bonusPoint="+bonusPoint);
	}
}

