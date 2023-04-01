package tdd2;

public class Coche {
public int velocidad;

public void acelerarjorge(int aceleracion) {
    velocidad += aceleracion;
}

public void decelerarjorge(int deceleracion) {
    velocidad -= deceleracion;
    if (velocidad<0) velocidad = 0;
}
}
