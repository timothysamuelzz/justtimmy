package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.keyPressPage;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {

    @Test
    public void testBackSpace(){
        keyPressPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.gerResult(), "You entered: BACK_SPACE");
    }

}
