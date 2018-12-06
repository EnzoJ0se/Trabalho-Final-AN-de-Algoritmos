package Ordination;

public class CountingSort {
	private Long time;
	private int comparison = 0;
	private int exchanges = 0;
	private Long startCount;
	
	public void CountingSortTest(int ordinate[]) {
		Ordinate(ordinate);
	}
	
	private void Ordinate(int ordinate[]){
		startCount = System.currentTimeMillis();

		int maior = ordinate[0];
		for (int i = 1; i < ordinate.length; i++) {
			comparison++;
			if (ordinate[i] > maior) {
				maior = ordinate[i];
			}
		}

		int[] c = new int[maior];
		for (int i = 0; i < ordinate.length; i++) {
			try {
				c[ordinate[i] - 1] += 1;
			} catch (Exception e) {
				break;
			}
		}
		for (int i = 1; i < maior; i++) {
			exchanges++;
			c[i] += c[i - 1];
		}

		Integer[] b = new Integer[ordinate.length];
		for (int i = 0; i < b.length; i++) {
			try {
				b[c[ordinate[i] - 1] - 1] = ordinate[i];
				c[ordinate[i] - 1]--;
			} catch (Exception e) {
				break;
			}
		}

		for (int i = 0; i < b.length; i++) {
			try {
				ordinate[i] = b[i];
			} catch (Exception e) {
				break;
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
	
	
	public static void main ( String[] args) {
		
	}

}
