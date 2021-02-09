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
            description = "Soczysty burger wołowy",
            price = 12,
            category = "Burgers"
        ),
        Product(
            name = "Cheeseburger",
            description = "Soczysty burger wołowy z dodatkiem sera",
            price = 13,
            category = "Burgers"
        ),
        Product(
            name = "DoubleHamburger",
            description = "Soczysty podwójny burger wołowy",
            price = 20,
            category = "Burgers"
        ),
        Product(
            name = "DoubleCheeseburger",
            description = "Soczysty podwójny burger wołowy z podwójną porcją sera",
            price = 22,
            category = "Burgers"
        ),
        Product(
            name = "Hotburger",
            description = "Soczysty, pikantny burger wołowy",
            price = 15,
            category = "Burgers"
        ),
        Product(
            name = "HotCheese",
            description = "Soczysty, pikantny burger wołowy z dodatkiem sera",
            price = 18,
            category = "Burgers"
        ),
        Product(
            name = "Espresso",
            description = "Unikalne połączenie intensywnego smaku i wyjątkowego aromatu dla wielbicieli klasyki. Zawsze świeżo mielone ziarna przed każdym podaniem.",
            price = 7,
            category = "Hot Drinks"
        ),
        Product(
            name = "Kawa czarna",
            description = "100% arabica. Jej pełny aromat i wyjątkowy smak sprawiają, że smakuje naprawdę doskonale.",
            price = 6,
            category = "Hot Drinks"
        ),
        Product(
            name = "Kawa z mlekiem",
            description = "Delikatniejsze wydanie klasycznej czarnej kawy. Jej świeżo zmielone ziarna zapewniają wyjątkowy smak, a dodatek mleka sprawia, że kawa nabiera bardziej subtelnego charakteru.",
            price = 6,
            category = "Hot Drinks"
        ),
        Product(
            name = "Cappuccino",
            description = "Perfekcyjne połączenie delikatności i słodyczy z mocą pobudzającego espresso.",
            price = 9,
            category = "Hot Drinks"
        ),
        Product(
            name = "Herbata",
            description = "Do wyboru: Earl Grey, English Breakfast, Jabłkowo‑Orientalna, Zielona, Korzenna i Owocowa.",
            price = 6,
            category = "Hot Drinks"
        ),
        Product(
            name = "Woda mineralna",
            description = "Gazowana lub niegazowana",
            price = 5,
            category = "Drinks"
        ),
        Product(
            name = "Shake",
            description = "Zimny mleczny koktajl z dodatkiem syropu smakowego",
            price = 10,
            category = "Drinks"
        ),
        Product(
            name = "Sałatka z kurczakiem",
            description = "Wyborna mieszanka sałat z marchewką, soczystymi kawałkami kurczaka, parmezanem, grzankami i pomidorem",
            price = 12,
            category = "Salad"
        ),
        Product(
            name = "Sałatka",
            description = "Lekka i wyśmienita mieszanka sałat z soczystym pomidorem",
            price = 10,
            category = "Salad"
        ),
        Product(
            name = "Sałatka grecka",
            description = "Sałatka zawiera chrupiącą sałatę lodową, pomidorki koktajlowe, świeże ogórki z dodatkiem siekanych oliwek, paprykę świeżą, czerwoną cebulę, ser typu greckiego oraz pieczywo",
            price = 14,
            category = "Salad"
        ),
        Product(
            name = "Sałatka z tuńczykiem",
            description = "Sałatka zawiera chrupiącą sałatę lodową, pomidorki koktajlowe, kawałki tuńczyka z dodatkiem zielonego groszku i kukurydzy oraz pieczywo czosnkowe",
            price = 16,
            category = "Salad"
        )
    )
}

data class Product(val name: String, val description: String, val price: Int, val category :String) {

}