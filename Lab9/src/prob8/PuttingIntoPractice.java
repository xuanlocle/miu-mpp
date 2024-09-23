package prob8;

import prob8.Trader;
import prob8.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice {
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> transactionList = transactions
                .stream()
                .filter(transaction -> transaction.getYear() >= 2011)
                .sorted(comparing(Transaction::getValue))
                .toList();
        System.out.println("Transactions from year 2011 and sort them by value (small to high):");
        System.out.println(transactionList);

        
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("Unique cities where the traders work");
        List<String> uniqueCities = transactions
                .stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .toList();
        System.out.println(uniqueCities);
        

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("All traders from Cambridge sorted sorted by name");
        List<Trader> tradersFromCambridge = transactions
                .stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(comparing(Trader::getName))
                .toList();
        System.out.println(tradersFromCambridge);

   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        System.out.println("A string of all traders names sorted alphabetically: ");
        String sortedTraderNames = transactions
                .stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(sortedTraderNames);

        // Query 5: Are there any trader based in Milan?
        long traderInMilanCounter = transactions
                .stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .count();

        System.out.println("Are there any trader based in Milan? " + (traderInMilanCounter > 0 ? "Yes" : "No"));
        
   
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Milan"))
                .forEach(transaction -> transaction.getTrader().setCity("Cambridge"));
        System.out.println("Transactions after update traders from Milan to Cambridge:");
        System.out.println(transactions);
        
        
        // Query 7: What's the highest value in all the transactions?
        int highestValue = transactions.stream().mapToInt(Transaction::getValue).max().orElse(0);
        System.out.println("Highest value is " + highestValue);
    }
}
