/*
final常量
1. 使用final修饰的变量，只能被初始化一次，值不能被修改。
2. 常量命名规则：字母大写，单词之间用下划线隔开

*/

public class Constants{

	public static void main(String[] args){
		final double PI = 3.14;
		//PI = 3.15;	//错误: 无法为最终变量PI分配值 PI = 3.15;
		double r = 4;
		double area = PI * r * r;
		double circle = 2 * PI * r;
		System.out.println("area = " + area);
		System.out.println("circle = " + circle);
	}
}