package com.snhu.sslserver;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{
    @RequestMapping("/hash")
    public String myHash() throws DigestException{
    	String data = "Peter F. Tumulty";
    	String encryptedData = checkSumVerification(data);
       
        return "<p>data:"+ data + "<br/> SHA-256 : CheckSum Value: " + encryptedData + "</p>";
    }
    
	private String checkSumVerification(String data) throws DigestException {
		String results = null;
		
		
		try {
			 MessageDigest md = MessageDigest.getInstance("SHA-256");
			 byte[] dataAsBytes = data.getBytes();
		     md.update(dataAsBytes);
		     MessageDigest mdClone = null;
			try {
				mdClone = (MessageDigest) md.clone();
			} catch (CloneNotSupportedException e) {
				throw new DigestException("couldn't clone message digest");	
			}
		     byte[] dataToDigest = mdClone.digest();
		     String digestToHex = bytesToHex(dataToDigest);
		     
		     results = digestToHex;
			
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		     throw new DigestException("couldn't make digest of the message");	
		} 
		
		return results;
	}
	
	private String bytesToHex(byte[] bytes) {
	    StringBuilder hexString = new StringBuilder();
	    
	    for (int i = 0; i < bytes.length; i++) {
	        char[] hexDigits = new char[2];
	        hexDigits[0] = Character.forDigit((bytes[i] >> 4) & 0xF, 16);
	        hexDigits[1] = Character.forDigit(bytes[i] & 0xF, 16);
	        hexString.append(hexDigits);
	    }
	    return hexString.toString();
	}
}