package es.orricoquiles.arraylist;


import java.math.BigDecimal;

public class PruebaAlmacen {
    public static void main(String[] args) {
        Almacen nuevoAlmacen = new Almacen();
        nuevoAlmacen.addBebida(new AguaMineral("bez-001", 2, BigDecimal.valueOf(1.5), "Bezolla", "Manantial"));
        nuevoAlmacen.addBebida(new AguaMineral("lan-001", 1, BigDecimal.valueOf(0.75), "Lanjaron", "Sierra Nevada"));
        nuevoAlmacen.addBebida(new AguaMineral("sol-001", 1, BigDecimal.valueOf(1), "Solan de cabras", "Sierra de Cuenca"));
        nuevoAlmacen.addBebida(new BebidaAzucarada("fan-001", 1, BigDecimal.valueOf(1.5), "Fanta de Naranja", 12.01, false));
        nuevoAlmacen.addBebida(new BebidaAzucarada("coc-001", 2, BigDecimal.valueOf(3.5), "Coca Cola", 28.8, false));
        nuevoAlmacen.addBebida(new BebidaAzucarada("acu-001", 3, BigDecimal.valueOf(3.76), "Acuarius", 5.86, true));
        nuevoAlmacen.addBebida(new BebidaAzucarada("coc-002", 2, BigDecimal.valueOf(2.89), "Pepsi Cola", 18, true));
        System.out.println(nuevoAlmacen.inventario());
        nuevoAlmacen.removeBebida("coc-002");
        System.out.println(nuevoAlmacen.inventario());
        System.out.println(nuevoAlmacen.precioTotalAlmacen());
        System.out.println(nuevoAlmacen.precioDeMarca("Coca"));
        //System.out.println(nuevoAlmacen.precioEstanteria());
    }
}

