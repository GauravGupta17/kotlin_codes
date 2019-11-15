fun main() {

    normal.hello.a = 90
    normal.climb()


}

class normal() {
    companion object hello {
        init {
            print("from init")
        }

        var a: Int = 0

        fun climb() {
            print("climbing")
        }

    }


}
