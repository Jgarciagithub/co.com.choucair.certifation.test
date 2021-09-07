package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.TestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Enterdata;
import tasks.JoinToday;
import tasks.OpenUp;

import java.util.List;

public class ChoucairTestStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants register in page web Utes$")
    public void thanBrandonWantsRegisterInPpageWebUtes(List<TestData> testData) throws Exception {
        OnStage.theActorCalled( "Brandon").wasAbleTo(OpenUp.thePage(),(JoinToday.clicbuttonjointoday()));
    }

    @When("^he complete the text boxs in the platform$")
    public void heCompletetheTextboxsinThePlatform(List<TestData>testData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Enterdata.the(testData.get(0).getName(),testData.get(0).getLastname(),
                testData.get(0).getEmailaddress(),testData.get(0).getMonth(),testData.get(0).getDay(), testData.get(0).getYear(),testData.get(0).getCreatedPassword()));

    }

    @Then("^he finds the button complete setup$")
    public void heFindstheButtonCompleteSetup(List<TestData>testData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(testData.get(0).getName(), testData.get(0).getLastname()
        ,testData.get(0).getEmailaddress(),testData.get(0).getMonth(),testData.get(0).getDay(), testData.get(0).getYear(),testData.get(0).getCreatedPassword())));
    }
}
