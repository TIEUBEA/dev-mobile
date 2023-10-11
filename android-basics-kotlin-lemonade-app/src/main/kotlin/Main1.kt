import java.util.*

fun main(args: Array<String>) {

    val isUnit = println ("Ceci est une expression!")
    println(isUnit); //On affecte à une variable le type de retour par défaut en kotlin.

    val temperature = 10
    val isHot = if(temperature>50) true else false // ici la valeur de retour est définie sur true ou faux. On compare la température à une valeur définie et on imprime le résultat de la comparaison (vrai ou faux)
    println(isHot)

    val message = "la température est ${if (temperature>50) "too warm" else "OK"}." //la valeur du message est définie par la valeur retournée par le if
    println(message)

    fun swim(speed: String ="fast"){
        println("swimming $speed")
    } // on crée une fonction swim(), avec un paramètre par défaut de type string, speed, qu'on initialise. La fonction imprime un texte.

    swim()
    swim("slow")
    swim(speed="turtle-like") // Nous faisons successivement un appel par défaut de la fonction swim, ensuite nous lui passons une valeur en paramètre de deux façons différentes


    fun shouldChangeWater (day: String, temperature: Int=22, dirty: Int = 20): Boolean{
        return when{
            temperature>30 ->true
            dirty>30 ->true
            day == "Dimanche" ->true
            else->false
        }
    } // On crée une fonction en précisant son type de retour, Boolean.

    fun fishFood(day: String): String{
        var food=""
        when(day){
            "Lundi"->food="biscuit"
            "Mardi"->food="croquette"
            "Mercredi"->food="Rien aunourd'hui"
            "Jeudi"->food="Riz"
            "Vendredi"->food="beignet"
            "Samedi"->food="tu supportes"
            "Dimanche"->food="légumes"
        }
        return food
    } //Ici on crée une fonction qui renverra la nourriture en fonction du jour de la semaine.

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }// Nous créons une fonction qui fait un random sur une liste de jour de la semaine et nous renvoie un jour

    fun feedTheFish(){
        val day= randomDay()
        val food = fishFood(day)
        println("Aujourd'hui nous sommes $day et le poisson mangera $food")
        println("Faut-il changer l'eau?: ${shouldChangeWater(day)}")
    }// Nous testons avec cette fonction les différentes fonctions implémentées plus haut

    fun isTooHot(temperature: Int) = temperature > 30

    fun isDirty(dirty: Int) = dirty > 30

    fun isSunday(day: String) = day == "Dimanche" // Nous définissons ici des fonctions compactes.

    fun newShouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
        return when {
            isTooHot(temperature) -> true
            isDirty(dirty) -> true
            isSunday(day) -> true
            else  -> false
        }
    } // nous réécrivons la fonction shoulchangewater() avec nos fonctions compactes

    /* LES FONCTIONS LAMBDAS*/

    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel)) // Nous affectons ici unr lambda à waterFilter

    //une autre façon de la déclarer :

    val newWaterFilter: (Int)-> Int = {dirty->dirty/2}// Nous déclarons une variable newWaterFilter qui sera le résultat d'une fonction qui prend un Int en paramètre et retourne une Int

    /*LES FONCTIONS D'ORDRE SUPERIEUR*/
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    } // il s'agit d'une fonction qui prend en paramètre une autre fonction et biensûr elle peut prendre une fonction lambda en paramètre.

    val waterFilterV2: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilterV2))//on affecte une fonction lambda à la variable waterFilterV2 ensuite on passe notre valeur à la fonction updateDirty que nous avons défini plus haut. Cela fonctionne car notre variable waterFilterV2 reçoit une lambda

    fun increaseDirty( start: Int ) = start + 1 //on définit une fonction qui prend un paramère de type Int et l'incrémente.

    println(updateDirty(15, ::increaseDirty)) // un cas d'utilisation d'une fonction d'ordre supérieur où cette dernière prend en paramètre une fonction qui n'est pas une lambda. Il faut pour que ça fonctionne ajouter l'opérateur ::

    var dirtyLevelV2 = 19
    dirtyLevelV2 = updateDirty(dirtyLevelV2) { dirtyLevel -> dirtyLevel + 23} // kotlin préfère que lors de l'utilisation d'une fonction supérieure, la fonction passée en paramètre soit le dernier paramètre. Kotlin a une syntaxe spéciale avec les fonctions lambdas qui ne nécessite même pas qu'elle soit inclus dans la paranthèse de la déclaration de la fonction
    println(dirtyLevelV2)



}
