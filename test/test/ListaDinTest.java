package test;

import applistadin.Aluno;
import applistadin.ListaDin;
import org.junit.Assert;
import org.junit.Test;



public class ListaDinTest {
   
    @Test
    public void testListaEstaVazia(){
        ListaDin i = new ListaDin();
        Assert.assertTrue(i.isEmpty());
    }
    
    @Test
    public void testInserirNoInicio() throws CloneNotSupportedException{
        ListaDin i = new ListaDin();
        i.insereInicio("Marcos", 5431);
        i.insereInicio("Joao", 12345);
        Aluno a = i.getInicio();
        Assert.assertEquals("Joao", a.getNome());
    }
    
    @Test
    public String exibirLista(){
      ListaDin i = new ListaDin();
      i.insereInicio("A", 1);
      i.insereInicio("B", 2);
      i.insereInicio("C", 3);
      i.insereInicio("D", 4);
      
      String alunos = i.exibirNomes();
      
      Assert.assertEquals("D;C;B;A;",alunos);
      
    }
}
