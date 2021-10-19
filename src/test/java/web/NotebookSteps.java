package web;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class NotebookSteps extends  Base{

  Base base;
  public NotebookSteps(Base base) {
    this.base = base;

  }

    @Given("^que acesso o site do mercado livre$")
    public void queAcessoOSiteDoMercadoLivre() {
      base.driver.get(base.url);

    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String arg0)  {
    base.driver.findElement(By.name("as_word")).sendKeys("notebook");

    }

    @And("^clico na lupa$")
    public void clicoNaLupa() {
    base.driver.findElement(By.className("nav-icon-search")).click();


    }

    @Then("^retorna lista de \"([^\"]*)\" como resultado$")
    public void retornaListaDeComoResultado(String arg0)  {
    assertEquals(arg0,base.driver.findElement(By.className("ui-search-breadcrumb__title")).getText());
    }
}
