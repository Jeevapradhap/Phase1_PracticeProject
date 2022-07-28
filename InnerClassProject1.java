package assistedpractice;

public class InnerClassProject1 {
	private String msg = "Welcome to Java";

	class Inner {
		void hello() {
			System.out.println(msg + ", Let us start learning Inner Classes");
		}
	}

	public static void main(String[] args) {

		InnerClassProject1 obj = new InnerClassProject1();
		InnerClassProject1.Inner in = obj.new Inner();
		in.hello();
	}
}
