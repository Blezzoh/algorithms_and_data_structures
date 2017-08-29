package data_structures.binarySearchTree;

/**
 * Created by blaise on 8/29/17.
 * This is the copy of the implementation of the BST on HackerRank
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();

    // return the number of elements on the tree
    public int cardinality();

    // return true if the element is a member of the tree
    public boolean member(D elt);

    // adds a new node/tree on the BST
    public NonEmptyBST<D> add(D elt);
}
