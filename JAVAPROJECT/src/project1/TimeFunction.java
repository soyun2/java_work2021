package project1;

import java.io.IOException;

public class TimeFunction{
	static int myTime = 0; //�ܿ��ð�
	static String timerBuffer; // �ܿ� �ð� ���ڿ��� ����� ����
	static int oldTime; // Ÿ�̸Ӱ� ON �Ǿ��� ���� �ð��� ����ϰ� �ִ� ����
	static int onOff;

	// ������ �� �ð��� �ʴ���(sec)�� �Է� �޾�, "04:11:15" ���� ������ ���ڿ��� �ú��ʸ� ����
	public static String secToHHMMSS(int secs) {
		int hour, min, sec;
		sec = secs % 60;
		min = secs / 60 % 60;
		hour = secs / 3600;

		timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
		return timerBuffer;
	}
//
//	public static void pause() {
//		try {
//			System.in.read();
//		} catch (IOException e) {
//		}
//	}
//	
	//���� �ð� �Է�(�ð� ����)
	public static int addTime(int i) {
		myTime += i;
		return myTime;
	}
}