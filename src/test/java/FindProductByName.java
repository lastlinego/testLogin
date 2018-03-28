import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class FindProductByName {
    WebDriver driver = new ChromeDriver();

    @Test
    public void findProductByName() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@class='rz-header-search-input-text passive']")).sendKeys("BOSCH KGN39VI35");
        driver.findElement(By.xpath("//button[@class='btn-link-i js-rz-search-button']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn-link-i'][@name='topurchases']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Продолжить покупки')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='xhr'][contains(text(),'Корзина')]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='novisited cart-i-title-link']")).getText().contains("BOSCH KGN39VI35"));
        Thread.sleep(500);
      //  driver.quit();
    }

}
