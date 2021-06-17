package resources;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Testing {
    public WebDriver driver;
    private Output output;
    private URL address;
    private Class page;
    private String scriptName;
    private String brandName;
    private Database db;
    private TestData td;
    private BrowserFactory bf;
    private WebFunctions webFunctions;
    private Logger logger;
    private Reporter reporter;

    //	CONSTRUCTOR
    public Testing(String environment, String brandName, String scriptName, String dataScriptName) {

//		1. INITIALIZING ATTRIBUTES:
        db = new Database();
        td = new TestData(db, brandName, scriptName);
        reporter = new Reporter(brandName, scriptName);
        output = new Output(db, brandName, environment, dataScriptName);
        webFunctions = new WebFunctions();
        address = new URL(brandName);
        this.brandName = brandName;
        logger = Logger.getLogger(brandName+"-"+scriptName);

//		2. INITIALIZING DRIVER
        String url = address.getURL(environment);
        System.out.println("-------LAUNCHING-----" + url);
        String browser = "Google Chrome";
        bf = new BrowserFactory(browser, url);
        driver = bf.driver;

//		3. INITIALING CURRENT PAGE
        page = null;
        reporter.info("Executing Test on: "+url);

    }

//	---------------------------------------------------------------------

    //	GETTERs and SETTERs FOR PAGE:
    public Class getPage() {
        return page;
    }

    public void setPage(Class page) {
        this.page = page;
    }

    //	---------------------------------------------------------------------
//	TEAR DOWN FOR TESTCASE:
    public void tearDown() {
        bf.closeBrowser();
//        db.insertRecordInDatabase(scriptName, "Elephant");
        //logger.info(output.getOutputs());
        reporter.flush();
    }

    //	---------------------------------------------------------------------
//	GETTERs and SETTERs FOR OUTPUT JSON:
    public String getOutput(String key) {
        return output.getOutput(key);
    }
    
    public void setOutput(String key, String value) {
        this.output.setOutput(key, value);
    }

    //	---------------------------------------------------------------------
    public String getBrandName(){
        return brandName;
    }
    //	---------------------------------------------------------------------
    public WebFunctions webFunctions() {
        return webFunctions;
    }

    //	---------------------------------------------------------------------
//    public Database db() {
//        return db;
//    }
    //	---------------------------------------------------------------------
    public String getTestData(String key) {
        return td.getTestData(key);
    }

    public String getDate(int offSet) {
        return td.getDate(offSet);
    }
    
    public String getDate(String effectiveDate) {
        return td.addDaystoDate(effectiveDate);
    }
    
    public String getLessDate(String effectiveDate){
    	return td.lessDaystoDate(effectiveDate);
    }

    public String getRandomString(int length) {
        return td.createRandomString(length);
    }
//	---------------------------------------------------------------------
    public Reporter getLogger() {
        return reporter;
    }
        
    public void markPassed() {
        reporter.pass("Test case is successful!");
        String result = output.getOutputs().toString()
        		.replace("{","")
        		.replaceAll(","," | ")
        		.replaceAll("\"", "")
        		.replace("}", "");
        reporter.info(result);
       }

    public void markFailed(String message) {
    	reporter.fail("Test case has failed!");
    	reporter.fail(message);
    }
    
    public void markTestDataUsed() {
    	int row = db.markOutputUsed();
    	if(row == 1)
    	reporter.info("Test data marked as Used");
    	else 
    		if (row == 0)
    			reporter.info("Unable to mark Test Data as Used.");
    	}
 }