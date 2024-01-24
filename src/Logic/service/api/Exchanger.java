package Logic.service.api;

import models.Currency;

public interface Exchanger {
    double exchanger(Currency fistCurrency, Currency secondCurrency);
}
