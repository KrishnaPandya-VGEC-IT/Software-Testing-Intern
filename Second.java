import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Dimension;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Second {
	
	//Test-1
	@Test
	public void checkFirstPageTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		String title = driver.getTitle();		
		Assert.assertEquals(title, "MCQ app");
		driver.close();
	}
		
	
	//Test-2
	@Test
	public void checkFirstImageLocationandSize()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		WebElement ele = driver.findElement(By.id("first_img"));
		
		int xCord = ele.getLocation().getX();
		int yCord = ele.getLocation().getY();
		
		org.openqa.selenium.Dimension dm = ele.getSize();
		
		int height = dm.getHeight();
		int width = dm.getWidth();
		
		Assert.assertEquals(Arrays.asList(xCord,yCord),Arrays.asList(18,178));
		Assert.assertEquals(Arrays.asList(height,width),Arrays.asList(300,400));
		
		driver.close();
	}
	
	//Test-3
	@Test
	public void checkFirstPageHeaderContent()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		WebElement ele = driver.findElement(By.id("first_header"));
		
		String content = ele.getText();
		assertEquals(content, "Welcome to MCQ app");
		
		driver.close();
	}
	
	//Test-4
	@Test
	public void checkFirstPageImage()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		driver.findElement(By.id("first_img"));
		driver.close();
	}
	
	//Test-5
	@Test
	public void checkFirstPageRadioButtons()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		
		driver.findElement(By.id("first_radio_dog")).click();
		driver.findElement(By.id("first_radio_cat")).click();
		driver.findElement(By.id("first_radio_giraffe")).click();
		
		driver.close();
	}
		
	
	//Test-6
	@Test
	public void checkFirstPageCheckBox()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		
		driver.findElement(By.id("checkbox_first")).click();		
		driver.close();
	}
	
	//Test-7
	@Test
	public void checkFirstPageOptionsOrder()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		WebElement ele1 = driver.findElement(By.id("first_radio_cat"));
		WebElement ele2 = driver.findElement(By.id("first_radio_dog"));
		
		int y1 = ele1.getLocation().getY();
		int y2 = ele2.getLocation().getY();
		
		assert(y1<y2);
		
		driver.close();
	}
	
	
	//Test-8
	@Test
	public void checkNavigationFromFirstToSecond()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/");
		
		driver.findElement(By.id("first_next")).click();
		
		assert(driver.findElement(By.id("second_main_div"))!=null);
		
		driver.close();
	}
	
	//Test-9
	@Test
	public void checkCheckboxesSecondPage()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/second");
		
		driver.findElement(By.id("second_op1")).click();
		driver.findElement(By.id("second_op2")).click();
		driver.findElement(By.id("second_op3")).click();
		driver.findElement(By.id("second_op4")).click();
				
		driver.close();
	}
	
	//Test-10
	@Test
	public void checkSecondPageDropDowns()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/second");
		
		driver.findElement(By.id("belt")).click();
		driver.findElement(By.id("goggles")).click();
		driver.findElement(By.id("clothes")).click();
				
		driver.close();
	}
	
	//Test-11
	@Test
	public void checkSecondPageImageLocation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/second");
		
		WebElement ele = driver.findElement(By.id("second_img"));
		
		int xCord = ele.getLocation().getX();
		int yCord = ele.getLocation().getY();
		
		
		assertEquals(Arrays.asList(xCord,yCord), Arrays.asList(18,86));
		driver.close();
	}
	
	//Test-12
	@Test
	public void checkSecondPageAnswered()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/second");
		
		driver.findElement(By.id("checkbox_second")).click();		
		driver.close();
	}
	
	
	//Test-13
	@Test
	public void checkSecondPageBackNavigation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/second");
		
		driver.findElement(By.id("second_back")).click();		
		
		assert(driver.findElement(By.id("first_main_div"))!=null);
		driver.close();
	}
	
	
	//Test-14
	@Test
	public void checkSecondPageNextNavigation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/second");
		
		driver.findElement(By.id("second_next")).click();		
		
		assert(driver.findElement(By.id("third_main_div"))!=null);
		driver.close();
	}
	
	//Test-15
	@Test
	public void checkThirdPageImageLocation()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/third");
		
		WebElement ele = driver.findElement(By.id("third_img"));
		
		int xCord = ele.getLocation().getX();
		int yCord = ele.getLocation().getY();
				
		assertEquals(Arrays.asList(xCord,yCord), Arrays.asList(18,86));
		
		driver.close();
	}
	
	//Test-16
	@Test
	public void checkThirdPageRadioButtons()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/third");
		
		WebElement ele = driver.findElement(By.id("third_img"));
		
		
		driver.findElement(By.id("third_radio_cat")).click();
		driver.findElement(By.id("third_radio_dog")).click();
		driver.findElement(By.id("third_radio_giraffe")).click();
		
		driver.close();
	}
	
	//Test-17
	@Test
	public void checkThirdPageOptionLocations()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/third");
		
		WebElement ele1 = driver.findElement(By.id("third_radio_cat"));
		WebElement ele2 = driver.findElement(By.id("third_radio_dog"));
		
		int y1 = ele1.getLocation().getY();
		int y2 = ele2.getLocation().getY();
		
		assert(y1<y2);
		
		driver.close();
	}
	
	//Test-18
	@Test
	public void checkThirdPageBackButton()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krishnapandya-vgec-it.github.io/GUIsecond/third");
		
		driver.findElement(By.id("third_back")).click();
		
		assert(driver.findElement(By.id("second_main_div"))!=null);
				
		driver.close();
	}
}

