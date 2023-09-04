package d.java8;

public class Static_and_defulat implements aa{
public static void main(String[] args) {
	Static_and_defulat sd=new Static_and_defulat();
//	sd.Add();
//	Static_and_defulat.Add();
aa.Add(10,20); //only call by intertface name 
	
	
}
}

interface aa{
	public  static void Add(int a,int b) {
		System.out.println("SUM is  "+a+b);
	}
}