package slamMobility;
import org.openqa.selenium.Keys;

import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestRunnerClass extends BaseClass {

@BeforeTest

		public  void setUp() throws InterruptedException {

			BaseClass obj = new BaseClass();

			driver = obj.Initialize();
	}


@DataProvider(name="StoreDP")

public Object[][] loginData1() {

	Object[][] arrayObject = getExcelData1("C:\\Users\\e190763\\Desktop\\Excel127.xlsx");

	return arrayObject;

}



/**

 * @param File Name

 * @param Sheet Name

 * @return

 */

public String[][] getExcelData1(String fileName) {

	String[][] arrayExcelData = null;

	int[] arr=new int [5];

	

	try {

		FileInputStream fs = new FileInputStream(fileName);

		Workbook workbook = WorkbookFactory.create(fs);
		


		System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

		DataFormatter dataFormatter = new DataFormatter();
		 	
        
		Sheet sheet1= workbook.getSheetAt(0);
		Row Row=sheet1.getRow(0);
		Sheet s1= workbook.getSheet("Sheet3");
		//int totalNoOfCols = 2;
		//int totalNoOfRows = 2;
		int totalNoOfCols =Row.getLastCellNum();
		int totalNoOfRows = sheet1.getPhysicalNumberOfRows();
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		
	
		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
		  for (int i= 0 ; i < totalNoOfRows-1; i++) {
			  
				for (int j=0; j < totalNoOfCols; j++) {
					System.out.println("Row i-->"+i);
					System.out.println("coloumn j -->"+j);
 					System.out.println(sheet1.getRow(i+1).getCell(j).getStringCellValue());
 					String cellValue = dataFormatter.formatCellValue( sheet1.getRow(i+1).getCell(j));
					arrayExcelData[i][j] = cellValue;
				}

			}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		e.printStackTrace();
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	return arrayExcelData;
}



@Test (priority =0)

void test()

{

	LoginPage loginPage = new LoginPage(driver);

			loginPage.setUsername("ALLFT");

			loginPage.setPassword("ALLFT#123");

			loginPage.setLocation("127");

			loginPage.setLoginButton();

			HomePage homePage1 = loginPage.setLoginButton();

	}


@Test(dataProvider="StoreDP",priority =1)
//public void DAL_SO_03_CAS_CK_CC_PK(String Item1, String Item2, String CustomerNo, String JobName, String CustomerPO  )
public void DAL_SO_03_CAS_CK_CC_PK(String Item1,String Qty1,String Item2, String Qty2,String CustomerNo, String JobName, String CustomerPO ) throws InterruptedException
 
  {

	  


	  //TO ENTER INVENTORY ITEM NUMBER

		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));

                searchInventoryButton.sendKeys(Item1);
                         
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 

              //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE

                WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));

                searchButton.submit(); 

                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

              Thread.sleep(10000);

       //CLICK ON SELECT ITEM TO ADD TO CART

        WebElement firstCheckBox = driver.findElement(By.xpath("//label[@for='checkbox0']"));

        firstCheckBox.click();
   

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       

        //TO CLICK ON ADDTOCART BUTTON

        WebElement addToCart = driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]"));

        addToCart.click();
    

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       

        //ENTER QUANTITY TO ITEM

        WebElement firstQuantity = driver.findElement(By.xpath("//*[@id='orderQty0']"));       

        firstQuantity.sendKeys(Qty1);
     

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        

        //CLICK ON ADD TO CART

        WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));

        addTOCartButton.submit();

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        

        //CLICK ON ADD MORE ITEMS BUTTON

        WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));

        addMoreItemsButton.click();

        

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        

        //ENTERING SECOND SEARCH ITEM

        WebElement searchButton2 = driver.findElement(By.name("searchItem"));

        searchButton2.clear();

        searchButton2.sendKeys(Item2); 
        	

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 

      //TO CLICK ON SEARCH BUTTON 

        WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));

        searchButton1.submit();

        

       try {

			Thread.sleep(5000);

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
       

      //CLICK ON SELECT ITEM TO ADD TO CART

        WebElement secondItemCheckBox = driver.findElement(By.xpath("//label[@for='checkbox0']"));
       

        secondItemCheckBox.click();
       

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       

        //TO CLICK ON ADDTOCART BUTTON

        WebElement addToCart2 = driver.findElement(By.id("js-item-cart"));

        addToCart2.click();

     

        //TO ENTER QUANTITY TO SECOND ITEM

        WebElement secondQuantity = driver.findElement(By.xpath("//*[@id='orderQty0']"));
        System.out.println("QUantity2"+ Qty2);

        secondQuantity.sendKeys(Qty2);

        

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        

      //CLICK ON ADD TO CART

        WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));

        addTOCartButton2.submit();
     

        

        //CLICK ON VIEW CART

        WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));

        viewCart.click();

    
       

        //TO ENTER CUSTOMER 

        WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));

        customerNumber.sendKeys(Keys.chord(CustomerNo, Keys.ENTER));
       

//        WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//
//        searchButton3.click();



        // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
  

        

        WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));

        tileItemsButton.click();
        

        WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));

        addToNewOrder2.submit();
 
      

        //ENTER JOB NAME

        WebElement jobName = driver.findElement(By.id("jobName"));

jobName.sendKeys(JobName);


//ENTER CUSTOMER PO#

WebElement customerPO = driver.findElement(By.id("customerPO"));

customerPO.sendKeys(CustomerPO);

//System.out.println(customerPO);



//SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM


Format f = new SimpleDateFormat("MM/dd/yyyy");

String strDate = f.format(new Date());

        WebElement shipDate = driver.findElement(By.id("reqShipDate"));

        shipDate.sendKeys(strDate);


        //CLICK ON NEXT BUTTON

WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));

nextButton.submit();


Thread.sleep(3000);

WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));

createOrder.submit();

//pop up
List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
if(myElements.size() > 0) 

driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();

Thread.sleep(5000);



System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());


WebElement home = driver.findElement(By.className("search-fields"));
home.click();

driver.navigate().refresh();


}

@AfterTest
public void close()
{
	driver.quit();
}

//@Test(dataProvider="storeDp")
//
//public void DAL_SO_03_CAS_CK_CC_SH(String ItemNumber1,String qty1,String ItemNumber2, String qty2) {				
//
//	
//
////		
//
//	//HomePage clearingTheCART = loginPage.setLoginButton();
//
////	
//
////				
//
//		homePage1.DAL_SO_01_CAS_CC_PK();
//
//		homePage1.logOut();
//
//		loginPage.setUsername("ALLFT");
//
//		loginPage.setPassword("ALLFT#123");
//
//		loginPage.setLocation("208");

//

//		HomePage homePage2 = loginPage.setLoginButton();

//		

//		homePage2.DAL_SO_01_CAS_CC_SH();

//		homePage2.logOut();

//		loginPage.setUsername("ALLFT");

//		loginPage.setPassword("ALLFT#123");

//		loginPage.setLocation("208");

//			

//			HomePage homePage3 = loginPage.setLoginButton();

//			homePage3.DAL_SO_03_CAS_CK_CC_PK();

//			homePage3.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

//			//homePage3.logOut();

//			

//			

//			HomePage homePage4 = loginPage.setLoginButton();

//			homePage4.DAL_SO_03_CAS_CK_CC_SH();

//			homePage4.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

			

//			HomePage homePage5 = loginPage.setLoginButton();

//			homePage5.DAL_SO_02_CAS_CA_CC_PK();

//			homePage5.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

//			

//			

//			

//			HomePage homePage6 = loginPage.setLoginButton();

//			homePage6.DAL_SO_02_CAS_CA_CC_PK();

//			homePage6.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

			

//			HomePage homePage7 = loginPage.setLoginButton();

//			homePage7.DAL_SO_04_CAS_CK_CC_CA_PK();

//			homePage7.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

//			

//			HomePage homePage8 = loginPage.setLoginButton();

//			homePage8.DAL_SO_04_CAS_CK_CC_CA_SH();

//			homePage8.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

			

			

//			HomePage homePage9 = loginPage.setLoginButton();

//			homePage9.DAL_SO_05_CAS_CR_CC_PK();

//			homePage9.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

//			

//			HomePage homePage10 = loginPage.setLoginButton();

//			homePage10.DAL_SO_05_CAS_CR_CC_SH();

//			homePage10.logOut();

//			loginPage.setUsername("ALLFT");

//			loginPage.setPassword("ALLFT#123");

//			loginPage.setLocation("208");

			

//			HomePage homePage11 = loginPage.setLoginButton();
//
//			homePage11.DAL_SO_06_CAS_CR_CC_PK();
//
//			homePage11.logOut();
//
//			loginPage.setUsername("ALLFT");
//
//			loginPage.setPassword("ALLFT#123");
//
//			loginPage.setLocation("208");
//
//			
//
//			HomePage homePage12 = loginPage.setLoginButton();
//
//			homePage12.DAL_SO_06_CAS_CR_CC_SH();
//
//			homePage11.logOut();
//
//			loginPage.setUsername("ALLFT");
//
//			loginPage.setPassword("ALLFT#123");
//
//			loginPage.setLocation("208");

			

			

			



		}

	