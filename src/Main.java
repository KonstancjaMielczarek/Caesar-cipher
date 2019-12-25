
public class Main {

    public static void main(String[] args) {
        String text = "ABC";

        Cipher szyfr = new Cipher();

        szyfr.setOffset(3);

        String encrypted = szyfr.encrypt(text);
        System.out.println(encrypted);

        System.out.println("-------------------------------------");

        System.out.println(szyfr.decrypt(encrypted));

    }

}
