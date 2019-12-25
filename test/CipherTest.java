
import org.junit.Test;
import static org.junit.Assert.*;

public class CipherTest {

    public CipherTest() {
    }

    @Test
    public void testSetOffset() {
        Cipher test1 = new Cipher();
        test1.setOffset(3);
        assertEquals(3, test1.offset);
    }

    @Test
    public void testEncrypt() {
        Cipher test2 = new Cipher();
        String text = "ABC";
        test2.setOffset(3);
        String actual = test2.encrypt(text);
        assertEquals("DEF", actual);
    }

    @Test
    public void testDecrypt() {
        Cipher test3 = new Cipher();
        String text = "DEF";
        test3.setOffset(3);
        String actual = test3.decrypt(text);
        assertEquals("ABC", actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEncryptBadSign() {
        Cipher test4 = new Cipher();
        String text = "!@#44ABC";
        test4.encrypt(text);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEncryptNULL() {
        Cipher test5 = new Cipher();
        String text = "";
        test5.encrypt(text);
    }

}
