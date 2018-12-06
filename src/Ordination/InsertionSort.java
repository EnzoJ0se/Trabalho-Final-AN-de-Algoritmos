package Ordination;

public class InsertionSort {
	private int exchanges;
	private int comparison;
	private Long time;
	private Long startCount;
	
	public void InsertionSortTest(int ordinate[]) {
		Ordinate(ordinate);
	}
	
	private void Ordinate(int ordinate[]) {
		startCount = System.currentTimeMillis();
		for (int i = 1; i < ordinate.length; i++,comparison++){
			
			int temp = ordinate[i];
			exchanges++;
			int j;
			for( j = i ; j > 0 && temp < ordinate[j-1]; j--){
				comparison= comparison+2;
				ordinate[j] = ordinate[j-1];
				exchanges++;		
			}
			ordinate[j] = temp;
			exchanges++;
		}
		time = System.currentTimeMillis() - startCount;
	}



	
	public int getExchanges() {
		return exchanges;
	}



	public int getComparison() {
		return comparison;
	}



	public Long getTime() {
		return time;
	}

}
