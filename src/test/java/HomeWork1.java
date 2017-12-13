import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork1 {

    WebDriver driver = new ChromeDriver();

    @Test
    public void login(){
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//*[@id=\"header_user_menu_parent\"]")).click();
    }
}
