/*
final����
1. ʹ��final���εı�����ֻ�ܱ���ʼ��һ�Σ�ֵ���ܱ��޸ġ�
2. ��������������ĸ��д������֮�����»��߸���

*/

public class Constants{

	public static void main(String[] args){
		final double PI = 3.14;
		//PI = 3.15;	//����: �޷�Ϊ���ձ���PI����ֵ PI = 3.15;
		double r = 4;
		double area = PI * r * r;
		double circle = 2 * PI * r;
		System.out.println("area = " + area);
		System.out.println("circle = " + circle);
	}
}