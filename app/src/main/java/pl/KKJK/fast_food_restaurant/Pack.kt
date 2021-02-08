package pl.KKJK.fast_food_restaurant

object Packs {
   val packs: List<Pack> = listOf(
           Pack(
                   name = "gfdssgfds",
                   price = 23,
                   position = emptyList()
           )
   )
}

class Pack(val name: String, val price: Int, position:List<Products>){

}
