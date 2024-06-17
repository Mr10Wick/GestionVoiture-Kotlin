class Voiture(
    marque: String,
    anneeFabrication: Int,
    couleur: String,
    val nombrePortes: Int
) : Vehicule(marque, anneeFabrication, couleur) {
    override fun afficherDetails() {
        super.afficherDetails()
        println("Nombre de portes: $nombrePortes")
    }

    override fun klaxonner() {
        println("La voiture fait: Bip Bip!")
    }
}
