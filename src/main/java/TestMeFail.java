import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMeFail {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get(System.getProperty("user.dir")+"\\padding.html");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().frame(driver.findElement(By.id("gauth-widget-frame")));
		WebElement loginForgotPassword = driver.findElement(By.id("loginforgotpassword"));
		loginForgotPassword.click();


		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("gauth-widget-frame")));
		WebElement resetPassowrd = driver.findElement(By.id("reset-password-loginID"));
		assert resetPassowrd.isDisplayed();
		driver.close();
	}

}
