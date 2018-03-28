import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTheCart extends BeforeAfter {
    @Test
    public void checkTheCart() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='xhr'][contains(text(), 'Корзина')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='empty-cart-title inline sprite-side']")).getText().contains("Корзина пуста"));

    }

}
