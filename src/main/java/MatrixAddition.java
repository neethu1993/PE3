public class MatrixAddition {
    private int m;
    private int n;
    public Boolean matrixAddition(int m,int n,int x,int y,int[][] first,int[][] second) {
        if(m==x && n==y) {
            if (first == null || second == null) {
                return false;
            } else {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(first[i][j] + second[i][j] + " ");
                    }
                    System.out.println();
                }
                return true;
            }
        }
        else {
            return false;
        }
    }
}
