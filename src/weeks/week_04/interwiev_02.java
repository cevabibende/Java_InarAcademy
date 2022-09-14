package weeks.week_04;

public class interwiev_02 {
	
	public static void main(String[] args) {
		String deneme = "JAVA is FUN aes";
		interwiev(deneme);
	}
	
	public static void interwiev(String s) {
		
		
		String result = s.replace('A','x');
		result = result.replace('a','X');
		result = result.replace('E','X');
		result = result.replace('e','X');
		result = result.replace('I','X');
		result = result.replace('i','X');
		result = result.replace('O','X');
		result = result.replace('o','X');
		result = result.replace('U','X');
		result = result.replace('u','X');
		
		
		System.out.println(result);


		
		
	}

}
