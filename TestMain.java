public class TestMain {

	public static void main(String[] args) {
		
		//Definicion de arreglo de numeros
		int numbers[] = {20, 50, 15, 6, 80};
		
		System.out.println("=======================================");
		System.out.println("Ejemplo uso Patron Strategy (DIINF)");
		System.out.println("=======================================");

		SortingContext context = new SortingContext();
		
		// Algoritmo InsertionSort (DIINF)
		context.setSortingMethod(new InsertionSort());
		context.sortNumbers(numbers);
		
		// Algoritmo SelectionSort (DIINF)
		context.setSortingMethod(new SelectionSort());
		context.sortNumbers(numbers);
		
	}
}
