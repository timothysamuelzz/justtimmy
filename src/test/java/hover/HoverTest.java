package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        assertEquals(hoversPage.hoverOverFigure().getTitle(), "name: user1", "Caption title incorrect");
    }
}
