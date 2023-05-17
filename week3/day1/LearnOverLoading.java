package week3.day1;

public class LearnOverLoading {

	public void add(int a,int b) {
	System.out.println(a+b);	
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);	
		}
	public void mul(Double a,Double b) {
		System.out.println(a*b);	
		}
	public void mul(float a,float b) {
		System.out.println(a*b);	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LearnOverLoading cal=new LearnOverLoading();
       cal.add(4, 5);
       cal.mul(7.2f,2.0f);
	}

	
}
