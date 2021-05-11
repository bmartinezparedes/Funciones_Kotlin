fun main(args: Array<String>) {

    var operacion:(Int,Int)-> Int={numero1:Int, numero2:Int-> numero1+numero2}
    println(operacion(6,5))
    operacion={numero1:Int, numero2:Int-> numero1-numero2}
    println(operacion(6,5))

    var mayor:(Int,Int)-> Boolean={numero1:Int, numero2:Int-> numero1>numero2}
    println(mayor(6,5))
    mayor={numero1:Int, numero2:Int-> numero1%2==0 && numero2%2==0}
    println(mayor(6,5))


}