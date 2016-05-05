
package sistema.academico;
import sistema.academico.lib.Scan_Texto;

public class SistemaAcademico {

    
    public static void main(String[] args) {
        
        
        Scan_Texto scan = new Scan_Texto();
        int nOpcaoGerencia, nOpcao;
        
        while(true)
        {
        
         System.out.println("<------------------------[SISTEMA ACADEMICO]--------------------->\n");
         System.out.println("-                    1- Gerenciar Professores;");
         System.out.println("-                    2- Gerenciar Alunos;     ");
         System.out.println("\n<--------------------------------------------[ 0- Sair ]--------->\n");
         
            nOpcaoGerencia = scan.Entrada_int();
            
            while(true)
            {
                if (nOpcaoGerencia == 1) // gerenciar PROFESSORES
                {
                    
                }//IF- Professor 
                else
                {
                
                }//ELSE- Aluno
                    
                
            }//WHILE Operações
        
        }//WHILE Gerencia
          
    }//MAIN
    
   /* private void menu_Operacoes(String cabecalho, Scan_Texto scan,  )
    {
                    int nOpcao;
                    
                    System.out.println("<------------------------[ "+cabecalho+" ]--------------------->\n");
                    System.out.println("-                    1- Cadastrar;");
                    System.out.println("-                    2- Excluir;  ");
                    System.out.println("-                    3- Alterar;  ");
                    System.out.println("-                    4- Pesquisar;");
                    System.out.println("\n<----------------------------------------[ 0- Sair ]--------->\n");
                   
                    nOpcao = scan.Entrada_int();
                    
                    switch (nOpcao) 
                    {
                              case 0 :
                                        Scan_Texto.clearConsole();
                                        System.out.println("Saindo..");
                                        break;
                              case 1 :
                                        Scan_Texto.clearConsole();
                                        break;  
                              case 2 :
                                        Scan_Texto.clearConsole();
                                        break;
                              case 3 :
                                        Scan_Texto.clearConsole();
                                        break;
                             default:
                                        Scan_Texto.clearConsole();
                                        break;
                      }
                    
        
    }
    
    
    */
    
}
