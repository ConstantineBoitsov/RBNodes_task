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