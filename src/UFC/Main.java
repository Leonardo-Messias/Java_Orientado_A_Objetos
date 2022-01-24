package UFC;

public class Main {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Leonardo Messias", "Brasileiro", 20, 15,
                0, 2, 1.69f, 65.0f);
        lutador[1]= new Lutador("Gustavo Messias", "Americano", 22, 11, 1, 0, 1.87f, 89f);

        lutador[0].perdeLuta();
        lutador[0].ganharLuta();
        lutador[0].empatarLuta();
        lutador[0].status();
        lutador[1].status();
    }
}
