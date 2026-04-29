package getting_started;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class first_test_script {
    public static void main(String[] args) {
        Playwright pw = Playwright.create();
        BrowserType browsertype = pw.chromium();
        Browser browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("msedge"));
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        String title = page.title();
        System.out.println("Title = " + title);

        //Closing the test
        // page.close();
        // browser.close();
        // pw.close();
    }
}
