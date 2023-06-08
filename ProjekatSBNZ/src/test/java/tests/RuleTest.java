package tests;

import classes.Card;
import classes.Client;
import classes.Transaction;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Date;

import static org.junit.Assert.*;

public class RuleTest {

    @Test
    public void testSuspiciousCloseInTimeTransactions() {
        // Create a new KieSession using the Drools rules
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("rulesSession");

        try {
            // Prepare test data
            Client client1 = new Client();
            Client client2 = new Client();
            Card card = new Card(client1, 1, 3000);
            Card card2 = new Card(client2, 2, 500);
            Transaction transaction1 = new Transaction(card, new Date(), "novi sad", 300, card2);
            Transaction transaction2 = new Transaction(card, new Date(), "novi sad", 500, card2);
            // Add the transactions to the session
            kSession.insert(card);
            kSession.insert(transaction1);
            kSession.insert(transaction2);

            // Execute the rules
            int firedRules = kSession.fireAllRules(10); // Set the maximum number of rules to fire

            // Verify that at least one rule fired
            assertTrue(firedRules > 0);

            // Verify that the transactions are marked as suspicious
            assertTrue(transaction1.isSuspicious());
            assertTrue(transaction2.isSuspicious());
        } finally {
            // Dispose of the session after the test
            kSession.dispose();
        }
    }
}