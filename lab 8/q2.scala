import scala.io.StdIn.readInt
object q2 extends App{ 
    val cat:num => Unit = {
        case x if x<0 => println("Negative")
        case x if x==0 => println("Zero")
        case x if x%2==0 => println("Even")
        case x => println("Odd")
    }
    var x = readInt()
    num(x)
}