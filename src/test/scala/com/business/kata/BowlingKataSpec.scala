package com.business.kata

import org.scalatest.FlatSpec

/**
  * Created by prasenjit.b on 7/12/2017.
  */
class BowlingKataSpec extends FlatSpec {

 /*it should "return correct frames in STRIKE case" in {
   val expectedFrame = List[Frame]( NormalFrame(7,2), Spare(5,5,3), NormalFrame(3,0), Strike(10,2,4), NormalFrame(2,4) )
   val returnedFrames = new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 10, 2, 4) )
   assertResult(expectedFrame)(returnedFrames)
 }

    it should "return correct frames in SPARE case" in {
      val expectedFrame = List[Frame]( Spare(7,10,5), Spare(5,5,3), NormalFrame(3,0), NormalFrame(1, 2), Spare(4, 8, 5), NormalFrame(5, 3) )
      val returnedFrames = new BowlingKata().bowlingToFrames( List(7, 10, 5, 5, 3, 0, 1, 2, 4, 8, 5, 3 ) )
      assertResult(expectedFrame)(returnedFrames)
    }*/

  /*  it should "return correct frames in SPARE-STRIKE case" in {
      val expectedFrame = List[Frame]( Frame2(7,10), Frame2(5,5), Frame2(3,0), Frame1(10), Frame2(2,4) )
      val returnedFrames = new BowlingKata().bowlingToFrames( List(7, 10, 5, 5, 3, 0, 10, 2, 4) )
      assertResult(expectedFrame)(returnedFrames)
    }

    it should "return correct frames in NEVER-ALL-DOWN case" in {
      val expectedFrame = List[Frame]( Frame2(7,2), Frame2(5,5), Frame2(3,0), Frame2(1,2), Frame2(4,8) )
      val returnedFrames = new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 1, 2, 4, 8) )
      assertResult(expectedFrame)(returnedFrames)
    }

    it should "return correct frames in Last-Frame-SPARE case" in {
      val expectedFrame = List[Frame]( Frame2(7,2), Frame2(5,5), Frame2(3,0), Frame2(1,2), Frame2(4,18) )
      val returnedFrames = new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 1, 2, 4, 18) )
      assertResult(expectedFrame)(returnedFrames)
    }

    it should "return correct frames in Last-Frame-STRIKE case" in {
      val expectedFrame = List[Frame]( Frame2(7,2), Frame2(5,5), Frame2(3,0), Frame2(1,2), Frame1(18) )
      val returnedFrames = new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 1, 2, 18) )
      assertResult(expectedFrame)(returnedFrames)
    }

    it should "throw Exception for more than 10 turns" in {
      assertThrows[RuntimeException]( new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 1, 2, 14,2,3) ) )
    }

    it should "throw Exception for less than 5 turns" in {
      assertThrows[RuntimeException]( new BowlingKata().bowlingToFrames( List(7, 2, 5) ) )
    }

    it should "throw Exception for wrong number of turns for NEVER-ALL-DOWN case" in {
      assertThrows[IndexOutOfBoundsException]( new BowlingKata().bowlingToFrames( List(7, 2, 5, 5, 3, 0, 1, 2, 4) ) )
    }*/
}
