package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PaginaSeleccionMaletas extends BasePage{

    public PaginaSeleccionMaletas(WebDriver driver){ super(driver); }

    // Objetos.
    @FindBy(xpath = "(//*[contains(@aria-label,'Eliminar')]) [1]")
    WebElement eliminarMaleta15kg;

    @FindBy(css = "button[id*='add-15']")
    WebElement agregarMaleta15kg;

    @FindBy(xpath = "(//*[contains(@aria-label,'Eliminar')]) [2]")
    WebElement eliminarMaleta32kg;

    @FindBy(xpath = "//*[contains(@aria-label,'Agregar')] ")
    WebElement agregarMaleta32kg;

    @FindBy(xpath = "//*[contains(text(),'Continuar')]")
    WebElement btnContinuar;


    // Metodos

    public void eliminarMaleta15kg(int cantidadMaletas) {
        try {
            waitFor(1);
            for (int i = 0; i < cantidadMaletas; i++)
                eliminarMaleta15kg.click();
        } catch (NoSuchElementException e) {
            waitFor(5);
            for (int i = 0; i < cantidadMaletas; i++)
                eliminarMaleta15kg.click();
        }
    }

    public void agregarMaleta15kg(int cantidadMaletas){
        try {
            waitFor(1);
            for (int i = 0; i < cantidadMaletas; i++)
                agregarMaleta15kg.click();
        } catch (NoSuchElementException e) {
            waitFor(5);
            for (int i = 0; i < cantidadMaletas; i++)
                agregarMaleta15kg.click();
        }
    }

    public void eliminarMaleta32kg(int cantidadMaletas){
        try {
            waitFor(1);
            for (int i = 0; i < cantidadMaletas; i++)
                eliminarMaleta32kg.click();
        } catch (NoSuchElementException e) {
            waitFor(5);
            for (int i = 0; i < cantidadMaletas; i++)
                eliminarMaleta32kg.click();
        }
    }
    public void agregarMaleta32kg(int cantidadMaletas){
        try {
            waitFor(1);
            for (int i = 0; i < cantidadMaletas; i++)
                agregarMaleta32kg.click();
        } catch (NoSuchElementException e) {
            waitFor(5);
            for (int i = 0; i < cantidadMaletas; i++)
                agregarMaleta32kg.click();
        }
    }

    public void clickContinuar(){
        waitFor(1);
        btnContinuar.click();

    }

}