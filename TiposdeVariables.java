public class TiposdeVariables {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //tipos de variables (Las más usadas)
        //ENTERAS
        byte entero = 12; //almacenamiento en la memoria = 8
        short enterodos = 12456; //aelm = 16
        int enterotres = 1245656; // aelm = 32
        long enterocuatro = 124565688; // aelm = 64 
        // DECIMALES
        //IMPORTANTE: en float siempre se pone "f" al final
        float decimal = 3.45f; // aelm = 32 
        double decimaldos = 4.56; // aelm = 64
        // CARACTERES
        char caracter = 'a';
        // BOOLEANO
        boolean decision = true;

        //System.out.println(""); es para imprimir
        System.out.println("Variable tipo Byte: " +entero);
        System.out.println("Variable tipo short: " +enterodos);
        System.out.println("Variable tipo int: " +enterotres);
        System.out.println("Variable tipo long: "+enterocuatro);
        System.out.println("Variable tipo float: "+decimal);
        System.out.println("Variable tipo double: "+decimaldos);
        System.out.println("Variable tipo char: "+caracter);
        System.out.println("Variable tipo boolean: "+decision);

    }
}
