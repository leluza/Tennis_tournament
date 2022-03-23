import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tournament {


        //herencia?

        public static void main ( String[] args)
        {
      /*
      tomar del usuario
      a) nombre del torneo
      b) nombre de los jugadores
      c) cantidad de sets 3 o 5
      d) % de exito de cada jugador
      */

            Scanner input = new Scanner(System.in);

            String tournament;
            System.out.println("Ingrese nombre del torneo: ");
            tournament = input.next();

            String first_player;
            System.out.println("Ingrese nombre del primer jugador: ");
            first_player = input.next();

            String p1_success;
            System.out.println("Ingrese nombre del primer jugador: ");
            p1_success = input.next();

            String second_player;
            System.out.println("Ingrese nombre del segundo jugador: ");
            second_player = input.next();

            String p2_success;
            System.out.println("Ingrese nombre del primer jugador: ");
            p2_success = input.next();

            String sets_amount;
            System.out.println("Ingrese el numero de sets: ");
            sets_amount = input.next();



            //hacer sets hasta que se cumpla (c)
            //hacer puntos hasta que se cumpla el set
            //hacer puntos, implica definir un ganador, haciendo uso de la fucion
            // aleatoria, y de los porcentajes de exito.
            //al punto generado, sumarlo al score del jugador correspondiente,
            //con la escala determinada 0,15,30,40, N-ventajas
            // al inicio del set el jugador que saca inicialmente en el game
            //jugar();

            //por cada punto mmostrar
            //ganador
            int match = 0;
            int point_winner = jugar();
            match++;
            System.out.println("El ganador es " + point_winner);
            // rsultado parcial del game
            List<Integer> points_p1 = new ArrayList<>();
            List<Integer> points_p2 = new ArrayList<>();

            // 0, 15, 30, 45, juego o ventaja
            // 6 juegos son un set

            List<Integer> winner_list= ( point_winner == 1 )? points_p1 : points_p2;
            List<Integer> loser_list = ( point_winner == 1 )? points_p1 : points_p2;
            switch (match){
                case 1: winner_list.add(15); loser_list.add(0);
                case 2: winner_list.add(30);loser_list.add(0);
                case 3: winner_list.add(45); loser_list.add(0);
                case 4:
            }


            //evaluar condicion de fin de set -->  condicion de fin de set: hasta que algun jugador tengo 40p
            // o que, pasados los 40p, uno de ellos gane 2 veces consecutivas

            //al finalizar el set, imprimir el ganador y el resultado parcial del set.
            //evaluar la condicion de fin de torneo


            //al finalizar el torneo, imprimir el nombre del ganador y del torneo
            //imprimir el resultado de los set con formato
            //


            //preguntar si desea volver a jugar
        }

        // jugar es un metodo que devuelve el identificador del jugadr que gano
        // debe ser una ejecucion aleatoria que contemple los porcentajes de exito
        public static int jugar(){
            return 0;
        }



}
