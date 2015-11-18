package ie.gmit.sw;

public class TwoDimArrayThreadClass implements Runnable{
	public void run() {
		int rows = 10;
		int cols = 10;
		int[][] twoDimArray = new int[rows][cols];

		for (int i=0; i < rows ; i++) {
			for (int j=0; j < cols ; j++) {
				twoDimArray[i][j] = ((int)(Math.random()*100+1));
				System.out.print( twoDimArray[i][j] + "  ");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("");
		}
	}
}