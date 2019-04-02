package test;

import applistadin.ListaDin;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ListaDinTest {
   
    @Test
    public void testListaEstaVazia(){
        ListaDin i = new ListaDin();
        Assert.assertTrue(i.isEmpty());
    }
    
}
