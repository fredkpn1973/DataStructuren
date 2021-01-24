import net.datastructures.*;

public class findChildren<E> extends AbstractTree<E> {

    public static class Node<E> implements Position<E> {
        private E element;

        public E getElement() {
            return element;}
    }

    protected Node<E> root = null;

    public Position<E> root() {
        return root;
    }

    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();

    }


}