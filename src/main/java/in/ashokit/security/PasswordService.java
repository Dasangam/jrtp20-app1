package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService 
{
	int i=10;
	int j=20;

	int k=10;

	int m=20;



	
	int g=80;

	int f=30;


	public static String encode(String s)
	{
		int j=10;
		Encoder e=Base64.getEncoder();
		return e.encodeToString(s.getBytes());
	}
	public static String decode(String encodetxt)
	{
		Decoder d=Base64.getDecoder();
		byte[]b=d.decode(encodetxt);
		return new String(b);
	}

	
}
