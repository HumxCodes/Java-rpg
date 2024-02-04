public class Comandante {
    public static void main(String[] args) {
        // Criando um array de Personagem
        Personagem[] herois = new Personagem[3];

        // Adicionando instâncias de Guerreiro e Mago ao array
        herois[0] = new Guerreiro("Lancelot", 200, 100, 20);
        herois[1] = new Mago("Zax", 210, 105, 30);
        herois[2] = new Guerreiro("Joseph", 180, 80, 18);

        // Iterando sobre o array e imprimindo informações e características específicas
        for (Personagem heroi : herois) {
            System.out.println("\nInformações do Herói:");
            heroi.exibirInformacoes();

            // Verificando o tipo de herói e realizando ações específicas
            if (heroi instanceof Guerreiro) {
                ((Guerreiro) heroi).atacar();
                System.out.println("Tipo: Guerreiro");
                System.out.println("Força: " + ((Guerreiro) heroi).getForca());
            } else if (heroi instanceof Mago) {
                ((Mago) heroi).curar();
                System.out.println("Tipo: Mago");
                System.out.println("Inteligência: " + ((Mago) heroi).getInteligencia());
            }
        }
    }
}