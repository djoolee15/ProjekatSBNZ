package classes;

import java.util.Date;

public class Transaction {


    // nema potrebe da postoji account , zato sto jedan nalog ima samo 1 karticu, a vec postoji polje card
    private Integer amount;
    private String location;
    private Card card;
    private Card recipient_acc;
    private Date date;


    private boolean suspicious;

    public Transaction(Integer amount, String location, Card card, Card recipient_acc, Date date) {
        this.amount = amount;
        this.location = location;
        this.card = card;
        this.recipient_acc = recipient_acc;
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getRecipient_acc() {
        return recipient_acc;
    }

    public void setRecipient_acc(Card recipient_acc) {
        this.recipient_acc = recipient_acc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSuspicious() {
        return suspicious;
    }

    public void setSuspicious(boolean suspicious) {
        this.suspicious = suspicious;
    }
}
