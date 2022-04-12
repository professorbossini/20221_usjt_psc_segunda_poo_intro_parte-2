import java.util.Random;
public class Jogo {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem("John", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 4, 8);
        Random gerador = new Random();
        /*
            1: Caçar
            2: Comer
            3: Dormir
        */
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

            //esse valor está entre 0 e 1
            double atividadeDoSoneca = gerador.nextDouble();
            //se o valor for no máximo 0.7, colocar o soneca para dormir
            //se o valor for no máximo 0.85, colocar o soneca para comer
            //senão, colocar o soneca para caçar
            System.out.println("=====================================");
            Thread.sleep(2 * 1000);
        }


        //esse também é um loop infinito
        // for (; ;){

        // }
    }
}
