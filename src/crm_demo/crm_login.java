package crm_demo;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crm_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver4.exe"); //Launch chrome driver
		WebDriver driver=new ChromeDriver();
	    
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS); // Professionally 30secs is enough, Synchronization Implicit(It will wait from one page to another page) implicit,explicit (For single elements), thread.sleep:50000ms
		
	    driver.get("https://freecrm.com/"); // get-launch the Url of any application 
		
	    driver.manage().window().maximize(); //Maximize the WINDOW
		
	    driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click(); // LOG IN Button On the Web Page
		
	    driver.findElement(By.name("email")).sendKeys("raksha@mobignosis.net"); //Email id
		
	    driver.findElement(By.name("password")).sendKeys("P@ss12345"); //Password
		
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click(); //Login button		
		//driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click(); 
		//boolean yes=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).isDisplayed();
        //System.out.println(yes);
        
	    driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click(); //Menu--->Contacts 
        
	    driver.navigate().refresh();
        
	    driver.navigate().refresh(); //Refresh functionality
        
	    driver.navigate().refresh();
        
	    driver.findElement(By.xpath("//button[@class='ui linkedin button'and text()='New']")).click();//Contacts-->New Button
        driver.navigate().refresh();
        
        driver.findElement(By.name("first_name")).sendKeys("Selenium Demo"); //First Name
        //driver.navigate().refresh();
        
        driver.findElement(By.name("last_name")).sendKeys("R"); //Last Name
        
        driver.findElement(By.name("middle_name")).sendKeys("mVerve"); //Middle Name
        
        WebElement mm=driver.findElement(By.xpath("//div[@name='company']//input[@class='search']"));              // company
		mm.click();
		
		mm.clear();
		mm.sendKeys("mVerve");
		mm.sendKeys(Keys.ENTER); 
		
		
		/* WebElement pp=driver.findElement(By.xpath("//label[contains(text(),'Access')]")); // ACCESS field
	       pp.click();
	       pp.sendKeys("Yallowwwww");
	       pp.sendKeys(Keys.ENTER); */
	   
		
        //driver.findElement(By.xpath("//div[@name='company']")).click();
        
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Hello how you been??");//Description
        
        WebElement aa=driver.findElement(By.xpath("//div[@name='status']"));       //  Select Status
		aa.click();
		aa.sendKeys(Keys.ARROW_DOWN);
		aa.sendKeys(Keys.ARROW_DOWN);
		aa.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@name='category']")).click(); //Category field
		
		driver.findElement(By.xpath("//div[@class='visible menu transition']//span[@class='text'][contains(text(),'Lead')]")).click();
		
		
	/*	WebElement bb=driver.findElement(By.xpath("//div[@name='category']")); //Category drop down 
		bb.click();
		bb.sendKeys(Keys.ARROW_DOWN);
		bb.sendKeys(Keys.ENTER);*/
        
		WebElement cc=driver.findElement(By.xpath("//div[@name='channel_type']")); //Social Channels
        cc.click();
        //cc.sendKeys(Keys.ARROW_DOWN);
        cc.sendKeys(Keys.ARROW_DOWN);//Facebook
        cc.sendKeys(Keys.ENTER);
        
       WebElement dd= driver.findElement(By.xpath("//input[@placeholder='Facebook profile link']"));//Entering Facebook link
       dd.sendKeys("https://www.facebook.com/");
       dd.sendKeys(Keys.ENTER);
        //driver.findElement(By.cssSelector("input[placeholder=\"Facebook profile link\"]")).sendKeys("https://facebook.com/abc");
	   
       WebElement ee=driver.findElement(By.xpath("//input[@name='address']")); //ADDRESS
       ee.click();
       ee.sendKeys("41, Sri Krishna Mansion, 3rd Floor, S End D Cross Rd, 3rd Phase, J. P. Nagar, Bengaluru, Karnataka 560078");
       
       WebElement ff=driver.findElement(By.xpath("//input[@name='city']")); //CITY
       ff.click();
       ff.sendKeys("Bangalore");
       
       WebElement gg=driver.findElement(By.xpath("//input[@name='state']")); //STATE
       gg.click();
       gg.sendKeys("Karnataka");
       
       WebElement hh=driver.findElement(By.xpath("//input[@name='zip']")); //ZIP CODE
       hh.click();
       hh.sendKeys("560098");
       
       

       
     /*  WebElement ii=driver.findElement(By.xpath("//div[@name='country']"));
       ii.click();
       //ii.sendKeys(Keys.ARROW_DOWN);
       //ii.sendKeys(Keys.ARROW_DOWN);
       ii.sendKeys(Keys.ARROW_DOWN);
       ii.sendKeys(Keys.ARROW_DOWN);
       ii.sendKeys(Keys.ENTER); */
       
    
      // code to click on the country element
       
    	/* driver.findElement(By.name("country")).click();
    		
    		// code to select any country dynamically
    		String befor= "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div/div/div/div[5]/div/div[2]/div[";
    		String after= "]";
    		int countryId = 100; // 100 for india
    		try {
    			for(int countries=0; countries <240; countries ++) {
    				if(countries == countryId) {
    					driver.findElement(By.xpath(befor + countries + after)).click();
                                                                   break;
    				}
    			}			
    		}
    		catch(Exception e) {
    			System.out.println(e);
    		} */
             
    	
    		driver.findElement(By.xpath("//input[@name='department']")).sendKeys("QA Department"); //DEPARTMENT field
    		 
    	    driver.findElement(By.xpath("//input[@name='position']")).sendKeys("STE"); //POSITION field
            
    	    WebElement jj= driver.findElement(By.xpath("//div[@name='source']")); //Source field
    	    jj.click();
    	    jj.sendKeys(Keys.ARROW_DOWN);
    	    jj.sendKeys(Keys.ENTER);
    	    
    	    driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//label[contains(text(),'Do not Email')]")).click(); //Do not Email field
    	    
    	    driver.findElement(By.xpath("//input[@name='day']")).sendKeys("4"); //Birthday--->Day field
    	  
    	   /*WebElement kk= driver.findElement(By.xpath("//div[@name='month']//span[contains(text(),'August')]")); MONTH HAVE A DOUBT????
    	   kk.click();
    	   kk.sendKeys(Keys.ENTER);
    	   /*kk.click();
    	   kk.sendKeys(Keys.ARROW_DOWN);
    	   kk.sendKeys("August");
    	   kk.click();*/
    	   
    	   driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//label[contains(text(),'Do not Call')]")).click(); //Do not call field
    	   
    	   driver.findElement(By.xpath("//div[@class='ui toggle checkbox']//label[contains(text(),'Do not Text')]")).click(); //Do not text 
    	   
    	   driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("IDENTITY-22");//Identifier field
    	    
    	   driver.findElement(By.xpath("//div[@name='month']//i[@class='dropdown icon']")).click(); //MONTH Drop down click
    	   
    	   driver.findElement(By.xpath("//div[@class=\"visible menu transition\"]//span[contains(text(),'January')]")).click(); //SELECTING Month here I have selected January
    	   
    	   driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1881"); //YEAR Selection
    	   
    	   /* Country Dynamic Selection Code */
    	   
    	   //NEED TO GO THROUGH 'COUNTRY' CODE
    	   
    	   
    	   try {
    			driver.findElement(By.name("country")).click();
    			String selectCountry = "India";
    			java.util.List<WebElement> list = driver.findElements(By.xpath("//div[@name='country']//span[@class='text']"));
    			//System.out.println(list.size());
    			for(WebElement countryList: list) {
    				//System.out.println("country name : " + el.getText());
    				if(countryList.getText().equals(selectCountry)) {											
    					String b="//div[@name='country']//span[@class='text'][contains(text(),'";
    					String a="')]";
    					driver.findElement(By.xpath(b+ selectCountry +a)).click();
    					//System.out.println(b+ selectCountry +a);
    					break;
    				}
    			}
    			
    			}
    			catch(Exception e) {
    				System.out.println(e);
    				e.printStackTrace();
    			}
    	 
    	       driver.findElement(By.xpath("//input[@name='image']")).sendKeys("D:\\WORK\\Yo.jpg"); //IMAGE field
    	         
    	         
    	       driver.findElement(By.xpath("//div[@name='timezone']//i[@class='dropdown icon']")).click();   // TIME ZONE
    	 	
    	      
    	       driver.findElement(By.xpath("//div[@class='visible menu transition']//span[@class='text'][contains(text(),'Asia/Kolkata')]")).click();//Time Zone Selection from the drop down
    	      
    	       /*driver.findElement(By.xpath("//div[@name='company']")).sendKeys("Oracle");//COMPANY FIELD
    	       
    	       driver.findElement(By.xpath("//div[@class='selected item addition']//span[@class='text'][contains(text(),'Add')]")).click(); */
    	       
    	       WebElement ll= driver.findElement(By.xpath("//div[@name='supervisor']//input[@class='search']"));  //SUPERVISOR Field
    	       ll.click();
    	       ll.clear();
    	       ll.sendKeys("Supervisor");
    	       ll.sendKeys(Keys.ENTER);
    	       
    	       WebElement nn= driver.findElement(By.xpath("//div[@name='assistant']//input[@class='search']"));  //Assistant Field
    	       nn.click();
    	       nn.clear();
    	       nn.sendKeys("Assistant");
    	       nn.sendKeys(Keys.ENTER);
    	      
    	       WebElement oo= driver.findElement(By.xpath("//div[@name='referred_by']//input[@class='search']"));  //Reffered_By Field
    	       oo.click();
    	       oo.clear();
    	       oo.sendKeys("Reffered by Oracle");
    	       oo.sendKeys(Keys.ENTER);
    	      
    	      driver.findElement(By.xpath("//i[@class='save icon']")).click(); //SAVE THE FORM --> 'Save' button
    			
    	      /* TAGS xpath could not find */
    			
    	   
    	       
    	       
    	   
    	       
    	       
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       
       
       
       
    	   
    	   
    	   
    	   
	}
}
