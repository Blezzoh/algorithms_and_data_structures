package data_structures.binarySearchTree;

/**
 * Created by blaise on 8/29/17.
 * This is the copy of the implementation of the BST on HackerRank
 */
public class NonEmptyBST<D extends Comparable> implements Tree<D> {
    D root;
    Tree left;
    Tree right;

    public NonEmptyBST(D elt){
        root = elt;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }

    public NonEmptyBST(D newRoot, Tree<D> newLeft, Tree<D> newRight) {

        root = newRoot;
        right = newLeft;
        left = newLeft;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D elt) {
        if(root == elt){
            return true;
        }
        else{
            if(root.compareTo(elt) < 0){
                return left.member(elt);
            }
            else
                return right.member(elt);
        }
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        if(root == elt){
            return this;
        }
        else if(root.compareTo(elt) < 0){
            return new NonEmptyBST<D>(root, left.add(elt), right);
        }
        else {
            return new NonEmptyBST<D>(root, left, right.add(elt));
        }
    }
}
