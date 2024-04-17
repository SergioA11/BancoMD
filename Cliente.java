package BancoMD;

public class Cliente {
        
        String nombre; 
        String cedula;

        public Cliente(String nombre, String cedula){
            this.nombre = nombre;
            this.cedula = cedula;
        }
        public String getCedula(){
                return this.cedula;
        }

        public String getNombre(){
                return this.nombre;
        }
}
