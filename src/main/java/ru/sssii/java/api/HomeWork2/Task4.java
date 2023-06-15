package ru.sssii.java.api.HomeWork2;

public class Task4 {
    public static void main(String[] args) {
        int[][] board = {
                new int[]{5, 3, 0, 0, 7, 0, 0, 0, 0},
                new int[]{6, 0, 0, 0, 9, 5, 0, 0, 0},
                new int[]{0, 9, 8, 0, 0, 0, 0, 0, 0},
                new int[]{8, 0, 0, 0, 6, 0, 0, 0, 3},
                new int[]{4, 0, 0, 8, 0, 3, 0, 0, 1},
                new int[]{7, 0, 0, 0, 2, 0, 0, 0, 6},
                new int[]{0, 6, 0, 0, 0, 0, 2, 8, 0},
                new int[]{0, 0, 0, 4, 1, 9, 0, 0, 5},
                new int[]{0, 0, 0, 0, 8, 0, 0, 7, 9}};
        var res = Fill(board);
        Print(board);
        System.out.printf("res: %b\n", res);
    }

    static void Print(int[][] board) {
        System.out.print("\033[H\033[J");
        int i = 1;
        int j = 1;

        for (var line : board) {
            j = 1;
            for (var item : line) {
                if (j % 3 == 0)
                    System.out.printf("%d   ", item);
                else
                    System.out.printf("%d ", item);
                j += 1;
            }
            if (i % 3 == 0)
                System.out.println("\n");
            else
                System.out.println();
            i += 1;
        }
    }

    private static boolean Fill(int[][] board) {
        var pos = positionEl(board);
        int row = pos[0];
        int col = pos[1];
        if (row == -1)
            return true;
        for (int el = 1; el < 10; el++) {
            if (validElementInPosition(board, el, row, col)) {
                board[row][col] = el;
                if (Fill(board)) {
                    return true;
                }
            }
            board[row][col] = 0;
        }
        return false;
    }

    private static boolean validElementInPosition(int[][] board, int el, int x, int y) {
        var column = getColumn(board, y);
        if (indexOf(board[x], el) != -1 || indexOf(column, el) != -1) {
            return false;
        }
        int row = (x / 3) * 3;
        int col = (y / 3) * 3;
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                if (board[r][c] == el)
                    return false;
            }
        }
        return true;
    }


    private static int indexOf(int[] chars, int el) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == el) {
                return i;
            }
        }
        return -1;
    }

    private static int[] getColumn(int[][] board, int y) {
        int size = board.length;
        int[] temp = new int[size];
        for (int x = 0; x < size; x++) {
            temp[x] = board[x][y];
        }
        return temp;
    }

    private static int[] positionEl(int[][] board) {
        int size = board.length;
        for (int x = 0; x < size; x++)
            for (int y = 0; y < size; y++)
                if (board[x][y] == 0) return new int[]{x, y};
        return new int[]{-1, -1};
    }

}
