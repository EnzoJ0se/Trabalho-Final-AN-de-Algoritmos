package Ordination;

import java.util.Random;

import view.MenuView;

public class BubbleSort {
	
	private Long time;
	private int comparison = 0;
	private int exchanges = 0;
	private int temp = 0;
	private Long startCount;
	
	public void BubbleSortTest() {
		Random randomGenerator = new Random();
		
		int[] ordinate = new int[30000];
		for(int i = 0; i < ordinate.length; i++) {
			ordinate[i] = randomGenerator.nextInt(29999);
		}
		
		startCount = System.currentTimeMillis();
		Ordinate(ordinate);
		time = System.currentTimeMillis()-startCount;
		
	}
	
	
	private void Ordinate(int data[]) {
		
		for (int i = 0; i < data.length-1; i++, comparison++)
			
			for (int j = data.length-1; j > i; --j, comparison = comparison+2)
				
				if (data[j] < data[j-1]){ 
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
					exchanges = exchanges + 3;
				}
		
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	
	public int getcomparison() {
		return comparison;
	}
	public void setcomparison(int comparison) {
		this.comparison = comparison;
	}
	public int getExchanges() {
		return exchanges;
	}
	public void setExchanges(int exchanges) {
		this.exchanges = exchanges;
	}
	
	public static void main(String[] args) {
		new BubbleSort().BubbleSortTest(); 
	}

}
