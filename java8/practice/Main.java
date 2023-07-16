   /*a1=     2 4 6
      a2=  3 6 9
        a3=3 2 1

        highest sum between  row column and daignol*/

public class Main {


    public static void main(String[] args) {

        int [][] mat={
                {2,4,6},
                {3,6,9},
                {3,2,1}
        };
        for (int i=0;i< mat.length;i++){
            int  rowSum=0;
            for (int j=0;j<mat[i].length;j++){
                rowSum +=mat[i][j];

            }

        }
    }
}
