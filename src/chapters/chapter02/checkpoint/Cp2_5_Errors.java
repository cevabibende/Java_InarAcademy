package chapters.chapter02.checkpoint;

public class Cp2_5_Errors {

	public static void main(String[] args) {

		int k = 5;
		 //This line did not exist. variable k is not defined as an error
		
		int i = k + 2;
		System.out.println(i);
	}

}
