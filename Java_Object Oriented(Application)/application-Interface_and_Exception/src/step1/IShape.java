/**
 * IShape:����ƽ��ͼ������ѭ�Ľӿ�
 */
package step1;

import java.util.Scanner;

/**
 * @author imagan
 */
public interface IShape
{
    /**
     * ��ƽ��ͼ�ε����
     *
     * @return ƽ��ͼ�ε����
     */
    double getArea();

    /**
     * ��ƽ��ͼ�ε��ܳ�
     *
     * @return ƽ��ͼ�ε��ܳ�
     */
    double getPerimeter();

    /**
     * �ӿ���̨����ƽ��ͼ�εĻ������ԣ��ڴ˻����Ͽ�����������ܳ�
     *
     * @param sc �Կ���̨�������ɨ��Ķ���
     * @throws ShapeException �����������ֵ������Բ�İ뾶Ϊ������0�����׳�ShapeException�쳣,���⵱һЩ���Բ��Ϸ����������߲��ܹ��������Σ���Ҳ�׳��쳣
     */
    void input(Scanner sc) throws ShapeException;
}
