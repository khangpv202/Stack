import Stack.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: khangpv
 * Date: 6/17/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    @Test
    public void testCreateStack(){
        Stack a = new Stack();
        assertEquals(a.size(),0);
    }
    @Test
    public void testPushValue(){
        Stack a = new Stack();
        a.push("firstValue");
        assertEquals(a.size(),1);
    }
    @Test
    public void testPushjustOneValue(){
        Stack a = new Stack();
        a.push("firstValue");
        a.push("secondtValue");
        a.push("thirdValue");
        assertEquals(a.size(),3);
        a.push("fourValue");
        assertEquals(a.size(),4);
    }
    @Test
    public void testEmptyPop(){
        Stack a = new Stack();
        a.top();
        assertEquals(null,a.top());
    }
    @Test
    public void testPushIntoEmptyStackAndTop(){
        Stack a = new Stack();
        a.push("value");
        assertEquals(a.top(),"value");
    }
    @Test
    public void testPopEmptyStack(){
         try{
             Stack a = new Stack();
             a.pop();
         }catch (Exception e){
             assertEquals(e.getMessage()," StackEmptyException");
         }
    }
    @Test
    public void testPopStack(){
        try{
            Stack a = new Stack();
            a.push("firstValue");
            a.push("secondtValue");
            a.push("thirdValue");
            assertEquals(a.size(),3);
            String re = a.pop();
            assertEquals(a.size(),2);
            assertEquals(re,"thirdValue");
        }catch (Exception e){
            assertEquals(e.getMessage()," StackEmptyException");
        }
    }
    @Test
    public void testPopStackHasOneMember(){
        Stack a = new Stack();
        a.push("firstValue");
        String re = a.pop();
        assertEquals(re,"firstValue");
        assertEquals(0,a.size());
    }

    @Test
    public void testTopAndPop(){
        Stack a = new Stack();
        a.push("firstValue");
        a.push("secondtValue");
        a.push("thirdValue");
        assertEquals(a.size(),3);
        String tp = a.top();
        String pp = a.pop();
        assertEquals(tp,pp);
    }
    @Test
    public void testPushandPop(){
        Stack a = new Stack();
        a.push("firstValue");
        a.push("secondtValue");
        a.push("thirdValue");
        assertEquals("thirdValue",a.pop());
        assertEquals("secondtValue",a.pop());
        assertEquals("firstValue",a.pop());
        assertEquals(0,a.size());

    }

}
