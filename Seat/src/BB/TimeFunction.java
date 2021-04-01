package BB;
import java.io.*;
import java.util.Scanner;

public class TimeFunction{
	static int myTime = 0;
	static String timerBuffer; // �ܿ� �ð� ���ڿ��� ����� ����
	static int oldTime; // Ÿ�̸Ӱ� ON �Ǿ��� ���� �ð��� ����ϰ� �ִ� ����

	public static void main(String[] args) {
		while(true) {
		addTime();
		stopwatch(1); // 1�� �μ��� ������ Ÿ�̸Ӱ� ����
		System.out.println("ȯ���մϴ�! ���� Ű�� ������ ����մϴ�.");

		pause(); // ������ EnterŰ�� ���� ������ ������ ���

		stopwatch(0); // 0�� ������ Ÿ�̸Ӱ� ������ �ð� ���ڿ��� ���ۿ� ����
		System.out.format("�ȳ���������! �ܿ��ð�: [%s]%n", timerBuffer); // ��� �ð� ȭ�鿡 ���
	}}

	public static void stopwatch(int onOff) {
		if (onOff == 1) // Ÿ�̸� �ѱ�
			oldTime = (int) System.currentTimeMillis() / 1000;

		if (onOff == 0) // Ÿ�̸� ����, �ú��ʸ� timerBuffer �� ����
			secToHHMMSS((int)myTime-((int) System.currentTimeMillis() / 1000)+oldTime);
			myTime = (int)myTime-((int) System.currentTimeMillis() / 1000)+oldTime;
	}

	// ������ �� �ð��� �ʴ���(sec)�� �Է� �޾�, "04:11:15" ���� ������ ���ڿ��� �ú��ʸ� ����
	public static void secToHHMMSS(int secs) {
		int hour, min, sec;

		sec = secs % 60;
		min = secs / 60 % 60;
		hour = secs / 3600;

		timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
	}

	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}
	
	//���� �ð� �Է�(�ð� ����)
	public static void addTime() {
		System.out.println("���� �ð��� �Է��ϼ���.(�ð� ����)");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		System.out.println(i + "�ð��� �����Ǿ����ϴ�.");
		myTime += i * 3600;
	}
}