public class CafeExportacion extends Cafe {
    // Constantes y Atributos
    private Integer CIF_BASE = 20;
    private Integer cif;
    private boolean verde;

    // Constructor
    public CafeExportacion() {
        // Código
        this.peso = this.PESO_BASE;
        this.calidadC = this.CALIDAD_C_BASE;
        this.precioBase = this.PRECIO_BASE;
        this.cif = this.CIF_BASE;
        this.verde = false;
        this.tipoCafe = "exportacion";
    }

    public CafeExportacion(Double precioBase, Integer peso) {
        // Código
        this.peso = peso;
        this.calidadC = this.CALIDAD_C_BASE;
        this.precioBase = precioBase;
        this.cif = this.CIF_BASE;
        this.verde = false;
        this.tipoCafe = "exportacion";
    }

    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde) {
        // Código
        this.peso = peso;
        this.calidadC = calidadC;
        this.precioBase = precioBase;
        this.cif = cif;
        this.verde = verde;
        this.tipoCafe = "exportacion";
    }

    // Métodos
    public Double calcularPrecio() {
        // Código
        Double adicion = 0.0;
        adicion = super.calcularPrecio();
        if (this.verde == true) {
            adicion += 50;
        }
        if (this.cif > 40) {
            adicion += this.precioBase * 0.3;
        }
        return adicion;
    }
}