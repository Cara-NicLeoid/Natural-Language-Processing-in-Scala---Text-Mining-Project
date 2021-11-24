import scala.io.Source

object AC52043_Word_Count extends App {

  // Step 1 - User to provide name of the text to be examined.
  val text = "bleak-house.txt"
  println("The Name of the File is : " + text)

  // Step 2 - Create WordCount function.
  def WordCount(file: String) {
    // function counts words in a file, where words are identified by one or more whitespaces.
    val src = Source.fromFile(file)
    val wordcount =
      (for {
        lines <- src.getLines
      } yield {
        val words = lines.split("\\s+")
        words.size
      }).sum
    println("Total wordcount in the file is : " + wordcount)
  }
  // Step 3 - Apply the WordCount function to the text.
  WordCount(text)
}
