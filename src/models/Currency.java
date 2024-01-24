package models;

public class Currency {
    private String nameCurrency;
    private int valueCurrency;

    public Currency(String nameCurrency, int valueCurrency) {
        this.nameCurrency = nameCurrency;
        this.valueCurrency = valueCurrency;
    }

    public Currency() {
        this.nameCurrency = "";
    }

    public String getNameCurrency() {
        return nameCurrency;
    }

    public void setNameCurrency(String nameCurrency) {
        this.nameCurrency = nameCurrency;
    }

    public int getValueCurrency() {
        return valueCurrency;
    }

    public void setValueCurrency(int valueCurrency) {
        this.valueCurrency = valueCurrency;
    }
}
