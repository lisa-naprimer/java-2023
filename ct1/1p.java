public class Task1 implements Debuggable {
    public Task1() {
    }

    public void invoke() {
        int size = 5;
        int[][] matrix = (new Matrix(size)).getMatrix();
        System.out.println(Utils.matrixToString(Utils.convertInt2D(matrix)));
        System.out.println("----------------");
        int[][] transMatrix = new int[size][size];

        for(int i = 0; i < transMatrix.length; ++i) {
            for(int j = 0; j < transMatrix[i].length; ++j) {
                transMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println(Utils.matrixToString(Utils.convertInt2D(transMatrix)));
    }
}
