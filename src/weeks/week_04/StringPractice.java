package weeks.week_04;

public class StringPractice {
	public static void main(String[] args) {
		
		length();
		substring();
		equalsIgnoreCase();
		contains();
		charAt();
		trim();
		toLowerCase();
		toUpperCase();
		concat();
		compareTo();
		compareToIgnoreCase();
	}
	public static void length() {
		System.out.println("length örneği");
		String temp = "I love inar academy";
		int length = temp.length();		
		System.out.println(length);
	}
	public static void substring() {
		System.out.println("substring örneği");
		String temp = "inar academy";
		String yeni = temp.substring(3,9);
		System.out.println(temp);
		System.out.println(yeni);	
	}
	public static void equalsIgnoreCase() {
		System.out.println("equalsIgnoreCase örneği");
		String write1 = "inar academy";
		String write2 = "ıNAR ACADEMY";
		String write3 = "JAVA";
		System.out.println(write1.equalsIgnoreCase(write2));
		System.out.println(write1.equalsIgnoreCase(write3));
	}
	public static void contains() {
		System.out.println("contains örneği");
		String temp = "inar academy";
		System.out.println(temp.contains("nar"));
		System.out.println(temp.contains(" acad"));
		System.out.println(temp.contains("love"));
	}
	public static void charAt() {
		System.out.println("charAt örneği");
		String temp = "inar academy";
		System.out.println(temp.charAt(3));
	}
	public static void trim() {
		System.out.println("trim örneği");
		String temp = "   inar academy   ";
		System.out.println(temp.trim());
	}	
	public static void toLowerCase() {
		System.out.println("toLowerCase(); örneği");
		String temp = "   INAR ACDEMY   ";
		System.out.println(temp.toLowerCase());
	}
	public static void toUpperCase() {
		System.out.println("toUpperCase(); örneği");
		String temp = "   ınar acdemy   ";
		System.out.println(temp.toUpperCase());
	}
	public static void concat() {
		System.out.println("concat(); örneği");
		String temp = "   ınar";
		String temp1 = " acdemy   ";
		System.out.println(temp.concat(temp1));
	}
	public static void compareTo() {
		System.out.println("compareTo(); örneği");
		String temp = "ınar";
		String temp1 = "ınar";
		System.out.println(temp.compareTo(temp1));
	}
	public static void compareToIgnoreCase() {
		System.out.println("compareToIgnoreCase(); örneği");
		String temp = "ınar";
		String temp1 = "ıNar";
		System.out.println(temp.compareToIgnoreCase(temp1));
	}

}
