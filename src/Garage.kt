class Garage {
    private val vehicules = mutableListOf<Vehicule>()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
    }

    fun afficherGarage() {
        for (vehicule in vehicules) {
            vehicule.afficherDetails()
            println()
        }
    }

    fun testerKlaxonner() {
        for (vehicule in vehicules) {
            vehicule.klaxonner()
        }
    }
}

