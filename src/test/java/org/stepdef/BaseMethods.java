package org.stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {
	public static WebDriver driver;

	//browser launch
	public static void getUrl(String browser,String url) {
		switch (browser){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			break;
		}

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}

	
	//to enter the text in the Fields
	public  void typeText(WebElement txt, String data) {
		txt.sendKeys(data);
	}

	public WebElement locatorId(String id) {
		return driver.findElement(By.id(id));

	}

	public WebElement locatorName(String name) {
		return driver.findElement(By.name(name));

	}

	public WebElement locatorXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));

	}

	public WebElement locatorTagName(String tn) {
		return driver.findElement(By.tagName(tn));

	}

	public WebElement locatorLinkText(String text) {
		return driver.findElement(By.linkText(text));
	}

	public WebElement partialLinkText(String pText) {
		return driver.findElement(By.partialLinkText(pText));
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public void hovering(WebElement hover) {
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
	}

	public void rightClick(WebElement rc) {
		Actions a = new Actions(driver);
		a.contextClick(rc).perform();
	}

	public void doubleClick(WebElement dc) {
		Actions a = new Actions(driver);
		a.doubleClick(dc).perform();
	}

	public void mouseClick(WebElement mc) {
		Actions a = new Actions(driver);
		a.click(mc).perform();
	}

	
	//to click the button
	public void click(WebElement click) {
		click.click();
	}

	public List<WebElement> allElements(String xpath) {
		return driver.findElements(By.xpath(xpath));
	}

	
	//to get the message displayed or static text
	public String getText(WebElement text) {
		return text.getText();
	}

	
	//to get the value displayed or dynamic text
	public String getAttribute(WebElement text, String type) {
	
		return text.getAttribute(type);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String currentUrl() {
		return driver.getCurrentUrl();
	}

	public List<WebElement> allElementsId(String id) {
		return driver.findElements(By.id(id));
	}

	public List<WebElement> allElementsName(String name) {
		return driver.findElements(By.id(name));
	}

	public List<WebElement> allElementsTagName(String tn) {
		return driver.findElements(By.id(tn));
	}

	public void scrollDown(WebElement txt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView(true)", txt);
	}

	public void scrollUp(WebElement txt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView(false)", txt);
	}

	public Alert alert() {
		return driver.switchTo().alert();
	}

	public File screenShot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.FILE);
	}

	public void frame(int index) {
		driver.switchTo().frame(index);
	}

	public void frame(String Id) {
		driver.switchTo().frame(Id);
	}

	public void frame(WebElement txt) {
		driver.switchTo().frame(txt);
	}

	public void dropValue(WebElement txt, String value) {
		Select s = new Select(txt);
		s.selectByValue(value);
	}
	
	
	
	//dropdown-selectByVisibleText,to select the listed options
	public void dropText(WebElement txt, String text) {
		Select s = new Select(txt);
		s.selectByVisibleText(text);
	}

	public List<WebElement> dropOptions(WebElement txt) {
		Select s = new Select(txt);
		return s.getOptions();
	}

	public List<WebElement> dropSelectedOptions(WebElement txt) {
		Select s = new Select(txt);
		return s.getAllSelectedOptions();
	}

	public WebElement dropFirstSelected(WebElement txt) {
		Select s = new Select(txt);
		return s.getFirstSelectedOption();
	}

	public boolean isMultiple(WebElement txt) {
		Select s = new Select(txt);
		return s.isMultiple();
	}

	public void dropDeSelect(WebElement txt, String type, int index) {
		Select s = new Select(txt);
		switch (type) {
		case "index":
			s.deselectByIndex(index);
			break;
		case "all":
			s.deselectAll();
		default:
			break;
		}
	}

	public String TabName() {
		return driver.getWindowHandle();
	}

	public Set<String> allTab() {
		return driver.getWindowHandles();
	}

	public void navigate(String how) {
		switch (how) {
		case "back":
			driver.navigate().back();
			break;
		case "front":
			driver.navigate().forward();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;
		default:
			break;
		}
	}

	public void navigateUrl(String url) {
		driver.navigate().to(url);
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void setPosition(int a, int b) {
		Point p = new Point(a, b);
		driver.manage().window().setPosition(p);
	}

	public static void waits(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public Sheet getSheet(String path, String sheetName) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(stream);
		return workbook.getSheet(sheetName);
	}

	public Sheet createSheet(String path, String sheetName) throws IOException {
		File f = new File(path);
		FileInputStream stream = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(stream);
		return workbook.createSheet(sheetName);
	}

	public void fileCopy(String path, File srcFile) throws IOException {
		File f = new File(path);
		FileUtils.copyFile(srcFile, f);
	}

	public void fileWrite(String path, Workbook workbook) throws IOException {
		File f = new File(path);
		FileOutputStream stream2 = new FileOutputStream(f);
		workbook.write(stream2);
	}

	public static String getDataFromExcel(int rowNo, int cellNo) throws IOException {
		File file = new File("C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\BaseClass\\TestData\\TestD.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Adactin");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		CellType cellType = cell.getCellType();
		String value = null;
		switch (cellType) {
		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				value = format.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}

		default:
			break;

		}
		return value;
	}

	public static void getCellInExcel(int rowNo, int cellNo,String at) throws IOException {
		File file = new File("C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\BaseClass\\TestData\\TestD.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Employee");
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(at);
		FileOutputStream stream2 = new FileOutputStream(file);
		workbook.write(stream2);
		
	}
	public void clear(WebElement ref) {
		ref.clear();
	}

	public static Properties getDataFromProperty() throws IOException {
		
		File file =  new File("C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\BaseClass\\src\\test\\resources\\config.properties");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		return properties;
	}

	public static String getKeyFromPro(String key) throws IOException {
		String string = getDataFromProperty().get(key).toString();
		return string;
	}
	
	
	
	
	
	
	
	
	
	}

