package test.main;

import test.mypac.Messenger;
import test.mypac.Radio;

public class MainClass05 {

	public static void main(String[] args) {
	//Messenger Ŭ������ sendMessage(), getMessage(), useRadio() �޼ҵ� ȣ��	
		Messenger msg = new Messenger();
		msg.sendMessage("�Ⱦ���");
		msg.getMessage();
		msg.useRadio(new Radio());
	}
	
}
