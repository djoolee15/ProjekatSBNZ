package classes;

import java.util.Date;

public class Transaction {

    private Card card;

    private Date date;

    private String location;

    private Integer amount;

    private boolean suspicious;

    private Card recipientCard;

    public Transaction(Card card, Date date, String location, Integer amount, Card recipientCard) {
        this.card = card;
        this.date = date;
        this.location = location;
        this.amount = amount;
        this.recipientCard = recipientCard;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Card getRecipientCard() {
        return recipientCard;
    }

    public void setRecipientCard(Card recipientCard) {
        this.recipientCard = recipientCard;
    }

    public boolean isSuspicious() {
        return suspicious;
    }

    public void setSuspicious(boolean suspicious) {
        this.suspicious = suspicious;
    }
}
