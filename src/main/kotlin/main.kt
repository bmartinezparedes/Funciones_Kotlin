fun main(args: Array<String>) {

    var operacion:(Int,Int)-> Int={numero1:Int, numero2:Int-> numero1+numero2}
    println(operacion(6,5))
    operacion={numero1:Int, numero2:Int-> numero1-numero2}
    println(operacion(6,5))

}