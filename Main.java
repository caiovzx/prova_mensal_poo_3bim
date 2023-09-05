public class Main {
    public static void main(String[] args) {
        Estradista estradista = new Estradista("Carlos");
        Maratonista maratonista = new Maratonista("Ana");

        estradista.pedalar();
        maratonista.correr();

        estradista.setNome("Carlos Silva");
        System.out.println("Nome do estradista: " + estradista.getNome());
    }
}
