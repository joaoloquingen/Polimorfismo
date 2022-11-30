public class Cabecalho {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public void imprimir(){
        System.out.println(this.getTexto());
    }

}
