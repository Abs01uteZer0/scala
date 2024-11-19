import scala.util.Random

//11. Распечатайте текст предложения, который содержит наибольшее количество слов.
object lab_rab_1 extends App {

  // Генерация случайных предложений
  def generateSentences(numSentences: Int): List[String] = {
    val words = List("Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing")
    (1 to numSentences).toList.map { _ =>
      (1 to Random.nextInt(10) + 1).map(_ => words(Random.nextInt(words.length))).mkString(" ")
    }
  }

  // Поиск предложения с наибольшим количеством слов
  def findLongestSentence(sentences: List[String]): String = {
    sentences.maxBy(_.split(" ").length)
  }

  // Главная программа
  val sentences = generateSentences(5) // Генерируем 5 предложений
  println("Generated Sentences:")
  sentences.foreach(println)

  val longestSentence = findLongestSentence(sentences)
  println(s"\nSentence with the most words:\n$longestSentence")
}