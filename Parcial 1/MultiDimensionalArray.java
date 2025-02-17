public class MultiDimensionalArray {
    public void printDimensionalArray(){
        int [][] matrix = {
            {1,2},
            {3,4}
        };

        for (int i = 0; i<matrix.length; i++) {
            System.out.println("Longitud de la fila" + matrix[i].length);
            for (int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j]+ "");
            }
            System.out.println();

        }
    }
    
}
