
public class UniFriend extends Friend{
	String major;
	
	public UniFriend(String name, String number, String major) {
		super(name, number);
		this.major = major;
	}

	public String toString() {
		return "UniFriend [major=" + major + ", name=" + name + ", number=" + number + "]";
	}
	
}
