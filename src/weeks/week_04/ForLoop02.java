package weeks.week_04;

public class ForLoop02 {
	public static void main(String[] args) {
		
		String w = "TarikInarAcademy";
		
		int length = w.length();
		System.out.println(w);
		
		for(int i = 1; i < length; i = i + 2) {
			System.out.print(w.charAt(i));	
		}
		for(int i = 0; i < length; i = i + 2) {
			System.out.print(" " + w.charAt(i));
		}
	}

}
