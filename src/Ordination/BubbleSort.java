package Ordination;

import java.util.Random;

public class BubbleSort {
	
	private Long time;
	private int comparison = 0;
	private int exchanges = 0;
	private int temp = 0;
	private Long startCount;
	
	public void BubbleSortTest(int ordinate[]) {
		
		Ordinate(ordinate);
		
//		System.out.println(time);
	}
	
	
	private void Ordinate(int data[]) {
		startCount = System.currentTimeMillis();
		
		for (int i = 0; i < data.length-1; i++, comparison++)
			
			for (int j = data.length-1; j > i; --j, comparison = comparison+2)
				
				if (data[j] < data[j-1]){ 
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
					exchanges = exchanges + 3;
				}
		time = System.currentTimeMillis()-startCount;
	}

	public Long getTime() {
		return time;
	}
	public int getcomparison() {
		return comparison;
	}
	public int getExchanges() {
		return exchanges;
	}
	
	
//	public static void main(String[] args) {
//		new BubbleSort().BubbleSortTest(); 
//	}

}
