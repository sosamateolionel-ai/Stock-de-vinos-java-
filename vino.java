public class vino {

    String etiqueta;
    String varietal;
    double precio;
    int stockBotellas;

    // Constructor: valida que el stock inicial no sea negativo
    vino(String etiquetaVino, String varietalVino, double precioVino, int stockBotella) {

        etiqueta = etiquetaVino;
        varietal = varietalVino;
        precio = precioVino;

        if (stockBotella < 0) {
            System.out.println("Stock inicial inválido, se asigna 0.");
            stockBotellas = 0;
        } else {
            stockBotellas = stockBotella;
        }
    }

    // Vende botellas, verificando que haya stock suficiente
    void venderBotellas(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
            return;
        }
        if (cantidad > stockBotellas) {
            System.out.println("Stock insuficiente para vender " + cantidad + " botellas de " + etiqueta
                    + ". Stock actual: " + stockBotellas);
        } else {
            stockBotellas -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " botellas de " + etiqueta);
        }
    }

   
    void reponerStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a reponer debe ser mayor a 0.");
            return;
        }
        stockBotellas += cantidad;
        System.out.println("Stock repuesto: +" + cantidad + " botellas de " + etiqueta);
    }

    void mostrarEstado() {
        System.out.println("Estado del inventario ");
        System.out.println("Etiqueta: " + etiqueta);
        System.out.println("Varietal: " + varietal);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock actual: " + stockBotellas + " botellas");
        System.out.println("");
    }

    public static void main(String[] args) {

        vino vino1 = new vino("Trapiche Medalla", "Malbec", 8500.0, 50);

        vino1.mostrarEstado();

        
        vino1.venderBotellas(12);

        
        vino1.venderBotellas(100);

       
        vino1.reponerStock(30);

        
        vino1.mostrarEstado();
    }
}