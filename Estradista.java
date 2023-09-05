public class Estradista extends Ciclista implements Corredor {
    public Estradista(String nome) {
        super(nome);
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo como estradista.");
    }
}