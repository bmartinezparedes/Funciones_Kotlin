import java.util.*

fun main(args: Array<String>) {

    var operacion:(Int,Int)-> Int={numero1:Int, numero2:Int-> numero1+numero2}
    println(operacion(6,5))
    operacion={numero1:Int, numero2:Int-> numero1-numero2}
    println(operacion(6,5))

    var mayor:(Int,Int)-> Boolean={numero1:Int, numero2:Int-> numero1>numero2}
    println(mayor(6,5))
    mayor={numero1:Int, numero2:Int-> numero1%2==0 && numero2%2==0}
    println(mayor(6,5))

    var tabla2= Array<Int>(10,{it*2})
    println(tabla2.joinToString())
    var tabla3= Array<Int>(10,{it*3})
    println(tabla3.joinToString())
    var tabla4= Array<Int>(10,{it*4})
    println(tabla4.joinToString())

    fun filtroPorLg(length: Int) {
        val names = arrayListOf("Adam","Andrew","Chike","Kechi")
        val filterResultado = names.filter {
            it.length == length
        }
        println(filterResultado)
    }
    filtroPorLg(6)
}
