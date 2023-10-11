package example.myapp

import kotlin.math.PI

open class Aquarium (open var length: Int =100, open var width: Int=20, open var height: Int=40) {

    //En kotlin, le constructeur n'est pas défini dans la classe comme dans d'autre langage de POO, mais au niveau de la déclaration de la classe.
    //On utilise le mot clé open pour marquer les propriétés et classes utilisables dans la sous-classe
    open var volume: Int
        get() = width * height * length/1000
        set(value){
            height = (value*100)/(width*length)
        } //Nous définissons des accesseurs ici pour la valeur du volume qui est calculée.

    open val shape="rectangle"
    open var water: Double=0.0
        get()=volume*0.9
    init{
        println("L'aquarium est en cours d'initialisation...")
    }

    //init définit les actions qui se produiront automatiquement dès la création d'un objet aquarium.

    constructor(numberOfFish: Int):this(){
        val tank= numberOfFish * 2000 * 1.1
        height=(tank/(length*width)).toInt()
    }//On ajoute un second constructeur qui implémente de nouvelles fonctions et prend un nouveau paramètre. On fait une surcharge en quelque sorte
    fun printSize(){
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Heigth: $height cm ")
        println(
            "Volume: $volume Litres"
        )
        println("Quantité d'eau: $water Litres (plein à ${water/volume*100.0}%)")


    }
}
//Les getters et les setters sont automatiquement définis avec kotlin
//Nous définissons une nouvelle classe Aquarium dans le package example.myapp, avec les propriétés width, length et height
class TowerTank (override var height: Int, var diameter: Int): Aquarium(height=height, width = diameter, length = diameter ){ //Override est utilisé pour implémenter une propriété de la classe mère
    override var volume: Int
        get() = (width/2 * length/2 * height/1000 * PI).toInt()
        set(value) {
            height = ((value * 1000/ PI)/(width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8
    override val shape = "cylindre"


} // Nous implémentons ici la classe towertank qui hérite de la classe aquarium en implémentant certaines de ses propriétés.

