package Õ¯¬Á±‡≥Ã.ipaddress;
import java.io.Serializable;
/*
 * InetAddress¿‡
 */
import java.net.*;
public class Demo  implements Serializable{

	public static void main(String[] args){
		// TODO Auto-generated method stub

		byte[] ip=new byte[32];
		try {
			InetAddress ia=InetAddress.getByName("localhost");			
			System.out.println(ia.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
