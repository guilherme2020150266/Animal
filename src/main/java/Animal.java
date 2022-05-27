public abstract  class Animal {

    private String nome;
    private double comprimento;
    private int numero_de_patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, double comprimento, int numero_de_patas, String cor, String ambiente, double velocidade ){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numero_de_patas = numero_de_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumero_de_patas() {
        return numero_de_patas;
    }

    public void setNumero_de_patas(int numero_de_patas) {
        this.numero_de_patas = numero_de_patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public abstract void dados();

}
