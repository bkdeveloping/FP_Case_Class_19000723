package FunctionScala

object caseclass {

  case class Point(x:Int,y:Int)
  {


    //Addition of two points
    def +(that:Point)=Point(this.x+that.x,that.y+this.y)

    //moving pointers
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

    //distance between two points
    def distance(a:Point)=Point(this.x-a.x,this.y-a.y)

    //inverse of point
    def invert()=Point(this.y,this.x)
  }



  def main(args: Array[String]): Unit = {
    val a=new Point(9,7)
    val b=new Point(6,3)
    val c=new Point(2,1)
    println("A="+a);
    println("B="+b);
    println("C="+c);

    //addition Q1
    val x=a+b
    println( "A+B ="+ x)

    //move x and y coordinates of A with 2 Q2
    println("after move x coordinate by 1 and y coordinate by 1 in A = "+ a.move(2,2))

    //distance of two points Q3

    println("C-B="+ c.distance(b))

    //after switching the  x and y coordinates Q4
    println("After switching x and y coordinates of A=" + a.invert())
  }




}
