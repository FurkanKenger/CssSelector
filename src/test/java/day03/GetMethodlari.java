package day03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // amazona git
        driver.get("https://www.amazon.com");

        // arama kutusuna locate yaz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // arama kutusunun tagname' nin input olduğunu test et
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if(actualTagName.equals(expectedTagName)){
            System.out.println("tag name testi PASSED");
        }else System.out.println("tagName testi FAİLLLED");

        // arama kutusunun name atributu nun değerinin field- keywords olduğunu test ediniz
        String expectedAtributuName = "field- keywords";
        String actualAtributuName =aramaKutusu.getAttribute("name");
        if(actualAtributuName.equals(expectedAtributuName)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILLED");
    }
}