package classes;

public class Card {

    private Client CardHolder;

    private Integer card_number;

    private Integer amount;

    public Card(Client cardHolder, Integer card_number, Integer amount) {
        CardHolder = cardHolder;
        this.card_number = card_number;
        this.amount = amount;
    }

    public Client getCardHolder() {
        return CardHolder;
    }

    public void setCardHolder(Client cardHolder) {
        CardHolder = cardHolder;
    }

    public Integer getCard_number() {
        return card_number;
    }

    public void setCard_number(Integer card_number) {
        this.card_number = card_number;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
