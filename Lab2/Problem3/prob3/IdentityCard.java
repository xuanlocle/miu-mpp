package prob3;

import java.util.Date;
import java.util.Random;

public class IdentityCard {
    private Human human;

    public Integer getSsnNumber() {
        return ssnNumber;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    private Integer ssnNumber;
    private Date assignedDate;
    private Date dueDate;

    private IdentityCard(){}

    private IdentityCard(Human person, Integer ssnNumber, Date assignedDate, Date dueDate){
        this.human = person;
        this.ssnNumber = ssnNumber;
        this.assignedDate = assignedDate;
        this.dueDate = dueDate;
    }

    public Human getHuman() {
        return human;
    }

    public static IdentityCard createIdentityCard(Human human) {
        if (human == null) {
            throw new NullPointerException("No Hhuman");
        }

        int ssn = new Random().nextInt(1, 99999);
        Date dueDate = new Date();
        Date assignDate = new Date();
        return new IdentityCard(human, ssn,assignDate, dueDate);
    }
}
