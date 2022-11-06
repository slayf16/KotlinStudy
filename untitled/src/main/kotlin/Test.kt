import java.util.*

///val aaa = 10
/*
        1. ДУмаем, вспоминаем
        2. Metanit
        3. Пиши мне
 */
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
    val num = readLine()!!.toInt()
    numReversed(num)
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

