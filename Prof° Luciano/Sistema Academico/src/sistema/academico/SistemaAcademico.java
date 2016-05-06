package sistema.academico;

import sistema.academico.lib.Scan_Texto;
import sistema.academico.Work_data.*;

public class SistemaAcademico {

    public static void main(String[] args) {

        Scan_Texto scan = new Scan_Texto();
        int nOpcaoGerencia, nOpcao, codigo;

        while (true) {

            System.out.println("<------------------------[SISTEMA ACADEMICO]--------------------->\n");
            System.out.println("-                    1- Gerenciar Professores;");
            System.out.println("-                    2- Gerenciar Alunos;     ");
            System.out.println("\n<--------------------------------------------[ 0- Sair ]--------->\n");

            nOpcaoGerencia = scan.Entrada_int();

            if (nOpcaoGerencia == 1) // gerenciar PROFESSORES
            {
                Professor professor = new Professor();
                VetorProfessor vetProfessor = new VetorProfessor();
                while (true) {

                    System.out.println("<------------------------[ PROFESSOR ]--------------------->\n");
                    System.out.println("-                    1- Cadastrar;");
                    System.out.println("-                    2- Excluir;  ");
                    System.out.println("-                    3- Alterar;  ");
                    System.out.println("-                    4- Pesquisar(Codigo);");
                    System.out.println("-                    5- Pesquisar(Registro);");
                    System.out.println("\n<----------------------------------------[ 0- Sair ]--------->\n");

                    nOpcao = scan.Entrada_int();

                    switch (nOpcao) {
                        case 0:
                            Scan_Texto.clearConsole();
                            System.out.println("Saindo..");
                            break;
                        case 1:

                            System.out.print("Digite o nome do professor: ");
                            professor.setNome(scan.Entrada_str());
                            System.out.print("Digite o Endereco: ");
                            professor.setEndereco(scan.Entrada_str());
                            System.out.print("Digite o telefone: ");
                            professor.setTelefone(scan.Entrada_str());
                            System.out.print("Digite Codigo de Registro: ");
                            professor.setRegistro(scan.Entrada_str());
                            System.out.print("Digite a Matéria: ");
                            professor.setMateria(scan.Entrada_str());

                            vetProfessor.adiciona(professor);
                            Scan_Texto.clearConsole();

                            break;
                        case 2:

                            System.out.print("Digite o Código do Aluno que deseja excluir: ");
                            codigo = scan.Entrada_int();
                            System.out.print("Deseja realmente excluir?(S ou N)");
                            String confirmacao = scan.Entrada_str();

                            if (confirmacao == "s" || confirmacao == "S") {
                                vetProfessor.remove(codigo);
                            } else {
                                System.out.print("Operação cancelada.");
                            }

                            Scan_Texto.clearConsole();
                            break;

                        case 3:

                            System.out.print("Digite o Código do Aluno que deseja Alterar: ");
                            codigo = scan.Entrada_int();

                            professor = vetProfessor.pega(codigo);
                            System.out.print("Digite o nome do professor: ");
                            professor.setNome(scan.Entrada_str());
                            System.out.print("Digite o Endereco: ");
                            professor.setEndereco(scan.Entrada_str());
                            System.out.print("Digite o telefone: ");
                            professor.setTelefone(scan.Entrada_str());
                            System.out.print("Digite Codigo de Registro: ");
                            professor.setRegistro(scan.Entrada_str());
                            System.out.print("Digite a Matéria: ");
                            professor.setMateria(scan.Entrada_str());

                            vetProfessor.adiciona(codigo, professor);
                            System.out.print("Cadastro Alterado com sucesso!");

                            Scan_Texto.clearConsole();
                            break;
                        case 4:
                            System.out.print("Digite o Código do Aluno que deseja pesquisar: ");
                            codigo = scan.Entrada_int();

                            professor = vetProfessor.pega(codigo - 1);
                            System.out.println("\n\t\tPROFESSOR\n\tNome: " + professor.getNome()
                                    + "\n\tEndereço: " + professor.getEndereco()
                                    + "\n\tTelefone: " + professor.getTelefone()
                                    + "\n\tRegistro: " + professor.getRegistro()
                                    + "\n\tMatéria: " + professor.getMateria());

                            break;
                        default:
                            Scan_Texto.clearConsole();
                            break;

                    }
                }// LOOP INFINITO - PROFESSOR
            }//IF- Professor 
            else {

                Aluno aluno = new Aluno();
                VetorAluno vetAluno = new VetorAluno();

                while (true) {
                    System.out.println("<------------------------[ ALUNO ]--------------------->\n");
                    System.out.println("-                    1- Cadastrar;");
                    System.out.println("-                    2- Excluir;  ");
                    System.out.println("-                    3- Alterar;  ");
                    System.out.println("-                    4- Pesquisar(Codigo);");
                    System.out.println("-                    5- Pesquisar(RA);");
                    System.out.println("\n<----------------------------------------[ 0- Sair ]--------->\n");

                    nOpcao = scan.Entrada_int();

                    switch (nOpcao) {
                        case 0:
                            Scan_Texto.clearConsole();
                            System.out.println("Saindo..");
                            break;
                        case 1:

                            aluno.setNome(scan.Entrada_str());
                            aluno.setEndereco(scan.Entrada_str());
                            aluno.setTelefone(scan.Entrada_str());
                            aluno.setRa(scan.Entrada_str());
                            aluno.setCurso(scan.Entrada_str());

                            vetAluno.adiciona(aluno);

                            Scan_Texto.clearConsole();
                            break;
                        case 2:
                            System.out.print("Digite o Código do Aluno que deseja excluir: ");
                            codigo = scan.Entrada_int();
                            System.out.print("Deseja realmente excluir?(S ou N)");
                            String confirmacao = scan.Entrada_str();

                            if (confirmacao == "s" || confirmacao == "S") {
                                vetAluno.remove(codigo);
                            } else {
                                System.out.print("Operação cancelada.");
                            }

                            Scan_Texto.clearConsole();
                            break;
                        case 3:
                            System.out.print("Digite o Código do Aluno que deseja Alterar: ");
                            codigo = scan.Entrada_int();

                            aluno = vetAluno.pega(codigo);
                            System.out.print("Digite o nome do aluno: ");
                            aluno.setNome(scan.Entrada_str());
                            System.out.print("Digite o Endereco: ");
                            aluno.setEndereco(scan.Entrada_str());
                            System.out.print("Digite o telefone: ");
                            aluno.setTelefone(scan.Entrada_str());
                            System.out.print("Digite o RA: ");
                            aluno.setRa(scan.Entrada_str());
                            System.out.print("Digite o Curso: ");
                            aluno.setCurso(scan.Entrada_str());

                            vetAluno.adiciona(codigo, aluno);
                            System.out.print("Cadastro Alterado com sucesso!");

                            Scan_Texto.clearConsole();
                            break;
                        case 4:
                            
                            System.out.print("Digite o Código do Aluno que deseja pesquisar: ");
                            codigo = scan.Entrada_int();

                            aluno = vetAluno.pega(codigo - 1);
                            System.out.println("\n\t\tALUNO\n\tNome: " + aluno.getNome()
                                    + "\n\tEndereço: " + aluno.getEndereco()
                                    + "\n\tTelefone: " + aluno.getTelefone()
                                    + "\n\tRA: " + aluno.getRa()
                                    + "\n\tCurso: " + aluno.getCurso());
                        
                            
                            break;
                        default:
                            Scan_Texto.clearConsole();

                            break;

                    }

                }
            }//ELSE- Aluno

        }//WHILE Gerencia

    }//MAIN

}// CLASS MAIN.
