class Main {
// shiny happy people laughing ☀️
  public static void main(String[] args) {
   Pessoa pessoa = new Pessoa();
    
    // settando os atributos
    pessoa.setNome("Paulo");
    pessoa.setIdade(25);
    // acessando os dados
    System.out.println(pessoa.getNome());  
    System.out.println(pessoa.getIdade());  
    // utilizando os métodos
    pessoa.dizerNome();
    pessoa.dizerIdade();
  }
}