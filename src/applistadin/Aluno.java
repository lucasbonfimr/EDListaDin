package applistadin;

public class Aluno implements Cloneable{
    private String nome;
    private int ra;
    
    public Aluno(String nome, int ra){
        this.nome = nome;
        this.ra = ra;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public String getNome(){
        return nome;
    }
}
