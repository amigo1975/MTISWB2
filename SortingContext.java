public class SortingContext {
	
	private SortingStrategy strategy;
	
	//Metodo principal
	public void setSortingMethod(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public SortingStrategy getStrategy() {
		return this.strategy;
	}
	
	public void sortNumbers(int[] numbers){
		this.strategy.sort(numbers);
	}
}

