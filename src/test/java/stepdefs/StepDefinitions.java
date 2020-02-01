package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pl.com.aay.pageObject.*;

import java.util.List;
import java.util.Map;

public class StepDefinitions {
    WebDriver driver;

    MainPage mainPage;
    SmallMenuPage smallMenuPage;
    MenuPage menuPage;
    LoginPage login;
    ProductPage productPage;
    SummaryProductPage summaryProductPage;
    ContactUsPage contactUsPage;

    @Given("Wchodze na strone glowna")
    public void wchodze_na_strone_glowna() throws Throwable {
        System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
        driver = new FirefoxDriver();

        mainPage = new MainPage(driver);
        login = new LoginPage(driver);
        productPage = new ProductPage(driver);
        summaryProductPage = new SummaryProductPage(driver);
        smallMenuPage = new SmallMenuPage(driver);
        menuPage = new MenuPage(driver);
        contactUsPage =  new ContactUsPage(driver);

        mainPage.openMainPage();
    }

    @Given("^Loguje sie do aplikacji login \\\"([^\\\"]*)\\\", password \\\"([^\\\"]*)\\\"$")
    public void loguje_sie_do_aplikacji(String username, String password) throws Throwable {
        smallMenuPage.openSignIn();
        login.loggin(username, password);
    }

    @When("Klikam w pierwszy produkt")
    public void klikam_w_pierwszy_produkt () throws Throwable {
        mainPage.openMainPage();
        mainPage.clickOnFirstProduct();
    }

    @When("^Podaje ilosc (\\\\d+)$")
    public void podaje_ilosc (int amount) throws Throwable {
        productPage.enterQuantity(amount);
    }

    @When("^Podaje rozmiar \\\"([^\\\"]*)\\\"$")
    public void podaje_rozmiar (String size) throws Throwable {
        productPage.enterSize(size);
    }

    @When("Klikam dodaj do koszyka")
    public void klikam_dodaj_do_koszyka () throws Throwable {
        productPage.clickAdd();
    }

    @When("Potwierdzam dodanie do koszyka")
    public void potwierdzam_dodanie_do_koszyka () throws Throwable {
        productPage.confirm();
    }

    @When("Podsumowanie")
    public void podsumowanie () throws Throwable {
        summaryProductPage.proceedProduct();
    }

    @When("Adres")
    public void adres () throws Throwable {
        summaryProductPage.proceedProduct();
    }

    @When("Wysylka")
    public void wysylka () throws Throwable {
        summaryProductPage.confirmTerms();
        summaryProductPage.proceedProduct();
    }

    @When("Wybieram opcje Contact Us")
    public void wybieram_opcje_contact_us () throws Throwable {
        smallMenuPage.openContactUs();
    }

    @When("^Wpisuje dane do kontaktu$")
    public void wpisuje_dane_do_kontaktu(DataTable dt) throws Throwable {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        contactUsPage.sendEmailToContact(list.get(0).get("temat"),list.get(0).get("email"),list.get(0).get("order"),list.get(0).get("message"));
        // albo
        contactUsPage.sendEmailToContact(dt);
    }

    @When("Wysylam email")
    public void wysylam_email () throws Throwable {
        contactUsPage.sendEmail();
    }

    @When("^Wyszukuje produkt \\\"([^\\\"]*)\\\"$")
    public void wyszukuje_produkt (String kategoriaProduktu) throws Throwable {
        mainPage.searchProduct(kategoriaProduktu);
    }

    // nowy page object
    // generyczna metoda do wyszukiwania objektów po cenie i nazwie
    // xpath cena: "//div[@id='best-sellers_block_right']/descendant::span[contains(text(),'16.40')]/ancestor::li/a"
    // xpath nazwa "//div[@id='best-sellers_block_right']/descendant::a[contains(text(),'Printed Chiffon Dress')]/ancestor::li/a"
    // Skorzystać z findBys
    @When("^Wyszukuje produkt po \\\"([^\\\"]*)\\\" \\\"([^\\\"]*)\\\" $")
    public void wyszukuje_produkt_po (String nazwa, String cena) throws Throwable {

    }

    // Pola z recenzji dodać jako okno modalne w ProductPage
    @When("Dodaje recenzje")
    public void dodaje_recenzje () throws Throwable {

    }

    // Dopisać generyczną metoda wybierającą konkretną wartość w menu
    @When("Wybieram z menu opcje \\\"([^\\\"]*)\\\"")
    public void wybieram_z_menu_opcje (String option) throws Throwable {

    }

    // Zrobić jeden główny PageObject SeachPage i 3 obiekty dziedziczące WomenSearchPage, DressesSearchPage, TShirtShearchPage
    // Zrobić metody generyczne do wyszukiwania produktu po atrybutach takich jakie są w data table
    // Przykładowy xpath:
    //  (//span[contains(text(),'Size')]/ancestor::div[@class='layered_filter']/descendant::a[contains(text(),'S')]/parent::label/parent::li/descendant::input)[1]
    // Skorzystać z Set keyset = newmap.keySet();
    @When("Wyszukuje produkt po atrybutach")
    public void wyszukuje_produkt_po_atrybutach () throws Throwable {

    }

    @Then("Platnosc")
    public void platnosc() throws Throwable {
        summaryProductPage.pay();
    }

    @Then("Sprawdzam komunikat")
    public void sprawdzam_komunikat_wyslania_emaila () throws Throwable {
         Assert.assertEquals(contactUsPage.getAlert(),"Your message has been successfully sent to our team.");
    }

    // Sprawdzam komunikat "Your comment has been added and will be available once approved by a moderator"
    // Kliam OK
    @Then("Potwierdzam recenzje")
    public void potwierdzam_recenzje () throws Throwable {

    }

}
