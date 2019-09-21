/*
使用命令行的方式执行的时候，命令行环境默认编码格式是GBK
因此在文件中包含中文的时候须将编码格式设置为ANSI，就不会出现乱码错误
注意：
	1. .java文件的名称必须跟public class的名称保持一致。
	2. 一个java文件中科院包含多个class，但是public class只能有一个。
	3. public static void  main(String[] args){} 是所有 Java 程序的入口函数，
	   如果想执行对应的Java代码，则必须要添加此函数，切格式是固定的。
	4. main方法中参数列表可以支持多种写法,如：String[] args \ String [] args \ String args[]
	5. main方法中参数名称可以自定义，一般写成args。
	6. Java代码在编写的时候，每行结尾需要使用 ; 分号结束。
	7. Java代码块需要使用 {} 大括号括起来，前后匹配。
*/
//java中的注释分为三哪类：
//  1. 当行注释：双斜杠
/*  2. 多行注释：斜杠星 xxx 星斜杠星 */
/**
*   3.文档注释：斜杠两个星 每行注释一个星 星斜杠
*/

public class HelloWorld{
	
	public static void  main(String[] args){
		System.out.println("欢迎大家学习Java");
	
	}
	
}