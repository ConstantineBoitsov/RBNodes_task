package lesson3;

import org.junit.Test;

import static lesson3.RBTree.checkTree;
import static org.junit.Assert.*;

/**
 * Created by Константин on 05.05.2017.
 */
public class RBTreeTest {

    @Test
    public void checkTreeTest() throws Exception {

        RBNodeTest<Integer> root = new RBNodeTest<>(15);
        RBNodeTest<Integer> node3 = new RBNodeTest<>(3);
        RBNodeTest<Integer> node5 = new RBNodeTest<>(5);
        RBNodeTest<Integer> node7 = new RBNodeTest<>(7);
        RBNodeTest<Integer> node17 = new RBNodeTest<>(17);
        RBNodeTest<Integer> node18 = new RBNodeTest<>(18);
        RBNodeTest<Integer> node20 = new RBNodeTest<>(20);

        node5.setColor(true);
        node18.setColor(true);

        root.setLeft(node5);
        node5.setLeft(node3);
        node5.setRight(node7);
        root.setRight(node18);
        node18.setLeft(node17);
        node18.setRight(node20);

        assertTrue(checkTree(root));


        node20.setColor(true);

        assertFalse(checkTree(root));

    }

    public void checkTreeTest1() throws Exception {

        RBNodeTest<Integer> root = new RBNodeTest<>(15);
        RBNodeTest<Integer> node2 = new RBNodeTest<>(2);
        RBNodeTest<Integer> node3 = new RBNodeTest<>(3);
        RBNodeTest<Integer> node4 = new RBNodeTest<>(4);
        RBNodeTest<Integer> node5 = new RBNodeTest<>(5);
        RBNodeTest<Integer> node6 = new RBNodeTest<>(6);
        RBNodeTest<Integer> node7 = new RBNodeTest<>(7);
        RBNodeTest<Integer> node9 = new RBNodeTest<>(9);
        RBNodeTest<Integer> node10 = new RBNodeTest<>(10);
        RBNodeTest<Integer> node11 = new RBNodeTest<>(11);
        RBNodeTest<Integer> node16 = new RBNodeTest<>(16);
        RBNodeTest<Integer> node17 = new RBNodeTest<>(17);
        RBNodeTest<Integer> node18 = new RBNodeTest<>(18);
        RBNodeTest<Integer> node19 = new RBNodeTest<>(19);
        RBNodeTest<Integer> node20 = new RBNodeTest<>(20);
        RBNodeTest<Integer> node22 = new RBNodeTest<>(22);

        node5.setColor(true);
        node18.setColor(true);
        node10.setColor(true);

        root.setLeft(node5);
        node5.setLeft(node3);
        node3.setLeft(node2);
        node3.setRight(node4);
        node5.setRight(node7);
        node7.setLeft(node6);
        node7.setRight(node10);
        node10.setLeft(node9);
        node10.setRight(node11);
        root.setRight(node18);
        node18.setLeft(node17);
        node17.setLeft(node16);
        node18.setRight(node20);
        node20.setLeft(node19);
        node20.setRight(node22);

        assertTrue(checkTree(root));

        node19.setColor(true);

        assertFalse(checkTree(root));

    }

    class RBNodeTest<T> implements RBNode<T> {

        private T value;
        private RBNode<T> left = null;
        private RBNode<T> right = null;
        private boolean isRed = false;

        RBNodeTest(T value) {
            this.value = value;
        }

        @Override
        public T getValue() {
            return null;
        }

        @Override
        public RBNode<T> getLeft() {
            return left;
        }

        @Override
        public RBNode<T> getRight() {
            return right;
        }

        @Override
        public void setLeft(RBNode<T> left) {
            this.left = left;
        }

        @Override
        public void setRight(RBNode<T> right) {
            this.right = right;
        }

        @Override
        public void setColor(boolean isRed) {
            this.isRed = isRed;
        }

        @Override
        public boolean isRed() {
            return isRed;
        }
    }

}