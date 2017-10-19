import org.scalatest.FunSuite

class taskTest extends FunSuite {

  test("testRemoveMultiples") {
    val sample = List(3,5,7,9)
    val sourceList = task.makeList(List.empty , 2 , 10)
    val result = task.removeMultiples(2,sourceList)
    assert(result ===  sample )
  }

  test("testMakeList") {
    val sample = List(2,3,4,5)
    val result = task.makeList(List.empty , 1 , 5)
    assert(result ===  sample )
  }

  test("testPrimeNumList") {
    val sample = List(2,3,5,7)
    val sourceList = task.makeList(List.empty , 1 , 10)
    val result = task.primeNumList(0,sourceList)
    assert(result ===  sample )
  }

}
