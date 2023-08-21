class Pessoa {
  private String nome;
  private int idade;

  public void dizerNome() {
    System.out.println("Olá, meu nome é " + nome);
  }
  public void dizerIdade() {
    System.out.println("Olá, tenho " + idade + " anos.");
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
   public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
}