import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork1 {

    WebDriver driver = new ChromeDriver();

   @Test
    public void login() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='header_user_menu_parent']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("vova@yopmail.com");
        driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Gfhjkm123");
        driver.findElement(By.xpath("//*[@id='popup_signin']/div[1]/div[2]/div[1]/div[2]/div/span/button")).click();
        driver.quit();

    }


}
