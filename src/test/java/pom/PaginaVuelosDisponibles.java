package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaginaVuelosDisponibles extends BasePage{

    public PaginaVuelosDisponibles(WebDriver driver){ super(driver); }

    // Objetos.

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


    @FindBy(css = "ol[aria-label='Vuelos disponibles.'] li.cfVFEa")
    List<WebElement> vuelosDisponibles;

    @FindBy(css = "ol[aria-label='Tarifas disponibles.'] li[id*='WrapperBundleCardbundle-detail']")
    List<WebElement> tarifasDisponibles;

    // --- //*[@id='button9']  ---
    @FindBy(xpath = "//*[contains(text(),'Continuar')]")
    WebElement btnContinuar;

    @FindBy(css = "div.MuiDialog-container.MuiDialog-scrollPaper")
    WebElement muiDialog;


    // Metodos

    public void seleccionarOrigen(String texto){
        waitFor(1);
        if(isVisible(cerrarSurvey))
            cerrarSurvey.click();
        inputOrigen.sendKeys(texto);
        waitFor(1);
        primeraSugerencia.click();
    }

    public void seleccionarDestino(String texto){
        waitFor(1);

        inputDestino.click();
        inputDestino.sendKeys(texto);
        waitFor(1);
        primeraSugerencia.click();

        waitFor(5);
    }

    public void elegirFechaIda(int nroDiaDisponible){
        inputFechaIda.click();
        waitFor(1);
        WebElement diaElegido = diasDisponibles.get(nroDiaDisponible-1);
        diaElegido.click();
    }

    public void elegirFechaVuelta(int nroDiaDisponible){
        waitFor(1);
        WebElement diaElegido = diasDisponibles.get((nroDiaDisponible-1));
        diaElegido.click();
    }

    public void realizarBusqueda(){
        btnBuscar.click();
        waitFor(10);
    }

    public void seleccionarVueloMasEconomico(){
        waitFor(5);
        if (vuelosDisponibles.size()==0) {
            waitFor(1);
            vuelosDisponibles = driver.findElements(By.cssSelector("ol[aria-label='Vuelos disponibles.'] li"));
        }
        for (WebElement vuelo :vuelosDisponibles) {
            if(vuelo.getText().contains("Más económico")) {
                System.out.println("Vuelo seleccionado, queda elegir tarifa.");
                waitFor(2);
                vuelo.click();
                break;
            }
        }
        vuelosDisponibles.clear();
        waitFor(1);

    }

    public void seleccionarTarifaLight(){
        waitFor(2);
        if (tarifasDisponibles.size()==0) {
            waitFor(1);
            tarifasDisponibles = driver.findElements(By.cssSelector("ol[aria-label='Tarifas disponibles.'] li[id*='WrapperBundleCardbundle-detail']"));
        }
        for (WebElement tarifa :tarifasDisponibles) {
            if(tarifa.getText().contains("light")) {
                System.out.println("Tarifas seleccionada.");
                tarifa.click();
                break;
            }
        }
        waitFor(1);
    }

    public void clickEnBtnContinuar(){
        waitFor(4);
        btnContinuar.click();
    }

}