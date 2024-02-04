  public class Guerreiro extends Personagem implements Atacante {
    private int forca;

    // Construtor
    public Guerreiro(String nome, int vida, int mana, int forca) {
        super(nome, vida, mana);
        this.forca = forca;
    }

    // Métodos de acesso e modificação específicos do Guerreiro
    public int getForca() {
        return this.forca;
    }

    public void setForca(int novaForca) {
        this.forca = novaForca;
    }

    // Sobrescrever o método exibirInformacoes para incluir a força
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Força: " + getForca());
    }

// Implementação do método atacar da interface Atacante
    @Override
    public void atacar() {
        System.out.println("Guerreiro atacando!");
    }
}