public abstract class Reprodutor {


    public abstract void reproduzir();

    public void importar(String[] lista) {
        System.out.println("Lista importada");
    }

    public void parar() {
        System.out.println("Reprodutor parou");
    }

    public void embaralhar(String[] lista) {
        System.out.println("Lista embaralhada");
    }
}
