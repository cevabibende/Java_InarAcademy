package weeks.week_04;

public class ForLoop03 {
	
	public static void main(String[] args) {
		
		String s = "Inar Academy";
	
		int l = s.length();
		
		String result = "";
		
		for (int i = 0; i < l; i++) {
			
			char harf = s.toLowerCase().charAt(i);
			
			if (harf != 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
				
				result = result + s.charAt(i);
			}
			
		}
		System.out.println(result);
	}

	
	
	
	
}
