package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) {
		Thread t1 = new Thread(new TwoDimArrayThreadClass());
		t1.start();
	}
}