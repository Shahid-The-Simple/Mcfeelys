package shahid;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class test {

	WebDriver driver;
	@BeforeClass
	  public void Setup() {
		  
		  System.setProperty("WebDriver.chorme.driver", "C:\\Users\\shahi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();  
}
@Test (priority = 1)
public void Home() throws IOException, InterruptedException {
	driver.navigate().to("https://www.mcfeelys.com/");
	System.out.println(driver.getCurrentUrl());
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Home.jpg"));
	Thread.sleep(8000);
}

@Test(priority = 2)
public void login() throws InterruptedException, IOException {
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[4]/header/div[1]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	File w = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(w, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Loginpop.jpg"));
	driver.findElement(By.id("email")).sendKeys("shahidmcfeely@yopmail.com");
	driver.findElement(By.id("pass")).sendKeys("Shahid@123");
	driver.findElement(By.id("send2")).click();
	Thread.sleep(5000);
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Login.jpg"));
	Thread.sleep(15000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\NewletterPOP.jpg"));
	//driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[13]/div/a")).click();
}
@Test(priority = 3)
public void signin() throws IOException, InterruptedException {
	driver.navigate().to("https://www.mcfeelys.com/customer/account/");
	Thread.sleep(2000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\signin.jpg"));
}
@Test(priority = 4)
public void subscription() throws InterruptedException, IOException {
	driver.navigate().to("https://www.mcfeelys.com/newsletter/manage/");
	driver.findElement(By.id("subscription")).click();
	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
	Thread.sleep(3000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\subs.jpg"));
}
@Test(priority = 5)
public void subsmail() throws IOException, InterruptedException {
	driver.navigate().to("https://yopmail.com/");
	driver.findElement(By.id("login")).sendKeys("shahidmcfeely@yopmail.com");
	driver.findElement(By.xpath("//*[@id=\"refreshbut\"]/input")).click();
	Thread.sleep(3000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\subsmail.jpg"));

}

@Test(priority = 6)
public void category() throws IOException, InterruptedException {
	driver.navigate().to("https://www.mcfeelys.com/");
	Thread.sleep(3000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Homepagelogo.jpg"));
	driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/a")).click();
	Thread.sleep(3000);
	File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(a, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\category.jpg"));
}
@Test(priority = 7)
public void search() throws IOException, InterruptedException {
	driver.findElement(By.id("search")).sendKeys("nuts");
	File p = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(p, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\search.jpg"));
	driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div[2]/button")).click();
	Thread.sleep(3000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\relatedsearch.jpg"));
}
@Test(priority = 8)
public void sort() throws InterruptedException, IOException {
	driver.navigate().to("https://www.mcfeelys.com/wood-finishes/paints.html");
	driver.findElement(By.id("sorter")).click();
	driver.findElement(By.xpath("//*[@id=\"sorter\"]/option[3]")).click();
	Thread.sleep(2000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\sort.jpg"));
}
@Test(priority = 9)
public void filters() throws InterruptedException, IOException {
	driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/form/div/div[2]/a/div[2]/span[1]")).click();
	Thread.sleep(2000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\filters.jpg"));
}
@Test(priority = 10)
public void related_products() throws IOException {
	driver.navigate().to("https://www.mcfeelys.com/mcfeely-s-pocketmax-pocket-hole-screw-assortment-with-bins.html");
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	((org.openqa.selenium.JavascriptExecutor) Scrool).executeScript("window.scrollBy(0,800)", "");
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\related_products.jpg"));
}
@Test(priority = 11)
public void Upsell_products() throws IOException {
	driver.navigate().to("https://www.mcfeelys.com/mcfeely-s-pocketmax-pocket-hole-screw-assortment-with-bins.html");
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	((org.openqa.selenium.JavascriptExecutor) Scrool).executeScript("window.scrollBy(0,900)", "");
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Upsell_products.jpg"));
}
@Test(priority = 12)
public void produt() throws InterruptedException, IOException {
	driver.navigate().to("https://www.mcfeelys.com/1-4-20-tee-nuts-18-8-stainless-qty-25.html");
	Thread.sleep(2000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\productpage.jpg"));
	driver.findElement(By.id("qty")).clear();
	driver.findElement(By.id("qty")).sendKeys("2");
	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
	File b = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(b, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Addtocart.jpg"));
}
@Test(priority = 13)
public void wishlist() throws InterruptedException, IOException {
	driver.navigate().to("https://www.mcfeelys.com/microjig-fitfinder-gauge.html");
	driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[1]/fieldset/div[3]/div/a[1]")).click();
	Thread.sleep(3000);
	File b = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(b, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Wishlist.jpg"));
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	((org.openqa.selenium.JavascriptExecutor) Scrool).executeScript("window.scrollBy(0,500)", "");
	driver.findElement(By.xpath("//*[@id=\"wishlist-view-form\"]/div[2]/div[1]/button[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("email_address")).sendKeys("shahid@exinent.com");
	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
	Thread.sleep(300);
	File ab = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(ab, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Wishlist_share.jpg"));
}
@Test(priority = 14)
public void minicart() throws IOException, InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[4]/header/div[2]/div/div[3]/div[2]/a[1]")).click();
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Minicart.jpg"));
	driver.navigate().to("https://www.mcfeelys.com/checkout/cart/");
	Thread.sleep(5000);
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	((org.openqa.selenium.JavascriptExecutor) Scrool).executeScript("window.scrollBy(0,300)", "");
	File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(x, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\cartpage.jpg"));
}
@Test(priority = 15)
public void checkout() throws IOException, InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")).click();
	Thread.sleep(10000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\checkout.jpg"));
}
@Test(priority = 16)
public void defaultship() throws IOException {
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	((org.openqa.selenium.JavascriptExecutor) Scrool).executeScript("window.scrollBy(0,900)", "");
	driver.findElement(By.xpath("//*[@id=\"s_method_amstrates_amstrates9\"]"));
	if(driver.findElement(By.xpath("//*[@id=\"s_method_amstrates_amstrates9\"]")).isSelected());{
	System.out.println("Default Ground is selecetd");
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\defaultship.jpg"));
	}}
@Test(priority = 17)
public void payment() throws IOException, InterruptedException {
	driver.navigate().to("https://www.mcfeelys.com/checkout/");
	Thread.sleep(10000);
	File q = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(q, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\Payments.jpg"));
	JavascriptExecutor Scrool = (JavascriptExecutor) driver;
	((org.openqa.selenium.JavascriptExecutor) Scrool).executeScript("window.scrollBy(0,900)", "");
	driver.findElement(By.xpath("//*[@id=\"block-discount-heading\"]/span")).click();
	driver.findElement(By.id("discount-code")).sendKeys("exitest");
	Thread.sleep(3000);
	File v = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(v, new File("C:\\Users\\shahi\\OneDrive\\Documents\\Automation\\Mcfeely\\coupoun.jpg"));
	
}
@AfterClass
public void closer() {
	driver.quit();
}}