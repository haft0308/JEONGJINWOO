package pointer;

public class pointmain {

	public static void main(String[]args) {
		point2d p2=new point2d();
		p2.point2dstart(1, 3);
		p2.point2dend(5, 7);
		p2.result();
		
		point3d p3=new point3d(2,2);
		p3.line();
		p3.result();
		
	}
}
class point{
	int x;
	int y;
	int z;
	int x1;
	int y1;
	int x2;
	int y2;
	double centerint;
	int centerdecimal;
	int center_2;
	int squared_x;
	int squared_y;
	point(){
		
	}
	
}
class point3d extends point{
	double center;
	int line;
	int liness;
	point3d(){
		
	}
	//����Ʈ�� ����
	point3d(int x,int z){
		this.x=x;
		this.z=z;
	}
	//����,����(���������� �Ÿ�) ����
	void line() {
		line =x+z;
		int lines=(int)Math.pow(line,2);
	    liness=lines+lines;
		center=Math.sqrt(liness);
	}
	//��� ���Ǻ���*����(���������� �Ÿ�) ����/���
	void result() {
		int half=line/2;
		double one=Math.PI*Math.pow(half,2);
		double volume=one*center;
		System.out.println("����պ��Ǵ�:"+volume);
	}
}
class point2d extends point{
	
	point2d(){
		
	}
	//����Ʈ �� ����
	void point2dstart(int x,int y){
		this.x1=x;
		this.y1=y;
	}
	void point2dend(int x,int y) {
		this.x2=x;
		this.y2=y;
	}
	//������ �Ÿ� ����� ���
	void result() {
		this.squared_x=(int)Math.pow(x2-x1,2);
		this.squared_y=(int)Math.pow(y2-y1,2);
		this.center_2=squared_x+squared_y;
		this.centerint=Math.sqrt(center_2);
		
		System.out.println("�����ǰŸ�:"+centerint);
	}

}