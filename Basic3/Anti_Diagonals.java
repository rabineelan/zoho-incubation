class Anti_Diagonals{
 
   
    void diagonal(int A[][])
    {
 
        int N = 3;
 
        
        for (int col = 0; col < N; col++) {
 
            int startcol = col, startrow = 0;
 
            while (startcol >= 0 && startrow < N) {
 
                System.out.print(A[startrow][startcol]
                                 + " ");
 
                startcol--;
 
                startrow++;
            }
            System.out.println();
        }
 
       
        for (int row = 1; row < N; row++) {
            int startrow = row, startcol = N - 1;
 
            while (startrow < N && startcol >= 0) {
                System.out.print(A[startrow][startcol]
                                 + " ");
 
                startcol--;
 
                startrow++;
            }
            System.out.println();
        }
    }
 
    
    public static void main(String args[])
    {
 
       
        int A[][]
            = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
 
        Anti_Diagonals m = new Anti_Diagonals();
 
        m.diagonal(A);
    }
}
