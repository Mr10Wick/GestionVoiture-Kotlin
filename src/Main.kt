fun main() {
    val garage = Garage()

    val voiture = Voiture("Toyota", 2020, "Rouge", 4)
    val camion = Camion("Mercedes", 2018, "Blanc", 10000)
    val moto = Moto("Harley-Davidson", 2021, "Noir", true)

    garage.ajouterVehicule(voiture)
    garage.ajouterVehicule(camion)
    garage.ajouterVehicule(moto)

    println("Détails du garage:")
    garage.afficherGarage()

    println("Test des klaxons:")
    garage.testerKlaxonner()
}
