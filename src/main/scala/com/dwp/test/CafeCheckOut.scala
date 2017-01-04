package com.dwp.test

/**
 * @author Nagaraju Anthati 
 * Assumptions : A list of items of the order are passed
 */
import scala.util._
import scala.collection.mutable._

//case class Item(var Item_Name:String,var Item_Type:String,var Price:Float)

object CafeCheckOut {
  
  def main(args : Array[String]) {
    println("..............Welcome to CafeShop.................")
     println("---------------------------------------------------") 
     println("----------------Menu and Prices---------------\n")
     println("Item\t\t"+"cost:\t")
     printf("1.Cola:(one each)\t"+":£0.50pp\n") 
     printf("2.Coffee:(one each)\t"+":£1.00pp\n")
     printf("3.Cheese Sandwich-cold:(one each)\t"+":£2.00pp\n")
     printf("4.Steak Sandwich-hot:(one each)\t"+":£4.50pp\n")
     var l= List("Cola","Coffee","Cheese Sandwich")
     var sum=0.0
     var Invalid_Items=0
    if(!l.length<0){
    
   for x in l{
        
    x=> match {
      
      case "Cola" => sum+=0.50
      case "Coffee" => sum+=1.00
      case "Cheese Sandwich" => sum+=2.00
      case "Steak Sandwich" => sum+=4.50
      case _ =>  printf("undefined item ")
                  Invalid_Items+=1
    }
    
    }
      
    }
     
    printf(" you have bought \n"+l)
    printf("Please pay :£ $sum")
     
  }

}
