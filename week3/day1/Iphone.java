package week3.day1;

public class Iphone extends ClassIos {

	public void makeCall()
	{
		System.out.println("Call by IPhone");
	}
	public void SendSms()
	{
	System.out.println("message from Iphone");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone call=new Iphone();
		call.makeCall();
		call.SendSms();
		call.StartApp();
		call.ShutDown();
		

	}

}
