package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/Lan/test.feature",
        glue = "seleniumcode",
        tags = {"@PrimerTest,@SegundoTest"},
        plugin = {"json:test/report/cucumber_report.json"}
)

public class testrunner {

    @AfterClass
    public static void tearDown(){
        try {
            System.out.println("Generando reporte.");
            String [] cmd = {"cmd.exe","/C","npm run report"};

            Runtime.getRuntime().exec(cmd);
        }catch (Exception ex){
            System.out.println("Reporte no se pudo generar.");
            ex.printStackTrace();
        }
    }
}

// Orquesta las pruebas. Es el rey



