package week3.day1;

public class SmartPhone extends AndroidPhone {
	 public void takevideo()
	{
		System.out.println("overloadded by me");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SmartPhone smart=new SmartPhone();
     smart.takevideo();
		
		AndroidPhone smart1=new AndroidPhone();
		smart1.takevideo();
	}

}
