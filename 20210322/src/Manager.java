
public class Manager {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];
		friends[0] = new UniFriend("대학교친구1", "010123123","컴퓨터");
		friends[1] = new UniFriend("대학교친구2", "011123123","컴퓨터");
		
		friends[2] = new CompFriend("직장친구1", "0112468249","개발1팀");
		friends[3] = new CompFriend("직장친구2", "0111268548","개발2팀");
		
		for(int i=0; i<friends.length;i++) {
			System.out.println("friends["+i+"]"+friends[i]);
			System.out.println();
		}
	}
}
