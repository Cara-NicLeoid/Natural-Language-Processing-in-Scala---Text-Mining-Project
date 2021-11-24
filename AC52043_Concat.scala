object AC52043_Concat {
  def main(args: Array[String]) {
    //Step 1- Create First List
    val List_A  = List(1, 2, 3)
    println("List_A holds " + List_A)

    //Step 2- Create Second List
    val List_B = List(4, 5, 6)
    println("List_B holds " + List_B)

    //Step 2- Concat the first and second list and report results to the user.
    println("Concatinating List_A with List_B ")
    val Concat = List_A ::: List_B
    println("Concat List holds : " + Concat)
  }
}
