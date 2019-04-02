package applistadin;

public class No {
    Aluno aluno;
    No proximo;
    
    public No(Aluno a){
        aluno = a;
        proximo = null;
    }
    
    public Aluno getItem() throws CloneNotSupportedException{
        return (Aluno) aluno.clone();
    }
    
    public void setProximo(No no){
        proximo = no;
    }
}
