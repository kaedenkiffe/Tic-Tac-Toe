import java.util.Scanner;

public class TicTacToe
{
    /**
     * Constructor for objects of class tictactoe
     */
    public TicTacToe()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerOne;
        String playerTwo;
        System.out.println("Hello Players");
        System.out.println("Enter Player one's name");
        playerOne = input.next();
        System.out.println("Enter Player two's name");
        playerTwo = input.next();
        System.out.println("Tic-Tac-Toe:" + playerOne + " vs "+ playerTwo);
        
        char[][] board = new char[3][3];
        for(int i=0; i<3;i++){
            for (int k=0; k<3;k++){
                board[i][k]='-';
            }
        }
        
        drawBoard(board);
        boolean playerOneTurn = true;
        char symbol = ' ';
        
        if (playerOneTurn) {
            symbol = 'x';
        } else {
            symbol = 'o';
        }
        
        if (playerOneTurn) {
            System.out.println(playerOne + "'s turn (x)");
        } else {
            System.out.println(playerTwo + "'s turn (o)");
        }
        
        int row = 0;
        int column = 0;
        
        while (true) {
            System.out.println("Select a row (0, 1, or 2): ");
            row = input.nextInt();
            System.out.println("Select a column (0, 1, or 2): ");
            column = input.nextInt();

            //Row and Column authenticator
            if (row < 0 || column < 0 || row > 2 || column > 2) {
                System.out.println("Out of bounds");
            } else if (board[row][column] != '-') {
                System.out.println("Spot already selected");
            } else {
                break;
            }
        }
        board[row][column] = symbol;
        drawBoard(board);
    }

    public static void drawBoard(char[][] board) {
        for(int i=0; i<3;i++){
            for (int k=0; k<3;k++){
                System.out.print(board[i][k]);
            }
            System.out.println();
        }
    }
}

