public class SkyView {
    int numRows;
    int numCols;
    double[] scanned;
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int x = 0;
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(row % 2 == 0)
                {
                    view[row][col] = scanned[x];
                }
                else
                    {
                    view[row][numCols - col - 1] = scanned[x];
                }

                x++;
            }
        }
    }


    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0;
        int count = 0;

        for(int row = startRow; row <= endRow; row++)
        {
            for(int col = startCol; col <= endCol; col++)
            {
                sum += view[row][col];
                count++;
            }
        }

        return sum / count;
    }




}
