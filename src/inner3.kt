
fun main()
{

    val a = Outer12.Inner45()
    a.fac()

}
class Outer12 {


    class Inner45 {

        fun fac(){
            print("from the inner Method")
        }




    }



}