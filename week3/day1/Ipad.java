package week3.day1;

import org.openqa.selenium.devtools.v109.io.IO;

public class Ipad extends ClassIos {
    
	public void watchmovie() {
		System.out.println("Movie by Ipad");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad movie=new Ipad();
		movie.ShutDown();
		movie.StartApp();
		movie.IncreaseVolume();
		movie.watchmovie();
	}

}
