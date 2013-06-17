package Stack;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: khangpv
 * Date: 6/17/13
 * Time: 1:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    private String value;
    private ArrayList<String>members;
    public Stack(){
        members= new ArrayList<String>();
    }
    public int size() {
        return members.size();
    }

    public void push(String firstValue) {
        members.add(firstValue);
    }

    public String top() {
        if(members.size()==0)
            return null;
        else {
            return members.get(members.size()-1);
        }
    }

    public String pop() {
        if(members.size()==0) throw  new NullPointerException(" StackEmptyException") ;
        else{
            String re = members.get(members.size()-1);
            members.remove(members.size()-1);
            return  re;

        }
        //return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
