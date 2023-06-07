package tests;

import classes.Card;
import classes.Client;
import classes.Transaction;
import org.testng.annotations.Test;
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
            Client client1 = new Client( "Djordje",  "Vajagic",  21,  1,  300000);
            Client client2 = new Client( "Petar",  "Petrovic",  21,  2,  300000);
            Card card = new Card( client1, 1,3000);
            Card card2 = new Card(client2, 2, 500);
            Transaction transaction1 = new Transaction( 500, "novi sad", card, card2, new Date());
            Transaction transaction2 = new Transaction(500, "beograd", card, card2, new Date());
            // Add the transactions to the session
            kSession.insert(card);
            kSession.insert(transaction1);
            kSession.insert(transaction2);

            // Execute the rules
            int firedRules = kSession.fireAllRules();

            // Assert that the rule fired
            assertEquals(1, firedRules);

            // Verify that the transactions are marked as suspicious
            assertTrue(transaction1.isSuspicious());
            assertTrue(transaction2.isSuspicious());
        } finally {
            // Dispose of the session after the test
            kSession.dispose();
        }
    }
}




