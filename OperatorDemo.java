/*
�����������+��-��*��/��%��++��--

��ֵ�������=
	Java�ֵȺ�=��ʾ��ֵ�������==��ʾ��ȹ�ϵ�Ĳ�����
	
��չ��ֵ�������+=��-=��*=��/=

��ϵ�������>��<��>=��<=��==��!=
	��ϵ��������ص�ֵ�ǲ������ͣ�Ҳ����˵����true��false�������.
	
�߼��������&&��||����
	�߼������һ������ֵ���Ǿ����ֵ�����Ǳ��ʽ��
	&&����ʾ��·��
		1. ���ߵı��ʽ�������ҿ�ʼ�Աȣ������ߵı��ʽ��false�����ұ߲���Ҫ�����жϣ����Ϊfalse��
		2. ���ߵı��ʽ��ֻҪ��һ����false��������������false��
		3. ֻ�е����ߵı��ʽ��Ϊtrueʱ������������true��
	||����ʾ��·��
		1. ���ߵı��ʽ�������ҿ�ʼ�Աȣ������ߵı��ʽ��true�����ұ߲���Ҫ�����жϣ����Ϊtrue��
		2. ���ߵı��ʽ��ֻҪ��һ����true��������������true��
		3. ֻ�е����ı��ʽ��Ϊfalse�ǣ�����������false��
	! ��ȡ���������̾�� ! �ұ���false��ȡ��������Ϊtrue�������̾�� ! �ұ���true��ȡ��������Ϊfalse��
	
λ�������&��|��^��~��>>��<<��>>>
	λ�����ֻ�ܲ�����ֵ��������ʱ���ת�ɶ����ƽ������㡣

���������������Ŀ�����
	ʹ�õ�ʱ����Ҫ��һ�����ʽ�����ʽ�����ture���򷵻��ʺ� ? ����Ľ���������flase���򷵻�ð�� : ����Ľ����
*/

public class OperatorDemo{
	
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		System.out.print("a+b = ");	System.out.println(a+b);
		System.out.print("a-b = ");	System.out.println(a-b);
		System.out.print("a*b = ");	System.out.println(a*b);
		System.out.print("a/b = ");	System.out.println(a/b);	//�������㣬ȡ�̡�
		System.out.print("a%b = ");	System.out.println(a%b);	//ģ���㣬ȡ������
		System.out.print("a++ = ");	System.out.println(a++);	//��ӡ��� 1 ��a++ ���ȴ�ӡ����a��ֵ��֮���ټ���a��1�����Դ�ӡ���Ϊ1 ��
		System.out.print("++a = ");	System.out.println(++a);	//��ӡ��� 3 �� ++a���ȼ��� a �� 1 ���ٴ�ӡ���� a ��ֵ����Ϊa����һ�д����о����� a++ ������֮��ֵΪ 2 �������ڱ��е� ++a ����֮��ֵΪ 3 ��
		System.out.print("a-- = ");	System.out.println(a--);	//��ӡ�����3
		System.out.print("--a = ");	System.out.println(--a);	//��ӡ�����1
		System.out.print("++b+b++=");	System.out.println(++b+b++);	//��ӡ�����6
		
		int c = 1;
		c = c + 2;	//�� c += 2 ִ�н����ͬ��
		c += 2;	//�� c = c + 2 ִ�н����ͬ��
		
		byte d = 10;
		//����ת�����⣬d��btye���ͣ�d+1������int���ͣ���Ҫ��int���͵�ֵת��Ϊbyte�����о�����ʧ�������Ҫǿ��ת����
		//d = d + 1;	//����: �����ݵ�����: ��intת����byte���ܻ�����ʧ��
		//�����ڽ��д��������ʱ��ʹ����չ�������
		d += 1;

		//��ϵ��������ص�ֵ�ǲ������ͣ�Ҳ����˵����true��false�������
		System.out.print("1>2 = ");	System.out.println(1>2);
		System.out.print("1<2 = ");	System.out.println(1<2);
		System.out.print("1>=2 = ");	System.out.println(1>=2);
		System.out.print("1<=2 = ");	System.out.println(1<=2);
		System.out.print("1==2 = ");	System.out.println(1==2);
		System.out.print("1!=2 = ");	System.out.println(1!=2);
		
		//�߼������
		System.out.println( 3>5 && 3<4 );	//��������false
		System.out.println( 3<5 && 3<4 );	//��������true
		System.out.println( 3>5	|| 3<4 );	//��������true
		System.out.println( 3>5 || 3>4 );	//��������false
		System.out.println( !true );	//��������false
		System.out.println( !false );	//��������true
		
		System.out.println("-------------�ָ���------------");
		
		//λ�����ֻ�ܲ�����ֵ��������ʱ���ת�ɶ����ƽ������㡣
		System.out.println(4 & 5);	//��ӡ�����4
		System.out.println(4 | 5);	//��ӡ�����5
		System.out.println(4 ^ 5);	//��ӡ�����1
		//���룬����ԭ�룬����
		System.out.println(~4);
		System.out.println(2<<3);
		System.out.println(16>>2);
		
		//�������������Ŀ�������
		//ʹ�õ�ʱ����Ҫ��һ�����ʽ�����ʽ�����ture���򷵻��ʺ� ? ����Ľ���������flase���򷵻�ð�� : ����Ľ����
		System.out.println(3>2?3:2);	//��ӡ�����3
		
			
		//��ӡ���Ϊ��false����Ŀ���� true ? false ���ؽ���� false��ð��֮��� true ��false : true�������㡣
		System.out.println( true ? false : true ? false : true );
			
		//��ӡ���Ϊ��false����Ŀ���� false �� false ���ؽ���Ǽ���ִ�� true �� false : true ��������Ϊ��false��
		System.out.println( false ? false : true ? false : true ); 
		
	}
}