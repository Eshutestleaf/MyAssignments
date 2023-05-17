package week3.day1;

public class ClassIos {
	
	public void StartApp()
	{
	System.out.println("Started by main class IOS");	
	}
	public void IncreaseVolume()
	{
	System.out.println("Volume Increased by main class IOS");	
	}
	public void ShutDown()
	{
	System.out.println("Shutted off by main class IOS");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassIos ios=new ClassIos();
      ios.StartApp();
      ios.IncreaseVolume();
      ios.ShutDown();
		
	}

}
