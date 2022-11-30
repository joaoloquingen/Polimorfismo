public class Gerente extends Funcionario {
    private String subordinados;

    public String getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(String subordinados) {
        this.subordinados = subordinados;
    }
    public void imprimir(){
        System.out.println("Olá meu nome é: "
                + this.getNome() + ". Eu recebo "
                + this.getSalario() + " de salário."
                + " E tenho um custo de " + this.getCusto() + " para a empresa!" + " sou subordinado por " + this.getSubordinados());
    }
}
