package ro.cinemacity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
   public static String BASE_URL = "https://www.cinemacity.ro/#/";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public static String MovieSelect_Url="https://www.cinemacity.ro/cinemas/cluj-iulius-mall/1803#/buy-tickets-by-cinema?in-cinema=1803&at=2023-07-26&view-mode=list";


}