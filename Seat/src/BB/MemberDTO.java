package BB;
public class MemberDTO {
   
    private String name;
    private String pwd;
    private String tel;
    private String addr;
    private String time;
 
   
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
   
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
   
    
    //DTO ∞¥√º »Æ¿Œ
    @Override
    public String toString() {
        return "MemberDTO [name=" + name + ", pwd=" + pwd + ", tel=" + tel+ ", addr=" + addr + ", time ="+time+"]";
    }
	
}

