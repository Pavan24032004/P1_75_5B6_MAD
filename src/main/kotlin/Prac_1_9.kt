import kotlin.math.max
fun main(args:Array<String>) {
    println("----------------------------")
    var ary: IntArray = intArrayOf(15, 1, 8, 90, 20, 0)
    var max_val = ary[0]
    for (i in ary) {
        if (i > max_val) {
            max_val = i
        }
    }
    println("Array:")
    for (i in ary) {
        print(" " + i + " ")
    }
    println("\n-------------------------------")
    println("Maximum value is:" + max_val)
}
