package test.mypac;
/*
 *  [�޼ҵ带 ���鶧 ��� �ؾ� �ϴ°�]
 *  1. ���� ������
 *  2. static or non static
 *  3. ���� type
 *  4. �޼ҵ��
 *  5. �޼ҵ忡 �����ϴ� ������ ������ ������ type
 */
public class MyObject {
	/*
	 * public => 
	 * void =>
	 * walk => �޼ҵ��
	 * walk() => �� �޼ҵ�� � ���ڸ� ���� �ʴ´�
	 */
	
	public void walk() {
		System.out.println("������ �ɾ��");
	}
	//int type �� �������ִ� �޼ҵ�
	public int getNumber() {
		return 10;
	}
	//String type �� �������ִ� �޼ҵ�
	public String getGreeting() {
		return "�ȳ��ϼ���";
	}
	
	public Car getCar() {
		return new Car();
	}
}
