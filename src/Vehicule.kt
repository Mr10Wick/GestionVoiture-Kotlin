open class Vehicule(
    val marque: String,
    val anneeFabrication: Int,
    val couleur: String
) {
    open fun afficherDetails() {
        println("Marque: $marque, Année: $anneeFabrication, Couleur: $couleur")
    }

    open fun klaxonner() {
        println("Le véhicule klaxonne!")
    }
}
