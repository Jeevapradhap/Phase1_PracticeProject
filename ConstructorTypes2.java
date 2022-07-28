package assistedpractice;
//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
		System.out.println(id+" "+name);
	}
}
public class ConstructorTypes2 {

	public static void main(String[] args) {

		Std std1=new Std(1,"Jeeva");
		Std std2=new Std(9,"Sashiga");
		std1.display();
		std2.display();
			}
	}
