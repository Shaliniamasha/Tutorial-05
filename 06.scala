object FibonacciPrinter extends App {
  def fibonacci(n: Int): List[Int] = {
    def fibonacciHelper(i: Int, fibSeq: List[Int]): List[Int] = {
      if (i <= 0) fibSeq.reverse
      else if (i == 1) fibonacciHelper(i - 1, 0 :: fibSeq)
      else if (i == 2) fibonacciHelper(i - 1, 1 :: 0 :: fibSeq)
      else {
        val sum = fibSeq.head + fibSeq.tail.head
        fibonacciHelper(i - 1, sum :: fibSeq)
      }
    }
    fibonacciHelper(n, List(1, 0))
  }
  val n = 10
  val fibNumbers = fibonacci(n)
  println(s"The first $n Fibonacci numbers are: ${fibNumbers.mkString(", ")}")
}