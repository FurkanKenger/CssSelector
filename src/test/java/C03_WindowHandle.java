import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle()); // CDwindow-9C969A615F669679F7CC4D9DA75B9878
        // Farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız.

    }
}
