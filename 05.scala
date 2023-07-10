object EvenSumCalculator extends App{
  def evenSum(n:Int):Int={
    if(n<=0)0
    else if(n%2==0)n+evenSum(n-2)
    else evenSum(n-1)
  }
  val result = evenSum(10)
  println(s"The sum of even numbers less than 10 is: $result")
}