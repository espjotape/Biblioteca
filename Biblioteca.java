import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
 private List<Livro> livros = new ArrayList<>();
 private List<Emprestimo> emprestimos = new ArrayList<>();

 //Método de Adicionar Livros
 public void adicionarLivro(Livro livro) {
  livros.add(livro);
 }

 //Método de Listar todos os livros disponíveis
 public void listarLivrosDisponiveis() {
  for(Livro livro : livros) {
   if(livro.isDisponivel()) {
    System.out.println(livro.getId() + " - " + livro.getTitulo());
   }
  }
 }

 //Método de Realizar empréstimo de um livro
  public void emprestarLivro(Livro livro, String nomeUsuario) {
   if(livro.isDisponivel()) {
    LocalDate dataEmprestimo = LocalDate.now();
    Emprestimo novoEmprestimo = new Emprestimo(livro, nomeUsuario, dataEmprestimo);
    emprestimos.add(novoEmprestimo);
    livro.setDisponivel(false);
   }else {
    System.out.println("Livro não disponível para empréstimo.");
   }
  }
 
 public Livro buscarLivroPorId(int id) {
  for (Livro livro : livros) {
   if (livro.getId() == id) {
    return livro;
   }
 }
   return null; // Retorna null se o livro não for encontrado
 }
 }
