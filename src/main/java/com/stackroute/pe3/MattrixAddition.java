package com.stackroute.pe3;

public class MattrixAddition{

    //Class variables are declared
    int[][] matrix1,matrix2;
    int rows,columns;


    //Matrices are initialised
    public void MatrixInitialisation(int rows,int columns)
    {
        this.rows=rows;
        this.columns=columns;
        matrix1=new int[rows][columns];
        matrix2=new int[rows][columns];
    }

    //Setting the two arrays in their corresponding matrix form
    public void setMatrices(int[] a,int[] b)
    {
        int k=0;
        int l=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix1[i][j]=a[k++];
                matrix2[i][j]=b[l++];
            }
        }
    }

    ///Matrices are getting added
    public Integer[][] addMatrices(int[][]matrix1,int[][]matrix2)
    {   Integer[][] sum= new Integer[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        } return sum;
    }
}
