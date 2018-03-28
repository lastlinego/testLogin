import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreditElements extends BeforeAfter {
    @Test
    public void creditElements() throws InterruptedException {
       driver.findElement(By.xpath("//span[@class='m-top-i-text']")).click();

    }
}
