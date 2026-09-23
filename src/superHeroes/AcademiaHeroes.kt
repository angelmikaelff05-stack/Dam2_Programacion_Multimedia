package superHeroes

fun main(){
    val velocista = Velocista()
    val forzudo = Forzudo()
    val telepata = Telepata()

    repeat(3){
        velocista.usarPoder()
        forzudo.usarPoder()
        telepata.usarPoder()
    }
    velocista.mostrarEstado()
    forzudo.mostrarEstado()
    telepata.mostrarEstado()

}

open class SuperHeroe(val nombre: String, var energia: Int, var nivel: Int){
    init {
        println("Se ha creado un superheroe")
    }
    open fun usarPoder(){
        this.energia -= 10
        println("Ha usado su poder de forma generica")
    }
    open fun mostrarEstado(){
        println("El heroe ${this.nombre} tiene de energia ${this.energia} y es de nivel ${this.nivel}")
    }
}

class Velocista(): SuperHeroe("velocista", 100, 1){
    override fun usarPoder(){
        if (this.energia <= 5){
            println("No puede usar poder tiene de energia ${this.energia}")
        }else{
            this.nivel += 2
            this.energia -= 5
            println("Ha usado su energia")
        }
    }
}
class Forzudo(): SuperHeroe("forzudo", 100, 1){
    override fun usarPoder(){
        if (this.energia <= 20){
            println("No puede usar poder tiene de energia ${this.energia}")
        }else{
            this.nivel += 1
            this.energia -= 20
            println("Ha usado su energia")
        }
    }
}
class Telepata(): SuperHeroe("telepata", 100, 1){
    override fun usarPoder(){
        if (this.energia <= 15){
            println("No puede usar poder tiene de energia ${this.energia}")
        }else{
            this.nivel += 3
            this.energia -= 15
            println("Ha usado su energia")
        }
    }
}


