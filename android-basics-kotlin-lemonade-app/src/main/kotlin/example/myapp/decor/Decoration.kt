package example.myapp.decor

data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String){

}

enum class Color(val rgb: Int){
    RED(0XFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

fun makeDecorations(){
    val decoration1 = Decoration("granite")
    println(decoration1)
    val decoration2 = Decoration("slate")
    println(decoration2)
    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    val d5= Decoration2("crystal", "wood","diver")
    println(d5)

    val(rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun main(){
    makeDecorations()

}