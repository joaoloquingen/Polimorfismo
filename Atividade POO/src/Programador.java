public class Programador extends Funcionario {
    private String linguagens;

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }
    public void imprimir(){
        System.out.println("Olá meu nome é: "
                + this.getNome() + ". Eu recebo "
                + this.getSalario() + " de salário."
                + " E tenho um custo de " + this.getCusto() + " para a empresa!" + " Minha especialidade " + this.getLinguagens());
    }
}
