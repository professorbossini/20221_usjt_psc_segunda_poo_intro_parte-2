public class Personagem{
    //atributos
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    

    //métodos
    //um método tem quatro partes:
    //tipo de retorno, nome, lista de parâmetros, corpo
    //isso é a definição de um método
    void cacar(){
        if (energia >= 2){
            System.out.println(nome + " caçando...");
            energia = energia - 2;
            //energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        // if (fome < 10)
        //     fome += 1;

    }

    void comer(){
        if (fome >= 1){
            System.out.printf("%s comendo...\n", nome);
            energia = Math.min(energia + 1, 10);
            fome -= 1;
        }
        else{
            System.out.println(nome + " sem fome...");
        }
    }

    void dormir(){
        if (sono >= 1){
            //System.out.print(nome + " dormindo\n");
            String exibir = String.format("%s dormindo...\n", nome);
            System.out.print(exibir);
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }
    }
    
}





// int somar(int a, int b){
//    return a + b; 
// }
// public static void main(String[] args) {
//     Personagem p = new Personagem();
//     //isso é chamada (call) de um método
//     p.cacar();
//     int resultado = p.somar(2, 3);
//     System.out.println(resultado);
//     System.out.println("Até logo");
// }