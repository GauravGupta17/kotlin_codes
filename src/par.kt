//abstract class ,members ,fun implementaions

abstract class Parent{

    abstract var name:String

    abstract fun sum()
    abstract fun add()

}


interface DNA{


    var s:String

    fun add()
    fun sub()
    fun multi(

    )

    fun ano() {
        println("Hello")
    }

}




class Child:DNA{
    override var s: String = " "


    var c :DNA = Child()

    override fun add() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sub() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun multi() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun go(){
        println("GOOOOing")
    }


}