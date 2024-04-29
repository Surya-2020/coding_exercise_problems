import java.util.HashSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		Engine car=new Engine();
	    car.show();
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo2 t2 = new ThreadDemo2();
		FunctionDemo func = () -> {
			System.out.println("Im in functional interface...");
			int output = 10 + 12;
			System.out.println("Output: " + output);
			return output;
		};
		func.saySomething();
		func.equals(2);
		Thread th = new Thread(t1);
		Thread th2 = new Thread(t2);
		try {
			th.start();
			Thread.sleep(2000);
			th2.start();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Parent parent = new Sample();
		TreeSet<Parent> set = new TreeSet<>();
		Parent p1 = new Parent("xx", "23");
		Parent p2 = new Parent("yy", "23");

		set.add(p1);
		set.add(p2);
		System.out.println("Tree set view" + set.toString());

		HashSet<Parent> set2 = new HashSet<>();
		set2.add(new Parent());
		set2.add(new Parent());
		System.out.println("Hash set view" + set2.toString());
		for (Parent p : set) {
			set.remove(p);
		}
		System.out.println("set view" + set.toString());
		parent.run();


	}

}
