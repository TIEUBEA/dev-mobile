package example.myapp

fun buildAquarium(){
    val myAquarium = Aquarium() //on crée un aquarium avec la hauteur, la largeur et la profondeur par défaut
    myAquarium.printSize() // Nous créons une instance de notre classe et nous appelons une méthode définie
    myAquarium.height = 60
    myAquarium.printSize()

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    val aquarium3= Aquarium(height = 45, length = 95)
    aquarium3.printSize()

    val aquarium4 = Aquarium(numberOfFish = 30)
    aquarium4.printSize()
    aquarium4.volume=70
    aquarium4.printSize()

    val aquarium5 = Aquarium(width = 25, length = 25, height = 40)
    aquarium5.printSize()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main(){
    makeFish()
    buildAquarium()
}