public class Main {
    public static void main(String[] args) {
        // Crear objeto CuerpoHumano
        CuerpoHumano cuerpo = new CuerpoHumano();

        // Establecer y mostrar atributos de cada parte del cuerpo humano

        // Corazón
        cuerpo.getCorazon().setLatidosPorMinuto(72);
        cuerpo.getCorazon().setTamano(300);
        cuerpo.getCorazon().setEstadoSalud("Saludable");
        System.out.println("Corazón: " + cuerpo.getCorazon().getLatidosPorMinuto() + " latidos por minuto.");

        // Pulmón izquierdo
        cuerpo.getPulmonIzquierdo().setCapacidadPulmonar(2500);
        cuerpo.getPulmonIzquierdo().setEsIzquierdo(true);
        cuerpo.getPulmonIzquierdo().setEstadoSalud("Normal");
        System.out.println("Pulmón izquierdo capacidad: " + cuerpo.getPulmonIzquierdo().getCapacidadPulmonar() + " ml.");

        // Pulmón derecho
        cuerpo.getPulmonDerecho().setCapacidadPulmonar(2600);
        cuerpo.getPulmonDerecho().setEsIzquierdo(false);
        cuerpo.getPulmonDerecho().setEstadoSalud("Normal");
        System.out.println("Pulmón derecho capacidad: " + cuerpo.getPulmonDerecho().getCapacidadPulmonar() + " ml.");

        // Hígado
        cuerpo.getHigado().setPeso(1.5);
        cuerpo.getHigado().setEstaFuncionando(true);
        cuerpo.getHigado().setEstadoSalud("Saludable");
        System.out.println("Hígado peso: " + cuerpo.getHigado().getPeso() + " kg.");

        // Apendice
        cuerpo.getApendice().setInflamado(false);
        cuerpo.getApendice().setTamano(10);
        cuerpo.getApendice().setEstadoSalud("Normal");
        System.out.println("Apendice estado: " + (cuerpo.getApendice().isInflamado() ? "Inflamado" : "No inflamado"));
    }
}
