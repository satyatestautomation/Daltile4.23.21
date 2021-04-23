package slamMobility;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

                WebDriver driver;
                
    public HomePage(WebDriver driver){ 
            this.driver=driver; 
         
        
    }
                                                
    
      
//  public void clearingTheCART()
//  {
//              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            //WebElement cartButton = driver.findElement(By.xpath("//*[@class='item-list']"));
//            WebElement cartButton = driver.findElement(By.xpath("//span[@id='noOfItems']"));
//    cartButton.click();
//    
//    WebElement checkTileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
//    checkTileItemsButton.click();
//    
//    WebElement deleteItemsButton = driver.findElement(By.xpath("//button[@id='js-delete-lines']"));
//    deleteItemsButton.click();
//              
//    WebElement okButton = driver.findElement(By.xpath("//button[@id='js-delete-line']"));
//    okButton.click();
//  }  
  
  
  
   public void DAL_SO_01_CAS_CC_PK() throws InterruptedException
                {
                  
      //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
      WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
      searchButton.click();
      
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
     
       //TO SELECT 3 DIFFERENT ORDERS FROM THE LIST
          
     WebElement firstItem = driver.findElement(By.xpath("//label[@for='checkbox0']"));
                firstItem.click();
                   //WebElement firstItem = driver.findElement(By.cssSelector("body.page-homepage.pageType-ContentPage.template-pages-layout-landingLayout1Page.pageLabel-homepage.language-en:nth-child(2) div.toggled:nth-child(2) div.clearfix:nth-child(8) div.bs-example.bs-item-list.layout-boxshadow div.table-cnt table.table.table-striped.tableSection01 tbody.tableBodyScrl tr.itemData:nth-child(1) td:nth-child(1) div.customCheckboxSmall label:nth-child(1) > label:nth-child(2)"));
                   //rel xpath = tr[@id='itemData0']//td//div[@class='customCheckboxSmall']//label//label
                   //abs xpath = /html[1]/body[1]/div[2]/div[3]/div[7]/div[1]/form[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/label[1]
       //css = body.page-homepage.pageType-ContentPage.template-pages-layout-landingLayout1Page.pageLabel-homepage.language-en:nth-child(2) div.toggled:nth-child(2) div.clearfix:nth-child(8) div.bs-example.bs-item-list.layout-boxshadow div.table-cnt table.table.table-striped.tableSection01 tbody.tableBodyScrl tr.itemData:nth-child(1) td:nth-child(1) div.customCheckboxSmall label:nth-child(1) > label:nth-child(2)  
                   //rel xpath for 2nd item
       //tr[@id='itemData2']//td//div[@class='customCheckboxSmall']//label//label
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                  
                WebElement secondItem = driver.findElement(By.xpath("//label[@for='checkbox2']"));
                secondItem.click();
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//            WebElement thirdItem = driver.findElement(By.xpath("//label[@for='checkbox3']"));
//            thirdItem.click();
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
                //TO CLICK ON ADDTOCART BUTTON
                WebElement addToCart = driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]"));
                addToCart.click();
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
          
                
       //TO ENTER QUANTITY IN 3 ORDERS THAT WERE SELECTED
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
                WebElement firstQty = driver.findElement(By.id("orderQty0"));
                firstQty.sendKeys("100");
                
                WebElement secondQty = driver.findElement(By.id("orderQty1"));
                WebDriverWait wait1=new WebDriverWait(driver, 40);
                WebElement secondqty = wait1.until(ExpectedConditions.visibilityOf(secondQty));
                secondqty.sendKeys("20");
                try {
                                Thread.sleep(10000);
                } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
                
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
//                            WebElement thirdQty = driver.findElement(By.id("orderQty2"));
//                            WebDriverWait wait=new WebDriverWait(driver, 60);
//                            WebElement thirdqty = wait.until(ExpectedConditions.visibilityOf(thirdQty));
//                            thirdqty.sendKeys("20");
                                //WebElement ele = wait.until(ExpectedConditions.visibilityOf(thirdQty));
                                
                                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
                //WebElement thirdQty = driver.findElement(By.id("orderQty2"));
                                //thirdQty.sendKeys("5");
                

    WebElement AddToCartOnPage2 = driver.findElement(By.xpath("//button[@id='js-add-tile']"));             
    AddToCartOnPage2.click();
                
                                               
       //CLICK ON VIEW CART
                                WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
                                viewCart.click();
                               
                                
                                //1.TO ENTER CUSTOMER#
//2. ALSO NEED TO HIT THE SEARCH BUTTON,NEED TO IDENTIFY THE SEARCH LOCATOR
                                
                                WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
                                customerNumber.sendKeys("010393001");
                                customerNumber.sendKeys(Keys.TAB);

                                //String CustomerNo = customerNumber.getAttribute("number");
                                //customerNumber.sendKeys("000096001");
                                
                                //System.out.println("customerNumber used is: " + number);
                                //driver.navigate().refresh();
                                
//                                WebElement searchButton2 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//                                searchButton2.click();
                                //xpath of search button = a[@class='glyphicon glyphicon-search']
                                
//                                try {
//                                                Thread.sleep(5000);
//                                } catch (InterruptedException e) {
//                                                // TODO Auto-generated catch block
//                                                e.printStackTrace();
//                                }
             // driver.navigate().refresh();
              
              Thread.sleep(7000);
                                
          // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
                                //UNDERNEATH IS CODE TO SELECT THE ITEMS INDIVIDUALLY
                                
                                WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
                                tileItemsButton.click();
                                
//                            WebElement firstItemInCart = driver.findElement(By.xpath("//label[@for='checkbox0']"));
//                            firstItemInCart.click();
//                            
//                            
//                            WebElement secondItemInCart = driver.findElement(By.xpath("//label[@for='checkbox1']"));                            secondItemInCart.click();
//                                
//                            WebElement ThirdItemInCart = driver.findElement(By.xpath("//label[@for='checkbox3']"));
//                            ThirdItemInCart.click();
                                
                                //CLICKING ON ADD TO NEW ORDER
                                
                                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                
                                //WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[@class='btn btn-general blue-button second-btn pull-right']"));
                                //WebElement addToNewOrder2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[7]/form[1]/div[4]/div[1]/div[2]/button[2]"));
                                //Rel Xpath = //button[@class='btn btn-general blue-button second-btn pull-right']
                                //            Abs Xpath = /html[1]/body[1]/div[2]/div[3]/div[7]/form[1]/div[4]/div[1]/div[2]/button[2]                
                                // css = body.page-homepage.pageType-ContentPage.template-pages-layout-landingLayout1Page.pageLabel-homepage.language-en:nth-child(2) div.toggled:nth-child(2) div.clearfix:nth-child(8) form.clearfix.form-inline.title-search-form:nth-child(2) div.fixed-footer.clearfix:nth-child(4) div.container-fluid div.pull-right.flex-container > button.btn.btn-general.blue-button.second-btn.pull-right:nth-child(2)
                                //addToNewOrder2.click();
                                
                                try {
									Thread.sleep(7000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                                
                                
                                
                                WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
                                addToNewOrder2.click();
                                
//                                System.out.println("Order creation is in progress");
                                
                                
                                //ENTER JOB NAME
                                WebElement jobName = driver.findElement(By.id("jobName"));
               jobName.sendKeys("DAL_SO_01_CAS_CC_PK");
               
              // System.out.println(jobName);
               
       //ENTER CUSTOMER PO#
               WebElement customerPO = driver.findElement(By.id("customerPO"));
               customerPO.sendKeys("DAL_SO_01_CAS_CC_PK");
               //System.out.println(customerPO);
     
//SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM
      
               
//               WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
//               dateSelection.sendKeys("10/25/2019");
//               
               
               Format f = new SimpleDateFormat("MM/dd/yyyy");
               String strDate = f.format(new Date());
                                WebElement shipDate = driver.findElement(By.id("reqShipDate"));
                                shipDate.sendKeys(strDate);
               
       
                                //CLICK ON NEXT BUTTON
       WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
       nextButton.submit();
     
    
      
        //CLICK ON CREATE ORDER
//        WebElement createOrderButton = driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
//       createOrderButton.click();
//              
       //POP UP WARNING(SOMETIMES ONLY)
      
       //List<WebElement> myElements = driver.findElements(By.xpath("//h4[@id='cartonErrorText']/parent::div)"));
       
       List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
      if(myElements.size() > 0) 
       
       driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
       
   
   WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
   createOrder.click();
   
   //POP UP , CLICK YES
//   WebElement yesOnPopUp = driver.findElement(By.id("validateOrderYes"));
//   yesOnPopUp.click();
//   
 
   System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
   
   
   //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   
   //CAPTURE THE ORDER NUMBER
//   System.out.println(driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
   
                }
      //TO LOG OUT OF THE STORE
     void logOut() throws InterruptedException{
                
                 //LOG OUT
            WebElement line= driver.findElement(By.xpath("//a[@class='navbar-brand menu-toggle']"));
Actions action = new Actions(driver);
action.moveToElement(line);
action.click();
action.build().perform();

      Thread.sleep(10000);
      driver.findElement(By.id("logOutbtn")).click();
      
                }
     
  

                
                
                public void DAL_SO_01_CAS_CC_SH() throws InterruptedException {
                              {
                
                                              
//                                              String T = driver.getTitle();
//                                                 System.out.println(T);
                                                 
                                    //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
                                    WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
                                    searchButton.click();
                                    
                                    
                                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                    
                                    //VERIFYING PAGE TITLE
//                                    String N = driver.getTitle();
//                                    System.out.println(N);
                                    
                                     //TO SELECT 3 DIFFERENT ORDERS FROM THE LIST
                                    
                                    Thread.sleep(3000);
                                        
                                   WebElement firstItem = driver.findElement(By.xpath("//label[@for='checkbox0']"));
                                               firstItem.click();
                                                 //WebElement firstItem = driver.findElement(By.cssSelector("body.page-homepage.pageType-ContentPage.template-pages-layout-landingLayout1Page.pageLabel-homepage.language-en:nth-child(2) div.toggled:nth-child(2) div.clearfix:nth-child(8) div.bs-example.bs-item-list.layout-boxshadow div.table-cnt table.table.table-striped.tableSection01 tbody.tableBodyScrl tr.itemData:nth-child(1) td:nth-child(1) div.customCheckboxSmall label:nth-child(1) > label:nth-child(2)"));
                                                 //rel xpath = tr[@id='itemData0']//td//div[@class='customCheckboxSmall']//label//label
                                                 //abs xpath = /html[1]/body[1]/div[2]/div[3]/div[7]/div[1]/form[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/label[1]
                                     //css = body.page-homepage.pageType-ContentPage.template-pages-layout-landingLayout1Page.pageLabel-homepage.language-en:nth-child(2) div.toggled:nth-child(2) div.clearfix:nth-child(8) div.bs-example.bs-item-list.layout-boxshadow div.table-cnt table.table.table-striped.tableSection01 tbody.tableBodyScrl tr.itemData:nth-child(1) td:nth-child(1) div.customCheckboxSmall label:nth-child(1) > label:nth-child(2)  
                                                 //rel xpath for 2nd item
                                     //tr[@id='itemData2']//td//div[@class='customCheckboxSmall']//label//label
                                                
                                              WebElement secondItem = driver.findElement(By.xpath("//label[@for='checkbox2']"));
                                              secondItem.click();
                                              
                               WebElement thirdItem = driver.findElement(By.xpath("//label[@for='checkbox3']"));
                              thirdItem.click();
                                              
                                              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                              
                                              //TO CLICK ON ADDTOCART BUTTON
                                              WebElement addToCart = driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]"));
                                              addToCart.click();
                                              
                                              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                              
                                              //opens a diff box
                              //verify page source and print title "Inventory search"
//                                              System.out.println("Entered Inventory serach page and Items selected");
                                              
                                              
                                     //TO ENTER QUANTITY IN 3 ORDERS THAT WERE SELECTED
                                              //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                              
                                              WebElement firstQty = driver.findElement(By.id("orderQty0"));
                                              firstQty.sendKeys("100");
                                              
                                              WebElement secondQty = driver.findElement(By.id("orderQty1"));
                                              WebDriverWait wait1=new WebDriverWait(driver, 40);
                                              WebElement secondqty = wait1.until(ExpectedConditions.visibilityOf(secondQty));
                                              secondqty.sendKeys("20");
                                              try {
                                                              Thread.sleep(10000);
                                              } catch (InterruptedException e) {
                                                              // TODO Auto-generated catch block
                                                              e.printStackTrace();
                                              }
                                              
                                               //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                              
                                WebElement thirdQty = driver.findElement(By.id("orderQty2"));
//                                                          WebDriverWait wait=new WebDriverWait(driver, 60);
//                                                          WebElement thirdqty = wait.until(ExpectedConditions.visibilityOf(thirdQty));
                                                thirdQty.sendKeys("20");
                                                              //WebElement ele = wait.until(ExpectedConditions.visibilityOf(thirdQty));
                                                              
                                                              //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                              
                                              //WebElement thirdQty = driver.findElement(By.id("orderQty2"));
                                                              //thirdQty.sendKeys("5");
                                              

                                    //CLICK ON ADDTOCART AFTER ITEMS ARE ADDED
                                ////form[@id='titleItemListForm']/child::div[@class='pad-more clearfix']//button[contains(text(),'CART')]
                                              //WebElement ADDTOCARTonPG2 = driver.findElement(By.xpath("//form[@id='titleItemListForm']/child::div[@class='pad-more clearfix']//button[contains(text(),'CART')]"));
                                     //WebElement ADDTOCARTonPG2 = driver.findElement(By.id("js-add-tile"));
                                  WebElement AddToCartOnPage2 = driver.findElement(By.xpath("//button[@id='js-add-tile']"));                
                                  AddToCartOnPage2.submit();                                 
                                              
//                                  System.out.println("Items got added to cart");

                                               Thread.sleep(5000);
                                     //CLICK ON VIEW CART
                                                              WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
                                                              viewCart.click();
                                                              
//                                                              String viewCartPage = driver.getTitle();
//                                                              System.out.println(viewCartPage);
                                                              
                                                              
                                                              //1.TO ENTER CUSTOMER#
                              //2. ALSO NEED TO HIT THE SEARCH BUTTON,NEED TO IDENTIFY THE SEARCH LOCATOR
                                                              
                                                              WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
                                                              customerNumber.sendKeys("101331940");
                                                              customerNumber.sendKeys(Keys.TAB);

                                                              
//                                                              WebElement searchButton2 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//                                                              searchButton2.click();
                                                              //xpath of search button = a[@class='glyphicon glyphicon-search']
                                                              
                                        // SELECTING ITEMS FROM SHOPPING CART AGAIN
                                                              
                                                              WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
                                                              tileItemsButton.click();
//                                                          WebElement firstItemInCart = driver.findElement(By.xpath("//label[@for='checkbox0']"));
//                                                          firstItemInCart.click();
//                                                          
//                                                          
//                                                          WebElement secondItemInCart = driver.findElement(By.xpath("//label[@for='checkbox1']"));
//                                                          secondItemInCart.click();
//                                          
                                                              WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
                                                              addToNewOrder2.click();
//                                                          
                                                              
                                                              Thread.sleep(5000);
                                                              
                              //Moves to create Order page, view page source
                              //can we use the same actual and expected or use new?
                                     //String actualTitle = driver.getTitle();
                                     //String ExpectedTitle = "Create Order | Slabmobile Site";
                                                              //assertEquals(expectedTitle, actualTitle);
                                                              
//                                                              System.out.println("Order creation is in progress");
                                                              
                                                              
                                                              //ENTER JOB NAME
                                                              WebElement jobName = driver.findElement(By.id("jobName"));
                                             jobName.sendKeys("DAL_SO_01_CAS_CC_SH");
                                             
                                     //ENTER CUSTOMER PO#
                                             WebElement customerPO = driver.findElement(By.id("customerPO"));
                                             customerPO.sendKeys("DAL_SO_01_CAS_CC_SH");
                                             
                                           //SELECTING SHIP BUTTON
                                              WebElement shipButton = driver.findElement(By.xpath("//label[@for='Ship']"));
                                              shipButton.click();
                                             
                                              //SELECTING SHIP TO ADDRESS FROM DROPDOWN BY INDEX
                                              WebElement shipToAddress = driver.findElement(By.id("shipToAddresses"));
                                              shipToAddress.click();
                                              
                                              Select selectAddress = new Select (driver.findElement(By.id("shipToAddresses")));
                                              selectAddress.selectByValue("1");
                                             
                                              
                                      
                              //  
                                                /*
                                                * WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
                                                * dateSelection.sendKeys("10/25/2019");
                                                * 
                                                 */
                                              //ENTERING SSC SHIPDATE
                                              Format f = new SimpleDateFormat("MM/dd/yyyy");
                              String strDate = f.format(new Date());
                                              
                                              WebElement shipDate = driver.findElement(By.id("shipReqShipDate"));
                                              shipDate.sendKeys(strDate);
                                              
                                              WebElement sscShipDate = driver.findElement(By.id("sscShipDate"));
                                              sscShipDate.sendKeys(strDate);
                                                             
                                              //Freight Terms
                                              Select freightTerms = new Select(driver.findElement(By.id("fulfillmentDetails.freightTerms")));
                                              freightTerms.selectByVisibleText("Prepaid & Add");
                                              
                                             //carrier selection
                                              WebElement carrierSelection = driver.findElement(By.xpath("//div[@class='inner-addon right-addon']//a[@class='glyphicon glyphicon-search js-carrier-lookup']"));
                                              carrierSelection.click();
                                              
                                              //ENTERING PALLET COUNT
                                              WebElement EstPalletCount = driver.findElement(By.id("palletCount"));
                                              EstPalletCount.sendKeys("5");
                                              
                                              Thread.sleep(5000);
                                              
                                              //CLICKING ON GET LTL RATING
                                              
                                              WebElement ltlRating = driver.findElement(By.id("js-tpm-rating"));
                                              ltlRating.submit();
                                           
                                            
                                              driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                                              
                                              //SELECT CARRIER FROM LIST
                                              //Select optionsFromCarrierList = new
                                            //  ltlRating.click();
                                              WebDriverWait carrier =new WebDriverWait(driver, 40);
                                             WebElement ele1 = carrier.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody[@id='tpmRatingList']/tr[1]/td[2]"))));
                                              ele1.click();
                                              

                                             Thread.sleep(5000);
                                              
                                    
//                                            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                                                                        
//                                          //ENTERING CUSTOMER REQ DATE, HARDCODED
//                                           Format f = new SimpleDateFormat("MM/dd/yyyy");
//                                           String strDate = f.format(new Date());
                                                //            dateSelection.sendKeys(strDate);
                                                                                         
                               //dateSelection.sendKeys("");
                               
                                              
                                              //CLICKING ON NEXT BUTTON  
                                              WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
                                              nextButton.click();
                                              
                                              
                                              
                                              //CLICKING ON CREATE ORDER BUTTON
                                              WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
                                              createOrder.click();
                                              
                                              List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
                                              if(myElements.size() > 0) 
                                               
                                               driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
                                              
                                              //CAPTURE THE ORDER NUMBER
                                              System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
                                              
                              }     
                }
           
                              public void DAL_SO_03_CAS_CK_CC_PK() {
                            	  {
                            	  //TO ENTER INVENTORY ITEM NUMBER
                            		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
                                              searchInventoryButton.sendKeys("0T03Q3565U1P");
                                              
                                            //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
                                              WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
                                              searchButton.click(); 
                                              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                                              
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
                                      firstQuantity.sendKeys("100");
                                      
                                      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                                      
                                      //CLICK ON ADD TO CART
                                      WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
                                      addTOCartButton.submit();
                                      
                                      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                      
                                      //CLICK ON ADD MORE ITEMS BUTTON
                                      WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
                                      addMoreItemsButton.click();
                                      
                                      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                      
                                      //ENTERING SECOND SEARCH ITEM
                                      WebElement searchButton2 = driver.findElement(By.name("searchItem"));
                                      searchButton2.clear();
                                      searchButton2.sendKeys("9999547869");   
                                      
                                    //TO CLICK ON SEARCH BUTTON 
                                      WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
                                      searchButton1.click();
                                      
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
                                      secondQuantity.sendKeys("50");
                                      
                                      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                                      
                                    //CLICK ON ADD TO CART
                                      WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
                                      addTOCartButton2.submit();
                                      
                                      
                                      //CLICK ON VIEW CART
                                      WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
                                      viewCart.click();
                                      
                                      
//                                      //CLICK ON ADD MORE ITEMS BUTTON
//                                      WebElement addMoreItemsButton2 = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
//                                      addMoreItemsButton2.click();
//                                      
//                                    //TO ENTER THIRD INVENTORY ITEM NUMBER
//                            		  WebElement searchInventoryButton3 = driver.findElement(By.id("searchInput"));
//                            		  searchInventoryButton3.clear();        
//                            		  searchInventoryButton3.sendKeys("9999622734");
//                            		  
//                                      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//                            		  
//                            		//TO CLICK ON SEARCH BUTTON 
//                                      WebElement searchButton3 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
//                                      searchButton3.click(); 
//                                      
//                                      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//                    		  
//                                  //CLICK ON SELECT ITEM 
//                                   // WebElement thirdItemCheckBox = driver.findElement(By.xpath("//label[@for='checkbox0']"));
//                                    WebElement thirdItemCheckBox = driver.findElement(By.xpath("//tr[@id='itemData0']//td//div[@class='customCheckboxSmall']//label//label"));
//                                    thirdItemCheckBox.click();
//                                    
//                                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//                                    WebDriverWait wait2= new WebDriverWait(driver,20);
//                                    WebElement thirditem = wait2.until((ExpectedConditions.visibilityOf(thirdItemCheckBox)));
//                                                                   
//                                    thirditem.click();
//                                   try {
//									Thread.sleep(5000);
//								} catch (InterruptedException e1) {
//									// TODO Auto-generated catch block
//									e1.printStackTrace();
//								}
                                                                                                           
//                                    //TO CLICK ON ADDTOCART BUTTON
//                                    WebElement addToCart3 = driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]"));
//                                    //WebElement addToCart3 = driver.findElement(By.id("js-item-cart"));
//                                      addToCart3.click();
//                                      
//                                      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//      
//                                           
//                                      //TO ENTER QUANTITY TO SECOND ITEM
//                                    WebElement thirdQuantity = driver.findElement(By.xpath("//label[@class='quantity']"));
//                                     thirdQuantity.sendKeys("5");
//                                     
//                                     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//                                     //CLICK ON ADD TO CART
//                                     WebElement addTOCartButton3 = driver.findElement(By.id("js-add-tile"));
//                                     addTOCartButton3.submit();
//                                              
                                      
                                      //TO ENTER CUSTOMER 
                                      WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
                                      customerNumber.sendKeys("101576540");
                                      customerNumber.sendKeys(Keys.TAB);

                                     
//                                      WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//                                      searchButton3.click();
//                                      //xpath of search button = a[@class='glyphicon glyphicon-search']
//                                      
//                                      try {
//                                                      Thread.sleep(5000);
//                                      } catch (InterruptedException e) {
//                                                      // TODO Auto-generated catch block
//                                                      e.printStackTrace();
//                                      }
//                                                                                         
                                      // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
                                     
                                      
                                      WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
                                      tileItemsButton.click();
                                      
                                      WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
                                      addToNewOrder2.click();
                            		  
                                      
                                      //ENTER JOB NAME
                                      WebElement jobName = driver.findElement(By.id("jobName"));
                     jobName.sendKeys("DAL_SO_03_CAS_CK_CC_PK");
                     
                   
                     
             //ENTER CUSTOMER PO#
                     WebElement customerPO = driver.findElement(By.id("customerPO"));
                     customerPO.sendKeys("DAL_SO_03_CAS_CK_CC_PK");
                     //System.out.println(customerPO);
           
      //SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM
            
                 
                     
                     Format f = new SimpleDateFormat("MM/dd/yyyy");
                     String strDate = f.format(new Date());
                                      WebElement shipDate = driver.findElement(By.id("reqShipDate"));
                                      shipDate.sendKeys(strDate);
                     
             
                                      //CLICK ON NEXT BUTTON
             WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
             nextButton.click();
             
             
             List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
             if(myElements.size() > 0) 
              
              driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
              
          
          WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
          createOrder.submit();
          
          //POP UP , CLICK YES
       //   WebElement yesOnPopUp = driver.findElement(By.id("validateOrderYes"));
       //   yesOnPopUp.click();
       //   
        
          System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
          
                              }
                              }
                              
    public void DAL_SO_03_CAS_CK_CC_SH() {
    {
                            		  
    	 //TO ENTER INVENTORY ITEM NUMBER
		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
                searchInventoryButton.sendKeys("0001BA7251P");               		  
                            		  
                //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
                WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
                searchButton.click(); 
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                
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
        firstQuantity.sendKeys("100");                    		  
        
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //CLICK ON ADD TO CART
        WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
        addTOCartButton.submit();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //CLICK ON ADD MORE ITEMS BUTTON
        WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
        addMoreItemsButton.click();
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        //ENTERING SECOND SEARCH ITEM
        WebElement searchButton2 = driver.findElement(By.name("searchItem"));
        searchButton2.clear();
        searchButton2.sendKeys("9999537332");   
        
      //TO CLICK ON SEARCH BUTTON 
        WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
        searchButton1.click();
        
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
        secondQuantity.sendKeys("50");
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
      //CLICK ON ADD TO CART
        WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
        addTOCartButton2.submit();
        
              
        //CLICK ON VIEW CART
        WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
        viewCart.click();
           

        
        //TO ENTER CUSTOMER 
        WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
        customerNumber.sendKeys("101576540");
        customerNumber.sendKeys(Keys.TAB);

       
//        WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//        searchButton3.click();
//        //xpath of search button = a[@class='glyphicon glyphicon-search']
//        
//        try {
//                        Thread.sleep(5000);
//        } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//        }
//                                                           
        // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
       
        
        WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
        tileItemsButton.click();
        
        WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
        addToNewOrder2.click();
		  
        
        //ENTER JOB NAME
        WebElement jobName = driver.findElement(By.id("jobName"));
jobName.sendKeys("DAL_SO_03_CAS_CK_CC_SH");



//ENTER CUSTOMER PO#
WebElement customerPO = driver.findElement(By.id("customerPO"));
customerPO.sendKeys("DAL_SO_03_CAS_CK_CC_SH");
//System.out.println(customerPO);                    		  
                              }

    //SELECTING SHIP BUTTON
    WebElement shipButton = driver.findElement(By.xpath("//label[@for='Ship']"));
    shipButton.click();
   
    //SELECTING SHIP TO ADDRESS FROM DROPDOWN BY INDEX
    WebElement shipToAddress = driver.findElement(By.id("shipToAddresses"));
    shipToAddress.click();
    
    Select selectAddress = new Select (driver.findElement(By.id("shipToAddresses")));
    selectAddress.selectByValue("1");
   
    

//  
      /*
      * WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
      * dateSelection.sendKeys("10/25/2019");
      * 
       */
    //ENTERING SSC SHIPDATE
    Format f = new SimpleDateFormat("MM/dd/yyyy");
String strDate = f.format(new Date());
    
    WebElement shipDate = driver.findElement(By.id("shipReqShipDate"));
    shipDate.sendKeys(strDate);
    
    WebElement sscShipDate = driver.findElement(By.id("sscShipDate"));
    sscShipDate.sendKeys(strDate);
                   
    //Freight Terms
    Select freightTerms = new Select(driver.findElement(By.id("fulfillmentDetails.freightTerms")));
    freightTerms.selectByVisibleText("Prepaid & Add");
    
   //carrier selection
    WebElement carrierSelection = driver.findElement(By.xpath("//div[@class='inner-addon right-addon']//a[@class='glyphicon glyphicon-search js-carrier-lookup']"));
    carrierSelection.click();
    
    //ENTERING PALLET COUNT
    WebElement EstPalletCount = driver.findElement(By.id("palletCount"));
    EstPalletCount.sendKeys("5");
    
    //CLICKING ON GET LTL RATING
    
    WebElement ltlRating = driver.findElement(By.id("js-tpm-rating"));
    ltlRating.submit();
 
  
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    
    //SELECT CARRIER FROM LIST
    //Select optionsFromCarrierList = new
  //  ltlRating.click();
    WebDriverWait carrier =new WebDriverWait(driver, 40);
   WebElement ele1 = carrier.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody[@id='tpmRatingList']/tr[1]/td[2]"))));
    ele1.click();
    

   try {
	Thread.sleep(7000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    

//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                              
////ENTERING CUSTOMER REQ DATE, HARDCODED
// Format f = new SimpleDateFormat("MM/dd/yyyy");
// String strDate = f.format(new Date());
      //            dateSelection.sendKeys(strDate);
                                               
//dateSelection.sendKeys("");

    
    //CLICKING ON NEXT BUTTON  
    WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
    nextButton.click();
    
    
    
    //CLICKING ON CREATE ORDER BUTTON
    WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
    createOrder.click();
    
    List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
    if(myElements.size() > 0) 
     
     driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
    
    //CAPTURE THE ORDER NUMBER
    System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
    
    
    }
    

       public void DAL_SO_02_CAS_CA_CC_PK(){
    	   
    	   {
    	   
    		 //TO ENTER INVENTORY ITEM NUMBER
     		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
                       searchInventoryButton.sendKeys("D208MB5B1P");
                       
                     //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
                       WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
                       searchButton.click(); 
                       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                       
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
               firstQuantity.sendKeys("100");
               
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               
               //CLICK ON ADD TO CART
               WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
               addTOCartButton.submit();
               
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
               //CLICK ON ADD MORE ITEMS BUTTON
               WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
               addMoreItemsButton.click();
               
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
               //ENTERING SECOND SEARCH ITEM
               WebElement searchButton2 = driver.findElement(By.name("searchItem"));
               searchButton2.clear();
               searchButton2.sendKeys("F0171212MS1P");   
               
             //TO CLICK ON SEARCH BUTTON 
               WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
               searchButton1.click();
               
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
               secondQuantity.sendKeys("80");
               
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               
             //CLICK ON ADD TO CART
               WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
               addTOCartButton2.submit();
               
               
               //CLICK ON VIEW CART
               WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
               viewCart.click();
               
               
//               //CLICK ON ADD MORE ITEMS BUTTON
//               WebElement addMoreItemsButton2 = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
//               addMoreItemsButton2.click();
//               
//             //TO ENTER THIRD INVENTORY ITEM NUMBER
//     		  WebElement searchInventoryButton3 = driver.findElement(By.id("searchInput"));
//     		  searchInventoryButton3.clear();        
//     		  searchInventoryButton3.sendKeys("9999622734");
//     		  
//               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//     		  
//     		//TO CLICK ON SEARCH BUTTON 
//               WebElement searchButton3 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
//               searchButton3.click(); 
//               
//               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//		  
//           //CLICK ON SELECT ITEM 
//            // WebElement thirdItemCheckBox = driver.findElement(By.xpath("//label[@for='checkbox0']"));
//             WebElement thirdItemCheckBox = driver.findElement(By.xpath("//tr[@id='itemData0']//td//div[@class='customCheckboxSmall']//label//label"));
//             thirdItemCheckBox.click();
//             
//             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//             WebDriverWait wait2= new WebDriverWait(driver,20);
//             WebElement thirditem = wait2.until((ExpectedConditions.visibilityOf(thirdItemCheckBox)));
//                                            
//             thirditem.click();
//            try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
                                                                                    
//             //TO CLICK ON ADDTOCART BUTTON
//             WebElement addToCart3 = driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]"));
//             //WebElement addToCart3 = driver.findElement(By.id("js-item-cart"));
//               addToCart3.click();
//               
//               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//                    
//               //TO ENTER QUANTITY TO SECOND ITEM
//             WebElement thirdQuantity = driver.findElement(By.xpath("//label[@class='quantity']"));
//              thirdQuantity.sendKeys("5");
//              
//              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//              //CLICK ON ADD TO CART
//              WebElement addTOCartButton3 = driver.findElement(By.id("js-add-tile"));
//              addTOCartButton3.submit();
//                       
               
               //TO ENTER CUSTOMER 
               WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
               customerNumber.sendKeys("101366240");
               customerNumber.sendKeys(Keys.TAB);
              
//               WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//               searchButton3.click();
//               //xpath of search button = a[@class='glyphicon glyphicon-search']
//               
//               try {
//                               Thread.sleep(5000);
//               } catch (InterruptedException e) {
//                               // TODO Auto-generated catch block
//                               e.printStackTrace();
//               }
//                                                                  
               // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
              
               
               WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
               tileItemsButton.click();
               
               WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
               addToNewOrder2.click();
     		  
               
               //ENTER JOB NAME
               WebElement jobName = driver.findElement(By.id("jobName"));
jobName.sendKeys("DAL_SO_02_CAS_CA_CC_PK");



//ENTER CUSTOMER PO#
WebElement customerPO = driver.findElement(By.id("customerPO"));
customerPO.sendKeys("DAL_SO_02_CAS_CA_CC_PK");
//System.out.println(customerPO);

//SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM



Format f = new SimpleDateFormat("MM/dd/yyyy");
String strDate = f.format(new Date());
               WebElement shipDate = driver.findElement(By.id("reqShipDate"));
               shipDate.sendKeys(strDate);


               //CLICK ON NEXT BUTTON
WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
nextButton.click();


List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
if(myElements.size() > 0) 

driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();


WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
createOrder.click();

//POP UP , CLICK YES
//   WebElement yesOnPopUp = driver.findElement(By.id("validateOrderYes"));
//   yesOnPopUp.click();
//   

System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());

    		   
    		   
    		   
       }
                       
       }
       
    	       	   public void DAL_SO_02_CAS_CA_CC_SH() {
    		    {
    		                            		  
    		    	 //TO ENTER INVENTORY ITEM NUMBER
    				  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
    		                searchInventoryButton.sendKeys("008144SP");               		  
    		                            		  
    		                //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
    		                WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		                searchButton.click(); 
    		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    		                
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
    		        firstQuantity.sendKeys("100");                    		  
    		        
    		        
    		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		        
    		        //CLICK ON ADD TO CART
    		        WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
    		        addTOCartButton.submit();
    		        
    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		        
    		        //CLICK ON ADD MORE ITEMS BUTTON
    		        WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
    		        addMoreItemsButton.click();
    		        
    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		        
    		        //ENTERING SECOND SEARCH ITEM
    		        WebElement searchButton2 = driver.findElement(By.name("searchItem"));
    		        searchButton2.clear();
    		        searchButton2.sendKeys("DA20RAINDRPMS1P");   
    		        
    		      //TO CLICK ON SEARCH BUTTON 
    		        WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		        searchButton1.click();
    		        
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
    		        secondQuantity.sendKeys("50");
    		        
    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		        
    		      //CLICK ON ADD TO CART
    		        WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
    		        addTOCartButton2.submit();
    		        
    		              
    		        //CLICK ON VIEW CART
    		        WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
    		        viewCart.click();
    		           

    		        
    		        //TO ENTER CUSTOMER 
    		        WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
    		        customerNumber.sendKeys("101366240");
    		        customerNumber.sendKeys(Keys.TAB);
    		       
//    		        WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//    		        searchButton3.click();
//    		        //xpath of search button = a[@class='glyphicon glyphicon-search']
//    		        
//    		        try {
//    		                        Thread.sleep(5000);
//    		        } catch (InterruptedException e) {
//    		                        // TODO Auto-generated catch block
//    		                        e.printStackTrace();
//    		        }
//    		                                                           
    		        // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
    		       
    		        
    		        WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
    		        tileItemsButton.click();
    		        
    		        WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
    		        addToNewOrder2.click();
    				  
    		        
    		        //ENTER JOB NAME
    		        WebElement jobName = driver.findElement(By.id("jobName"));
    		jobName.sendKeys("DAL_SO_02_CAS_CA_CC_SH");



    		//ENTER CUSTOMER PO#
    		WebElement customerPO = driver.findElement(By.id("customerPO"));
    		customerPO.sendKeys("DAL_SO_02_CAS_CA_CC_SH");
    		//System.out.println(customerPO);                    		  
    		                              }

    		    //SELECTING SHIP BUTTON
    		    WebElement shipButton = driver.findElement(By.xpath("//label[@for='Ship']"));
    		    shipButton.click();
    		   
    		    //SELECTING SHIP TO ADDRESS FROM DROPDOWN BY INDEX
    		    WebElement shipToAddress = driver.findElement(By.id("shipToAddresses"));
    		    shipToAddress.click();
    		    
    		    Select selectAddress = new Select (driver.findElement(By.id("shipToAddresses")));
    		    selectAddress.selectByValue("1");
    		   
    		    

    		//  
    		      /*
    		      * WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
    		      * dateSelection.sendKeys("10/25/2019");
    		      * 
    		       */
    		    //ENTERING SSC SHIPDATE
    		    Format f = new SimpleDateFormat("MM/dd/yyyy");
    		String strDate = f.format(new Date());
    		    
    		    WebElement shipDate = driver.findElement(By.id("shipReqShipDate"));
    		    shipDate.sendKeys(strDate);
    		    
    		    WebElement sscShipDate = driver.findElement(By.id("sscShipDate"));
    		    sscShipDate.sendKeys(strDate);
    		                   
    		    //Freight Terms
    		    Select freightTerms = new Select(driver.findElement(By.id("fulfillmentDetails.freightTerms")));
    		    freightTerms.selectByVisibleText("Prepaid & Add");
    		    
    		   //carrier selection
    		    WebElement carrierSelection = driver.findElement(By.xpath("//div[@class='inner-addon right-addon']//a[@class='glyphicon glyphicon-search js-carrier-lookup']"));
    		    carrierSelection.click();
    		    
    		    //ENTERING PALLET COUNT
    		    WebElement EstPalletCount = driver.findElement(By.id("palletCount"));
    		    EstPalletCount.sendKeys("5");
    		    
    		    //CLICKING ON GET LTL RATING
    		    
    		    WebElement ltlRating = driver.findElement(By.id("js-tpm-rating"));
    		    ltlRating.submit();
    		 
    		  
    		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    		    
    		    //SELECT CARRIER FROM LIST
    		    //Select optionsFromCarrierList = new
    		  //  ltlRating.click();
    		    WebDriverWait carrier =new WebDriverWait(driver, 40);
    		   WebElement ele1 = carrier.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody[@id='tpmRatingList']/tr[1]/td[2]"))));
    		    ele1.click();
    		    

    		   try {
    			Thread.sleep(7000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		    

    		//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    		                              
    		////ENTERING CUSTOMER REQ DATE, HARDCODED
    		// Format f = new SimpleDateFormat("MM/dd/yyyy");
    		// String strDate = f.format(new Date());
    		      //            dateSelection.sendKeys(strDate);
    		                                               
    		//dateSelection.sendKeys("");

    		    
    		    //CLICKING ON NEXT BUTTON  
    		    WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
    		    nextButton.click();
    		    
    		    
    		    
    		    //CLICKING ON CREATE ORDER BUTTON
    		    WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
    		    createOrder.click();
    		    
    		    List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
    		    if(myElements.size() > 0) 
    		     
    		     driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
    		    
    		    //CAPTURE THE ORDER NUMBER
    		    System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
    	       	   }


    		    
    		    
    		    
    		    public void DAL_SO_04_CAS_CK_CC_CA_PK(){
    		    	   
    		    	   {
    		    	   
    		    		 //TO ENTER INVENTORY ITEM NUMBER
    		     		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
    		                       searchInventoryButton.sendKeys("VL7312241P6");
    		                       
    		                     //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
    		                       WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		                       searchButton.click(); 
    		                       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    		                       
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
    		               firstQuantity.sendKeys("20");
    		               
    		               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		               
    		               //CLICK ON ADD TO CART
    		               WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
    		               addTOCartButton.submit();
    		               
    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		               
    		               //CLICK ON ADD MORE ITEMS BUTTON
    		               WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
    		               addMoreItemsButton.click();
    		               
    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		               
    		               //ENTERING SECOND SEARCH ITEM
    		               WebElement searchButton2 = driver.findElement(By.name("searchItem"));
    		               searchButton2.clear();
    		               searchButton2.sendKeys("9999547869");   
    		               
    		             //TO CLICK ON SEARCH BUTTON 
    		               WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		               searchButton1.click();
    		               
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
    		               secondQuantity.sendKeys("50");
    		               
    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		               
    		             //CLICK ON ADD TO CART
    		               WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
    		               addTOCartButton2.submit();
    		               
    		               
    		               //CLICK ON VIEW CART
    		               WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
    		               viewCart.click();
    		               
    		               

    		               
    		               //TO ENTER CUSTOMER 
    		               WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
    		               customerNumber.sendKeys("101704940");
    		               customerNumber.sendKeys(Keys.TAB);
    		              
//    		               WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//    		               searchButton3.click();
//    		               //xpath of search button = a[@class='glyphicon glyphicon-search']
//    		               
//    		               try {
//    		                               Thread.sleep(5000);
//    		               } catch (InterruptedException e) {
//    		                               // TODO Auto-generated catch block
//    		                               e.printStackTrace();
//    		               }
//    		                                                                  
    		               // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
    		              
    		               
    		               WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
    		               tileItemsButton.click();
    		               
    		               WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
    		               addToNewOrder2.click();
    		     		  
    		               
    		               //ENTER JOB NAME
    		               WebElement jobName = driver.findElement(By.id("jobName"));
    		jobName.sendKeys("DAL_SO_04_CAS_CK_CC_CA_PK");



    		//ENTER CUSTOMER PO#
    		WebElement customerPO = driver.findElement(By.id("customerPO"));
    		customerPO.sendKeys("DAL_SO_04_CAS_CK_CC_CA_PK");
    		//System.out.println(customerPO);

    		//SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM



    		Format f = new SimpleDateFormat("MM/dd/yyyy");
    		String strDate = f.format(new Date());
    		               WebElement shipDate = driver.findElement(By.id("reqShipDate"));
    		               shipDate.sendKeys(strDate);


    		               //CLICK ON NEXT BUTTON
    		WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
    		nextButton.click();


    		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
    		if(myElements.size() > 0) 

    		driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();


    		WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
    		createOrder.click();

    		//POP UP , CLICK YES
    		//   WebElement yesOnPopUp = driver.findElement(By.id("validateOrderYes"));
    		//   yesOnPopUp.click();
    		//   

    		System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());

    		    		   
    		    		   
    		    		   
    		       }
    		             
    		    }
    		    	   
    		    	   
    		    	   
    		    	   public void DAL_SO_04_CAS_CK_CC_CA_SH() {
    		    		    {
    		    		                            		  
    		    		    	 //TO ENTER INVENTORY ITEM NUMBER
    		    				  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
    		    		                searchInventoryButton.sendKeys("9999600090");               		  
    		    		                            		  
    		    		                //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
    		    		                WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		    		                searchButton.click(); 
    		    		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    		    		                
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
    		    		        firstQuantity.sendKeys("20");                    		  
    		    		        
    		    		        
    		    		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		    		        
    		    		        //CLICK ON ADD TO CART
    		    		        WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
    		    		        addTOCartButton.submit();
    		    		        
    		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		    		        
    		    		        //CLICK ON ADD MORE ITEMS BUTTON
    		    		        WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
    		    		        addMoreItemsButton.click();
    		    		        
    		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		    		        
    		    		        //ENTERING SECOND SEARCH ITEM
    		    		        WebElement searchButton2 = driver.findElement(By.name("searchItem"));
    		    		        searchButton2.clear();
    		    		        searchButton2.sendKeys("0025A3401SP");   
    		    		        
    		    		      //TO CLICK ON SEARCH BUTTON 
    		    		        WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		    		        searchButton1.click();
    		    		        
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
    		    		        secondQuantity.sendKeys("40");
    		    		        
    		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		    		        
    		    		      //CLICK ON ADD TO CART
    		    		        WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
    		    		        addTOCartButton2.submit();
    		    		        
    		    		              
    		    		        //CLICK ON VIEW CART
    		    		        WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
    		    		        viewCart.click();
    		    		           

    		    		        
    		    		        //TO ENTER CUSTOMER 
    		    		        WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
    		    		        customerNumber.sendKeys("101704940");
    		    		        customerNumber.sendKeys(Keys.TAB);
    		    		       
//    		    		        WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//    		    		        searchButton3.click();
//    		    		        //xpath of search button = a[@class='glyphicon glyphicon-search']
//    		    		        
//    		    		        try {
//    		    		                        Thread.sleep(5000);
//    		    		        } catch (InterruptedException e) {
//    		    		                        // TODO Auto-generated catch block
//    		    		                        e.printStackTrace();
//    		    		        }
//    		    		                                                           
    		    		        // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
    		    		       
    		    		        
    		    		        WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
    		    		        tileItemsButton.click();
    		    		        
    		    		        WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
    		    		        addToNewOrder2.click();
    		    				  
    		    		        
    		    		        //ENTER JOB NAME
    		    		        WebElement jobName = driver.findElement(By.id("jobName"));
    		    		jobName.sendKeys("DAL_SO_04_CAS_CK_CC_CA_SH");



    		    		//ENTER CUSTOMER PO#
    		    		WebElement customerPO = driver.findElement(By.id("customerPO"));
    		    		customerPO.sendKeys("DAL_SO_04_CAS_CK_CC_CA_SH");
    		    		//System.out.println(customerPO);                    		  
    		    		                              }

    		    		    //SELECTING SHIP BUTTON
    		    		    WebElement shipButton = driver.findElement(By.xpath("//label[@for='Ship']"));
    		    		    shipButton.click();
    		    		   
    		    		    //SELECTING SHIP TO ADDRESS FROM DROPDOWN BY INDEX
    		    		    WebElement shipToAddress = driver.findElement(By.id("shipToAddresses"));
    		    		    shipToAddress.click();
    		    		    
    		    		    Select selectAddress = new Select (driver.findElement(By.id("shipToAddresses")));
    		    		    selectAddress.selectByValue("1");
    		    		   
    		    		    

    		    		//  
    		    		      /*
    		    		      * WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
    		    		      * dateSelection.sendKeys("10/25/2019");
    		    		      * 
    		    		       */
    		    		    //ENTERING SSC SHIPDATE
    		    		    Format f = new SimpleDateFormat("MM/dd/yyyy");
    		    		String strDate = f.format(new Date());
    		    		    
    		    		    WebElement shipDate = driver.findElement(By.id("shipReqShipDate"));
    		    		    shipDate.sendKeys(strDate);
    		    		    
    		    		    WebElement sscShipDate = driver.findElement(By.id("sscShipDate"));
    		    		    sscShipDate.sendKeys(strDate);
    		    		                   
    		    		    //Freight Terms
    		    		    Select freightTerms = new Select(driver.findElement(By.id("fulfillmentDetails.freightTerms")));
    		    		    freightTerms.selectByVisibleText("Prepaid & Add");
    		    		    
    		    		   //carrier selection
    		    		    WebElement carrierSelection = driver.findElement(By.xpath("//div[@class='inner-addon right-addon']//a[@class='glyphicon glyphicon-search js-carrier-lookup']"));
    		    		    carrierSelection.click();
    		    		    
    		    		    //ENTERING PALLET COUNT
    		    		    WebElement EstPalletCount = driver.findElement(By.id("palletCount"));
    		    		    EstPalletCount.sendKeys("5");
    		    		    
    		    		    //CLICKING ON GET LTL RATING
    		    		    
    		    		    WebElement ltlRating = driver.findElement(By.id("js-tpm-rating"));
    		    		    ltlRating.submit();
    		    		 
    		    		  
    		    		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    		    		    
    		    		    //SELECT CARRIER FROM LIST
    		    		    //Select optionsFromCarrierList = new
    		    		  //  ltlRating.click();
    		    		    WebDriverWait carrier =new WebDriverWait(driver, 40);
    		    		   WebElement ele1 = carrier.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody[@id='tpmRatingList']/tr[1]/td[2]"))));
    		    		    ele1.click();
    		    		    

    		    		   try {
    		    			Thread.sleep(7000);
    		    		} catch (InterruptedException e) {
    		    			// TODO Auto-generated catch block
    		    			e.printStackTrace();
    		    		}
    		    		    

    		    		//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    		    		                              
    		    		////ENTERING CUSTOMER REQ DATE, HARDCODED
    		    		// Format f = new SimpleDateFormat("MM/dd/yyyy");
    		    		// String strDate = f.format(new Date());
    		    		      //            dateSelection.sendKeys(strDate);
    		    		                                               
    		    		//dateSelection.sendKeys("");

    		    		    
    		    		    //CLICKING ON NEXT BUTTON  
    		    		    WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
    		    		    nextButton.click();
    		    		    
    		    		    
    		    		    
    		    		    //CLICKING ON CREATE ORDER BUTTON
    		    		    WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
    		    		    createOrder.click();
    		    		    
    		    		    List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
    		    		    if(myElements.size() > 0) 
    		    		     
    		    		     driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
    		    		    
    		    		    //CAPTURE THE ORDER NUMBER
    		    		    System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
    		    	   }


    		    	   
    		    		    public void DAL_SO_05_CAS_CR_CC_PK(){
    		    		    	   
    		    		    	   {
    		    		    	   
    		    		    		 //TO ENTER INVENTORY FIRST ITEM 
    		    		     		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
    		    		                       searchInventoryButton.sendKeys("CH2524481PK");
    		    		                       
    		    		                     //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
    		    		                       WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		    		                       searchButton.click(); 
    		    		                       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    		    		                       
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
    		    		               firstQuantity.sendKeys("100");
    		    		               
    		    		               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		    		               
    		    		               //CLICK ON ADD TO CART
    		    		               WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
    		    		               addTOCartButton.submit();
    		    		               
    		    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		    		               
    		    		               //CLICK ON ADD MORE ITEMS BUTTON
    		    		               WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
    		    		               addMoreItemsButton.click();
    		    		               
    		    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		    		               
    		    		               //ENTERING SECOND SEARCH ITEM
    		    		               WebElement searchButton2 = driver.findElement(By.name("searchItem"));
    		    		               searchButton2.clear();
    		    		               searchButton2.sendKeys("PL02S43091P2");   
    		    		               
    		    		             //TO CLICK ON SEARCH BUTTON 
    		    		               WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
    		    		               searchButton1.click();
    		    		               
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
    		    		               secondQuantity.sendKeys("33");
    		    		               
    		    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		    		               
    		    		             //CLICK ON ADD TO CART
    		    		               WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
    		    		               addTOCartButton2.submit();
    		    		               
    		    		               
    		    		               //CLICK ON VIEW CART
    		    		               WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
    		    		               viewCart.click();
    		    		               
    		    		               

    		    		               
    		    		               //TO ENTER CUSTOMER 
    		    		               WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
    		    		               customerNumber.sendKeys("102459340");
    		    		               customerNumber.sendKeys(Keys.TAB);


    		    		              
//    		    		               WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//    		    		               searchButton3.click();
//    		    		               //xpath of search button = a[@class='glyphicon glyphicon-search']
//    		    		               
//    		    		               try {
//    		    		                               Thread.sleep(5000);
//    		    		               } catch (InterruptedException e) {
//    		    		                               // TODO Auto-generated catch block
//    		    		                               e.printStackTrace();
//    		    		               }
//    		    		                                                                  
    		    		               // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
    		    		              
    		    		               
    		    		               WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
    		    		               tileItemsButton.click();
    		    		               
    		    		               WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
    		    		               addToNewOrder2.click();
    		    		     		  
    		    		               
    		    		               //ENTER JOB NAME
    		    		               WebElement jobName = driver.findElement(By.id("jobName"));
    		    		jobName.sendKeys("DAL_SO_05_CAS_CR_CC_PK");



    		    		//ENTER CUSTOMER PO#
    		    		WebElement customerPO = driver.findElement(By.id("customerPO"));
    		    		customerPO.sendKeys("DAL_SO_05_CAS_CR_CC_PK");
    		    		//System.out.println(customerPO);

    		    		//SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM



    		    		Format f = new SimpleDateFormat("MM/dd/yyyy");
    		    		String strDate = f.format(new Date());
    		    		               WebElement shipDate = driver.findElement(By.id("reqShipDate"));
    		    		               shipDate.sendKeys(strDate);


    		    		               //CLICK ON NEXT BUTTON
    		    		WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
    		    		nextButton.click();


    		    		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
    		    		if(myElements.size() > 0) 

    		    		driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();


    		    		WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
    		    		createOrder.click();

    		    		//POP UP , CLICK YES
    		    		//   WebElement yesOnPopUp = driver.findElement(By.id("validateOrderYes"));
    		    		//   yesOnPopUp.click();
    		    		//   

    		    		System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());

    		    		    		   
    		    		    		   
    		    		    		   
    		    		       }
    		    		             
    		    		    }	    	   
    		    	   
    		    	   
    		    	   
    		    		    public void DAL_SO_05_CAS_CR_CC_SH() {
        		    		    {
        		    		                            		  
        		    		    	 //TO ENTER INVENTORY ITEM NUMBER
        		    				  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
        		    		                searchInventoryButton.sendKeys("0135161P2");               		  
        		    		                            		  
        		    		                //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
        		    		                WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
        		    		                searchButton.click(); 
        		    		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        		    		                
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
        		    		        firstQuantity.sendKeys("100");                    		  
        		    		        
        		    		        
        		    		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		    		        
        		    		        //CLICK ON ADD TO CART
        		    		        WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
        		    		        addTOCartButton.submit();
        		    		        
        		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        		    		        
        		    		        //CLICK ON ADD MORE ITEMS BUTTON
        		    		        WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
        		    		        addMoreItemsButton.click();
        		    		        
        		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        		    		        
        		    		        //ENTERING SECOND SEARCH ITEM
        		    		        WebElement searchButton2 = driver.findElement(By.name("searchItem"));
        		    		        searchButton2.clear();
        		    		        searchButton2.sendKeys("M31312241L");   
        		    		        
        		    		      //TO CLICK ON SEARCH BUTTON 
        		    		        WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
        		    		        searchButton1.click();
        		    		        
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
        		    		        secondQuantity.sendKeys("33");
        		    		        
        		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        		    		        
        		    		      //CLICK ON ADD TO CART
        		    		        WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
        		    		        addTOCartButton2.submit();
        		    		        
        		    		              
        		    		        //CLICK ON VIEW CART
        		    		        WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
        		    		        viewCart.click();
        		    		           

        		    		        
        		    		        //TO ENTER CUSTOMER 
        		    		        WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
        		    		        customerNumber.sendKeys("102459340");
        		    		        customerNumber.sendKeys(Keys.TAB);
        		    		       
//        		    		        WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
//        		    		        searchButton3.click();
//        		    		        //xpath of search button = a[@class='glyphicon glyphicon-search']
//        		    		        
//        		    		        try {
//        		    		                        Thread.sleep(5000);
//        		    		        } catch (InterruptedException e) {
//        		    		                        // TODO Auto-generated catch block
//        		    		                        e.printStackTrace();
//        		    		        }
//        		    		                                                           
        		    		        // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
        		    		       
        		    		        
        		    		        WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
        		    		        tileItemsButton.click();
        		    		        
        		    		        WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
        		    		        addToNewOrder2.click();
        		    				  
        		    		        
        		    		        //ENTER JOB NAME
        		    		        WebElement jobName = driver.findElement(By.id("jobName"));
        		    		jobName.sendKeys("DAL_SO_05_CAS_CR_CC_SH");



        		    		//ENTER CUSTOMER PO#
        		    		WebElement customerPO = driver.findElement(By.id("customerPO"));
        		    		customerPO.sendKeys("DAL_SO_05_CAS_CR_CC_SH");
        		    		//System.out.println(customerPO);                    		  
        		    		                              }

        		    		    //SELECTING SHIP BUTTON
        		    		    WebElement shipButton = driver.findElement(By.xpath("//label[@for='Ship']"));
        		    		    shipButton.click();
        		    		   
        		    		    //SELECTING SHIP TO ADDRESS FROM DROPDOWN BY INDEX
        		    		    WebElement shipToAddress = driver.findElement(By.id("shipToAddresses"));
        		    		    shipToAddress.click();
        		    		    
        		    		    Select selectAddress = new Select (driver.findElement(By.id("shipToAddresses")));
        		    		    selectAddress.selectByValue("1");
        		    		   
        		    		    

        		    		//  
        		    		      /*
        		    		      * WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
        		    		      * dateSelection.sendKeys("10/25/2019");
        		    		      * 
        		    		       */
        		    		    //ENTERING SSC SHIPDATE
        		    		    Format f = new SimpleDateFormat("MM/dd/yyyy");
        		    		String strDate = f.format(new Date());
        		    		    
        		    		    WebElement shipDate = driver.findElement(By.id("shipReqShipDate"));
        		    		    shipDate.sendKeys(strDate);
        		    		    
        		    		    WebElement sscShipDate = driver.findElement(By.id("sscShipDate"));
        		    		    sscShipDate.sendKeys(strDate);
        		    		                   
        		    		    //Freight Terms
        		    		    Select freightTerms = new Select(driver.findElement(By.id("fulfillmentDetails.freightTerms")));
        		    		    freightTerms.selectByVisibleText("Prepaid & Add");
        		    		    
        		    		   //carrier selection
        		    		    WebElement carrierSelection = driver.findElement(By.xpath("//div[@class='inner-addon right-addon']//a[@class='glyphicon glyphicon-search js-carrier-lookup']"));
        		    		    carrierSelection.click();
        		    		    
        		    		    //ENTERING PALLET COUNT
        		    		    WebElement EstPalletCount = driver.findElement(By.id("palletCount"));
        		    		    EstPalletCount.sendKeys("5");
        		    		    
        		    		    //CLICKING ON GET LTL RATING
        		    		    
        		    		    WebElement ltlRating = driver.findElement(By.id("js-tpm-rating"));
        		    		    ltlRating.submit();
        		    		 
        		    		  
        		    		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        		    		    
        		    		    //SELECT CARRIER FROM LIST
        		    		    //Select optionsFromCarrierList = new
        		    		  //  ltlRating.click();
        		    		    WebDriverWait carrier =new WebDriverWait(driver, 40);
        		    		   WebElement ele1 = carrier.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody[@id='tpmRatingList']/tr[1]/td[2]"))));
        		    		    ele1.click();
        		    		    

        		    		   try {
        		    			Thread.sleep(7000);
        		    		} catch (InterruptedException e) {
        		    			// TODO Auto-generated catch block
        		    			e.printStackTrace();
        		    		}
        		    		    

        		    		//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        		    		                              
        		    		////ENTERING CUSTOMER REQ DATE, HARDCODED
        		    		// Format f = new SimpleDateFormat("MM/dd/yyyy");
        		    		// String strDate = f.format(new Date());
        		    		      //            dateSelection.sendKeys(strDate);
        		    		                                               
        		    		//dateSelection.sendKeys("");

        		    		    
        		    		    //CLICKING ON NEXT BUTTON  
        		    		    WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
        		    		    nextButton.click();
        		    		    
        		    		    
        		    		    
        		    		    //CLICKING ON CREATE ORDER BUTTON
        		    		    WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
        		    		    createOrder.click();
        		    		    
        		    		    List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
        		    		    if(myElements.size() > 0) 
        		    		     
        		    		     driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
        		    		    
        		    		    //CAPTURE THE ORDER NUMBER
        		    		    System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
        		    	   }
	    	   
    		    	   
    		    	   
    		    		    public void DAL_SO_06_CAS_CR_CC_PK(){
 		    		    	   
 		    		    	   {
 		    		    	   
 		    		    		 //TO ENTER INVENTORY FIRST ITEM 
 		    		     		  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
 		    		                       searchInventoryButton.sendKeys("D208MB5B1P");
 		    		                       
 		    		                     //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
 		    		                       WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
 		    		                       searchButton.click(); 
 		    		                       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 		    		                       
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
 		    		               firstQuantity.sendKeys("10");
 		    		               
 		    		               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		    		               
 		    		               //CLICK ON ADD TO CART
 		    		               WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
 		    		               addTOCartButton.submit();
 		    		               
 		    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		    		               
 		    		               //CLICK ON ADD MORE ITEMS BUTTON
 		    		               WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
 		    		               addMoreItemsButton.click();
 		    		               
 		    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		    		               
 		    		               //ENTERING SECOND SEARCH ITEM
 		    		               WebElement searchButton2 = driver.findElement(By.name("searchItem"));
 		    		               searchButton2.clear();
 		    		               searchButton2.sendKeys("CH2524481PK");   
 		    		               
 		    		             //TO CLICK ON SEARCH BUTTON 
 		    		               WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
 		    		               searchButton1.click();
 		    		               
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
 		    		               secondQuantity.sendKeys("17");
 		    		               
 		    		               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 		    		               
 		    		             //CLICK ON ADD TO CART
 		    		               WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
 		    		               addTOCartButton2.submit();
 		    		               
 		    		               
 		    		               //CLICK ON VIEW CART
 		    		               WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
 		    		               viewCart.click();
 		    		               
 		    		               

 		    		               
 		    		               //TO ENTER CUSTOMER 
 		    		               WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
 		    		               customerNumber.sendKeys("102528540");
 		    		               customerNumber.sendKeys(Keys.TAB);


 		    		              
// 		    		               WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
// 		    		               searchButton3.click();
// 		    		               //xpath of search button = a[@class='glyphicon glyphicon-search']
// 		    		               
// 		    		               try {
// 		    		                               Thread.sleep(5000);
// 		    		               } catch (InterruptedException e) {
// 		    		                               // TODO Auto-generated catch block
// 		    		                               e.printStackTrace();
// 		    		               }
// 		    		                                                                  
 		    		               // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
 		    		              
 		    		               
 		    		               WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
 		    		               tileItemsButton.click();
 		    		               
 		    		               WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
 		    		               addToNewOrder2.click();
 		    		     		  
 		    		               
 		    		               //ENTER JOB NAME
 		    		               WebElement jobName = driver.findElement(By.id("jobName"));
 		    		jobName.sendKeys("DAL_SO_06_CAS_CR_CC_PK");



 		    		//ENTER CUSTOMER PO#
 		    		WebElement customerPO = driver.findElement(By.id("customerPO"));
 		    		customerPO.sendKeys("DAL_SO_06_CAS_CR_CC_PK");
 		    		//System.out.println(customerPO);

 		    		//SELECT DATE FROM CALENDAR, GETTING CURRENT DATE FROM SYSTEM



 		    		Format f = new SimpleDateFormat("MM/dd/yyyy");
 		    		String strDate = f.format(new Date());
 		    		               WebElement shipDate = driver.findElement(By.id("reqShipDate"));
 		    		               shipDate.sendKeys(strDate);


 		    		               //CLICK ON NEXT BUTTON
 		    		WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
 		    		nextButton.click();


 		    		List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
 		    		if(myElements.size() > 0) 

 		    		driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();


 		    		WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
 		    		createOrder.click();

 		    		//POP UP , CLICK YES
 		    		//   WebElement yesOnPopUp = driver.findElement(By.id("validateOrderYes"));
 		    		//   yesOnPopUp.click();
 		    		//   

 		    		System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());

 		    		    		   
 		    		    		   
 		    		    		   
 		    		       }
    		    		    }
 		    		    	   
 		    		    	  public void DAL_SO_06_CAS_CR_CC_SH() {
 	        		    		    {
 	        		    		                            		  
 	        		    		    	 //TO ENTER INVENTORY ITEM NUMBER
 	        		    				  WebElement searchInventoryButton = driver.findElement(By.id("searchInput"));
 	        		    		                searchInventoryButton.sendKeys("9999600093");               		  
 	        		    		                            		  
 	        		    		                //TO CLICK ON SEARCH BUTTON ON INVENTORY SEARCH PAGE
 	        		    		                WebElement searchButton = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
 	        		    		                searchButton.click(); 
 	        		    		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 	        		    		                
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
 	        		    		        firstQuantity.sendKeys("10");                    		  
 	        		    		        
 	        		    		        
 	        		    		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	        		    		        
 	        		    		        //CLICK ON ADD TO CART
 	        		    		        WebElement addTOCartButton = driver.findElement(By.id("js-add-tile"));
 	        		    		        addTOCartButton.submit();
 	        		    		        
 	        		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	        		    		        
 	        		    		        //CLICK ON ADD MORE ITEMS BUTTON
 	        		    		        WebElement addMoreItemsButton = driver.findElement(By.xpath("//*[contains(text(),'ADD MORE ITEMS')]"));
 	        		    		        addMoreItemsButton.click();
 	        		    		        
 	        		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	        		    		        
 	        		    		        //ENTERING SECOND SEARCH ITEM
 	        		    		        WebElement searchButton2 = driver.findElement(By.name("searchItem"));
 	        		    		        searchButton2.clear();
 	        		    		        searchButton2.sendKeys("M47512121L");   
 	        		    		        
 	        		    		      //TO CLICK ON SEARCH BUTTON 
 	        		    		        WebElement searchButton1 = driver.findElement(By.xpath("//div[@id='mainSearch']//button[@class='btn btn-lightblue'][contains(text(),'SEARCH')]"));
 	        		    		        searchButton1.click();
 	        		    		        
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
 	        		    		        secondQuantity.sendKeys("17");
 	        		    		        
 	        		    		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	        		    		        
 	        		    		      //CLICK ON ADD TO CART
 	        		    		        WebElement addTOCartButton2 = driver.findElement(By.id("js-add-tile"));
 	        		    		        addTOCartButton2.submit();
 	        		    		        
 	        		    		              
 	        		    		        //CLICK ON VIEW CART
 	        		    		        WebElement viewCart = driver.findElement(By.xpath("//*[contains(text(),'VIEW CART')]"));
 	        		    		        viewCart.click();
 	        		    		           

 	        		    		        
 	        		    		        //TO ENTER CUSTOMER 
 	        		    		        WebElement customerNumber = driver.findElement(By.id("js-customer-id-tab"));
 	        		    		        customerNumber.sendKeys("102528540");
 	        		    		       customerNumber.sendKeys(Keys.TAB);


 	        		    		       
// 	        		    		        WebElement searchButton3 = driver.findElement(By.xpath("//a[@class='glyphicon glyphicon-search']"));
// 	        		    		        searchButton3.click();
// 	        		    		        //xpath of search button = a[@class='glyphicon glyphicon-search']
// 	        		    		        
// 	        		    		        try {
// 	        		    		                        Thread.sleep(5000);
// 	        		    		        } catch (InterruptedException e) {
// 	        		    		                        // TODO Auto-generated catch block
// 	        		    		                        e.printStackTrace();
// 	        		    		        }
// 	        		    		                                                           
 	        		    		        // SELECTING ALL TILE ITEMS FROM SHOPPING CART AGAIN
 	        		    		       
 	        		    		        
 	        		    		        WebElement tileItemsButton = driver.findElement(By.xpath("//label[@for='tilecheck']"));
 	        		    		        tileItemsButton.click();
 	        		    		        
 	        		    		        WebElement addToNewOrder2 = driver.findElement(By.xpath("//button[contains(text(),'ADD TO NEW ORDER')]"));
 	        		    		        addToNewOrder2.click();
 	        		    				  
 	        		    		        
 	        		    		        //ENTER JOB NAME
 	        		    		        WebElement jobName = driver.findElement(By.id("jobName"));
 	        		    		jobName.sendKeys("DAL_SO_06_CAS_CR_CC_SH");



 	        		    		//ENTER CUSTOMER PO#
 	        		    		WebElement customerPO = driver.findElement(By.id("customerPO"));
 	        		    		customerPO.sendKeys("DAL_SO_06_CAS_CR_CC_SH");
 	        		    		//System.out.println(customerPO);                    		  
 	        		    		                              }

 	        		    		    //SELECTING SHIP BUTTON
 	        		    		    WebElement shipButton = driver.findElement(By.xpath("//label[@for='Ship']"));
 	        		    		    shipButton.click();
 	        		    		   
 	        		    		    //SELECTING SHIP TO ADDRESS FROM DROPDOWN BY INDEX
 	        		    		    WebElement shipToAddress = driver.findElement(By.id("shipToAddresses"));
 	        		    		    shipToAddress.click();
 	        		    		    
 	        		    		    Select selectAddress = new Select (driver.findElement(By.id("shipToAddresses")));
 	        		    		    selectAddress.selectByValue("1");
 	        		    		   
 	        		    		    

 	        		    		//  
 	        		    		      /*
 	        		    		      * WebElement dateSelection = driver.findElement(By.id("reqShipDate"));
 	        		    		      * dateSelection.sendKeys("10/25/2019");
 	        		    		      * 
 	        		    		       */
 	        		    		    //ENTERING SSC SHIPDATE
 	        		    		    Format f = new SimpleDateFormat("MM/dd/yyyy");
 	        		    		String strDate = f.format(new Date());
 	        		    		    
 	        		    		    WebElement shipDate = driver.findElement(By.id("shipReqShipDate"));
 	        		    		    shipDate.sendKeys(strDate);
 	        		    		    
 	        		    		    WebElement sscShipDate = driver.findElement(By.id("sscShipDate"));
 	        		    		    sscShipDate.sendKeys(strDate);
 	        		    		                   
 	        		    		    //Freight Terms
 	        		    		    Select freightTerms = new Select(driver.findElement(By.id("fulfillmentDetails.freightTerms")));
 	        		    		    freightTerms.selectByVisibleText("Prepaid & Add");
 	        		    		    
 	        		    		   //carrier selection
 	        		    		    WebElement carrierSelection = driver.findElement(By.xpath("//div[@class='inner-addon right-addon']//a[@class='glyphicon glyphicon-search js-carrier-lookup']"));
 	        		    		    carrierSelection.click();
 	        		    		    
 	        		    		    //ENTERING PALLET COUNT
 	        		    		    WebElement EstPalletCount = driver.findElement(By.id("palletCount"));
 	        		    		    EstPalletCount.sendKeys("5");
 	        		    		    
 	        		    		    //CLICKING ON GET LTL RATING
 	        		    		    
 	        		    		    WebElement ltlRating = driver.findElement(By.id("js-tpm-rating"));
 	        		    		    ltlRating.submit();
 	        		    		 
 	        		    		  
 	        		    		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 	        		    		    
 	        		    		    //SELECT CARRIER FROM LIST
 	        		    		    //Select optionsFromCarrierList = new
 	        		    		  //  ltlRating.click();
 	        		    		    WebDriverWait carrier =new WebDriverWait(driver, 40);
 	        		    		   WebElement ele1 = carrier.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@class='table table-striped']//tbody[@id='tpmRatingList']/tr[1]/td[2]"))));
 	        		    		    ele1.click();
 	        		    		    

 	        		    		   try {
 	        		    			Thread.sleep(7000);
 	        		    		} catch (InterruptedException e) {
 	        		    			// TODO Auto-generated catch block
 	        		    			e.printStackTrace();
 	        		    		}
 	        		    		    

 	        		    		//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// 	        		    		                              
 	        		    		////ENTERING CUSTOMER REQ DATE, HARDCODED
 	        		    		// Format f = new SimpleDateFormat("MM/dd/yyyy");
 	        		    		// String strDate = f.format(new Date());
 	        		    		      //            dateSelection.sendKeys(strDate);
 	        		    		                                               
 	        		    		//dateSelection.sendKeys("");

 	        		    		    
 	        		    		    //CLICKING ON NEXT BUTTON  
 	        		    		    WebElement nextButton= driver.findElement(By.id("updateSalesInfo"));
 	        		    		    nextButton.click();
 	        		    		    
 	        		    		    
 	        		    		    
 	        		    		    //CLICKING ON CREATE ORDER BUTTON
 	        		    		    WebElement createOrder= driver.findElement(By.xpath("//button[contains(text(),'CREATE ORDER')]"));
 	        		    		    createOrder.click();
 	        		    		    
 	        		    		    List<WebElement> myElements = driver.findElements(By.xpath("//div[@class='modal-body box-error']"));
 	        		    		    if(myElements.size() > 0) 
 	        		    		     
 	        		    		     driver.findElement(By.xpath("//button[@id='validateOrderYes']")).click();
 	        		    		    
 	        		    		    //CAPTURE THE ORDER NUMBER
 	        		    		    System.out.println("Order created is "+ driver.findElement(By.xpath("//a[@class='collapsed orderno-title salesordernumber']")).getText());
 		    		    	  }
 		    		    	  
}   		    	  
 	        		 

	    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    		    	  
 		    	   	    	   
 		    		             
 		    		        	   	    	   
    		    	   
    		    	   
    		    	   
    		    	   
    		    	   
 		    	   
    		       
    		    
    		    
    		    
    		    
    		    



    	   
    	   
                              
             
                             
     
                
   
                             
                   
                
                              

                
                
                
     

                                                



     




