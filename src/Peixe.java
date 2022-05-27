public class Peixe extends Animal{

    private String caracteristica;

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Peixe(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade,String caracteristica) {
        super(nome, comprimento, numero_de_patas, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
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
        System.out.println("Característica: " + this.getCaracteristica());

    }
}
