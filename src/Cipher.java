
public class Cipher {

    protected int offset;
    private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    private final int len = alphabet.length();

    public void setOffset(int n) {
        offset = n;
    }

    public String encrypt(String text) {
        return crypt(text, offset);
    }
    
    public String decrypt(String text) {
        return crypt(text,-offset);
    }

    private String crypt(String text, int offset) {
        String newText = "";
        if (text.matches("[" + alphabet + "]+")) {
            offset = offset % len;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                int idx = alphabet.indexOf(ch);
                idx = (idx + offset + len) % len;
                ch = alphabet.charAt(idx);
                newText += ch;
            }
        } else {
            throw new IllegalArgumentException("Nieprawidlowy znak");
        }
        return newText;
    }

}
