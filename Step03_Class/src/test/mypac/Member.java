package test.mypac;
/*
 *  Member 객체에 회원의 번호, 이름, 주소를 담고 싶다면
 *  클래스를 어떻게 설계를 해야 할까?
 *  
 *  저장소(필드)가 3개 필요하다
 *  필드의 type은 int, String, String
 */

public class Member {
	public int num;
	public String name;
	public String addr="";
    //필드는 초기화 자동으로 돼서 생략 가능
}
