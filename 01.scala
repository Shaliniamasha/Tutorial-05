object PrimeChecker extends App{
  def  isPrime(n:Int):Boolean ={
    def isPrimeHelper(i:Int):Boolean={
      if(i<=1)true
      else if(n%i==0)false
      else isPrimeHelper(i-1)
    }
    isPrimeHelper(n/2)
  }
  val numbers = List(5,8,13,20)
  numbers.foreach{n=>
  println(s"$n is prime : ${isPrime(n)}")
  }
}