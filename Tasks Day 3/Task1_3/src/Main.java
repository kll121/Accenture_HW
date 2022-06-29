public class Main {
    public static void main(String[] args) {
        int[][] mTable = new int[10][10];
        int ii, jj; //will be given the value of i + 1, and j + 1, since loops start from 0
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mTable[i][j] = (i + 1) * (j + 1);
            }
        }



        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ii = i+1;
                jj = j+1;
                if((i+1) != 10) {

                    System.out.print(ii + " * " + jj + " = " + mTable[i][j] + "     ");
                }
                if(ii == 10) {
                    System.out.print(ii + " * " + jj + " = " + mTable[i][j] + "    ");
                }

                if (mTable[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

