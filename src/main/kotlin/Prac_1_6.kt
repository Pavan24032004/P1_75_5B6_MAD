import java.util.Scanner fun main(args: Array<String>)
{
    val reader = Scanner(System.`in`)
    println("Enter the Number 1")
    val  num1:Int = reader.nextInt()
    val read = Scanner(System.`in`)
    println("Enter the Number 2")
    val num2:Int = read.nextInt()
    val add = addition(num1,num2)
    val sub = subtraction(num1,num2)
    val mul = multiplication(num1,num2)
    val div = division(num1,num2)
    println("Addition is $add")
    println("Subtraction is $sub")
    println("Multiplication is $mul")
    println("Division is $div")

}
fun addition(num1: Int,num2: Int): Int {

    return num1 + num2
}
fun subtraction(num1: Int,num2: Int): Int
{
    return num1 - num2
}
fun multiplication(num1: Int,num2: Int): Int
{
    return num1 * num2
}
fun division(num1: Int,num2: Int): Int
{
    return num1 / num2
}
