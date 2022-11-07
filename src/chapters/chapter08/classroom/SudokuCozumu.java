package chapters.chapter08.classroom;

public class SudokuCozumu {
    public static void main(String[] args) {
        int[][] suDoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        if (gecerliBirSudokuCozumumu(suDoku)) {
            System.out.println("geçerli bir sudoku çözümü");
        } else {
            System.out.println("geçerli olmayan bir sudoku çözümü");
        }
    }

    private static boolean gecerliBirSudokuCozumumu(int[][] suDoku) {
        if (gecerliSayiKontrolu(suDoku) == false){
            return false;
        }
         if (satirKontrolu(suDoku) == false){
             return false;
         }
        if (sutunKontrolu(suDoku) == false) {
            return false;
        }
        return true;
    }

    private static boolean sutunKontrolu(int[][] suDoku) {
        for (int sutun = 0; sutun < suDoku.length; sutun++) {
            boolean[] kontrol = new boolean[9];
            for (int satir = 0; satir < suDoku.length; satir++) {
                kontrol[suDoku[satir][sutun] - 1] = true;
            }
            for (boolean b : kontrol){
                if (b == false){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean satirKontrolu(int[][] suDoku) {
        for (int satir = 0; satir < suDoku.length; satir++) {
            boolean[] kontrol = new boolean[9];
            for (int sutun = 0; sutun < suDoku[satir].length; sutun++) {
                kontrol[suDoku[satir][sutun] - 1] = true;
            }
            for (boolean b : kontrol){
                if (b == false){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean gecerliSayiKontrolu(int[][] suDoku) {
        for (int satir = 0; satir < suDoku.length; satir++) {
            for (int sutun = 0; sutun < suDoku[satir].length; sutun++) {
                if (suDoku[satir][sutun] < 1 || suDoku[satir][sutun] > 9) {
                    return true;
                }
            }
        }
        return false;
    }
}

