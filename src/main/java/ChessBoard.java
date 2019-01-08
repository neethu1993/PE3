public class ChessBoard {
    public void chessBoardMethod() {

            for (int i=0;i<8;i++){
                System.out.println();
                for (int j=0;j<8;j++){
                    if(i+j==0 || (i+j)%2==0){
                        System.out.print("WW|");
                    }
                    else {
                        System.out.print("BB|");
                    }
                }
            }
    }

    public static void main(String[] args) {
        ChessBoard object = new ChessBoard();
        object.chessBoardMethod();
    }
}
