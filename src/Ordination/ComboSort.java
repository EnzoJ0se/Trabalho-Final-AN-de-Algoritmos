package Ordination;

public class ComboSort {
	private int exchanges;
	private int comparison;
	private Long time;
	private Long startCount;
	
	
	public void ComboSortTest( int ordinate[]) {
		Ordinate(ordinate);
	}
	
	private void Ordinate( int ordinate[]) {
		startCount = System.currentTimeMillis();
		
		int i, j, aux, exchanged = 1;
		int interval = ordinate.length;
		while (interval > 1 || exchanged == 1){
		interval = interval * 10 / 13;
			if (interval == 9 || interval == 10) {
			interval = 11;
			}
			
			if (interval < 1) {
			interval = 1;
			exchanged = 0;
			}
			
			for (i = 0, j = interval; j < ordinate.length; i++, j++){
			comparison++;
				if (ordinate[i] > ordinate[j]){
				exchanges++;
					
				aux = ordinate[i];
				ordinate[i] = ordinate[j];
				ordinate[j] = aux;
				exchanged = 1;
				}
			}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
