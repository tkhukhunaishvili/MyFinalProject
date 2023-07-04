import StepObject.SearchSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Data.SearchData.*;

public class SearchTest {
    @Test

    public void searchWithEmptyKeyword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        SearchSteps step01 = new SearchSteps(driver);
        step01.search(emptyKeyword);
        step01.pressEnter();

        Thread.sleep(5000);
        driver.close();


    }

    @Test

    public void searchWithInvalidKeyword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        SearchSteps step01 = new SearchSteps(driver);
        step01.search(invalidKeyword);
        step01.pressEnter();

        SoftAssert softAssert = new SoftAssert();
        String actualTitle =driver.getTitle();
        String expectedTitle = "მოიძებნა 0 პროდუქტი";
        softAssert.assertEquals(actualTitle,expectedTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println(" ძიების შედეგი სწორია");
        } else {
            System.out.println(" ძიების შედეგი არასწორია");
        }

        Thread.sleep(5000);
        driver.close();
    }

    @Test

    public void searchWithValidKeyword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        SearchSteps step01 = new SearchSteps(driver);
        step01.search(validKeyword);
        step01.pressEnter();
        Thread.sleep(5000);
        driver.close();
    }

    @Test

    public void searchWithValidKeyword2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        SearchSteps step01 = new SearchSteps(driver);
        step01.search(validKeyword);
        step01.pressEnter();



        Thread.sleep(5000);
        driver.close();
    }
}

