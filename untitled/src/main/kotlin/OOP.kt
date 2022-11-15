
/*sealed class NR(val name: String){

    object Uni : AnimalAction(name)
    class Suces(val result: String) : AnimalAction(name)
    class Error(error: Error, eroorCode: INT) : AnimalAction(name)
}

fun main() {
  val action = AnimalAction()

    val aaa = when(action) {
        is AnimalAction.Jump -> ""
        is AnimalAction.Run -> ""
    }
}

fun a(jump:  AnimalAction.Jump) {

}*/

//вопрос про is