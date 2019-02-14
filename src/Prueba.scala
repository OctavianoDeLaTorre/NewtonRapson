

object Prueba {
  def main(args: Array[String]): Unit = {
   //println(gcbIterativo(50, 15))
   //println(gcb(50, 15))
    
    println("Raiz: " + newtonR(10.7,2))
    println("Raiz: " + newtonRaphson(10.7))
  }
  
  def gcb(a:Int, b:Int):Int = {
    if(b==0) a else  gcb(b,a%b)
  }
  
  def gcbIterativo (a:Int, b:Int) :Int = {
    var a1 = b
    var b1 = a%b
    while(b1 != 0){
      a1 = b1
      b1 = a1%b1
    }
    a1
  }
  
  def newtonRaphson (x:Double): Double ={
    var y = 1.0
    
    while(Math.abs(Math.pow(y, 2)-x) > 0.0001){
      y = ((x/y) + y) / 2
      println(y)
    }
    y
  }
  
  def newtonR(x:Double, y:Double):Double = {
    if(Math.abs(Math.pow(y, 2)-x) > 0.0001){
      newtonR(x,((x/y) + y) / 2)
    }else{
      y
    }
  }
 
  
}