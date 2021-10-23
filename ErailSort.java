package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 //MAXIMISE WINDOW
		 driver.manage().window().maximize();
		 driver.get("https://erail.in/");
		 Thread.sleep(3000);
		 driver.findElement(By.id("chkSelectDateOnly")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("txtStationFrom")).clear();
		 driver.findElement(By.id("txtStationFrom")).sendKeys("New Delhi",Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.id("txtStationTo")).clear();
		 driver.findElement(By.id("txtStationTo")).sendKeys("Salem Jn",Keys.ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.id("buttonFromTo")).click();
		 List<WebElement> trainNameList = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td/following-sibling::td[@style=';']"));	
			int trainCount = trainNameList.size();
			System.out.println("Total trains from Delhi to Salem are " +trainCount);
			List<String> trainName = new ArrayList<String>();
			for (WebElement eachTrain : trainNameList) {
				System.out.println(eachTrain.getText());
				String trainNameEach = eachTrain.getText();
				trainName.add(trainNameEach);
			}
			Collections.sort(trainName);
			System.out.println("Train Name List in Ascending order");
			for (String eachTrain : trainName) {
				System.out.println(eachTrain);
		
	}

}
}
