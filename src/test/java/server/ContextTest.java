package server;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ContextTest {


    @Test
    public void testCreateCard() {
        List<String> request = new ArrayList<String>();
        request.add("CreateCard");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Created 100000", actual);
    }

    @Test
    public void testGetBalance() {
        List<String> request = new ArrayList<String>();
        request.add("GetBalance");
        request.add("100000");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Balance 1000", actual);
    }

    @Test
    public void testPayAmount() {
        List<String> request = new ArrayList<String>();
        request.add("PayAmount");
        request.add("100000");
        request.add("200");
        Context context = new Context();
        String actual = context.execute(request);
        assertEquals("Paid 200", actual);
    }
}