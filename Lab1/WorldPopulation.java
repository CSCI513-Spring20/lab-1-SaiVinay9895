import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {
	int i =0;

	SortStrategy sortStrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortStrategy = new SelectionSort(); // Set the default strategy here.	
	}
	
	public void readInputFile(){
		population = readPopulationFile("src\\WorldPopulation.csv");
	}
	
	public void setStrategy(SortStrategy strategy){
		sortStrategy = strategy;
		sortStrategy.sort(population);
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			while((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				String token1 = tokenizer.nextToken();
				String token2 = tokenizer.nextToken();
				 population[i] = Integer.parseInt(tokenizer.nextToken());
				 i++;
			}
			reader.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
	  
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation(){
    String d =sortStrategy.strategyName();
    System.out.println(d);
	long y = sortStrategy.getSorttime();
	System.out.println("time "+y);
		
		
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		SelectionSort selectionSort = new SelectionSort();
		BubbleSort bubblesort  = new BubbleSort();
		InsertionSort insertionsort = new InsertionSort(); 
		
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(selectionSort); //  Currently no strategies.
		worldPopulation.sortPopulation();
		worldPopulation.setStrategy(bubblesort); 
		worldPopulation.sortPopulation();
		worldPopulation.setStrategy(insertionsort); //  Currently no strategies.
		worldPopulation.sortPopulation();
	}

}
