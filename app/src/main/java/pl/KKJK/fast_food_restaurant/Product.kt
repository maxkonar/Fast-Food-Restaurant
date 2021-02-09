package pl.KKJK.fast_food_restaurant

import android.os.Parcel
import android.os.Parcelable

object Products {
    var products: List<Product> = listOf(
            Product(
                name = "Cola",
                description = "Przepyszna coca-cola prosto z lodówki",
                price = 10,
                category = "Drinks"
            ),
            Product(
                    name = "Fanta",
                    description = "Przepyszna Fanta prosto z lodówki",
                    price = 10,
                    category = "Drinks"
            ),
            Product(
                    name = "Sprite",
                    description = "Przepyszny Sprite prosto z lodówki",
                    price = 10,
                    category = "Drinks"
            ),
            Product(
                    name = "Hop Cola",
                    description = "Przepyszna Hop Cola prosto z lodówki",
                    price = 20,
                    category = "Drinks"
            ),
            Product(
                name = "Hamburger",
                description = "Soczysty hamburger wołowy",
                price = 10,
                category = "Burgers"
            )
    )
}

data class Product(val name: String, val description: String, val price: Int, val category :String) {

}