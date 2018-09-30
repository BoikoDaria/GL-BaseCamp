import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static WebDriver driver;

    @BeforeClass
    public static void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/dasha/Downloads/chromedriver");
        driver = new ChromeDriver();
    }

    @Before
    public void openGoogle () {
        driver.get("https://google.com");
    }

    @Test
    public void baseGoogleSearch () throws Exception {
        WebElement searchInputField = driver.findElement(By.id("lst-ib"));
        searchInputField.sendKeys("Selenium");
        searchInputField.sendKeys(Keys.ENTER);
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
