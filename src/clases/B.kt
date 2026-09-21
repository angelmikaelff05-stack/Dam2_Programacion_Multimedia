package clases

class Circle(var radius: Double) {
    constructor(name: String) : this(3.0){
        print(name)
    }

    constructor(diameter: Int): this(diameter/2.0){
        print("In diameter constructor")
    }
    init {
        print("Area: ${Math.PI * radius * radius}")
    }


}

fun main(){
    val c = Circle(4.0)
}