package bingo

class GestionJuego {

    fun datos(){
        val jugadores = ArrayList<Jugador>()
        val cartones = mutableListOf<Carton>()
        println("¿Cuantos jugadores van a jugar?")
        var cantidadJugadores : Int = readLine()!!.toInt()

        for (i in 1..cantidadJugadores){
            println("¿Cuantos cartones para el jugador " + (i) + " ?")
            var cantidadCartones : Int = readLine()!!.toInt()
            repeat(cantidadCartones){
                cartones.add(crearCarton())
            }
            jugadores.add(Jugador(cartones))
            cantidadCartones = 0
        }

        for (i in 0..cantidadJugadores-1){
            println("El jugador " + jugadores.get(i).id + " tiene " + jugadores.get(i).cartones + " Cartones")
        }
    }

    fun crearCarton(): Carton{
        val numeros = (1..20).shuffled().take(4)
        println(numeros)
        return Carton(numeros)
    }
}