package UFC;

public class Lutador {
    private String nome, nacionalidade,categoria;
    private Integer idade,vitorias,derrotas,empates;
    private Float altura;
    private Float peso;

    public void apresentar(){
        System.out.println("-------------------------------------");
        System.out.println("CHEGOU A HORA!!!  Apresentamos o Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(getIdade()+" anos");
        System.out.println(getAltura()+"m de altura");
        System.out.println("Pesando: "+this.getPeso()+"Kg");
        System.out.println("Ganhou: "+this.getVitorias());
        System.out.println("Perdeu: "+this.getDerrotas());
        System.out.println("Empatou: "+this.getEmpates());
    }
    public void status(){
        System.out.println("--------------------------------------");
        System.out.println(this.getNome());
        System.out.println("Peso "+getCategoria());
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perdeLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso<52.2){
            this.categoria="Invalido";
        }else if(peso<=70.3){
            this.categoria="Leve";
        }else if(this.peso<=83.9){
            this.categoria="Medio";
        }else if(this.peso<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Invalido";
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public Lutador(String nome, String nacionalidade, Integer idade, Integer vitorias, Integer derrotas, Integer empates, Float altura, Float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);


    }
}