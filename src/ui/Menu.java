package ui;

import Logic.service.ExchangerImp;
import models.Currency;

import java.util.Scanner;
public class Menu {
    private final static Scanner scanner = new Scanner(System.in);
    public static ExchangerImp exchangerImp = new ExchangerImp();

    private static final String menu1 = """
            Введите первую валюту
            USD
            EUR
            BYN
            RUB
            UAH
            GBP
            KRW
            KZT
            """;

    private static final String menu2 = """
            Введите валюту В которую надо перевести
            USD
            EUR
            BYN
            RUB
            UAH
            GBP
            KRW
            KZT
            """;


    public static void run(){
        System.out.println(menu1);
        Currency firstCurrency = new Currency();

        String name1 = scanner.next();
        firstCurrency.setNameCurrency(name1);

        System.out.println("Введите количество денег");
        int value = scanner.nextInt();
        firstCurrency.setValueCurrency(value);

        System.out.println(menu2);

        String name2 = scanner.next();

        Currency secondCurrency = new Currency();
        secondCurrency.setNameCurrency(name2);

        System.out.println(exchangerImp.exchanger(firstCurrency, secondCurrency));
    }
}
