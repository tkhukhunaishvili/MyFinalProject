package StepObject;

import Page.SearchPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchSteps extends SearchPage {
     WebDriver driver;
      public  SearchSteps (WebDriver driver2){

          driver = driver2;
      }
      @Step ("ძიების ველში ტექსტის ჩაწერა")
      public void search (String i){

          driver.findElement(searchBox).sendKeys(i);
      }
      @Step ("ძებნა ღილაკზე დაჭერა")
    public void pressEnter() {
        driver.findElement(searchBox).sendKeys(Keys.ENTER);

    }

      }

