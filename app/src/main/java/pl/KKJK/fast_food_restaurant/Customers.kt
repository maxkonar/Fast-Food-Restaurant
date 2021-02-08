package pl.KKJK.fast_food_restaurant

object Customer {
    val Customers: List<customer> = listOf(
            customer(
                    login = "test_login",
                    password = "123456"
            ),
            customer(
                    login = "test_login2",
                    password = "1234567"

            )
    )

    class customer(login: String, password: String) {

    }
}