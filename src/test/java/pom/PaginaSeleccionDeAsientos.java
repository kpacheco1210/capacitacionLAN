package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PaginaSeleccionDeAsientos extends BasePage{

    public PaginaSeleccionDeAsientos(WebDriver driver){ super(driver); }

    // Objetos.

    @FindBy(xpath = "//div[contains(@class,'deBhoE')][button]")
    List<WebElement> asientosDisponibles;

    @FindBy(xpath = "//*[@id='ListCard-0']")
    WebElement unAdultoAsiento;

    @FindBy(xpath = "//*[contains(text(),'Siguiente vuelo')]")
    WebElement btnAsientoSigVuelo;

    @FindBy(xpath = "//*[contains(text(),'Confirmar')]")
    WebElement btnConfirmar;

    @FindBy(xpath = "//*[contains(text(),'Continuar')]")
    WebElement btnContinuar;

    @FindBy(xpath = "//*[contains(text(),'Eliminar o cambiar asiento')]")
    WebElement eliminarAsiento;

    //button[data-zone='FRONT_SEATS']

    // Metodos

    public void elegirAsiento(){
        waitFor(8);
        String tipoDeAsiento = "Ventana";

        System.out.println(asientosDisponibles.size());
        if (asientosDisponibles.size()==0) {
            waitFor(1);
            asientosDisponibles = driver.findElements(By.xpath("//div[contains(@class,'deBhoE')][button]"));
        }
       // System.out.println("Muestro cantidad de asientos: " + asientosDisponibles.size());
        waitFor(5);
        for (WebElement asiento :asientosDisponibles) {
            asiento.click();
            String textoAsiento = asiento.getText();
        //    System.out.println("El texto muestra esto" + textoAsiento);
            System.out.println("***");
            if (textoAsiento.contains(tipoDeAsiento)){
        //        System.out.println("Encontre asiento, le hago click.");
                eliminarAsiento.click();
                waitFor(1);
                asiento.click();
                break;
            }
        }
        asientosDisponibles.clear();
    }

    public void clickAsientoSiguienteVuelo(){
        waitFor(2);
        btnAsientoSigVuelo.click();
    }
    public void clickConfirmar() {
        waitFor(2);
        btnConfirmar.click();

        waitFor(2);
        if (driver.findElements(By.cssSelector("li[data-testid*='bundle']")).size() > 0)
            btnContinuar.click();

        waitFor(2);
    }




}