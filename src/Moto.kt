class Moto(
    marque: String,
    anneeFabrication: Int,
    couleur: String,
    val aSidecar: Boolean
) : Vehicule(marque, anneeFabrication, couleur) {
    override fun afficherDetails() {
        super.afficherDetails()
        println("Présence de sidecar: ${if (aSidecar) "Oui" else "Non"}")
    }

    override fun klaxonner() {
        println("La moto fait: Vroom Vroom!")
    }
}
