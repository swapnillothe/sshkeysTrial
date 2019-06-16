import javax.inject.Inject

class Number {
  def *(i: Int):Int = 2

  def get(): Int = 2
}


case class Sample @Inject()(number: Number) {
  def double() = number * 2
}

val sample = Sample(new Number)
print(sample.double())
