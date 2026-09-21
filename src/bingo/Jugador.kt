package bingo

class Jugador(
    val cartones: MutableList<Carton>
){
    val id = siguienteId++
    companion object{
        private var siguienteId = 1
    }

    fun generarCarton(num: Int){
    }

}