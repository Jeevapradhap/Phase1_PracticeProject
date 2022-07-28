package assistedpractice;

public class InnerClassProject2 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  
	 
	 public static void main(String[] args) {
			InnerClassProject2 ob=new InnerClassProject2 ();  
			ob.display();  
			}
}
