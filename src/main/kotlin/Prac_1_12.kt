fun main(){
    println("using third variable")
    var a=5
    var b=1
    println("***Before swapping***")
    println("a=$a")
    println("b=$b")
    println("***After swapping***")
    var c=a
    a=b
    b=c
    println("a=$a")
    println("b=$b")
    println("")
    println("without using third variable")
    var a1=5
    var b1=1
    println("***Before swapping***")
    println("a1=$a1")
    println("b1=$b1")
    println("***After swapping***")
    a1=a1-b1 //5-1=4
    b1=a1+b1 //4+1=5
    a1=b1-a1 //5-4=1
    println("a1=$a1")
    println("b1=$b1")
}
