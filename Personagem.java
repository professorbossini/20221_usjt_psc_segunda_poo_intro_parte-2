public class Personagem{
    //atributos
    String nome;
    int energia;
    int fome;
    int sono;

    //métodos
    //um método tem quatro partes:
    //tipo de retorno, nome, lista de parâmetros, corpo
    //isso é a definição de um método
    void cacar(){
        System.out.println(nome + " caçando...");
    }

    void comer(){
        System.out.printf("%s comendo...\n", nome);
    }

    void dormir(){
        //System.out.print(nome + " dormindo\n");
        String exibir = String.format("%s dormindo...\n", nome);
        System.out.print(exibir);
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