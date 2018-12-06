package Ordination;

public class SelectionSort {
	private int exchanges;
	private int comparison;
	private Long time;
	private Long startCount;
	
	public void SelectionSortTest(int ordinate[]) {
		Ordinate(ordinate);
	}
	
	private void Ordinate(int ordinate[]) {
	
	startCount = System.currentTimeMillis();

	for (int i = 0; i < ordinate.length; i++,comparison++){
		int min = i;
		for (int j = i + 1; j <= ordinate.length-1 ; j++,comparison=comparison+2)
			if (ordinate[j] < ordinate[min])
				min = j;
		int temp = ordinate[i];
		ordinate[i] = ordinate[min];
		ordinate[min] = temp;
		exchanges = exchanges+3;
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
