package by.htp.jc1.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OperationDemo {

	public static void main(String[] args) {

		List<TwoNumberSum> arrayList = new ArrayList<TwoNumberSum>();

		for (int i = 1; i < 950; i++) {
			arrayList.add(new TwoNumberSum(i, i, i));
		}

		LinkedList<TwoNumberSum> linkedList = new LinkedList<TwoNumberSum>(arrayList);

		OperatorSum os1 = new OperatorSum(linkedList);
		OperatorSum os2 = new OperatorSum(linkedList);
		OperatorSum os3 = new OperatorSum(linkedList);
		// OperatorSum os4 = new OperatorSum(linkedList);
		// OperatorSum os5 = new OperatorSum(linkedList);
		// OperatorSum os6 = new OperatorSum(linkedList);
		// OperatorSum os7 = new OperatorSum(linkedList);
		// OperatorSum os8 = new OperatorSum(linkedList);
		// OperatorSum os9 = new OperatorSum(linkedList);
		// OperatorSum os10 = new OperatorSum(linkedList);

		os1.start();
		os2.start();
		os3.start();
		// os4.start();
		// os5.start();
		// os6.start();
		// os7.start();
		// os8.start();
		// os9.start();
		// os10.start();

		try {
			os1.join();
			os2.join();
			os3.join();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Операции сложения завершены.");

	}

}
