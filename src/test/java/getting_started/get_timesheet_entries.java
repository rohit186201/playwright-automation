package getting_started;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class get_timesheet_entries {
    public static void main(String[] args) {
        
        Playwright pw = Playwright.create();
        BrowserType browsertype = pw.chromium();
        Browser browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://cslforce.com/web#id=9646&cids=1&menu_id=704&model=project.task&view_type=form");



    }
}
