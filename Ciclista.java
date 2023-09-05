public class Ciclista implements Pessoa {
    private String nome;

    public Ciclista(String nome) {
        this.nome = nome;
    }

    public void pedalar() {
        System.out.println(nome + " está pedalando.");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
