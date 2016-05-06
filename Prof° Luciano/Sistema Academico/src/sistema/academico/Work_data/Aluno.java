/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.academico.Work_data;

/**
 *
 * @author Orion
 */
public class Aluno extends Pessoa{
    
    private String ra;
    private String curso;
    

  
 //--------------------------------------[SETTER'S]------------------------->
    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
      @Override
    public void setNome(String nome)
    {
        this.nome = nome;
    }
   @Override
   public void setTelefone(String telefone)
   {
       this.telefone = telefone;
   }
   
   @Override
   public void setEndereco(String endereco)
   {
       this.endereco = endereco;
   }
   
//--------------------------------------[GETTER'S]-------------------------> 
    @Override
   public String getNome()
   {
      return this.nome;
   }
   @Override
   public String getTelefone()
   {
       return this.telefone;
   }
      @Override
   public String getEndereco()
   {
       return this.endereco;
   } 
    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }
  
    
    
    
}
