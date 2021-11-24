import scala.annotation.tailrec
import scala.io.Source

object AC52043_Character_Count extends App {

  //Step 1 - Input the name of the text one wishes to examine.
  val text : String = "bleak-house.txt"
  println("The Name of the File is : " + text)

  // Step 2 - Prepare the file, by converting to lowercase and keeping only letters.
  val file = Source.fromFile(text).getLines().mkString("\n")
  val fileLower = file.toLowerCase()
  val filestrip = fileLower.replaceAll("[^A-Za-z]+", "")


  //Step 3 - Create a function that counts the frequency of characters in the text.
  def Character_Counter(filename: String) = {
    @tailrec
    def count(chars: List[Char], acc: Map[Char, Int]): Map[Char, Int] = {
      chars match {
        case Nil => acc
        case char :: rest =>
          count(rest, acc + (char -> (acc(char) + 1)))
      }
    }
    count(filename.toList, Map.empty[Char, Int] withDefaultValue 0)
  }

 // Step 4 - Apply the Function, and provide the user with the results.
  val character_count = Character_Counter(filestrip)
  println("The count of each letter in " + text + " is:" )
  println(character_count)
}


