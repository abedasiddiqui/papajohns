/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Siraj Siddiqui
 */
public class JohnpapaTest {
    
    public JohnpapaTest() {
        
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

@Test
    public void testPapajohns() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();       
        String baseUrl = "https://www.papajohns.com";
        //System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.papajohns.com/");  
        
        //incorrect user name correct password
        driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("header-account-sign-in-email")).sendKeys("si@yahoo.co.in");
        driver.findElement(By.id("header-account-sign-in-password")).sendKeys("Engineer1");
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
       
        try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[31;1m Login Not Successful Sorry the e-mail/password combination didn't match\033[0m ");
        }catch(Throwable t){            
             System.out.println("\033[32;1;2mLogin Not Successful\033[0m");
        }  
        driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("header-account-sign-in-email")).sendKeys("sija_r@yahoo.co.in");
        driver.findElement(By.id("header-account-sign-in-password")).sendKeys("Engineer1");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keep me signed in'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        Thread.sleep(2000);
        try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[32;1;2mLogin Successful\033[0m ");
        }catch(Throwable t){
         System.out.println("\033[31;1mLogin Not Successful\033[0m");
        }
        driver.manage().window().maximize();

        int v = 3;
        if (v == 1) {
            driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[1]/a")).click();
            driver.findElement(By.id("carryoutFormAccordion")).click();
            driver.findElement(By.id("locations-zipPostalcode")).sendKeys("60188");
            driver.findElement(By.id("locations-zipPostalcode")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Order Delivery'])[1]/following::button[1]")).click();
        } else {
            driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[1]/a")).click();
            driver.findElement(By.id("locations-country")).click();
            driver.findElement(By.id("locations-country")).click();
            driver.findElement(By.id("locations-addresstype")).click();
            driver.findElement(By.id("locations-addresstype")).click();
            driver.findElement(By.id("locations-streetaddress")).click();
            driver.findElement(By.id("locations-streetaddress")).clear();
            driver.findElement(By.id("locations-streetaddress")).sendKeys("1042 bedforddrive CarolStream");
            driver.findElement(By.id("locations-form")).submit();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Room Number'])[2]/following::div[3]")).click();
            driver.findElement(By.id("locations-aptstefloor")).click();
            driver.findElement(By.id("locations-aptstefloor")).click();
            driver.findElement(By.id("locations-usa-zipcode")).click();
            driver.findElement(By.id("locations-usa-zipcode")).click();
            driver.findElement(By.id("locations-usa-zipcode")).clear();
            driver.findElement(By.id("locations-usa-zipcode")).sendKeys("60188");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Postal Code'])[1]/following::div[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Postal Code'])[1]/following::input[2]")).click();
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[1]/a")).click();//choosing pizza
         try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[32;1;2mPizza Menu Option Page\033[0m ");
        }catch(Throwable t){
         System.out.println("\033[31;1mNot on Pizza Menu Option Page\033[0m");
        }
        
       try {
            driver.findElement(By.xpath("/html/body/div[2]/main/section[1]/div[1]/ul/li/a")).click();
        } catch (NoSuchElementException e1) {
            driver.findElement(By.xpath("/html/body/div[2]/main/section[1]/div[1]/ul/li/form/button")).click();
        }//create your own
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("/html/body/div[2]/main/form/div/div/div/div[3]/div[1]/fieldset[1]/div/label[1]")).click();//crust style original
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[1]/div/label[1]")).click();//crust style original valentines day
        driver.findElement(By.id("size_0")).click();//small
        driver.findElement(By.id("size_0")).click();//square cut
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[4]/div/label[2]")).click();//welldone bake
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[5]/div/label[3]")).click();//ranch sauce
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[6]/div/label[3]"));//extra
        JavascriptExecutor executor = (JavascriptExecutor) driver;//extra
        executor.executeScript("arguments[0].click();", ele);//extra
        WebDriverWait wait = new WebDriverWait(driver, 30);//time delay
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"size_0\"]/nav/a"))); //examining the xpath for a next cheese
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"size_0\"]/nav/div/a"))); //examining the xpath for a next cheese valentines day

        //driver.findElement(By.xpath("//*[@id=\"size_0\"]/nav/a")).click();  //next cheese click button
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/nav/div/a")).click();  //next cheese click button valentines day
        driver.findElement(By.xpath("//*[@id=\"Cheeses_0\"]/fieldset[1]/div/label[2]")).click();//light cheese
        //driver.findElement(By.xpath("//*[@id=\"Cheeses_0\"]/nav/a[2]")).click();//next meat button
        driver.findElement(By.xpath("//*[@id=\"Cheeses_0\"]/nav/div/a[2]")).click();//next meat button valentines day

        //driver.findElement(By.xpath("//*[@id=\"Meats_0\"]/nav/a[2]")).click();//next veggies button
        driver.findElement(By.xpath("//*[@id=\"Meats_0\"]/nav/div/a[2]")).click();//next veggies button valentines day

        driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/fieldset/ul/li[1]/img")).click();//mushroom
        driver.findElement(By.id("Fresh-Veggies_0")).click();//onions
        driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/fieldset/ul/li[6]/img")).click();//black olives
        new Select(driver.findElement(By.id("quantity"))).selectByIndex(2);//select number of pizzas
        driver.findElement(By.id("quantity")).click();//qty dropdown
        //driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/nav/button")).click();//add to cart
        driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/nav/div/button")).click();//add to cart valentines day
        driver.findElement(By.linkText("No Thanks")).click();//no thanks      
                       
       //sides
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[2]/a")).click();
         try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[32;1;2mSides Menu Option Selected\033[0m");
        }catch(Throwable t){
         System.out.println("\033[31;1mNot on Sides Menu Option\033[0m ");
        }
        driver.findElement(By.id("order-button-0-0")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        Select dropdown = new Select( driver.findElement(By.id("comp-side-0-0-0")));
        dropdown.selectByVisibleText("Ranch"); 
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[1]/a/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[2]/a")).click();    
        driver.findElement(By.id("order-button-0-2")).click();
        driver.findElement(By.linkText("∧")).click();    
        Select cheesestick = new Select( driver.findElement(By.id("comp-side-0-2-0")));
        cheesestick.selectByVisibleText("Special Garlic"); 
        driver.findElement(By.xpath("//*[@id=\"product-details-0-2\"]/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[1]/a/i")).click();
        
       //deserts
        
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
         try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[32;1;2mDeserts Menu Option Page\033[0m");
        }catch(Throwable t){
         System.out.println("Not on Deserts Menu Option");
        }
        driver.findElement(By.id("order-button-0-1")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-1\"]/form/input[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-0")).click();
        driver.findElement(By.linkText("∧")).click();    
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        Thread.sleep(2000);
        
                
       
         
        //*** for Drinks *****
        driver.get("https://www.papajohns.com/order/menu");
        //  driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();  //menu
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[4]/a")).click();              //drinks
         try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[32;1;2mDrinks Menu Option Page\033[0m");
        }catch(Throwable t){
         System.out.println("Not on Drinks Menu Option");
        }
        driver.findElement(By.xpath("//*[@id=\"order-button-0-0\"]")).click(); //order now
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/div[1]/div/button/label")).click();
        driver.findElement(By.xpath("//*[@id=\"ingredient-id-1\"]/li[2]/label")).click();
        //  driver.findElement(By.linkText("∨")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=∨ | ]]
        //driver.findElement(By.linkText("∨")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();

        //******* For Extras ********
       driver.get("https://www.papajohns.com/order/menu");
       //  driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();       //menu
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[5]/a")).click();  //extra
         try{
            assertEquals("Menu - Pizza, Sides, Desserts & More | Papa John's", driver.getTitle()); 
            System.out.println("\033[32;1;2mExtras Menu Option Page\033[0m");
        }catch(Throwable t){
         System.out.println("Not on Extras Menu Option");
        }
        driver.findElement(By.id("order-button-0-0")).click();   //order now
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/div[1]/div/button/label")).click();
        driver.findElement(By.xpath("//*[@id=\"ingredient-id-1\"]/li/label")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        Thread.sleep(1000);
        //   direct check out
        driver.findElement(By.linkText("Checkout")).click(); ////check out
         try{
            assertEquals("Checkout", driver.getTitle()); 
            System.out.println("\033[32;1;2mCheckout Page\033[0m");
        }catch(Throwable t){
         System.out.println("Not on Checkout page");
        }
        // SignOut
        driver.findElement(By.cssSelector("svg.icon")).click(); //signout
        driver.findElement(By.linkText("Sign Out")).click();
       
        Thread.sleep(1000);
        driver.close();
    }
}


