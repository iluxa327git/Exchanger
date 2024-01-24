package Logic.service;

import Logic.service.api.Exchanger;
import models.Currency;

public class ExchangerImp implements Exchanger {

    @Override
    public double exchanger(Currency fistCurrency, Currency secondCurrency) {
        switch(fistCurrency.getNameCurrency()){
            case "USD":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency();
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 0.92;
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 3.27;
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 88.87;
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 37.46;
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.78;
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 1330.24;
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 446.93;
                }
            case "EUR":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 1.09;
                    case "EUR":
                        return fistCurrency.getValueCurrency();
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 3.57;
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 96.86;
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 40.83;
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.85;
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 1449.40;
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 487.09;
                }
            case "BYN":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 0.31;
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 0.28;
                    case "BYN":
                        return fistCurrency.getValueCurrency();
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 27.16;
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 11.45;
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.24;
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 406.66;
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 136.60;
                }
            case "RUB":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 0.011;
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 0.010;
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 0.037;
                    case "RUB":
                        return fistCurrency.getValueCurrency();
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 0.42;
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.0088;
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 15;
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 5.04;
                }
            case "UAH":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 0.027;
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 0.025;
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 0.087;
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 0.087;
                    case "UAH":
                        return fistCurrency.getValueCurrency();
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.021;
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 35.54;
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 11.93;
                }
            case "GBP":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 1.27;
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 1.17;
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 4.17;
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 4.17;
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 47.76;
                    case "GBP":
                        return fistCurrency.getValueCurrency();
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 1697.31;
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 569.80;
                }
            case "KRW":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 0.00075;
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 0.00069;
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 0.0025;
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 0.067;
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 0.028;
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.0000059;
                    case "KRW":
                        return fistCurrency.getValueCurrency();
                    case "KZT":
                        return fistCurrency.getValueCurrency() * 0.34;
                }
            case "KZT":
                switch(secondCurrency.getNameCurrency()){
                    case "USD":
                        return fistCurrency.getValueCurrency() * 0.0022;
                    case "EUR":
                        return fistCurrency.getValueCurrency() * 0.0021;
                    case "BYN":
                        return fistCurrency.getValueCurrency() * 0.0073;
                    case "RUB":
                        return fistCurrency.getValueCurrency() * 0.20;
                    case "UAH":
                        return fistCurrency.getValueCurrency() * 0.084;
                    case "GBP":
                        return fistCurrency.getValueCurrency() * 0.0018;
                    case "KRW":
                        return fistCurrency.getValueCurrency() * 2.98;
                    case "KZT":
                        return fistCurrency.getValueCurrency();
                }
        }
        return 0;
    }
}
