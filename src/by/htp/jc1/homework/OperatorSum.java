package by.htp.jc1.homework;

import java.util.LinkedList;

public class OperatorSum extends Thread {

	private LinkedList<TwoNumberSum> linkedList;

	public OperatorSum(LinkedList<TwoNumberSum> linkedList) {
		this.linkedList = linkedList;
	}

	public void run() {

		int sum;
		TwoNumberSum ob;
		
		while (!linkedList.isEmpty()) {
			ob = linkedList.removeFirst();
			sum = ob.sumXY();
			System.out.println("ID = " + ob.getId() + ", сумма равна " + sum);
		}

	}
}
