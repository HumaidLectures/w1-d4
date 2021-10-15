import java.lang.Exception
import kotlin.math.sqrt

fun main() {
    val x:Int? = null

    if (x== null){
        throw NullPointerException()
    }

    try {
        println(sqrt(-50.5))
    }catch (e : ArithmeticException){
        println(e.localizedMessage)
    }


}