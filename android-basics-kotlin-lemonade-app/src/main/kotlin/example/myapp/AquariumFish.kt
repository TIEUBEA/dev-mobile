package example.myapp

interface FishColor{
    val color: String
}

//abstract class AquariumFish {
//    abstract val color: String
//} //Nous définissons une classe abstraite, pour des objets dont les attributs ne peuvent pas être généralisés.
interface FishAction{
    fun eat()// on définit des méthodes dans cette interface. Méthodes qui sont par la suite surchargées dans les définitions
}

class PrintingFishAction(val food: String): FishAction{
    override fun eat() {
        println(food)
    }
}

object GoldColor: FishColor{
    override val color = "gold"
}

object GreyColor: FishColor{
    override val color="grey"
}
//class Shark : FishColor, FishAction{
//    override val color = "grey"
//    override fun eat(){
//        println("hunt and eat fish")
//    }
//}

class Shark(fishColor: FishColor=GreyColor): FishColor by fishColor, FishAction by PrintingFishAction("hunt and eat fish") //Nous utilisons ici la déléguation d'interfaces pour définir les propriétés de nos poissons

//class Plecostomus: FishColor, FishAction{
//    override val color ="gold"
//    override fun eat(){
//        println("eat algae")
//    }
//}

//class Plecostomus: FishColor by GoldColor, FishAction{
//    override fun eat(){
//        println("eat algae")
//    }
//}

//class Plecostomus(fishColor: FishColor = GoldColor):FishAction, FishColor by GoldColor{
//    override fun eat(){
//        println("eat algae")
//    }
//}

class Plecostomus(fishColor: FishColor = GoldColor):FishAction by PrintingFishAction("eat algae"), FishColor by GoldColor





