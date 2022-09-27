public class App {
    public static void main(String[] args) throws Exception {
        Musica m = new Musica();
        m.reproduzir();
        m.parar();

        Imagem i = new Imagem();
        i.reproduzir();
        i.parar();

        Video v = new Video();
        v.reproduzir();
        v.parar();
    }
}
