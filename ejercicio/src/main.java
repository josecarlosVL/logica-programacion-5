import java.util.*;

public class main {
    static void main(String[] args) {
        //HashMap vacío
        HashMap<String, String> diccionario = new HashMap<>();

        //Llenamos con put clave-valor
        diccionario.put("manzana", "apple");
        diccionario.put("pelota", "ball");
        diccionario.put("carro", "car");
        diccionario.put("perro", "dog");
        diccionario.put("huevo", "egg");
        diccionario.put("flor", "flower");
        diccionario.put("jirafa", "giraffe");
        diccionario.put("sombrero", "hat");
        diccionario.put("jugo", "juice");
        diccionario.put("canguro", "kangaroo");
        diccionario.put("leon", "lion");
        diccionario.put("raton", "mouse");
        diccionario.put("enfermera", "nurse");
        diccionario.put("naranja", "orange");
        diccionario.put("loro", "parrot");
        diccionario.put("reina", "queen");
        diccionario.put("arcoíris", "rainbow");
        diccionario.put("araña", "spider");
        diccionario.put("arbol", "tree");
        diccionario.put("paraguas", "umbrella");
        diccionario.put("camioneta", "van");
        diccionario.put("ballena", "whale");
        diccionario.put("cebra", "zebra");

        //Separo las claves en un SET
        Set<String> clavesEsp= diccionario.keySet();
        int opcion = 1;
        do{
        // Se vuelve ArrayList para poder randomizar
        List<String> randomList = new ArrayList<>(clavesEsp);

        // Revuelve un orden random para los términos
        Collections.shuffle(randomList);

        Scanner scanner = new Scanner(System.in);
        int puntaje = 0;
        System.out.println("Traducción español - inglés");
        System.out.println("Instrucciones: Ingresa la traducción de cada término que se presenta. ");
        for (int i=0;i<5;i++){
            System.out.println("Pregunta " + (i + 1) + ": ");
            System.out.print(randomList.get(i) + ": ");
            String respuesta = scanner.nextLine();
            respuesta.toLowerCase();
            if(diccionario.get(randomList.get(i)).equals(respuesta)){
                System.out.println("Respuesta Correcta!!");
                puntaje++;
            } else{
                System.out.print("Respuesta Incorrecta :( . ");
                System.out.println("La respuesta correcta es: " + diccionario.get(randomList.get(i)) + ".");
            }
        }
        System.out.println("Tu puntaje es: " + puntaje +"/5.");
        System.out.println("Para probar de nuevo ingresa 1: ");
        opcion = scanner.nextInt();
    }while(opcion == 1);
        System.out.println("Vuelva pronto");}

}
