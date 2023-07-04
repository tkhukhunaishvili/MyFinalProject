import StepObject.LogInSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static Data.LogInData.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;

public class LogIn extends ChromeRunner {

    @Test
    @Description("ეს ტესტი ასრულებს სისტემაში მცდარი მონაცემებით დალოგინებას")
    @Severity(SeverityLevel.MINOR)
    public void logInWithIncorrectData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        LogInSteps step1 = new LogInSteps(driver);
        step1.profileButton();
        step1.emailInput(incorrectEmail);
        step1.passwordInput(incorrectPassword);
        step1.logInButton();

       /* WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"/html/body/div[7]/header/div[4]/div[2]/div[3]/div[4]/div[1]/span[1]"))); */


        Thread.sleep(4000);
        driver.close();
    }

    @Test
    @Description ("ეს ტესტი ასრულებს არასწორი მონაცემებით დალოგინებას")
    @Severity(SeverityLevel.NORMAL)
    public void LogInWithIncorrectData1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        LogInSteps step2 = new LogInSteps(driver);
        step2.profileButton();
        step2.emailInput(correctEmail);
        step2.passwordInput(incorrectEmail);
        step2.logInButton();

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "FinalProject1430@gmail.com";
        softAssert.assertEquals(expectedResult, "first@gmail.com");

        Thread.sleep(4000);
        driver.close();
    }

    @Test
    @Description ("ეს ტესტი ასრულებს მცდარი მონაცემებით დალოგინებას")
    public void LogInWithIncorrectData5() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        LogInSteps step3 = new LogInSteps(driver);
        step3.profileButton();
        step3.emailInput(incorrectEmail);
        step3.passwordInput(correctEmail);
        step3.logInButton();

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "FinalProject1430@gmail.com";
        softAssert.assertEquals(expectedResult, "first@gmail.com");

        Thread.sleep(4000);
        driver.close();
    }

    @Test
    @Description ("დალოგინება არსწორი მონაცემებით")
    public void LogInWithIncorrectData0() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        LogInSteps step4 = new LogInSteps(driver);
        step4.profileButton();
        step4.emailInput(incorrectEmail);
        step4.passwordInput(emptyPassword);
        step4.logInButton();

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "1430@gmail.com";
        softAssert.assertEquals(expectedResult, "first@gmail.com");

        Thread.sleep(4000);
        driver.close();
    }

    @Test
    @Description ("დალოგინება ცარიელი მონაცემებით")
    @Severity(SeverityLevel.NORMAL)
    public void LogInWithEmptyData9() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        LogInSteps step5 = new LogInSteps(driver);
        step5.profileButton();
        step5.emailInput(emptyEmail);
        step5.passwordInput(emptyPassword);
        step5.logInButton();

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "";
        softAssert.assertEquals(expectedResult, "123@gmail.com");

        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void LogInWithCorrectData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zoommer.ge/");

        LogInSteps step8 = new LogInSteps(driver);
        step8.profileButton();
        step8.emailInput(correctEmail);
        step8.passwordInput(correctPassword);
        step8.logInButton();

        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "FinalProject1430@gmail.com";
        softAssert.assertEquals(expectedResult, "first@gmail.com");

        Thread.sleep(4000);
        driver.close();
    }
}