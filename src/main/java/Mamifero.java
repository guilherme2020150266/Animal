public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        this.alimento  = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados() {
        System.out.println("\nDados do Animal:");
        System.out.println("\nNome: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento()+" cm");
        System.out.println("Número de patas: " + this.getNumero_de_patas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade: " + this.getVelocidade()+" m/s");
        System.out.println("Alimento: " + this.getAlimento());

    }
}
