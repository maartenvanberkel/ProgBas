package be.pxl.h11.opdr1;

public class DagApp {

	public static void main(String[] args) {
		Dag dag1 = Dag.MAANDAG;
		System.out.println(dag1);
		
		for (Dag dag : Dag.values()) {
			System.out.println(dag);
		}
	}
}