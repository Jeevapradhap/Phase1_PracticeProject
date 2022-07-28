package assistedpractice;

public class MethodOverloading3 {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

MethodOverloading3 ob=new MethodOverloading3();
       ob.area(12,14);
       ob.area(7);  
   }
}