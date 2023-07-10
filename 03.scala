object SumCalculator extends App{
  def sum(n:Int):Int = {
    if(n<=0)0
    else n + sum(n-1)
  }
  val result = sum(5)
  println(s"The sum is : $result")
}