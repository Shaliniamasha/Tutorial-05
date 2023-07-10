object  EvenOddChecker extends App
{
  def isEven(n:Int):Boolean={
    if(n==0)true
    else isOdd(n-1)
  }
  def isOdd(n:Int):Boolean={
    if(n==0)false
    else isEven(n-1)
  }
  val numbers = List(2,7,10,13)
  numbers.foreach{n=>
    if(isEven(n))println(s"$n is Even")
    else println(s"$n is odd")
  }
}