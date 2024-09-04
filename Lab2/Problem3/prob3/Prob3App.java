package prob3;

import java.util.Date;

public class Prob3App {
    public static void main(String[] args) {
        Human person = new Human("Loc", new Date());
        System.out.println(person.getCard());

        person.requestIdentityCard();
        System.out.println("Card Info ----");
        System.out.println(person.getCard().getSsnNumber());
        System.out.println(person.getCard().getAssignedDate());
        System.out.println(person.getCard().getDueDate());

        System.out.println("Card Human Info ----");
        System.out.println(person.getCard().getHuman().getName());
        System.out.println(person.getCard().getHuman().getBirthday());
    }
}
