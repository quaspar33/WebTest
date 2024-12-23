package com.web.test.tests;

import com.web.test.AbstractTest;
import com.web.test.page.QuestionnaireFirstPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuestionnaireFirstTest extends AbstractTest {
    QuestionnaireFirstPage questionnaireFirstPage;

    @BeforeClass
    @Override
    public void beforeClass() {
        super.beforeClass();
        questionnaireFirstPage = new QuestionnaireFirstPage(driver);
    }

    @Test
    public void questionnaireFirstTest() {
        questionnaireFirstPage.enterQuestionnaire();
        questionnaireFirstPage.enterBirthDate();
        questionnaireFirstPage.enterNationality();
        questionnaireFirstPage.enterPesel();
        questionnaireFirstPage.enterName();
        questionnaireFirstPage.enterSurname();
        questionnaireFirstPage.enterEmail();
        questionnaireFirstPage.enterPhoneNumber();
        questionnaireFirstPage.enterTaxOffice();
        questionnaireFirstPage.enterIban();
        questionnaireFirstPage.enterAddress();
        questionnaireFirstPage.acceptAddress();
        questionnaireFirstPage.nextPage();
    }
}
