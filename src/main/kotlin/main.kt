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
    println(tabla2.joinToString()) //con joinToString() recorro ttodo el array para despues poder mostrarlo con println
    var tabla3= Array<Int>(10,{it*3})
    println(tabla3.joinToString())
    var tabla4= Array<Int>(10,{it*4})
    println(tabla4.joinToString())

    fun filtroPorLg(length: Int) { //pido un numero que sera el tamaño del del nombre o nombres a querer mostrar
        val names = arrayListOf("Adam","Andrew","Chike","Kechi") // aqui tengo el array con los nombres
        val filterResultado = names.filter {   // .filter Devuelve una lista que contiene solo elementos que coinciden con el predicado dado.
            it.length == length // aqui digo que el tamaño a recorrer es igual a al que le dimos  en la funcion
        }
        println(filterResultado) //imprimo el resultado
    }
    filtroPorLg(6) //aqui llamo a la funcion para decirle de cuntos carateres tiene que recorrer
}
