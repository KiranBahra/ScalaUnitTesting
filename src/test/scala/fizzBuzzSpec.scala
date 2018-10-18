import org.scalatest._
/*
Create a function called fizzBuzz that takes an Int and returns the same value as a String
If the input is divisible by 3 (with no remainder) return the word “Fizz”
If the input is divisible by 5 (with no remainder) return the word “Buzz”
If the input is divisible by 3 and 5 (with no remainder) return the word “FizzBuzz”

 "add" should "add numbers" in {
    val nums = new TwoNumbers(1, 2)
    assert(nums.add === 3)
 */
class fizzBuzzSpec extends FlatSpec {
 /* "fizzBuzz" should "return word Fizz when input is divisible by 3 "
  val test1 = new FizzBuzz ()
    assert(test1.fizzBuzz(6)=== "fizz")

  "fizzBuzz" should "return word Buzz when input is divisible by 5 "
  val test2 = new FizzBuzz ()
  assert(test2.fizzBuzz(20)=== "Buzz")
*/
  "fizzBuzz" should "return word fizzBuzz with when input is divisible by 3 and 5"
  val test3 = new FizzBuzz ()
  assert(test3.fizzBuzz(15)=== "fizzBuzz")

}
