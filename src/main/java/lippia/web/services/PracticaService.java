package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticaConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.Collections;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class PracticaService extends ActionManager {

    public static void navegarWeb(){
        WebActionManager.navigateTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public static void setEmail(String email){ setInput(PracticaConstants.INPUT_EMAIL_CSS, email);    }

    public static void setPassword(String password){
        setInput(PracticaConstants.INPUT_PASSWORD_CSS, password);
    }

    public static void clickSignIn(){
        click(PracticaConstants.BUTTON_SIGNIN_CSS);
    }
}