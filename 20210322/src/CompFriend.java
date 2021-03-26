
public class CompFriend extends Friend{
	String depart;
	
	public CompFriend(String name, String number, String depart) {
		super(name, number);
		this.depart = depart;
	}
	public String toString() {
		return "CompFriend [depart=" + depart + ", name=" + name + ", number=" + number + "]";
	}	
}
