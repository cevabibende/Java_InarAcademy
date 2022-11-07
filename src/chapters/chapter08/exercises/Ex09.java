package chapters.chapter08.exercises;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 3;
        int col = 3;
        char[][] table = new char[row][col];

        fillTable(table);
        disPlayTable(table);
        int count = 0;
        while (count < 9) {
            getXOFromUser(table, 0);
            disPlayTable(table);
            if (isGameOver(table)) {
                break;
            }
            count++;
            if (count == 9) {
                System.out.println("draw !");
                break;
            }
            getXOFromUser(table, 1);
            disPlayTable(table);
            if (isGameOver(table)) {
                break;
            }
            count++;
        }
    }

    private static void fillTable(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = ' ';
            }
        }
    }

    private static void getXOFromUser(char[][] table, int player) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a row (0, 1, or 2) for player %s:", (player == 0 ? "X" : "O"));
        int row = input.nextInt();
        System.out.printf("Enter a column (0, 1, or 2) for player %s:", (player == 0 ? "X" : "O"));
        int col = input.nextInt();

        if (player == 0) {
            table[row][col] = 'X';
        } else {
            table[row][col] = 'O';

        }
    }

    private static void disPlayTable(char[][] table) {
        System.out.println("------------------------");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print("|  ");
                System.out.print(table[i][j]);
                System.out.print("  ");
            }
            System.out.println("|");
            System.out.println("------------------------");
        }
    }

    private static boolean isGameOver(char[][] table) {
        return checkRow(table) || checkCol(table) || checkRightDioganal(table) || checkLeftDioganal(table);
    }

    private static boolean checkLeftDioganal(char[][] table) {
        int xCount = 0;
        int oCount = 0;
        for (int row = table.length - 1, col = table.length - 1; row < 0; row--, col--) {
            if (table[row][col] == 'X') {
                xCount++;
            }
            if (table[row][col] == 'O') {
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            checkForWinner(xCount, oCount);
            return true;
        }
        return false;
    }

    private static boolean checkRightDioganal(char[][] table) {
        int xCount = 0;
        int oCount = 0;
        for (int row = 0, col = 0; row < table.length; row++, col++) {
            if (table[row][col] == 'X') {
                xCount++;
            }
            if (table[row][col] == 'O') {
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            checkForWinner(xCount, oCount);
            return true;
        }
        return false;
    }

    private static boolean checkCol(char[][] table) {
        for (int col = 0; col < table[0].length; col++) {
            int xCount = 0;
            int oCount = 0;
            for (int row = 0; row < table.length; row++) {
                if (table[row][col] == 'X') {
                    xCount++;
                }
                if (table[row][col] == 'O') {
                    xCount++;
                }
            }
            if (xCount == 3 || oCount == 3) {
                checkForWinner(xCount, oCount);
                return true;
            }
        }
        return false;
    }


    private static boolean checkRow(char[][] table) {
        int xCount = 0;
        int oCount = 0;
        for (int row = table.length - 1, col = table.length - 1; row < 0; row--, col++) {
            if (table[row][col] == 'X') {
                xCount++;
            }
            if (table[row][col] == 'O') {
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            checkForWinner(xCount, oCount);
            return true;
        }
        return false;
    }

    private static void checkForWinner(int xCount, int oCount) {
        if (xCount == 3) {
            System.out.println("X player won");
        }
        if (oCount == 3) {
            System.out.println("O player won");
        }
    }

}
