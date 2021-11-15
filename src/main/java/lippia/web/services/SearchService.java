package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Then;
import lippia.web.constants.PracticaConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SearchService extends ActionManager {

    public static void buscarPalabraClave(String criteria) {
        setInput(PracticaConstants.INPUT_SEARCH_XPATH, criteria);
    }
    public static void clickButtonSearch() {
        click(PracticaConstants.BUTTON_SEARCH_XPATH);
    }

    public static void verificarSearchPage(){
        Assert.assertTrue(isVisible(PracticaConstants.H1_TITULO_XPATH));
    }

    public static void filtrarArticulos(String filtro){
        waitVisibility(PracticaConstants.LIST_SEARCH_XPATH);
        Select filter = new Select(getElement(PracticaConstants.SELECT_SORTBY_XPATH));
        filter.selectByVisibleText(filtro);
//setDrop... ver si solo funciona con el tipo de locator select
    }
    public static void verificarPaginaOrdenada(){

        List<WebElement> listaPrecios = getElements(PracticaConstants.PRECIOS_XPATH);
        List<Double> priceAux = new ArrayList<>();
        for (int i = 0; i < listaPrecios.size(); i++) {
            String numberStr = listaPrecios.get(i).getText().substring(1);
            double aux = Double.parseDouble(numberStr);
            priceAux.add(i,aux);
        }
        for (int i = 0; i < listaPrecios.size() - 1 ; i++) {
            Assert.assertTrue(priceAux.get(i) < priceAux.get(i + 1), "Los elementos no se encuentran en el orden correcto");
        }
    }
}

