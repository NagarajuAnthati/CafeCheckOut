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
     val cold_food=List("Cheese Sandwich")
     val hot_food=List("Steak Sandwich")
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
    if(l.filter(cold_food.contains()!=null)&&l.filter(hot_food.contains()==null)){
      println("You will be charged a 10% of service charge for food")
      sum+=sum*0.1
      println("Please pay %.2f"sum)
      
    } else if (l.filter(hot_food.contains()!=null))
    {
      println("You will be charged a 20% of service charge for hot food")
      var service_charge=sum*0.2
      if(service_charge<20)
      sum+=sum*0.2
      else
        sum+=20
      println("Please pay %.2f"sum)
      
    }else
      
    printf("Please pay :£ $sum")
     
  }

}
