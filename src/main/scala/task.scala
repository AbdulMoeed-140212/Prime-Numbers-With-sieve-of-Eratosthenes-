object task {
  def main(args:Array[String])={
    print("Enter Last Number >> ")
    var till = readInt()
    var numList = makeList(List.empty , 2 , till)
    var primeList = primeNumList(0,numList)

    primeList.foreach(println)
  }

  def makeList(acc:List[Int], nextNum:Int , LastNum:Int):List[Int]={
    if(nextNum == LastNum){
      return acc::: List(nextNum)
    }
    makeList(acc:::List(nextNum) , nextNum+1 , LastNum)
  }

  def primeNumList(index:Int ,sourceList : List[Int]): List[Int]={
    if(index >= sourceList.length){
      return sourceList
    }
    var modifiedList = sourceList.take(index+1):::removeMultiples(sourceList(index),sourceList.drop(index+1))
    primeNumList(index+1 , modifiedList)
  }
  def removeMultiples(of:Int , sourceList: List[Int]) : List[Int] = {
    return sourceList.filter(_ % of != 0)
  }

}
