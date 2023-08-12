package CMS;

import java.util.Random;

public class OTP {
	public String  otp() {
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                
  
  
        String values = Capital_chars + Small_chars +
                        numbers;
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] password = new char[6];
  
        for (int i = 0; i < 6; i++)
        {
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
  
        }
        String otp = String.copyValueOf(password);
        return otp;
	}
}
