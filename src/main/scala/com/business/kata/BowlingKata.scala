package com.business.kata

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * Created by prasenjit.b on 7/12/2017.
  */


trait Frame{
  def score : Int
  def bolws( ): List[Int] ={

  }

}
object Frame{
  def getScore( frames : List[Frame])={
    frames.foldLeft(0)(( aggegation, frame ) => aggegation + frame.score )
  }
}

case class NormalFrame( first : Int, Second : Int) extends Frame {
  def score = first + Second
}
case class Strike( strike : Int, bonus1 : Int, bonus2 : Int) extends Frame {
  def score = strike + bonus1 + bonus2
}
case class Spare( first : Int, second : Int, bonus1 : Int) extends Frame {
  def score = first + second + bonus1
}

case class Wrapper(line : List[Int], frames : List[Frame], index : Int ){
  def drop( numberOfCellTraveresed : Int)={
    Wrapper( line.drop( numberOfCellTraveresed ), frames, index )
  }
}

object BowlingKata{

  def decision( fd : Wrapper ) : Wrapper = fd match {
    case Wrapper( Nil,_,_) => fd
    case Wrapper( 10 :: bonus1 :: bonus2 :: _,_, _ )=> Wrapper( fd.line, Strike(10, bonus1, bonus2 ) :: fd.frames, fd.index ).drop(1)
    case Wrapper( first :: second :: bonus1 :: _,_, _ ) if( first + second >= 10 )=> Wrapper( fd.line, Spare( first, second, bonus1 ) :: fd.frames, fd.index ).drop(2)
    case Wrapper( first :: second ::_, _, _ ) if( first + second < 10) => Wrapper( fd.line, NormalFrame(first, second) :: fd.frames, fd.index ).drop(2)
  }

  def bowlingToFrames(line: List[Int]) = {
    val aggregatedValue = line.foldLeft( Wrapper(line, List[Frame](),0)  )((frameData, turn )=> decision( frameData ) )
    println("Bowling turns :: "+line)
    println("Frames :: "+aggregatedValue.frames)
    println("Score :: "+Frame.getScore(aggregatedValue.frames))
  }

  def main(args: Array[String]): Unit = {
    bowlingToFrames( List(7, 3, 5, 5, 3, 0, 10, 2, 4) )
  }
}

/*class BowlingKata {

  def bowlingToFrames(line: List[Int]) = {

    println(s"Bowling Line :: $line")
    val frames = new ListBuffer[Frame]()
    val usedIndex = new ListBuffer[Int]()

    def decision(index: Int, turn: Int, usedIndex: ListBuffer[Int], frames: ListBuffer[Frame]): Int = {
      usedIndex.contains(index) match {
        case true => None
        case false => {
          (turn < 10) match {
            case true => {
              usedIndex.+=(index + 1)
              if (turn + line(index + 1) >= 10) {
                frames.+=( Spare(turn, line(index + 1), line(index + 2)) )
                println("Frame :: " + Spare(turn, line(index + 1), line(index + 2)))
              } else {
                frames.+=( NormalFrame(turn, line(index + 1)) )
                println("Frame :: " + NormalFrame(turn, line(index + 1)))
              }
            }
            case false => {
              frames.+=( Strike(turn, line(index + 1), line(index + 2)) )
              println("Frame :: " + Strike(turn, line(index + 1), line(index + 2)))
            }
          }
        }
      }
      index
    }

    line.foldLeft(0)((index, turn) => {
      decision( index, turn, usedIndex, frames )
      index + 1
    })

    println(s"Score :: ${Frame.getScore(frames.toList)}")
    frames.toList
  }
}


object BowlingKata{
  def main(args: Array[String]): Unit = {
    new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 10, 2, 4) )
  }
}*/




/* val frames = new ListBuffer[Frame]()
    val usedIndex = new ListBuffer[Int]()
    for( i <- 0 until line.length ){
      usedIndex.contains(i) match {
        case true => None
        case false =>{
          val member = line(i)
          (member < 10)match{
            case true => {
              usedIndex.+=(i+1)
              if( member + line(i+1) >= 10 ){
                frames.+= ( Spare( member, line(i+1), line(i+2) ) )
                println( "Frame"+Spare( member, line(i+1), line(i+2) ) )
              }else{
                frames.+= ( NormalFrame( member, line(i+1) ) )
                println( "Frame"+NormalFrame( member, line(i+1) ) )
              }
            }
            case false => {
              frames.+=( Strike(member, line(i + 1), line(i + 2)) )
              println( "Frame"+Strike(member, line(i + 1), line(i + 2)) )
            }
          }
        }
      }
    }
    println( s"Frames distribution :: ${frames.toList}" )
    println(s"Score :: ${Frame.getScore(frames.toList)}")
    frames.toList
  }*/