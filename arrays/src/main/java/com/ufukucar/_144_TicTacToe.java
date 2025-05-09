package com.ufukucar;

import java.util.Scanner;

public class _144_TicTacToe {

    static Scanner input = new Scanner(System.in);

    public static void printBoard(char[][] board) {

        System.out.print("\n");

        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[] askUser(char[][] board) {
        int row, column;

        while (true) {
            System.out.print(" * Pick a row and column number (0-2): ");
            row = input.nextInt();
            column = input.nextInt();

            // Geçerli indeks aralığında mı?
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Indices error! Please enter numbers between 0 and 2.");
                continue;
            }

            // Hücre boş mu?
            if (board[row][column] != '_') {
                System.out.println("Spot taken, try again.");
                continue;
            }

            // Geçerli ve boş hücre bulundu
            break;
        }

        return new int[]{row, column};
    }

    public static int checkRows (char [] [] board) {
        int count = 0;

        for ( int i = 0; i < board.length; i++) {
            for ( int j = 0; j < board[i].length; j++) {
                if ( board[i][j] == 'X') {
                    count++;
                }
                else if (board[i][j] == 'O') {
                    count--;
                }
            }

            if (count == 3 || count == -3){
                return count;
            }else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkColumns (char [][] board) {
        int count = 0;

        for ( int i = 0; i < board.length; i++) {
            for ( int j = 0; j < board[i].length; j++) {
                if ( board[j][i] == 'X') {
                    count++;
                }
                else if (board[j][i] == 'O') {
                    count--;
                }
            }

            if (count == 3 || count == -3){
                return count;
            }else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkLeft (char [][] board) {
        int count = 0;

        for ( int i = 0; i < board.length; i++) {

            if (board[2 - i][i] == 'X') {
                count++;
            }
            else if (board[2 - i][i] == 'O') {
                count--;
            }
        }

        return count;
    }

    public static int checkRight (char [][] board) {
        int count = 0;

        for ( int i = 0; i < board.length; i++) {

            if (board[i][i] == 'X') {
                count++;
            }
            else if (board[i][i] == 'O') {
                count--;
            }
        }

        return count;
    }

    public static int checkWin (char [][] board) {

        int rows = checkRows(board);

        if (Math.abs(rows) == 3) {
            return rows;
        }
        int columns = checkColumns(board);

        if (Math.abs(columns) == 3) {
            return columns;
        }

        int leftDiagonal = checkLeft(board);
        if (Math.abs(leftDiagonal) == 3){
            return leftDiagonal;
        }

        int rightDiagonal = checkRight(board);
        if (Math.abs(rightDiagonal) == 3){
            return rightDiagonal;
        }

        return -1;
    }

    public static void main(String[] args) {


        System.out.println("\nLet's play tic tac toe");

        char[][] board = {
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}
        };


        printBoard(board);

        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }

            printBoard(board);

            int count = checkWin(board);
            if ( count == 3)  {
                System.out.println("X WINS!");
                break;
            }

            else if (count == -3 ) {
                System.out.println("O WINS!");
                break;
            }
        }


    }


}
