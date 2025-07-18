import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.example.ForPaysend;

public class PaysendTest {

    @Test
    void testBrackets() {
        assertTrue(ForPaysend.removingBrackets("{}"));
        assertTrue(ForPaysend.removingBrackets("[]"));
        assertTrue(ForPaysend.removingBrackets("()"));
        assertTrue(ForPaysend.removingBrackets("{[()]}"));
        assertFalse(ForPaysend.removingBrackets("{{}}{"));
        assertFalse(ForPaysend.removingBrackets("}}"));
        assertFalse(ForPaysend.removingBrackets("([)]"));
        assertFalse(ForPaysend.removingBrackets("}{"));
        assertTrue(ForPaysend.removingBrackets(""));
        // based on the requirements this should pass, but my code is not handling this
        // option
        assertTrue(ForPaysend.removingBrackets("{(})"));
    }
}