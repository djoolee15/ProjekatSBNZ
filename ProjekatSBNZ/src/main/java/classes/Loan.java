package classes;

public class Loan {
    private Client client;
    private Integer sum;
    private Integer repaymentPeriod;
    // Ostale informacije koje su nam potrebe ce se pribavljati iz klienta, i treba ih dodati u klient klasu, a to su:
    // primanja, zaposlenje, krediti, rizicna grupa, prioritet

    private Integer repaymentAmount;
    private Boolean validRepaymentPeriod;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getRepaymentPeriod() {
        return repaymentPeriod;
    }

    public void setRepaymentPeriod(Integer repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public Boolean getValidRepaymentPeriod() {
        return validRepaymentPeriod;
    }

    public void setValidRepaymentPeriod(Boolean validRepaymentPeriod) {
        this.validRepaymentPeriod = validRepaymentPeriod;
    }

    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }
}

