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
//--------------------------------------[GETTER'S]-------------------------> 
    public String getRa() {
        return ra;
    }

    public String getCurso() {
        return curso;
    }
  
    
    
    
}
