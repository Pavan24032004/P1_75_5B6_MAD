tailrec fun fact(n:Int):Int
{
    if(n==1)
    {
        return 1
    }
    return n*fact(n-1)
}
fun main()
{
    println("Enter the number: ")
    var num:Int = readLine()!!.toInt()
    println("Factorial of $num is ${fact(num)}") }

