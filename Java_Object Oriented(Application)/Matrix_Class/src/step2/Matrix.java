package step2;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Matrix
{

    int rowCount;
    int colCount;
    double[][] data;

    public String toString()
    {
        String[][] dataString = new String[this.data.length][this.data[0].length];
        for (int i = 0; i < this.data.length; i++)
        {
            for (int j = 0; j < this.data[0].length; j++)
            {
                dataString[i][j] = new DecimalFormat("0.00").format(this.data[i][j]);
            }
        }
        StringBuilder temp = new StringBuilder("[");
        for (int i = 0; i < dataString.length; i++)
        {
            temp.append((Arrays.toString(dataString[i])).replaceAll(" ", ""));
            if (i <= this.data.length - 2)
            {
                temp.append(",\n ");
            } else
            {
                temp.append("]");
            }
        }
        return temp.toString();
    }

    public Matrix(int r, int c)
    {
        rowCount = r;
        colCount = c;
        data = new double[rowCount][colCount];
        for (int i = 0; i < rowCount; i++)
        {
            for (int j = 0; j < colCount; j++)
            {
                this.data[i][j] = 0;
            }
        }
    }

    public Matrix plus(Matrix mat)
    {
        Matrix M = new Matrix(this.rowCount, this.colCount);
        for (int i = 0; i < this.rowCount; i++)
        {
            for (int j = 0; j < this.colCount; j++)
            {
                M.data[i][j] = this.data[i][j] + mat.data[i][j];
            }
        }
        return M;
    }

    public Matrix plus(double num)
    {
        Matrix M = new Matrix(this.rowCount, this.colCount);
        for (int i = 0; i < this.rowCount; i++)
        {
            for (int j = 0; j < this.colCount; j++)
            {
                M.data[i][j] = this.data[i][j] + num;
            }
        }
        return M;
    }

    public int getRowCount()
    {
        return this.rowCount;
    }

    public int getColCount()
    {
        return this.colCount;
    }

    public Matrix multiply(Matrix mat)
    {
        if (this.colCount != mat.rowCount)
        {
            return null;
        }
        Matrix M = new Matrix(this.rowCount, mat.colCount);
        for (int i = 0; i < M.rowCount; i++)
        {
            for (int j = 0; j < M.colCount; j++)
            {
                double temp = 0;
                for (int k = 0; k < this.colCount; k++)
                {
                    temp = temp + this.data[i][k] * mat.data[k][j];
                }
                M.data[i][j] = temp;
            }
        }
        return M;
    }

    public Matrix multiply(double num)
    {
        Matrix M = new Matrix(this.rowCount, this.colCount);
        for (int i = 0; i < this.rowCount; i++)
        {
            for (int j = 0; j < this.colCount; j++)
            {
                M.data[i][j] = this.data[i][j] * num;
            }
        }
        return M;
    }

    public Matrix transpose()
    {
        Matrix M = new Matrix(this.colCount, this.rowCount);
        for (int i = 0; i < this.colCount; i++)
        {
            for (int j = 0; j < this.rowCount; j++)
            {
                M.data[i][j] = this.data[j][i];
            }
        }
        return M;
    }
}
