
package sistema.academico.Work_data;


public class Professor extends Pessoa
{
   private String registro;
   private String materia;
    //-------------------------------------[GETTER'S]--------------------------------->
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
   public String getRegistro() {
        return registro;
    }

   public String getMateria() {
        return this.materia;
    }
    

   //-------------------------------------[SETTER'S]--------------------------------->
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
   
   
    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
}
