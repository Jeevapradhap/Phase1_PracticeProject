package assistedpractice;

public class MethodOverloading2 {

	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodOverloading2 b=new MethodOverloading2();
		int ans= b.multipynumbers(8,3);
		System.out.println("Multipilcation is :"+ans);
		}


 }