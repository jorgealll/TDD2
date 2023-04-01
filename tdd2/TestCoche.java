package tdd2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCoche {

	@Test
    public void test_crear_coche_su_velocidad_es_cero(){
        Coche nuevoCoche = new Coche();
        Assert.assertEquals(0, nuevoCoche.velocidad);
    }

}
