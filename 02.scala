object PrimeSequence extends App{
  def primeSeq(n:Int):Unit = {
  def isPrime(k:Int,i:Int):Boolean={
    if(i<=1)true
    else if(k%i==0)false
    else isPrime(k,i-1)
  }
    def printPrimes(k:Int):Unit={
      if(k>=2){
        if(isPrime(k,k/2)){
          printPrimes(k-1)
          print(s"$k , ")
        }else{
          printPrimes(k-1)
        }
      }
    }
    printPrimes(n-1)
  }
  primeSeq(10)
}