package d.java8;

public class Demo_lamda{
  public static void main(String[] args) {
	interaf i1=(a,b)->{System.out.println("addition "+a+b);};
	i1.add(10, 45);
	i1.add(47, 5);
	i1.add(1, 4);
	i1.add(1, 45);
	
	
}
  
  
  //1.
  
  public void m1() {
	  System.out.println("hello");
  }
 
  
  interface interaf{
	  public void add(int a ,int b);
  }
  
  
  
  
  
}
