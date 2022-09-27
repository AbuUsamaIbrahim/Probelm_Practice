package leetCodeProblem;

public class Soduku {
    public static void main(String [] args){
        char[][] board = {
        {'.','.','4','.','.','.','6','3','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'5','.','.','.','.','.','.','9','.'},
        {'.','.','.','5','6','.','.','.','.'},
        {'4','.','3','.','.','.','.','.','1'},
        {'.','.','.','7','.','.','.','.','.'},
        {'.','.','.','5','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.','.','.'}};
         System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        int count = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = board[i][j];
                if(ch!='.')
                {
                    board[i][j]='.';
                    if(!isValid(board,i,j,ch))
                        return false;
                    board[i][j]=ch;
                }
            }
        }
        return true;

    }

    public static boolean isValid(char[][] board,int row, int col, char ch){
        for(int i=0;i<row;i++){
            if(board[i][col] == ch)
                return false;
        }

        for(int j=0;j<col;j++){
            if(board[row][j] == ch)
                return false;
        }

        int startRow = row - row%3;
        int startCol = col - col%3;

        for(int i=startRow; i<startRow+3; i++){
            for(int j=startCol; j<startCol+3; j++){
                if(board[i][j] == ch){
                    return false;
                }

            }
        }

        return true;

    }
}
