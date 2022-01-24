package testeEcg;

public class Servidor {
    Integer matricula;
    String nome;
    String area;
    Double salario;
    Double aumentoSalario;

    public Servidor(Integer matricula, String nome, String area, Double salario, Double aumentoSalario) {
        this.matricula = matricula;
        this.nome = nome;
        this.area = area;
        this.salario = salario;
        this.aumentoSalario = aumentoSalario;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getAumentoSalario() {
        return aumentoSalario;
    }

    public void setAumentoSalario(Double aumentoSalario) {
        this.aumentoSalario = aumentoSalario;
    }
    void aumentosal(){
      this.salario=getSalario()+getAumentoSalario();
        System.out.println("Reajuste: "+getSalario());
    }
  void Status(){
      System.out.println("Nome do Servidor: "+getNome());
      System.out.println("Matricula do "+getNome()+": "+getMatricula());
      System.out.println("Salario: "+getSalario());
      System.out.println("Pretencao de aumento salarial: "+"R$"+getAumentoSalario());

  }
}
