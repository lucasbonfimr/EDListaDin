package applistadin;

public class ListaDin {
    No inicio;
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    public Aluno getInicio() throws CloneNotSupportedException{
        return inicio.getItem();
    }
    
    public void insereInicio(String nome, int ra){
       //cria o novo No a ser inserido na lista
       Aluno a = new Aluno(nome, ra);
       No novoNo = new No(a);
       
       //aponta o proximo do novoNo para o inicio da lista
       novoNo.setProximo(inicio);
       
       //aponta o inicio da fila para o novoNo inserido
       inicio = novoNo;
    }

    public String exibirNomes() {
        No aux = inicio;
        String saida = "";
        
        while(aux != null){
            saida += aux.getAluno().getNome();
            
        }
        return saida;
    }
}
