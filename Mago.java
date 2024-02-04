    public class Mago extends Personagem implements Curandeiro {
        private int inteligencia;

        // Construtor
        public Mago(String nome, int vida, int mana, int inteligencia) {
            super(nome, vida, mana);
            this.inteligencia = inteligencia;
        }

        // Métodos de acesso e modificação específicos do Mago
        public int getInteligencia() {
            return this.inteligencia;
        }

        public void setInteligencia(int novaInteligencia) {
            this.inteligencia = novaInteligencia;
        }

        // Sobrescrever o método exibirInformacoes para incluir a inteligência
        @Override
        public void exibirInformacoes() {
            super.exibirInformacoes();
            System.out.println("Inteligência: " + getInteligencia());
        }

        // Método específico para ação do Mago
        public void curar() {
            System.out.println("Mago curando aliados!");
        }
    }
