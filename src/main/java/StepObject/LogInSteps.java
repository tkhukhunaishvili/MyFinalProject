package StepObject;

import Page.LogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LogInSteps  extends LogInPage {
    WebDriver driver;
    //იმისთვის რომ დრაივერი არ იყოს ცარიელი უნდა გავუწეროთ კონსტრუქტორი(კონსტრუქრორი იგივე მეთოდია რომელსაც ქვია კლასის სახელი
    public LogInSteps(WebDriver driver1){
        driver = driver1;
        //ასევე შეგვიძლია დრაივერს სახელი არ დავარქვათ და გავუწეროთ this.driver
    }
    @Step ("პროფილის ღილაკზე დაჭერა")
    public void profileButton (){

        driver.findElement(profileButton).click();
    }
    @Step("მეილის ჩაწერა")
    public void emailInput (String x){

        driver.findElement(emailField).sendKeys(x);
    }
    @Step("პარილის ჩაწერა")
    public void passwordInput(String y){

        driver.findElement(passwordField).sendKeys(y);
    }
    @Step("დალოგინების ღილაკზე დაჭერა")
    public void logInButton(){

        driver.findElement(logInButton).click();
    }
}

