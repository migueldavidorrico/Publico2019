package orricoquiles;

public class Uniones {
    public static void main(String[] args) {
        Perro can = new Perro("Bobby");
        Perro pluto = new Perro("Pluto");
        Gato misifu = new Gato("Misi");
        Palabra para = new Palabra("para", "es su utilidad");
        Palabra caidas = new Palabra("caidas", "ir a tierra rápido");
        System.out.println(can.unir(caidas));
        System.out.println(para.unir(caidas));
    }
}
