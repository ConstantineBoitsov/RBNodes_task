package lesson3;

/**
 * Created by Константин on 02.05.2017.
 */
public class RBTree {

    public static boolean checkTree(RBNode root){
        if (root==null) {
            return true;
        }
        RBNode left = root.getLeft();
        RBNode right = root.getRight();
        if (root.isRed()){
            if ((left!=null)&&(left.isRed())){
                return false;
            }
            if ((right!=null)&&(right.isRed())){
                return false;
            }
        }
        return checkTree(left)&&checkTree(right);
    }

}
