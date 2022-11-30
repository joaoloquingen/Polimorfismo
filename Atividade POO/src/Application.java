public class Application {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        Cabecalho cabecalho = new Cabecalho();
        Rodape rodape = new Rodape();
        funcionario.setNome("João");
        funcionario.setSalario(1210);
        funcionario.Aumento();
        cabecalho.setTexto(" Começo ");
        rodape.setTexto1("Fim");
        funcionario.imprimir(cabecalho, rodape);


        Programador programador = new Programador();
        Cabecalho cabecalho1 = new Cabecalho();
        Rodape rodape1 = new Rodape();
        programador.setNome("João Programador");
        programador.setSalario(5000);
        programador.Aumento();
        programador.setLinguagens("PHP, Java, JavaScript");
        cabecalho1.setTexto(" Começo ");
        rodape1.setTexto1(" Fim ");
        programador.imprimir(cabecalho1, rodape1);


        Gerente gerente = new Gerente();
        Cabecalho cabecalho2 = new Cabecalho();
        Rodape rodape2 = new Rodape();
        gerente.setNome("João Gerente");
        gerente.setSalario(7500);
        gerente.Aumento();
        gerente.setSubordinados("Eduardo Programador, Eduardo Secretário");
        cabecalho2.setTexto(" Começo ");
        rodape2.setTexto1("Fim");
        gerente.imprimir(cabecalho2, rodape2);


        Secretaria secretaria = new Secretaria();
        Cabecalho cabecalho3 = new Cabecalho();
        Rodape rodape3 = new Rodape();
        secretaria.setNome("João Secretário");
        secretaria.setSalario(2000);
        secretaria.Aumento();
        secretaria.setAgenda("Seg - Sala 1, Terça - Sala 2");
        cabecalho3.setTexto(" Começo ");
        rodape3.setTexto1("Fim");
        secretaria.imprimir(cabecalho3, rodape3);


    }
}
