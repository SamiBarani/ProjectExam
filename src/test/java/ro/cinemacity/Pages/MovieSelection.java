package ro.cinemacity.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MovieSelection extends BasePage {
    public MovieSelection(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/section[3]/section/div[1]/div/div[3]/div[3]/div/div/button/span[1]")


    private WebElement movieSelector;

    public void setMovieSelector(WebElement movieSelector){
            this.movieSelector = movieSelector;
            movieSelector.click();

    }
    @FindBy (xpath = "//button[@title='Alege un film']") private WebElement movieNames;

public void setMovieNames() {
    movieNames.click();
}
    @FindBy(xpath = "/html/body/div[11]/div[2]/div/div/input") private WebElement movieNameSelector;

    public void movieNameSelector(){
       movieNameSelector.click();

    }
}


