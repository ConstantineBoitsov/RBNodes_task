package lesson3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Константин on 05.05.2017.
 */
public class RBTreeTest {
    @Test
    public void checkTree() throws Exception {

        RBNodeTest<Integer> root = new RBNodeTest<>(15);

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