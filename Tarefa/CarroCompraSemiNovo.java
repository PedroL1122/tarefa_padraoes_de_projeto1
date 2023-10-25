package Tarefa;

public class CompraCarroSemiNovo extends Loja {

    @Override
    CarroSemi montaCarro(String compradoS) {
        if("B".equals(compradoS)) {
            return new ChevroletCar("Motor de 90 Cavalos", "cinza", "Tanque");
        } else {
            return null;
        }
    }

}
