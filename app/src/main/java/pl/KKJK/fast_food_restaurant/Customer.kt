package pl.KKJK.fast_food_restaurant

object Customers {
    val customers: List<Customer> = listOf(
            Customer(
                    Login = "login",
                    Password = "password"
            )
    )
}

class Customer(val Login: String, val Password: String){

}