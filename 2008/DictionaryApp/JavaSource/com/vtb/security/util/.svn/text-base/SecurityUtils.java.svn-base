/*
 * Created on 03.10.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.vtb.security.util.passwd.RandomPassword;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SecurityUtils {

	protected static int DEFAULT_GENERATED_PASSWORD_SIZE = 8;

	/**
	 * Подпись строки алгоритмом md5 
	 * @param text
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public static String encryptToMD5(String text) {
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
	    
			algorithm.update(text.getBytes());
			byte messageDigest[] = algorithm.digest();
	    
			StringBuffer hexString = new StringBuffer();
			for (int i=0;i<messageDigest.length;i++) {
				String hex = Integer.toHexString(0xFF & messageDigest[i]);
				if (hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
	 
			return hexString.toString();
		} catch (NoSuchAlgorithmException e){
			throw new RuntimeException("Exception while encrypt to md5: " + e.getMessage());
		}
	}
	
	public static String generatePassword(){
		return generatePassword(DEFAULT_GENERATED_PASSWORD_SIZE);
	}
	
	public static String generatePassword(int passwordLength){
		RandomPassword pass = new RandomPassword();
		return pass.getPass(passwordLength);
	}
	
}
