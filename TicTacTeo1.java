import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] board = new char[3][3];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        char currentPlayer = PLAYER_X;
        boolean gameWon = false;
        boolean gameDraw = false;
        
        while (!gameWon && !gameDraw) {
            printBoard();
            makeMove(scanner, currentPlayer);
            gameWon = checkWin(currentPlayer);
            gameDraw = checkDraw();
            
            // Switch player
            if (!gameWon && !gameDraw) {
                currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
            }
        }
        
        printBoard();
        
        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else if (gameDraw) {
            System.out.println("The game is a draw!");
        }
        
        scanner.close();
    }
    
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
    
    private static void printBoard() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }
    
    private static void makeMove(Scanner scanner, char player) {
        int row, col;
        while (true) {
            System.out.println("Player " + player + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
                board[row][col] = player;
                break;
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
    }
    
    private static boolean checkWin(char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        
        return false;
    }
    
    private static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
