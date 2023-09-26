public class LivroDeNotas {

    private String nomeDoCurso;

    public String getNomeDoCurso(){
        return nomeDoCurso;
    }
    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }
    
        
    public void exibirMensagem(String nomeDoCurso) {
        System.out.printf("Bem-Vindo ao Livro de Notas do curso %s", getNomeDoCurso());
    }
}
