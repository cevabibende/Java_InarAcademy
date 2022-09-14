package weeks.week_04;

public class ForLoopMain {
	public static void main(String[] args) {
		
		String s = "ene";
		boolean isPalindrom = true;
		int l = s.length();
		for (int i = 0; i < l / 2; i++) {
			if(!(s.charAt(i) == s.charAt(l - 1 - i))) {
				isPalindrom = false;
			}
		}
		if(isPalindrom) {
			System.out.println(s + " is palindrom");
		}else {
			System.out.println(s + " is not palindrom");
		}		
	}
}
