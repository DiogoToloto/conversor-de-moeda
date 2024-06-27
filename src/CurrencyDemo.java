import java.util.Currency;
import java.util.Locale;
import java.util.Set;
import java.text.NumberFormat;

public class CurrencyDemo {

    public static void main(String[] args) {
        // Obter informações de uma moeda específica
        getCurrencyInfo("USD");

        // Listar todas as moedas disponíveis
        listAllCurrencies();

        // Formatar um valor monetário
        formatCurrency("EUR", 12345.67);

        // Obter a quantidade de casas decimais de uma moeda
        getCurrencyDecimals("JPY");
    }

    private static void getCurrencyInfo(String currencyCode) {
        Currency currency = Currency.getInstance(currencyCode);
        System.out.println("Currency Code: " + currency.getCurrencyCode());
        System.out.println("Currency Symbol: " + currency.getSymbol());
        System.out.println("Currency Name: " + currency.getDisplayName());
        System.out.println("----------");
    }

    private static void listAllCurrencies() {
        Set<Currency> currencies = Currency.getAvailableCurrencies();
        for (Currency currency : currencies) {
            System.out.println("Currency Code: " + currency.getCurrencyCode());
            System.out.println("Currency Symbol: " + currency.getSymbol());
            System.out.println("Currency Name: " + currency.getDisplayName());
            System.out.println("----------");
        }
    }

    private static void formatCurrency(String currencyCode, double amount) {
        Currency currency = Currency.getInstance(currencyCode);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setCurrency(currency);
        String formattedAmount = currencyFormat.format(amount);
        System.out.println("Formatted Amount: " + formattedAmount);
        System.out.println("----------");
    }

    private static void getCurrencyDecimals(String currencyCode) {
        Currency currency = Currency.getInstance(currencyCode);
        int fractionDigits = currency.getDefaultFractionDigits();
        System.out.println("Fraction Digits for " + currencyCode + ": " + fractionDigits);
        System.out.println("----------");
    }
}