package src;

public class BoardGame {
    private String[][] board;
    private int playerRow;
    private int playerCol;
    private int counter;
    
    public BoardGame(int rows, int cols) {
        board = new String[rows][cols];
        // Initialize the board with empty spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = "O";
            }
        }
        // Place player at starting position (0,0)
        playerRow = 0;
        playerCol = 0;
        board[playerRow][playerCol] = "P";
        counter = 0;
    }
    
    public void displayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Students will implement these methods
    public void movePlayer(String direction) {
        String directionL = direction.toLowerCase();
        if(directionL.equals("w")){
            playerRow --;
        }else if(direction.equals("s")){
            playerRow ++;
        }else if(direction.equals("d")){
            playerCol ++;
        }else if(direction.equals("a")){
            playerCol --;
        }else{
            System.out.println("ERROR, ENTER EITHER W, A, S, OR D");
        }
        counter ++;
    }
    
    public boolean isGameLost() {
        if (playerRow == 5 || playerRow == -1 ||playerCol == 5 || playerCol == -1 ){
            return true;
        }
        if (counter == 10){
            return true;
        }
        return false;
    }
} 