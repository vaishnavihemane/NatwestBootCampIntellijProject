package com.stackroute.twostacks.commander;

import com.stackroute.twostacks.TwoStacks;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TwoStacksTest
{

    @Test
    public void queueTestPush(){
        TwoStacks.MyQueue<Integer> myQueue = new TwoStacks.MyQueue<Integer>();
        myQueue.push(5);
        assertThat(myQueue.peek(), is(5));
    }

    @Test
    public void queueTestPop(){
        TwoStacks.MyQueue<Integer> myQueue = new TwoStacks.MyQueue<Integer>();
        myQueue.push(5);
        myQueue.push(27);
        myQueue.pop();
        assertThat(myQueue.peek(), is(5));
    }

}
