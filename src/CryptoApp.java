/* Simple JAVA Encyption Application

 */
public class CryptoApp {

    public static void main(String[] args){

        Crypto crypto = new BasicCrypto();

        String data = "String to encrypt";
        String enc = new String(crypto.encrypt(data.getBytes()));
        String dec = new String(crypto.decrypt(enc.getBytes()));

        System.out.println("Original String:  " + data);
        System.out.println("Encrypted String:  " + enc);
        System.out.println("Decrypted String:  " + dec);
    }
}
