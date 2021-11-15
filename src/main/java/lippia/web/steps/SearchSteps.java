package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.SearchService;
import lippia.web.services.PracticaService;


public class SearchSteps extends PageSteps {

    @Given("el usuario esta en la pagina principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        PracticaService.navegarWeb();
    }

    @When("el usuario busca el articulo (.*)")
    public void elUsuarioIngresaElProductoQueDeseaBuscar(String criteria) {
        SearchService.buscarPalabraClave(criteria);
        SearchService.clickButtonSearch();
    }
    @Then("el usuario verifica que se ensena la pagina de busqueda")
    public void elUsuarioVerificaQueSeEnsenaLaPaginaDeBusqueda() {
        SearchService.verificarSearchPage();
    }

    @And("selecciona el filtro (.*)")
        public void seleccionaElFiltroFiltro(String filtro) {
            SearchService.filtrarArticulos(filtro);
        }

    @Then("los articulos se ordenan correctamente")
    public void losArticulosSeOrdenanCorrectamente() {
        SearchService.verificarPaginaOrdenada();
    }
}
