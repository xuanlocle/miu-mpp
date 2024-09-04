package prob3;

import java.util.Date;

public class Human {
    private String name;
    private IdentityCard card;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public Human(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public IdentityCard getCard() {
        return card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void requestIdentityCard() {
        this.card = IdentityCard.createIdentityCard(this);
    }
}
