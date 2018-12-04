package server;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ContextTest {


    @Test
    public void testCreateCard() {
        List<String> request = new ArrayList<String>();
        request.add("Shop");
        request.add("CreateCard");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Created 100000", actual);
    }

    @Test
    public void testGetBalance() {
        List<String> request = new ArrayList<String>();
        request.add("ATM1");
        request.add("GetBalance");
        request.add("100000");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Balance 1000", actual);
    }

    @Test
    public void testPayAmount() {
        List<String> request = new ArrayList<String>();
        request.add("ATM2");
        request.add("PayAmount");
        request.add("100000");
        request.add("200");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Paid 200", actual);
    }

    @Test
    public void testCashIn() {
        List<String> request = new ArrayList<String>();
        request.add("Bank");
        request.add("CashIn");
        request.add("100000");
        request.add("350");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Cash in 350", actual);
    }

    @Test
    public void testBlockCard() {
        List<String> request = new ArrayList<String>();
        request.add("BlockCard");
        request.add("100000");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Blocked 100000", actual);
    }
}