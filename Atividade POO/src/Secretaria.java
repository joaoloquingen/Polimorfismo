public class Secretaria extends Funcionario {
    private String agenda;
    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
    public void imprimir(){
        System.out.println("Olá meu nome é: "
                + this.getNome() + ". Eu recebo "
                + this.getSalario() + " de salário."
                + " E tenho um custo de " + this.getCusto() + " para a empresa!" +
                " datas disponivel para agendamento " + this.getAgenda());
    }
}
