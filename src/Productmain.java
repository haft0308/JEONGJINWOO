package Animalmain;

public class Productmain {

	public static void main(String[] args) {
		//구매자 객체 생성
		Buyer b=new Buyer();
		//제품의 객체생성
		Product[] p=new Product[3];
		//업케스팅
		p[0]=new TV();
		p[1]=new Computer();
		p[2]=new Audio();

		for(int i=0; i<3; i++) {
			//사용자의 물건구매 반복 3번
			b.buy(p[i]);
		}
		//사용자의 소지금 출력
		b.print();
	}

}
//기본값
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
	// 가진돈만큼 돈을 빼고 포인트를 적립
	void buy(Product p) {
		money=money-p.price;
		bonusPoint=bonusPoint+p.bonusPoint;
	}
	void print() {
		System.out.println("money="+money);
		System.out.println("bonusPoint="+bonusPoint);
	}
}

