public class Main {
  public static void main(String[] args) {
      // Criando um personagem
      Personagem meuPersonagem = new Personagem("Herói", 100, 50);

      // Informações do personagem
      System.out.println("Status do Personagem:");
      meuPersonagem.exibirInformacoes();

      // Modificando as características do personagem
      meuPersonagem.setNome("Novo Herói");
      meuPersonagem.setVida(150);
      meuPersonagem.setMana(75);

      // Informações após a modificação
      System.out.println("\nStatus do Personagem após PowerUp:");
      meuPersonagem.exibirInformacoes();

      // Criando um guerreiro
      Guerreiro meuGuerreiro = new Guerreiro("Lancelot", 200, 100, 20);

      // Informações do guerreiro
      System.out.println("\nStatus do Guerreiro:");
      meuGuerreiro.exibirInformacoes();

      // Modificando as características do guerreiro
      meuGuerreiro.setNome("Mega Lancelot");
      meuGuerreiro.setVida(250);
      meuGuerreiro.setMana(128);
      meuGuerreiro.setForca(30);

      // Informações após a modificação
    System.out.println("\nStatus do Guerreiro após PowerUp:");
      meuGuerreiro.exibirInformacoes();

    // Criando um mago
            Mago meuMago = new Mago("Zax", 210, 105, 30);

            // Informações do mago
            System.out.println("\nStatus do Mago:");
            meuMago.exibirInformacoes();

            // Modificando as características do mago
            meuMago.setNome("Zax, O Sábio");
            meuMago.setVida(230);
            meuMago.setMana(180);
            meuMago.setInteligencia(55);

            // Informações após a modificação
            System.out.println("\nStatus do Mago após PowerUp:");
            meuMago.exibirInformacoes();
        }
    }