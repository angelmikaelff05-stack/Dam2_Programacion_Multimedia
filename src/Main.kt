import ej1.Ganador
import java.util.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var r = kotlin.random.Random
    val player = "Player1"
    val bot = "CPU"
    val listaGanadores = ArrayList<Ganador>()
    println("---JUEGO DE PIEDRA, PAPEL, TIJERA---")

    println("¿Cuantas rondas jugaras?")
    val rondas: Int = readLine()!!.toInt()

    repeat(rondas){
        println("PIEDRA(R), PAPEL(P), TIJERAS(S)")
        var opc = readLine()
        var random = r.nextInt(1, 4)

        if ((opc.equals("R") && random == 1) || (opc.equals("P") && random == 2) ||
            (opc.equals("S") && random == 3)){
            println("EMPATE")
            listaGanadores.add(Ganador("Empate"))
        }else if ((opc.equals("R") && random == 3) || (opc.equals("P") && random == 1) ||
            (opc.equals("S") && random == 2)){
            println("Ganador $player")
            listaGanadores.add(Ganador(player))
        }else{
            println("Ganador $bot")
            listaGanadores.add(Ganador(bot))
        }
    }
    println("GANADORES DE CADA RONDA")
    for (i in 1..rondas){
        println("Ronda: $i: " + listaGanadores[i].nombre)
    }



}