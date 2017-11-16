import com.applitools.eyes.selenium.StitchMode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.RectangleSize;

public class HelloWorld {

    public static void main(String[] args) {

        // Open a Chrome browser.
        WebDriver driver = new ChromeDriver();

        // Initialize the eyes SDK and set your private API key.
        Eyes eyes = new Eyes();
        eyes.setApiKey("<API KEY>");

        try{

            // Start the test and set the browser's viewport size to 800x600.
            eyes.open(driver, "My FullScreenTest", "My first Selenium Java Full Page test!",
                    new RectangleSize(500, 400));

            // Set Stitch Mode
            eyes.setStitchMode(StitchMode.CSS);

            // setForceFullPageScreenshot
            eyes.setForceFullPageScreenshot(true);

            // Navigate the browser to the "hello world!" web-site.
            driver.get("https://www.garmin.com/en-US/account/");

            // Visual checkpoint #1.
            eyes.checkWindow("FullPage screenshot!");

            // End the test.
            eyes.close();

        } finally {

            // Close the browser.
            driver.quit();

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();
        }

    }

}