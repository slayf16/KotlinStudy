import java.util.*

fun main() {
/*    val a = arrayOf(1, 2, 3)

    val b = a.filter { it % 2 == 0 }

    println(a.contentToString())
    println(b)*/

    //task1
    //printEvenNum(0,10)

    //task2
/*    checkCountNum(10,20)
    checkCountNum(1,20)
    checkCountNum(110,201)*/

    //task3 (заполнение через метод?)
/*    var a =  Array<Int>(10){(0..99).random()}
    println(a.contentToString())*/

    //task4 (можно ли как то сделать метод, чтобы он принимал массивы разных типов, кроме перегрузки?)
/*    var a = arrayOf(1,2,3)
    var b = arrayOf(1,2,4,5)
    println(isContains(b,a))*/


    //task5
/*    val a = 2417
    when{
        a == 0 -> println("Понедельник")
        a%7==0 -> println("Понедельник")
        (a-1)%7==0 -> println("Вторник")
        (a-2)%7==0 -> println("Среда")
        (a-3)%7==0 -> println("Четверг")
        (a-4)%7==0 -> println("Пятница")
        (a-5)%7==0 -> println("Суббота")
        (a-6)%7==0 -> println("Воскресенье")
    }*/

    //task6
/*    val num = readLine()!!.toInt()
    numReversed(num)*/

    while (true){
        println("Выберите нужный  вариант\n" +
                "1. Сумма чисел\n" +
                "2. Разность чисел\n" +
                "3. Отношение чисел\n" +
                "4. Умножение чисел\n" +
                "0. Выход")
        try{

            val versionCalculator: Double = readLine()!!.toDouble()
            if(versionCalculator == 0.0){
                break
            }

            when(versionCalculator){
                1.0 -> {
                    println("1. Сумма чисел")
                    workCalculator(versionCalculator)
                }
                2.0 -> {
                    println("2. Разность чисел")
                    workCalculator(versionCalculator)
                }
                3.0 -> {
                    println("3. Отношение чисел")
                    workCalculator(versionCalculator)
                }
                4.0 -> {
                    println("4. Умножение чисел")
                    workCalculator(versionCalculator)
                }
                else -> println(getStringError())
            }

        } catch(e: Exception){
            println("Вы ничего не ввели или ввели не число!")
        }

    }
}
//task1
fun printEvenNum(A:Int, B:Int){
    val range = A.. B
    for(i in range){
        if(i%2 == 0) println(i)
    }
}
//task2
fun checkCountNum (A: Int, B: Int):Boolean{
    val a = A.toString()
    val b = B.toString()
    println(a.count()==b.count())
    return a.count()==b.count()
}

//task4
fun isContains(maxSizeArr:Array<Int>, minSizeArr: Array<Int>):Boolean{
    var Array = Array<Boolean>(minSizeArr.size){false}
    for(i in minSizeArr.indices){
        for(j in maxSizeArr.indices){
            if(minSizeArr[i]==maxSizeArr[j]){
                Array[i] = true
                break
            }
        }
    }
    return !Array.contains(false)
}
//task 6
fun numReversed(A:Int){
    val a = A.toString().reversed()
    var b: String = ""
    for(i in a.indices) {
        b+=a[i]+" "
    }
    println(b.trim())
}




fun getMethodCalc(versionCalculator: Double, Num1: Double, Num2: Double){

    when(versionCalculator){
        1.0 ->  println("$Num1 + $Num2 = ${getSumNumber(Num1, Num2)}")
        2.0 ->  println("$Num1 - $Num2 = ${getDiffNumber(Num1, Num2)}")
        3.0 ->  println("$Num1 / $Num2 = ${getRatioNumber(Num1, Num2)}")
        4.0 ->  println("$Num1 X $Num2 = ${getMultiplicationNumber(Num1, Num2)}")
        else -> println(getStringError())
    }
}

fun getStringError(): String{
    return "Необходимо выбрать цифры от 0 до 4, введенное число не входит в указанный диапазон!"
}

fun getSumNumber(a: Double, b: Double): Double{
    return a + b
}

fun getDiffNumber(a: Double,b: Double): Double{
    return a - b
}

fun getRatioNumber(a:Double, b:Double): Double{
    return a/b
}

fun getMultiplicationNumber(a:Double, b:Double): Double{
    return a*b
}

fun workCalculator(versionCalculator: Double){
    println("Введите число 1")
    val Num1: Double = readLine()!!.toDouble()
    println("Введите число 2")
    val Num2: Double = readLine()!!.toDouble()
    getMethodCalc(versionCalculator,Num1,Num2)

}

