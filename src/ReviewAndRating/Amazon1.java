package ReviewAndRating;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1
{
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.amazon.in/");
	
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// input kiya search box mai
	d.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("samsung m14");
	
	//click on search icon
	d.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	//click on review
	d.findElement(By.xpath("((//div[@class='a-row a-size-small'])[1]//span)[4]")).click();
	
	String a = d.findElement(By.xpath("((//div[@class='a-row a-size-small'])[1]//span)[4]")).getText();
	System.out.println(a);
}
}

