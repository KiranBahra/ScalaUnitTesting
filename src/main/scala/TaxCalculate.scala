class TaxCalculate {
  def calculateTax (a: Int): Int={
    if(a>10000){

      // println("condition met")
      val b= a * 15/100
      println(b.toString)
      return b

    }else if (a > 50000){
      val b= a * 20/100
      println(b.toString)
      return b


    }else if (a > 100000){

      val b = a * 40 / 100
      println(b.toString)
      return b
    } else

    //   println("condition not met")
      return 0

  }
}
