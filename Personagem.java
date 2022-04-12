public class Personagem{
    //atributos
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem (String nome, int energia, int fome, int sono){
        this(energia, fome, sono);
        this.nome = nome;
    }


    public Personagem(int energia, int fome, int sono){
        if (energia >= 0 && energia <= 10)
            this.energia = energia;
        if (fome >= 0 && fome <= 10)
            this.fome = fome;
        if (sono >= 0 && sono <= 10)
            this.sono = sono;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }
    

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