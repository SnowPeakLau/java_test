/*
算术运算符：+、-、*、/、%、++、--

赋值运算符：=
	Java种等号=表示赋值运算符，==表示相等关系的操作。
	
扩展赋值运算符：+=、-=、*=、/=

关系运算符：>、<、>=、<=、==、!=
	关系运算符返回的值是布尔类型，也就是说是有true和false两种情况.
	
逻辑运算符：&&、||、！
	逻辑运算符一般两的值不是具体的值，而是表达式。
	&&：表示短路与
		1. 两边的表达式从左向右开始对比，如果左边的表达式是false，则右边不需要进行判断，结果为false；
		2. 两边的表达式中只要有一个是false，则整体结果就是false；
		3. 只有当两边的表达式都为true时，整体结果才是true。
	||：表示短路或
		1. 两边的表达式从左向右开始对比，如果左边的表达式是true，则右边不需要进行判断，结果为true。
		2. 两边的表达式中只要有一个是true，则整体结果就是true。
		3. 只有当两的表达式都为false是，整体结果才是false。
	! ：取反，如果感叹号 ! 右边是false则取反运算结果为true，如果感叹号 ! 右边是true则取反运算结果为false。
	
位运算符：&、|、^、~、>>、<<、>>>
	位运算符只能操作数值，操作的时候会转成二进制进行运算。

条件运算符？：三目运算符
	使用的时候需要跟一个表达式，表达式如果是ture，则返回问号 ? 后面的结果，如果是flase，则返回冒号 : 后面的结果。
*/

public class OperatorDemo{
	
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.print("a+b = ");	System.out.println(a+b);
		System.out.print("a-b = ");	System.out.println(a-b);
		System.out.print("a*b = ");	System.out.println(a*b);
		System.out.print("a/b = ");	System.out.println(a/b);	//整除运算，取商。
		System.out.print("a%b = ");	System.out.println(a%b);	//模运算，取余数。
		System.out.print("a++ = ");	System.out.println(a++);	//打印结果 1 ，a++ 是先打印变量a的值，之后再计算a加1，所以打印结果为1 。
		System.out.print("++a = ");	System.out.println(++a);	//打印结果 3 ， ++a是先计算 a 加 1 ，再打印变量 a 的值，因为a在上一行代码中经过了 a++ 运算结果之后值为 2 ，所以在本行的 ++a 运算之后值为 3 。
		System.out.print("a-- = ");	System.out.println(a--);	//打印结果：3
		System.out.print("--a = ");	System.out.println(--a);	//打印结果：1
		System.out.print("++b+b++=");	System.out.println(++b+b++);	//打印结果：6
		
		int c = 1;
		c = c + 2;	//与 c += 2 执行结果相同。
		c += 2;	//与 c = c + 2 执行结果相同。
		
		byte d = 10;
		//类型转换问题，d是btye类型，d+1整体变成int类型，需要将int类型的值转换为byte，会有精度损失，因此需要强制转换。
		//d = d + 1;	//错误: 不兼容的类型: 从int转换到byte可能会有损失。
		//建议在进行此类操作的时候使用扩展运算符。
		d += 1;

		//关系运算符返回的值是布尔类型，也就是说是有true和false两种情况
		System.out.print("1>2 = ");	System.out.println(1>2);
		System.out.print("1<2 = ");	System.out.println(1<2);
		System.out.print("1>=2 = ");	System.out.println(1>=2);
		System.out.print("1<=2 = ");	System.out.println(1<=2);
		System.out.print("1==2 = ");	System.out.println(1==2);
		System.out.print("1!=2 = ");	System.out.println(1!=2);
		
		//逻辑运算符
		System.out.println( 3>5 && 3<4 );	//运算结果：false
		System.out.println( 3<5 && 3<4 );	//运算结果：true
		System.out.println( 3>5	|| 3<4 );	//运算结果：true
		System.out.println( 3>5 || 3>4 );	//运算结果：false
		System.out.println( !true );	//运算结果：false
		System.out.println( !false );	//运算结果：true
		
		System.out.println("-------------分隔符------------");
		
		//位运算符只能操作数值，操作的时候会转成二进制进行运算。
		System.out.println(4 & 5);	//打印结果：4
		System.out.println(4 | 5);	//打印结果：5
		System.out.println(4 ^ 5);	//打印结果：1
		//移码，补吗，原码，反码
		System.out.println(~4);
		System.out.println(2<<3);
		System.out.println(16>>2);
		
		//条件运算符（三目运算符）
		//使用的时候需要跟一个表达式，表达式如果是ture，则返回问号 ? 后面的结果，如果是flase，则返回冒号 : 后面的结果。
		System.out.println(3>2?3:2);	//打印结果：3
		
			
		//打印结果为：false，三目运算 true ? false 返回结果是 false，冒号之后的 true ？false : true不做运算。
		System.out.println( true ? false : true ? false : true );
			
		//打印结果为：false，三目运算 false ？ false 返回结果是继续执行 true ？ false : true ，运算结果为：false。
		System.out.println( false ? false : true ? false : true ); 
		
	}
}