package pl.KKJK.fast_food_restaurant

object Products {
    val products: List<Product> = listOf(
        Product(
            name = "testowy-produkt",
            description = "testowy opis",
            price = 10,
            category = "Drinks"
        ),
        Product(
            name = "testowy-produkt2",
            description = "testowy opis3",
            price = 10,
            category = "Burgers"
        )
    )
}

class Product(val name: String, val description: String, val price: Int, val category :String){

}