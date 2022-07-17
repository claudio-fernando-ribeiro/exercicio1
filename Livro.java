package introducao.exercicio1;

public class Livro {
    private String titulo;
    private Float valor;
    private boolean esgotado;
    private Autor escritor;


    @Override
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Título: ");
        montadorString.append(getTitulo());
        montadorString.append("Valor: ");
        montadorString.append(getValor());
        montadorString.append("Esgotado");
        montadorString.append(isEsgotado());
        montadorString.append("Autor nome: ");
        montadorString.append(getEscritor().getNome());
        montadorString.append("Autor Data de Nascimento: ");
        montadorString.append(getEscritor().getDataNascimento());

        return montadorString.toString();

        //return "Titulo: " + getTitulo() + 
      //          "Valor: " + getValor() + 
     //           "Esgotado: " + isEsgotado() + 
      //          "Autor Nome: " + getEscritor().getNome() + 
      //          "Autor Data Nascimento " + getEscritor().getDataNascimento();
    }
 
    public Autor getEscritor() {
        return escritor;
    }


    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }


    public Livro (String titulo){
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }

    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }

}
