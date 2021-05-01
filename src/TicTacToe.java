import java.util.Scanner;

public class TicTacToe {

    public static final String EMPTY_STRING = " ";
    private int row, col;

    private String player1, player2;

    private final String[][] maze = new String[3][3];

    public TicTacToe(){
        for(int r = 0; r <maze.length; r++){
            for(int c = 0; c <maze.length; c++){
                maze[r][c] = EMPTY_STRING;
            }
        }
    }

    public String getPlayer1() {

        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Please enter your name.");
        player1 = input.nextLine();
        return player1;

    }

    public String getPlayer2() {

        Scanner input = new Scanner(System.in);
        System.out.println("Player 2: Please enter your name.");
        player2 = input.nextLine();
        return player2;

    }

    public int getRow() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you row, make sure it is in the range of 0 and 2");
        int row = input.nextInt();
        if((row < 0) || (row > 2)){
            this.getRow();
        }
        return row;

    }

    public int getCol() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you col, make sure it is in the range of 0 and 2");
        int col = input.nextInt();
        if((col < 0) || (col > 2)){
            this.getCol();
        }
        return col;

    }

    public void printMatrix() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" | " + maze[i][j] + "");
            }
            System.out.println();
        }

    }

    public void conditionForWinner(){
        if((maze[0][0].equals("*")) && (maze[0][1].equals("*")) && (maze[0][2].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        } else if ((maze[0][0].equals("#")) && (maze[0][1].equals("#")) && (maze[0][2].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[1][0].equals("*")) && (maze[1][1].equals("*")) && (maze[1][2].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[1][0].equals("#")) && (maze[1][1].equals("#")) && (maze[1][2].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[2][0].equals("*")) && (maze[2][1].equals("*")) && (maze[2][2].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[2][0].equals("#")) && (maze[2][1].equals("#")) && (maze[2][2].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[0][0].equals("*")) && (maze[1][0].equals("*")) && (maze[2][0].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[0][0].equals("#")) && (maze[1][0].equals("#")) && (maze[2][0].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[0][2].equals("*")) && (maze[1][2].equals("*")) && (maze[2][2].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[0][2].equals("#")) && (maze[1][2].equals("#")) && (maze[2][2].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[0][1].equals("*")) && (maze[1][1].equals("*")) && (maze[2][1].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[0][1].equals("#")) && (maze[1][1].equals("#")) && (maze[2][1].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[0][0].equals("*")) && (maze[1][1].equals("*")) && (maze[2][2].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[0][0].equals("#")) && (maze[1][1].equals("#")) && (maze[2][2].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
        if((maze[0][2].equals("*")) && (maze[1][1].equals("*")) && (maze[2][0].equals("*"))){
            System.out.println(player1 + " is the winner");
            this.printMatrix();
            System.exit(0);
        }else if ((maze[0][2].equals("#")) && (maze[1][1].equals("#")) && (maze[2][0].equals("#"))) {
            System.out.println(player2 + " is the winner");
            this.printMatrix();
            System.exit(0);

        }
    }

    public void findWinner(){
        this.conditionForWinner();
    }

    public static void main(String[] args) {

        TicTacToe obj = new TicTacToe();

        String player1 = obj.getPlayer1();
        String player2 = obj.getPlayer2();
        String[][] maze = obj.maze;

        int row, col;

        for (int count = 0; count < 4; count++) {



            do {
                System.out.println(player1 + "'s turn");
                row = obj.getRow();
                col = obj.getCol();

                if (maze[row][col].equals("*")) {
                    System.out.println("This place is already filled by you " + player1 + ", choose some other place");
                    row = obj.getRow();
                    col = obj.getCol();
                } else if (maze[row][col].equals(EMPTY_STRING)) {
                    maze[row][col] = "*";
                } else if (maze[row][col].equals("#")) {
                    System.out.println("This place is already filled by " + player2);

                }

            } while (maze[row][col] != null && maze[row][col].equals("#"));
            obj.printMatrix();
            obj.findWinner();

            do {
                System.out.println(player2 + "'s turn");
                row = obj.getRow();
                col = obj.getCol();

                if (maze[row][col].equals("#")) {
                    System.out.println("This place is already filled by you," + player2 + " choose some other place");
                    row = obj.getRow();
                    col = obj.getCol();
                } else if (maze[row][col].equals(EMPTY_STRING)) {
                    maze[row][col] = "#";
                } else if (maze[row][col].equals("*")) {
                    System.out.println("This place is already filled by " + player1);

                }

            } while (maze[row][col] != null && maze[row][col].equals("*"));
            obj.printMatrix();
            obj.findWinner();
        }
            System.out.println("It is a draw");
            obj.printMatrix();
            System.exit(0);

    }
}

