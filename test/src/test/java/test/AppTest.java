package test;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static  org.junit.Assert.*;


@RunWith(Enclosed.class)
public class AppTest 
{
    

    public static class 三の倍数の場合{
        private FizzBuzz  fizzbuzz;

        @Before
        public void 前準備(){
            fizzbuzz = new FizzBuzz();
        }

        @Test
        public void _3を渡したら文字列3を返す() throws Exception{
         
             assertEquals("Fizz", fizzbuzz.convert(3)); 
        }

       
    }




    public static class 五の倍数の場合{

        private FizzBuzz  fizzbuzz;

        @Before
        public void 前準備(){
            fizzbuzz = new FizzBuzz();
        }      
        @Test
        public void _5を渡したら文字列Buzzを返す() throws Exception{
     
             assertEquals("Buzz", fizzbuzz.convert(5)); 
         }
     
         
    }


    public static class 十五の倍数の場合{
        private FizzBuzz  fizzbuzz;

        @Before
        public void 前準備(){
            fizzbuzz = new FizzBuzz();
        }

       
        @Test
         public void _15を渡したら文字列FizzBuzzを返す() throws Exception{
      
              assertEquals("FizzBuzz", fizzbuzz.convert(15)); 
          }
    }



    public static class その他の場合{
        private FizzBuzz  fizzbuzz;

        @Before
        public void 前準備(){
            fizzbuzz = new FizzBuzz();
        }  
        
        
        @Test
        public void _1を渡したら文字列1を返す() throws Exception{
         
             assertEquals("1", fizzbuzz.convert(1)); 
        }
     
        
     
       
    }
 



   
   
}
