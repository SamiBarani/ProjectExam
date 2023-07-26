package ro.cinemacity.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ro.cinemacity.Pages.MovieSelection;

import static ro.cinemacity.Pages.BasePage.MovieSelect_Url;

public class MovieSelectionTest extends BaseTest{
    @Test
    public void movieSelectionTest(){
        driver.get(MovieSelect_Url);
        waitForNumberOfSeconds(2);
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        waitForNumberOfSeconds(2);
        MovieSelection movieSelection = new MovieSelection(driver);
        movieSelection.setMovieNames();
        waitForNumberOfSeconds(3);
        movieSelection.movieNameSelector();
        waitForNumberOfSeconds(3);





    }



}
