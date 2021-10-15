public class concatenacionCadena {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo +" "+ usuario;
        System.out.println("Union: " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);
        //de izq a der, si encuentra primero
        //una suma, realiza la suma
        System.out.println(i + j +" "+  usuario);
        //de der a izq, si encuentra primero
        //una cadena, toma todo como cadena, y concatena
        //en vez de sumar
        System.out.println(usuario +" "+ i + j);
        //de der a izq, si encuentra primero
        //una cadena, toma todo como cadena, y concatena
        //en vez de sumar, PERO si quiero que sume, lo pongo
        //entre parentisis y va a realizar la suma, (por el orden)
        //de prioridad, quedarian Juan 7
        System.out.println(usuario +" "+ (i + j));
    }
}
