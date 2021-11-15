package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.PracticaService;

public class LoginSteps extends PageSteps {

    @Given("estoy en la pantalla de Login")
    public void estoyEnLaPantallaDeLogin() {
        PracticaService.navegarWeb();
    }

    @When("ingreso mi email (.*) y password(.*)")
    public void ingresoMiUsuarioyPassword(String email, String password) {
        PracticaService.setEmail(email);
        PracticaService.setPassword(password);
        PracticaService.clickSignIn();
    }

    @Then("ingreso a My Account")
    public void ingresoAMyAccount() {
    }
}