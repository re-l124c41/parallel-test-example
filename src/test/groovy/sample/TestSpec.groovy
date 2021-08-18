package sample

import spock.lang.*

class TestSpec extends Specification {

   @Unroll
   def test1(){
      expect:
      a == b

      where:
      a << [1,2,3,4,5]
      b << [5,4,3,2,1]
   }

   @Unroll
   def test2(){
      expect:
      a == b

      where:
      a << [1,2,3,4,5]
      b << [5,4,3,2,1]
   }
}
