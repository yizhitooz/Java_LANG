package step2;

import java.util.Scanner;

public class MainClass
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int rowCount, colCount;
        System.out.println("�������������");
        rowCount = sc.nextInt();
        colCount = sc.nextInt();

        //����1��rowCount��colCount�ľ���,��������Ԫ�س�ʼ��Ϊ0
        Matrix matA = new Matrix(rowCount, colCount);
        MainClass.inputMatrix(matA);
        System.out.println("����A=\n" + matA);
        Matrix matB = new Matrix(rowCount, colCount);
        MainClass.inputMatrix(matB);
        System.out.println("����B=\n" + matB);
        System.out.println("����������:");
        //ִ�о����������
        Matrix matC = matA.plus(matB);
        System.out.println("C=\n" + matC);
        //�޸�matA�ĵ�2�У���2�е��Ǹ�Ԫ��
        matA.data[1][1] = 89.4;
        //ִ�о�����һ������ӵ����㣬�����������Ԫ�ض����������
        Matrix matD = matA.plus(5.6);
        System.out.println("D=\n" + matD);
        //ִ�о����1������ˣ������������Ԫ�ض����������
        Matrix matF = matA.multiply(3.4);
        System.out.println("F=\n" + matF);
        //��ת�þ���
        Matrix matG = matA.transpose();
        System.out.println("G=\n" + matG);
        //ִ�о���˷������������˷����������壬��ο����Դ����̲ġ�
        Matrix matE = matA.multiply(matG);
        //��[[1,2,3],[4,5,6]]���Ƹ�ʽ�����������Ķ��Ŷ���Ӣ�Ķ���
        System.out.println("E=\n" + matE);
        MainClass.sc.close();
    }

    private static void inputMatrix(Matrix mat)
    {
        int rowCount = mat.getRowCount();
        int colCount = mat.getColCount();

        System.out.println("����" + rowCount + "��" + colCount + "����");
        for (int i = 0; i < rowCount; i++)
        {
            for (int j = 0; j < colCount; j++)
            {
                System.out.print("[" + i + "][" + j + "]=");
                mat.data[i][j] = sc.nextDouble();
            }
        }
    }
}
