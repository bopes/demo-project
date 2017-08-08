import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMe {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://bebef1987.github.io/demo-project/");
		WebElement el = driver.findElement(By.id("el2"));
		el.click();
		driver.close();
	}

}
