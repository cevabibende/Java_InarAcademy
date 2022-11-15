package chapters.chapter10.exercises.Ex27;

public class TestMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder1 = new MyStringBuilder("Inar Academy");
        String str1 = myStringBuilder1.toString();
        System.out.println(str1);


        String student = "Haluk";
        MyStringBuilder myStringBuilder2 = new MyStringBuilder(student);
        myStringBuilder1.append(myStringBuilder2);


        String test = myStringBuilder1.toString();
        System.out.println(test);
        myStringBuilder1.append(1651);


        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder1.lenght());
        System.out.println(myStringBuilder1.charAt(3));

        System.out.println(myStringBuilder1.toLowerCase());
        System.out.println(myStringBuilder1);

        String school = "ASFGJWQEGKG";
        System.out.println(school.toLowerCase());
        System.out.println(school);

        MyStringBuilder myStringBuilder3 = myStringBuilder1.substring(0,21);

        System.out.println(myStringBuilder3);
        System.out.println(myStringBuilder1);
    }
}