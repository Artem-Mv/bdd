package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {

    private SelenideElement amount = $("[data-test-id='amount']");

    public TransferPage() {
        amount.shouldBe(visible);
    }

    public DashboardPage transferMoneyFromCard2ToCard1(int sum, String numberCard2) {
        $("[data-test-id='amount'] input").setValue(String.valueOf(sum));
        $("[data-test-id='from'] input").setValue(numberCard2);
        $("[class='button__text']").click();

        return new DashboardPage();
    }
}