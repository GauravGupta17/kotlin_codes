 interface WhoCanCode {

    fun code()
}

interface WhoCanDesign {

    fun design()
}


 class  Employee(coder: WhoCanCode,Designer:WhoCanDesign) :WhoCanCode by coder,WhoCanDesign by Designer




 internal class FastCoder : WhoCanCode {


     override fun code() {

         println("coding")
     }
 }

 internal class GoodDesigner : WhoCanDesign {

     override fun design() {
         println("Design by Good Design")
     }
 }


 fun main(){
     val a = Employee(FastCoder(),GoodDesigner())
     a.code()
     a.design()


 }