public class Maratonista implements Corredor {
    private String nome;

    public Maratonista(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo como maratonista.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}