
public class Manager {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		friends[0] = new UniFriend("���б�ģ��1", "010123123","��ǻ��");
		friends[1] = new UniFriend("���б�ģ��2", "011123123","��ǻ��");
		
		friends[2] = new CompFriend("����ģ��1", "0112468249","����1��");
		friends[3] = new CompFriend("����ģ��2", "0111268548","����2��");
		
		for(int i=0; i<friends.length;i++) {
			System.out.println("friends["+i+"]"+friends[i]);
			System.out.println();
		}
	}
}
