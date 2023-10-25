package Tarefa;

public class CompraCarroZero extends Fabrica {

    @Override
    Carro montaCarro(String comprado) {
        if ("A".equals(comprado)) {
            return new HyundaiCar("Motor de 110 Cavalos", "Preto", "Tanque");
        } else {
            return null;
        }
    }

}
