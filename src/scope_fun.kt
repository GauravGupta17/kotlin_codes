fun main() {

    Monitor("120x120", "black", "Dell").let {
        it.color = "Blue"
        println(it)
        it.changeBrand("Apple")
        println(it)
    }


     var monitor = Monitor(
        dimension = "12").apply {

         color = "white"
         brand = "apple"
        monitorType = "123"
        println(this)
    }

    var a =10.also {
        println("from also ${it*it}")
    }





}

data class Monitor(var dimension: String, var color: String="", var brand: String="") {

    lateinit var monitorType: String
    fun changeBrand(newBrand: String) {

        brand = newBrand
    }

}