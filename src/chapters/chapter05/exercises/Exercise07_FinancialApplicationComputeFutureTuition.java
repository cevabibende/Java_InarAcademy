package chapters.chapter05.exercises;

/* Suppose that the tuition for a university is $10,000 
this year and increases 5% every year. In one year, 
the tuition will be $10,500. 
Write a program that computes the tuition 
in ten years and the total cost of four years’ 
worth of tuition after the tenth year. */

public class Exercise07_FinancialApplicationComputeFutureTuition {
	
	public static void main(String[] args) {
		
		double cost = 10000;
		double totalCost = 0;
		
		for(int year = 1; year < 15; year++) {
			cost = cost + (cost * 0.05);
			if(year == 10) {
				System.out.println("the fee is $ " + (int)(cost * 100) / 100.0 + " for the " + year + " year");
			}
			if(year > 10) {
				totalCost += cost;
			}
		}
		System.out.println("The total cost of 4 years of education after the 10th year is $ " + (int)(totalCost * 100) / 100.0);
	}
	
	

}
