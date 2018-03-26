import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findProductByName {
    WebDriver driver = new ChromeDriver();

    @Test
    public void findProductByName() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@class='rz-header-search-input-text passive']")).sendKeys("BOSCH KGN39VI35");
        driver.findElement(By.xpath("//button[@class='btn-link-i js-rz-search-button']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn-link-i'][@name='topurchases']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn-link-i'][@name='close']")).click();
        driver.findElement(By.xpath("//span[@class='xhr'][contains(text(),'Корзина')]")).click();
        driver.findElement(By.xpath("//a[@name='goods-link']")).getText().contains("BOSCH KGN39VI35");
        Thread.sleep(500);
        driver.quit();





    }

}
