import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem();
        Random gerador = new Random();
        /*
            1: Caçar
            2: Comer
            3: Dormir
        */ 
        cacador.nome = "John";
        while (true){
            int oQueFazer = gerador.nextInt(3) + 1;
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println("=====================================");
            Thread.sleep(2 * 1000);
        }


        //esse também é um loop infinito
        // for (; ;){

        // }
    }
}
