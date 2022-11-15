package chapters.chapter10.exercises.Ex27;

public class MyStringBuilder {

    private String str;

    public MyStringBuilder(String str) {
        this.str = str;
    }

    public MyStringBuilder append(MyStringBuilder str) {
        this.str = this.str + str.toString();
        return this;
    }

    public MyStringBuilder append(int i) {
        this.str = this.str + i;
        return this;
    }

    public int lenght() {
        return this.str.length();
    }

    public char charAt(int index) {
        return this.str.charAt(index);
    }

    public MyStringBuilder toLowerCase() {
        String str1 = "";
        for (int i = 0; i < this.str.length(); i++) {
            if(this.str.charAt(i) >= 'A' && this.str.charAt(i) <= 'Z') {
                char ch = (char)(str.charAt(i) - ('A' - 'a'));
                str1 += ch;
            } else {
                str1 += this.str.charAt(i);
            }
        }
        this.str = str1;
        return this;
    }

    public MyStringBuilder substring(int begin, int end) {

        this.str = this.str.substring(begin, end);
        return this;
    }

    public String toString() {
        return this.str;
    }
}
