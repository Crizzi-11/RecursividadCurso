
package Pilas;

/**
 *
 * @author Cristofer
 */
public class Carro {
    String vehiculo;
    String matricula;

    public Carro(String vehiculo, String matricula) {
        this.vehiculo = vehiculo;
        this.matricula = matricula;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
   }
