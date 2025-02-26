public class Cliente {
 private int id;
 private String nome;
 private String dataNascimento;
 private String email;

 public Cliente(int id, String nome, String dataNascimento, String email) {
     this.id = id;
     this.nome = nome;
     this.dataNascimento = dataNascimento;
     this.email = email;
 }

 public int getId() {
     return id;
 }

 public String getNome() {
     return nome;
 }

 public String getDataNascimento() {
     return dataNascimento;
 }

 public String getEmail() {
     return email;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public void setDataNascimento(String dataNascimento) {
     this.dataNascimento = dataNascimento;
 }
}
