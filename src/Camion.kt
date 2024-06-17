class Camion(
    marque: String,
    anneeFabrication: Int,
    couleur: String,
    val capaciteChargement: Int
) : Vehicule(marque, anneeFabrication, couleur) {
    override fun afficherDetails() {
        super.afficherDetails()
        println("Capacité de chargement: $capaciteChargement kg")
    }

    override fun klaxonner() {
        println("Le camion fait: Honk Honk!")
    }
}
