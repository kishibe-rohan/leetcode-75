//Question Link: https://leetcode.com/problems/word-search/

public boolean exists(char[][] board,String word){
  
  //check for every letter in the board as potential candidate for start
    for(int i=0;i<board.length;i++)
    {
        for(int j=0;j<board[0].length;j++)
        {
            if(dfs(board,i,j,word,0))
            return true;
        }
    }

    return false;
}

private boolean dfs(char[][] board,int i,int j,String word,int index){
    
    //finished tracing 
    if(index == word.length())
    return true;

    //out of bounds or condition not satisfied
    if(i > board.length-1 || i <0 || j<0 || j >board[0].length-1 || board[i][j]!=word.charAt(index))
    return false;

    board[i][j] = '*'     //mark visited
    boolean result = dfs(board,i-1,j,word,index + 1) || dfs(board,i+1,j,word,index + 1) || dfs(board,i,j-1,word,index + 1) || dfs(board,i,j+1,word,index + 1) 
    board[i][j] = word.charAt(index);   //unmark

    return result;

}