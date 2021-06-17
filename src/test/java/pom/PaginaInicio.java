package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.sun.activation.registries.LogSupport.log;

public class PaginaInicio extends BasePage{

    public PaginaInicio(WebDriver driver){ super(driver); }

    // Objetos.
    String url = "https://www.latamairlines.com/cl/es";

    @FindBy(css = "input[id='txtInputOrigin_field']")
    WebElement inputOrigen;

    @FindBy(css = "input[id='txtInputDestination_field']")
    WebElement inputDestino;

    @FindBy(css = "div[id='booking-box'] li")
    WebElement primeraSugerencia;

    @FindBy(css = "input[id='departureDate']")
    WebElement inputFechaIda;

    @FindBy(css = "input[id='arrivalDate']") // Cuando sea  necesario.
    WebElement inputFechaVuelta;

    @FindBy(css = "td[aria-disabled='false']")
    List<WebElement> diasDisponibles;

    @FindBy(css = "button[id='btnSearchCTA']")
    WebElement btnBuscar;

    @FindBy(css = "div[aria-label='Survey'] button")
    WebElement cerrarSurvey;

    @FindBy(css = "button[id*='btnTripTypeCTA']")
    WebElement opcionTipoDeViaje;

    // Metodos

    public void inicio(){
        driver.get(url);
        waitFor(7);
    }

    public void seleccionarVueloSoloIda(){
        waitFor(2);
        opcionTipoDeViaje.click();
        waitFor(1);
        // *-***** button[id*='btnTripType0']
        driver.findElement(By.xpath("//span[contains(text(),'Solo ida')] [1]")).click();
    }

    public void seleccionarOrigen(String texto){
        waitFor(1);
        inputDestino.click();
        waitFor(1);
        inputOrigen.click();
        waitFor(4);
        inputOrigen.sendKeys(texto);
        if (isVisible(cerrarSurvey))
            cerrarSurvey.click();
        waitFor(1);
        primeraSugerencia.click();
    }

    public void seleccionarDestino(String texto){
        inputDestino.click();
        waitFor(1);
        inputDestino.sendKeys(texto);
        waitFor(1);
        primeraSugerencia.click();

    }

    public void elegirFechaIda(int nroDiaDisponible){
        waitFor(1);
        inputFechaIda.click();
        waitFor(1);
        if(diasDisponibles.size()==0)
            driver.findElements(By.cssSelector("td[aria-disabled='false']"));
        WebElement diaElegido = diasDisponibles.get(nroDiaDisponible-1);
        diaElegido.click();
    }

    public void elegirFechaVuelta(int nroDiaDisponible){
        waitFor(2);
        WebElement diaElegido = diasDisponibles.get((nroDiaDisponible-1));
        diaElegido.click();
    }

    public void realizarBusqueda(){
        btnBuscar.click();
    }


}