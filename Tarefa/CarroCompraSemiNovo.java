package Tarefa;

public class CompraCarroSemiNovo extends Loja {

    @Override
    CarroSemi montaCarro(String compradoS) {
        if("B".equals(compradoS)) {
            return new OnixCar("Motor de 100 Cavalos", "Branco", "Tanque");
        } else {
            return null;
        }
    }

}
