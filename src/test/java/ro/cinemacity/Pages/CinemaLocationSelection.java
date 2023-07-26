package ro.cinemacity.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.net.URL;

public class CinemaLocationSelection extends BasePage {
    public CinemaLocationSelection(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[2]/nav/div/ul/li[1]/div/a") private WebElement locationCheck;
    public void pickCinemaLocation(){
        locationCheck.click();
      // asta de jos e un Enter
    }
    @FindBy(xpath ="/html/body/div[15]/div/div/div/div[2]/div[3]/div[1]/div/div/div" ) private WebElement cityLocation;
    public void cityName(){
        cityLocation.click();


    }
    @FindBy (xpath = "/html/body/div[15]/div/div/div/div[2]/div[3]/div[2]/div[2]/a/div[1]/div") private WebElement cityLocationShown;

    public void cityShowLocation(){
        cityLocationShown.click();

    }

    @FindBy (xpath = "/html/body/section[3]/section/div[1]/div/div[1]/div/h2") private WebElement verifyCitySelection;
    public boolean citySuccessfullySelected(){
        return verifyCitySelection.getText().contains("Program pentru Cluj Iulius Mall");

    }
}

