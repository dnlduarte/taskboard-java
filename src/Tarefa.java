import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Tarefa {
    public int id;
    public String titulo;
    public boolean concluida;

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public boolean isConcluida() { return concluida; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }
}

class Program {

    static List<Tarefa> tarefas = new ArrayList<>();
    static int proximoId = 1;
    static Scanner sc = new Scanner(System.in);

    static void adicionar() {
        System.out.print("\nTítulo da tarefa: ");
        String titulo = sc.nextLine();

        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título não pode ser vazio.");
            return;
        }

        Tarefa t = new Tarefa();
        t.setId(proximoId++);
        t.setTitulo(titulo);
        t.setConcluida(false);

        tarefas.add(t);
        System.out.println("Tarefa adicionada!");
    }

    static void excluir(){
        System.out.println("Excluir tarefa");
    }

    static void editar(){
        System.out.println("Editar tarefa");
    }

    static void listar(){
        System.out.println("Listar tarefa");
    }

    public static void main(String[] args){

        while (true) {
            System.out.println("=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar uma Tarefa ");
            System.out.println("2 - Excluir as Tarefas");
            System.out.println("3 - Editar uma Tarefa");
            System.out.println("4 - Listar uma Tarefa");
            System.out.println("5 - Sair");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    adicionar(); break;
                case 2:
                    excluir(); break;
                case 3:
                    editar(); break;
                case 4:
                    listar(); break;
                case 5:
                    return;

                default: System.out.println("Opção inválida.");
            }
        }
    }
}