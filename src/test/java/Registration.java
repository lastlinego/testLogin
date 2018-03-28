import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {
    WebDriver driver = new ChromeDriver();
    @Test
    public void registration() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='header_user_menu_parent']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='exponea-close']")).click();
        driver.findElement(By.xpath("//div[@class='auth-f-signup']")).click();
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Arnold");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("arni@yopmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gfhjkm123");
        driver.findElement(By.xpath("//button[@class='btn-link-i'][contains(text(),'Зарегистрироваться')]")).click();
        Thread.sleep(2000);
        driver.getTitle().contains("Личные данные");
        driver.quit();



    }
}
