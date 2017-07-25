package tr.org.linux.kamp.ceasercipher;

import java.util.Scanner;

public class CeaserCipher {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int key = input.nextInt();
		String str = input.nextLine();
		System.out.println();
		str = input.nextLine();
		while (key < 0) {
			key += 26;
		}

		System.out.println(str);

		String msg = encryption(key, str);
		System.out.println(msg);
		
		key = input.nextInt();
		str = input.nextLine();
		System.out.println();
		str = input.nextLine();
		
		String decrypted=decryption(key,str);
		System.out.println(decrypted);

	}

	public static String encryption(int key, String str) {
		String msg = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLetter(ch) && !(Character.isLetter(ch + key))) {
				msg += (char) (str.charAt(i) - ('z' - 'a' + 1) + key);

			} else if (Character.isLetter(ch)) {

				msg += (char) (str.charAt(i) + key);

			}

			else if (!Character.isLetter(ch)) {
				msg += (char) str.charAt(i);
				
			}
		}
		return msg;

	}
	
	public static String decryption(int key, String str) {
		key=-key;
		while (key < 0) {
			key += 26;
		}
		String decrypted=encryption(key,str);
		return decrypted;
	}
	

}

/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

import java.util.Scanner;

/**
 *
 * @author oyas

public class CaesarCipher {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir anahtar giriniz: ");
        int key = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Lütfen mesajı giriniz: ");
        String msg = sc.nextLine();
        
        System.out.println("Şifreleme için E, çözümleme için D giriniz: ");
        String op = sc.next();
        
        if(op.equals("E")){
            System.out.println(encrypt(msg, key));
        }
        else if(op.equals("D")){
            System.out.println(decrypt(msg, key));
        }
        else{
            System.out.println("Hatalı bir operasyon seçtiniz.");
        }
        
    }
    
    public static String encrypt(String msg, int key){
        if(key < 0) key = 26-(-key%26);
        String result = "";
        for(int i = 0; i < msg.length();i++){
            char ch = msg.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    result += (char)('A' + (ch + key - 'A')%26);
                }
                else{
                    result += (char)('a' + (ch + key - 'a')%26);
                }
            }
            else{
                result += ch;
            }
        }
        return result;
        
    }
    
    public static String decrypt(String msg, int key){
           return encrypt(msg, -key);
    }
}
*/
