package assistedpractice;

public class MethodOverloading1 {

	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		MethodOverloading1 d = new MethodOverloading1();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		}
	}