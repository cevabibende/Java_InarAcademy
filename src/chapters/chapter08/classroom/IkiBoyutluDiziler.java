package chapters.chapter08.classroom;

public class IkiBoyutluDiziler {
    public static void main(String[] args) {
        int[][] deneme = null;

        System.out.println(deneme);

        deneme = new int[5][5];

        deneme[3][4] = 7;

        for (int i = 0; i < deneme.length; i++) {
            for (int j = 0; j < deneme[i].length; j++) {
                System.out.print(deneme[i][j] + " ");
            }
            System.out.println();
        }

        int[][] x = new int[3][];

        x[0] = new int[4];
        x[1] = new int[5];
        x[2] = new int[6];

    }
}
