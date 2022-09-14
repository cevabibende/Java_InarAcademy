package weeks.week_04;

public class ForLoopDouble {
	public static void main(String[] args) {
		String s = "denemem";
		int l = s.length();
		String result = "";
		for (int i = 0; i < l; i++) {
			char ch = s.charAt(i);
			if(result.contains("" + ch) == false) {
				result += ch;
			}
			
		}
		System.out.println(result);
	}
	

}
