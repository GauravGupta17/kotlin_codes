


class Person(val firstName:String,val lastName:String,val age:Int) {

 init {
     println("$firstName $lastName ,$age")
 }


 fun display(name:String){
  println("-------In Person Display fun-------")
  println("$name")
 }


}