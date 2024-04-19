package 网络编程.TCP.com.common;
/**
 *   利用Socket编程传递对象流
 *   服务器和客户端公用的公共数据：User数据
 */
public class User implements java.io.Serializable{

	private String name;
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
