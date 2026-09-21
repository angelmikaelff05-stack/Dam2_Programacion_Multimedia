package ej1

import java.util.IllegalFormatCodePointException
import java.util.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var r = kotlin.random.Random
    val player = "Player1"
    val bot = "CPU"
    var puntosPlayer = 0
    var puntosBot = 0
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
            puntosPlayer++
        }else{
            println("Ganador $bot")
            listaGanadores.add(Ganador(bot))
            puntosBot++
        }
    }

    println("GANADORES DE CADA RONDA")
    for (i in 0..rondas-1){
        println("Ronda: " + (i+1) + ": "+ listaGanadores[i].nombre)
    }
    println("Player ganó: " + puntosPlayer)
    println("CPU ganó: " + puntosBot)

    if (puntosPlayer > puntosBot){println("GANADOR $player")}
    else if(puntosPlayer < puntosBot){println("GANADOR $bot")}
    else{println("EMPATE")}

    println("Ahora si")



}