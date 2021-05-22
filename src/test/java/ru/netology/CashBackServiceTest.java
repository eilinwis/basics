package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;
import ru.netology.service.CashBackService;


public class CashBackServiceTest {
    public CashBackService service = new CashBackService();

    @Test
    public void testRemain() {
        int amount = 600;
        service.remain(amount);
        assertEquals(service.remain(amount), 400);
    }

    @Test
    public void testAboveBorderLine() {
        int amount = 1001;
        service.remain(amount);
        assertEquals(service.remain(amount), 999);
    }

    @Test
    public void testBelowBorderLine() {
        int amount = 999;
        service.remain(amount);
        assertEquals(1,service.remain(amount));
    }
    @Test
    public void testBorderLine(){
        int amount = 1000;
        service.remain(amount);
        assertEquals(0, service.remain(amount));
    }
}