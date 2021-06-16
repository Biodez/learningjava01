import java.text.MessageFormat;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");

            char[][] ticTacTable = new char[3][3];
            for (int i = 0; i < ticTacTable.length; i++) {
              for (int j = 0; j < ticTacTable[i].length; j++) {
                ticTacTable[i][j] = '-';
              }
            }

            printBoard(ticTacTable);
            char x = 'X';
            char o = 'O';
            String turn = "Turn";
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    System.out.println(MessageFormat.format("{0}: {1}", turn, x));
                    int[] intArray = askUser(ticTacTable);
                    ticTacTable[intArray[0]][intArray[1]] = x;
                    printBoard(ticTacTable);
                } else {
                    System.out.println(MessageFormat.format("{0}: {1}", turn, o));
                    int[] intArray = askUser(ticTacTable);
                    ticTacTable[intArray[0]][intArray[1]] = o;
                    printBoard(ticTacTable);
                }
                if (checkWin(ticTacTable) == 3) {
                    System.out.println("X wins!");
                    break;
                } else if(checkWin(ticTacTable) == -3){
                    System.out.println("O wins!");
                    break;
                }
            }

            scan.close();
        }

    public static void printBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            System.out.println("\n");
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] askUser(char[][] board){
            System.out.print("• pick a row and column number: ");
            int row = scan.nextInt();
            int column = scan.nextInt();

            while (board[row][column] != '-') {
                System.out.println("The spot is taken, Kindly choose again");
                row = scan.nextInt();
                column = scan.nextInt();
            }
            int[] rowColumnArray = {row, column};
            return rowColumnArray;
    }
    public static int checkWin(char[][] board){
        int count = 0;
        for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board[i].length; j++) {
               if (board[i][j] == 'X') {
                   count++;
               } else if(board[i][j] == 'O') {
                   count--;
               }
           }
           if (count == 3 || count == -3) {
               return count;
           } else{
               count = 0;
           }
       }
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
               if (board[j][i] == 'X') {
                   count++;
                } else if(board[j][i] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else{
                count = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if(board[i][i] == 'O') {
                count--;
            }
        }
        if (count == 3 || count == -3) {
            return count;
        } else{
            count = 0;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][2-i] == 'X') {
                count++;
            } else if (board[i][2-i] == 'O'){
                count--;
            }
        }
        return count;
    }

}
