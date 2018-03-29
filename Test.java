import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args)throws InterruptedException {
		FirefoxDriver d1=new FirefoxDriver();
		d1.get("https://www.ubtiinc.com");
d1.findElement(By.linkText("AEROSPACE")).click();
		 //Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE PERFORMANCE VISIBILITY")).click();
         //Thread.sleep(2000);
 	    d1.findElement(By.className("img-portion")).click();
 	   Thread.sleep(2000);
 		String URL="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL);
 		d1.findElement(By.linkText("QUALITY MANAGEMENT")).click();
 		Thread.sleep(2000);
 		String URL1="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL1);
 		d1.findElement(By.linkText("PROGRAM PERFORMANCE")).click();
 		Thread.sleep(2000);
 		String URL2="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL2);
 		d1.findElement(By.linkText("ALERT MANAGEMENT")).click();
 		Thread.sleep(2000);
 		String URL3="https://ubtiinc.com/aerospace-and-defense/capstone/";
 		d1.navigate().to(URL3);
        d1.findElement(By.partialLinkText("CAPSTONE PROGRAM")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE SUPPLIER")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE QUALITY")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("CAPSTONE ALERT")).click();
         //Thread.sleep(8000);
        d1.findElement(By.linkText("TRINITY FRAMEWORK")).click();
        // Thread.sleep(8000);
        d1.findElement(By.partialLinkText("DEVELOPMENT ")).click();
        // Thread.sleep(8000);
         //d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("DATA")).click();
        // Thread.sleep(8000);
         //d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("ANALYTICS")).click();
        // Thread.sleep(8000);
        // d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("QA")).click();
         //Thread.sleep(8000);
        // d1.findElement(By.linkText("learn more.")).click();
        d1.findElement(By.partialLinkText("OPERATION")).click();
         Thread.sleep(2000);
         //d1.findElement(By.linkText("learn more.")).click();
         d1.get("https://www.ubtiinc.com");
         
         
         
         
d1.findElement(By.linkText("FINANCE")).click();
        Thread.sleep(2000);
 		d1.findElement(By.partialLinkText("FINANCIAL REPORTING")).click();
 		Thread.sleep(2000);
   		//d1.get("https://ubtiinc.com/industries/financial-services/");
   		d1.findElement(By.partialLinkText("TRINITY")).click();
   		Thread.sleep(2000);
   	 d1.findElement(By.partialLinkText("DEVELOPMENT")).click();
     // Thread.sleep(8000);
      //d1.findElement(By.linkText("learn more.")).click();
     d1.findElement(By.partialLinkText("DATA")).click();
     // Thread.sleep(8000);
      //d1.findElement(By.linkText("learn more.")).click();
     d1.findElement(By.partialLinkText("ANALYTICS &")).click();
     // Thread.sleep(8000);
     // d1.findElement(By.linkText("learn more.")).click();
     d1.findElement(By.partialLinkText("QA")).click();
      //Thread.sleep(8000);
     // d1.findElement(By.linkText("learn more.")).click();
     d1.findElement(By.partialLinkText("OPERATION")).click();
      //Thread.sleep(8000);
      //d1.findElement(By.linkText("learn more.")).click();
     d1.get("https://ubtiinc.com/industries/financial-services/");
     d1.findElement(By.partialLinkText("FINANCIAL SERVICE")).click();
     Thread.sleep(2000);
     //String URL51="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL51);
     d1.findElement(By.partialLinkText("FINANCIAL REPORTING AND")).click();
     Thread.sleep(2000);
     //String URL11="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL11);
     d1.findElement(By.partialLinkText("MODERNIZING")).click();
     Thread.sleep(2000);
     //String URL12="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL12);
     d1.findElement(By.partialLinkText("SYSTEM INTEGRATION")).click();
     Thread.sleep(2000);
    // String URL13="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL13);
     d1.findElement(By.partialLinkText("FASTER")).click();
     Thread.sleep(2000);
    // String URL14="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL14);
     d1.findElement(By.partialLinkText("ENTERPRISE DATA MANAGEMENT CASE")).click();
     Thread.sleep(2000);
     //String URL15="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL15);
     String selectLinkOpeninNewTab11 = Keys.chord(Keys.CONTROL,Keys.RETURN); 
     d1.findElement(By.linkText("ENTERPRISE DATA MANAGEMENT INFOGRAPHIC")).sendKeys(selectLinkOpeninNewTab11);
     //Thread.sleep(2000);
     d1.get("https://ubtiinc.com/industries/financial-services/");
     String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		d1.findElement(By.partialLinkText("EDM infographic")).sendKeys(selectLinkOpeninNewTab);
		//String URL4="https://ubtiinc.com/industries/financial-services/";
		//d1.navigate().to(URL4);
     d1.get("https://ubtiinc.com/industries/financial-services/");
		String selectLinkOpeninNewTab1 = Keys.chord(Keys.CONTROL,Keys.RETURN); 
      d1.findElement(By.linkText("Financial Reporting & Analytics System (FRAS) framework")).sendKeys(selectLinkOpeninNewTab1);
      Thread.sleep(2000);
		String URL5="https://ubtiinc.com/industries/financial-services/";
		d1.navigate().to(URL5);
     d1.get("https://www.ubtiinc.com");
     
     
     
d1.findElement(By.linkText("HEALTHCARE")).click();
    //Thread.sleep(2000);
    d1.findElement(By.linkText("Healthcare BI")).click();
    Thread.sleep(5000);
     d1.get("https://ubtiinc.com/healthcare/");
		d1.findElement(By.linkText("Health Insurance BI")).click();
		Thread.sleep(5000);
		 d1.get("https://ubtiinc.com/healthcare/");
	 d1.findElement(By.linkText("HOSPITAL ANALYTICS")).click();
    //Thread.sleep(2000);
	d1.findElement(By.linkText("VIEW REPORT")).click();
	Thread.sleep(2000);
	d1.findElement(By.xpath(".//*[@id='popmake-1890']/button")).click();
	//d1.findElement(By.partialLinkText("))
   d1.get("https://ubtiinc.com/healthcare/hospital-analytics/");
   d1.findElement(By.linkText("WATCH VIDEO")).click();
   Thread.sleep(2000);
   d1.findElement(By.xpath(".//*[@id='popmake-1888']/button")).click();
   d1.get("https://ubtiinc.com/healthcare/hospital-analytics/");
   d1.findElement(By.partialLinkText("LAB")).click();
   //Thread.sleep(2000);
  d1.findElement(By.partialLinkText("CLAIM")).click();
  //Thread.sleep(2000);
  d1.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div[1]/div[3]/a[1]")).click();
	//Thread.sleep(2000);
	d1.findElement(By.xpath(".//*[@id='popmake-1892']/button")).click();
	//d1.findElement(By.partialLinkText("))
 d1.get("https://ubtiinc.com/healthcare/claim-analytics/");
 d1.findElement(By.xpath("html/body/div[1]/div/div/div[1]/div[1]/div[3]/a[2]")).click();
 //Thread.sleep(2000);
 d1.findElement(By.xpath(".//*[@id='popmake-2334']/button")).click();
 d1.get("https://ubtiinc.com/healthcare/claim-analytics/");
   d1.findElement(By.linkText("HEALTH INSURANCE SOLUTION")).click();
   //Thread.sleep(2000);
   d1.findElement(By.partialLinkText("TRINITY")).click();
  // Thread.sleep(2000);
   d1.findElement(By.partialLinkText("DEVELOPMENT")).click();
   // Thread.sleep(8000);
    //d1.findElement(By.linkText("learn more.")).click();
   d1.findElement(By.partialLinkText("DATA")).click();
   // Thread.sleep(8000);
    //d1.findElement(By.linkText("learn more.")).click();
   d1.findElement(By.partialLinkText("ANALYTICS &")).click();
   // Thread.sleep(8000);
   // d1.findElement(By.linkText("learn more.")).click();
   d1.findElement(By.partialLinkText("QA")).click();
    //Thread.sleep(8000);
   // d1.findElement(By.linkText("learn more.")).click();
   d1.findElement(By.partialLinkText("OPERATION")).click();
    //Thread.sleep(8000);
   d1.get("https://ubtiinc.com/healthcare/");
   d1.findElement(By.partialLinkText("HEALTHCARE")).click();
   //Thread.sleep(2000);
   d1.get("https://ubtiinc.com/healthcare/");
   d1.findElement(By.linkText("HEALTH INSURANCE BROCHURE")).click();
   //Thread.sleep(2000);
   d1.get("https://www.ubtiinc.com");
   
   
   
d1.findElement(By.linkText("CLOUD")).click();
   Thread.sleep(2000);
   d1.findElement(By.id(".//*[@id='Map']/area[1]")).click();
   Thread.sleep(2000);
   d1.findElement(By.id(".//*[@id='Map']/area[3]")).click();
   Thread.sleep(2000);
   d1.findElement(By.id(".//*[@id='Map']/area[5]")).click();
   Thread.sleep(2000);
   d1.findElement(By.xpath("html/body/div/div/div/div[1]/div[1]/p[4]/a/b")).click();
   Thread.sleep(2000);
   d1.findElement(By.linkText("POWER BI")).click();
   String URL18="https://ubtiinc.com/cloud/";
		d1.navigate().to(URL18);
	d1.findElement(By.linkText("POWERAPPS")).click();
	Thread.sleep(2000);
	d1.findElement(By.partialLinkText("Healthcare")).click();
	Thread.sleep(2000);
	 String URL19="https://ubtiinc.com/cloud/";
		 d1.navigate().to(URL19);
	d1.findElement(By.linkText("ENTERPRISE")).click();
	Thread.sleep(2000);
    d1.get("https://www.ubtiinc.com");
			
			
		 
		 
		 
WebElement e1=d1.findElement(By.partialLinkText("ABOUT"));
			e1.click();
			e1.sendKeys(Keys.ARROW_DOWN);
			WebElement e2=d1.findElement(By.partialLinkText("Company"));
			e2.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			d1.findElement(By.partialLinkText("aerospace")).click();
			Thread.sleep(2000);
			d1.get("https://ubtiinc.com/company/");
			d1.findElement(By.partialLinkText("finance")).click();
			Thread.sleep(2000);
			d1.get("https://ubtiinc.com/company/");
			d1.findElement(By.partialLinkText("healthcare")).click();
			Thread.sleep(2000);
			d1.get("https://ubtiinc.com/company/");
			d1.get("https://www.ubtiinc.com");
			WebElement e3=d1.findElement(By.partialLinkText("ABOUT"));
			e3.click();
			e3.sendKeys(Keys.ARROW_DOWN);
			WebElement e4=d1.findElement(By.partialLinkText("Mission"));
			e4.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			d1.get("https://www.ubtiinc.com");
			WebElement e5=d1.findElement(By.partialLinkText("ABOUT"));
			e5.click();
			e5.sendKeys(Keys.ARROW_DOWN);
			WebElement e6=d1.findElement(By.partialLinkText("Qualifications"));
			e6.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			 String selectLinkOpeninNewTab18 = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		     d1.findElement(By.partialLinkText("Northrop")).sendKeys(selectLinkOpeninNewTab18);
		     //Thread.sleep(2000);
			d1.get("https://www.ubtiinc.com");
			WebElement e7=d1.findElement(By.partialLinkText("ABOUT"));
			e7.click();
			e7.sendKeys(Keys.ARROW_DOWN);
			WebElement e8=d1.findElement(By.partialLinkText("Careers"));
			e8.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		 
			
			
			
d1.findElement(By.linkText("BLOG")).click();
		 Thread.sleep(2000);
		 d1.findElement(By.partialLinkText("Aerospace")).click();
		 Thread.sleep(2000);
     d1.findElement(By.partialLinkText("CAPSTONE")).click();
     
     
     
     
     
     
     
     
     
   	 d1.findElement(By.partialLinkText("Request")).click();
    

	}

}
