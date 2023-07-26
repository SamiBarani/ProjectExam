package ro.cinemacity.Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ro.cinemacity.Pages.CinemaLocationSelection;

import static ro.cinemacity.Pages.BasePage.BASE_URL;

public class CinemaLocationSelectionTest extends BaseTest{
    @Test
    public void CinemaLocationTest(){
       //Driver = imi deschide UrL - UL SI WAIT e pentru accesul pe pagina web si asteptare
        driver.get(BASE_URL);
        waitForNumberOfSeconds(2);

        //cod pentru cookies
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        waitForNumberOfSeconds(2);

        //am facut codul in CinemaLocationSelect si aici doar il activez/chem
        CinemaLocationSelection cinemaLocationSelection = new CinemaLocationSelection(driver);
        cinemaLocationSelection.pickCinemaLocation();
        waitForNumberOfSeconds(3);
        // acum codul in care selectez orasul Cluj
        cinemaLocationSelection.cityName();
        waitForNumberOfSeconds(3);
        //Accesare locatie selectata din pagina
        cinemaLocationSelection.cityShowLocation();
        waitForNumberOfSeconds(3);
        //Scrolare pe pagiona
        scrollDown50();scrollDown100();scrollDown200();scrollDown250();scrollDown350();scrollDown450();scrollDown600();
        waitForNumberOfSeconds(3);
        scrollUp600();
        waitForNumberOfSeconds(5);
// Apelez verificarea si apelez emelenntul
cinemaLocationSelection.citySuccessfullySelected();
    }
}
