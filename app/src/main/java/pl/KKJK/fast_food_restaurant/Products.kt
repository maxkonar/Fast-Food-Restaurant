package pl.KKJK.fast_food_restaurant

object Products {
    val products: List<Product> = listOf(
            Product(
                name = "Test",
                price = 21,
                amount = 100,
                description = "SOME EXAMPLE TEXT"
            ),
            Product(
                    name = "Test2",
                    price = 22,
                    amount = 100,
                    description = "SOME EXAMPLE TEXT2"
            ),
            Product(
                    name = "Test3",
                    price = 23,
                    amount = 100,
                    description = "SOME EXAMPLE TEXT3"
            )

    )

    class Product(name: String, price: Int, amount: Int, description: String) {

    }
}