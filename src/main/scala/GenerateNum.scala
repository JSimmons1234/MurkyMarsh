

object GenerateNum {

  def randomNum(): Int ={
    val random = new scala.util.Random
    val i = random.nextInt(9)
    i
  }

}
