import java.time.LocalDate;
import java.util.Scanner;

public class Main {
 public static void main(String[] agrs) {
  Scanner scanner = new Scanner(System.in);
  Biblioteca biblioteca = new Biblioteca();

  // Criando os Autores
  Autor autor1 = new Autor(1,"J.K. Rowling", LocalDate.of(1965, 7, 31));
  Autor autor2 = new Autor(2, "J.R.R. Tolkien", LocalDate.of(1892, 1, 3));

  // Adicionando livros
  Livro livro1 = new Livro(1, "Harry Potter e a Pedra Filosofal", autor1, LocalDate.now(), LocalDate.now());
  Livro livro2 = new Livro(2, "O Senhor dos Anéis: A Sociedade do Anel", autor2, LocalDate.now(), LocalDate.now());
  Livro livro3 = new Livro(3, "Harry Potter e a Câmara Secreta", autor1, LocalDate.now(), LocalDate.now());

  biblioteca.adicionarLivro(livro1);
  biblioteca.adicionarLivro(livro2);
  biblioteca.adicionarLivro(livro3);

  while (true) {
   System.out.println("Deseja ver os livros disponíveis? (sim/não)");
   String resposta = scanner.nextLine();

   if(resposta.equalsIgnoreCase("sim")) {
    biblioteca.listarLivrosDisponiveis();
    
    System.out.println("Digite o ID do livro que deseja emprestar:");
    int livroId = scanner.nextInt();
    scanner.nextLine();

    Livro livroEscolhido = biblioteca.buscarLivroPorId(livroId);
    if(livroEscolhido != null ) {
     System.out.println("Digite seu nome:");
     String nomeUsuario = scanner.nextLine();
     biblioteca.emprestarLivro(livroEscolhido, nomeUsuario);
    } else{
     System.out.println("Livro não encontrado.");
    }

   } else {
    System.out.println("Fim da aplicação, Obrigado por utilizar nosso sistema.");
    break;
   }
   scanner.close();
  }

 } 
}

