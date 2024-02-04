public class Personagem {
    private String nome;
    private int vida;
    private int mana;

    // Construtor
    public Personagem(String nome, int vida, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    public int getMana() {
        return this.mana;
    }

    // Métodos de modificação (setters)
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setVida(int novaVida) {
        this.vida = novaVida;
    }

    public void setMana(int novaMana) {
        this.mana = novaMana;
    }

    // Método para exibir informações do personagem
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Mana: " + getMana());
    }

    // Método de ação genérico
    public void realizarAcao() {
        // Ação genérica
        System.out.println("Realizando ação genérica");
    }
}