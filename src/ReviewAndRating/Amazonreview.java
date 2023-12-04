package ReviewAndRating;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonreview
{
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// input kiya search box mai
	d.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Puma shoes for women");
	
	d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	//String text = d.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]")).getText();
	//System.out.println(text);
	d.findElement(By.xpath("(//div[@class='a-row a-size-small'])[1]")).click();
}
}
