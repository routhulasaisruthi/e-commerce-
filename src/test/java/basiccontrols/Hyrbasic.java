package basiccontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyrbasic {
public static void main(String args[]) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	/*driver.findElement(By.id("englishchbx")).click();
	WebElement hindichk=driver.findElement(By.id("hindichbx"));
	hindichk.click();
	WebElement chinesechbx=driver.findElement(By.id("chinesechbx"));
	chinesechbx.click();*/
	List <WebElement> checkboxs= driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<checkboxs.size();i++) {
		if(checkboxs.get(i).isDisplayed() && checkboxs.get(i).isEnabled());
		{
			System.out.println("checkboxes  at index:"+i+ "checkbox ");
			if(i==2)
				continue;
			checkboxs.get(i).click();
		}
		
}}}