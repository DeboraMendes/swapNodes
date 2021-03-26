package br.com.swapNodes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SwapNodesTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void test() {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        one.setRight(three);
        one.setLeft(two);

        two.setRight(four);

        three.setRight(five);

        SwapNodes.swapEveryKLevel(one, 2);
        SwapNodes.inorder(one);

        assertEquals("3 5 1 2 4", systemOutRule.getLog().trim());

    }

}
