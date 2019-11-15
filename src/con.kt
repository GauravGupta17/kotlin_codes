fun main(){

    val a = GetName("Gaurav",5)
 var t =   Person("Gaurav","Gupta",23)
      println("from object ->"+ t.firstName)


}




class GetName(var name:String){
   var id:Int=-1
    init {
        println("The Name is $name  ")
    }
constructor(name: String,id:Int):this(name){
    this.id =id
    println("from secondary constructor $name $id")
 }




}