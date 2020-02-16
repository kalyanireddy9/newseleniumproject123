import com.stepdefinitions.webdriverclass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class hooks {
    com.stepdefinitions.webdriverclass webdriverclass = new webdriverclass();
     @Before
    public void open_browser() throws IOException {
         webdriverclass.openBrowser();
     }

     @After
    public void close_browser() {

         webdriverclass.closebrowser();
     }
}
