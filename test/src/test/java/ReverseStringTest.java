import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

        @Test
        public void reverseTestWithNull(){
            Assert.assertNull(ReverseString.reverseString(null));
            System.out.println("passed");
        }

        @Test
        public void reverseTestWithDigits(){
            Assert.assertEquals("cba321", ReverseString.reverseString("123abc"));
            System.out.println("passed");
        }

        @Test
        public void reverseTestHappyPath(){
            Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
            System.out.println("passed");
        }


}
