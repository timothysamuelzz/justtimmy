package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FIleUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FIleUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\timothys\\Desktop\\selenium-webdriver-java-course-c4.2\\webdriver_java\\src\\test\\resources\\drivers");
       // assertEquals(uploadPage.getUploadedFiles(), "chromedriverWin2_83.exe", "Uploaded file is wrong");
    }
}
