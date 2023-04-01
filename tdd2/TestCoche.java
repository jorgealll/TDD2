package tdd2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCoche {

	@Test
	public void test_crear_coche_su_velocidad_es_cerojorgealtet(){
        Coche nuevoCoche = new Coche();
        Assert.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumentajorgealtet(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerarjorge(30);
       Assert.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuyejorgealtet(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarjorge(20);
        Assert.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_jorgealtet(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarjorge(80);
        Assert.assertEquals(0, nuevoCoche.velocidad);
    }
}
