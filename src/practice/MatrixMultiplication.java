package practice;

public class MatrixMultiplication {
    public static void main (String [] args){
        double[][] firstMatrix = {
                new double[]{1d,5d},
                new double[]{2d,3d},
                new double[]{1d,7d}
        };
        double[][] secondMatrix = {
                new double[]{1d,2d,3d,7d},
                new double[]{5d,2d,8d,1d}
        };

        double[][] result = multiplyMatrices(firstMatrix,secondMatrix);
        for(int row=0;row<result.length;row++){
            for (int col = 0; col<result[0].length;col++){
                System.out.print(result[row][col]+" ");
            }
            System.out.println(" ");
        }

//        System.out.println(secondMatrix.length);
    }

   public static double[][] multiplyMatrices(double[][] firsrMatrices,double[][] secondMatrices){
        double[][] result = new double[firsrMatrices.length][secondMatrices[0].length];
        for(int row = 0; row < result.length;row++){
            for(int col = 0; col < result[row].length; col++){
                result[row][col] = multiplyMatricesCell(firsrMatrices,secondMatrices,row,col);
            }
        }
        return result;
    }

    public static double multiplyMatricesCell(double[][] firstMatrices,double[][] secondMatrices, int row, int col){
        double cell = 0;
        for(int i=0; i<secondMatrices.length;i++){
            cell += firstMatrices[row][i]*secondMatrices[i][col];
        }
        return cell;
    }
}
