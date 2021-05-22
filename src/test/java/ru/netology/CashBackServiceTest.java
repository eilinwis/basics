package ru.netology;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
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
        assertEquals(service.remain(amount), 1);
    }

    @Test
    public void testBorderLine() {
        int amount = 1000;
        service.remain(amount);
        assertEquals(service.remain(amount), 0);
    }
}