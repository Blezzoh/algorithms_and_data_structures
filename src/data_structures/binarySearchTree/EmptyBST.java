package data_structures.binarySearchTree;

/**
 * Created by blaise on 8/29/17.
 * This is the copy of the implementation of the BST on HackerRank
 */
public class EmptyBST<D extends Comparable> implements Tree<D> {
    public EmptyBST(){

    }
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
}
