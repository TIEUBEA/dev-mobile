import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")


    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")//définition d' une liste de décorations d'aquarium au niveau supérieur avec listOf()
    println( decorations.filter {it[0] == 'p'}) //Le code de la condition de filtre est entre accolades {}et it fait implicitement référence à chaque élément lorsque le filtre parcourt la liste. Si l'expression renvoie true, l'élément est inclus.


    val filtered = decorations.asSequence().filter { it[0] == 'p' } // évaluons le filtre à l'aide d'un Sequencewith asSequence(). Attribuons la séquence à une variable appelée filteredet.

    println("filtered: $filtered") // affichons le

    val newList = filtered.toList() // forcons l'evaluation de la sequennce  en convertissant List en utilsant la fonction tolist
    println("new list: $newList") // affichage de la nouvelle list

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }


    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")


    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")

    feedTheFish()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
} // cette fonction appelle la fonction randomDay() pour obtenir un jour aleatoire dans la semaine et affiche un message food que le poisson mangera ce jour

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
} // cette fonction  choisir un jour aléatoire dans un tableau et le renvoyer. elle utilise la fonction nextInt() qui prend une limite entière, qui limite le nombre de Random()0 à 6 pour correspondre au week tableau.


fun fishFood (day : String) : String {
    var food = ""
    when (day) {
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
        else -> food = "nothing"
    }
    return food
} /* ici on utilise l"expression when pour choisir differents aliments pour differents jours.
    le else nous permet d'ajouter une branche suplementaire
   */


