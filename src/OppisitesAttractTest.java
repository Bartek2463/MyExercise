import org.junit.Test;
import  static org.junit.Assert.assertEquals;

 public class OppisitesAttractTest {
     @Test
     public void testOddAndEven(){
        assertEquals(true,OppisitesAttract.isLove(1,4));
    }
    @Test
     public void testEvenAndEven(){
         assertEquals(false,OppisitesAttract.isLove(2,2));
    }
    @Test
     public  void testOddAndOdd(){
         assertEquals(false,OppisitesAttract.isLove(1,1));
    }
    @Test
     public void testEvenAnddOdd(){
     assertEquals(true,OppisitesAttract.isLove(0,1));
     }


}