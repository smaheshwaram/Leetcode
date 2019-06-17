package javatopics;
/*
Shallow copies duplicate as little as possible. A shallow copy of a collection is a copy of the collection structure, not the elements. With a shallow copy, two collections now share the individual elements.
Objects share same reference. Elements rae not copied. They are shared between 2 objects. But, new data structure is created exactly similar to old object ds.

Deep copies duplicate everything. A deep copy of a collection is two collections with all of the elements in the original collection duplicated.
Objects doesn't share same reference. Both have different object references but do have same data structure and elements are copied not shared.

If class doesn't implement Cloneable interface then CloneNotSupportedException occurs
 */

public class DeepCopy implements Cloneable {
    private int id;

    private DeepCopy(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        DeepCopy deepCopy = new DeepCopy( 5 );
        try {
            DeepCopy deepCopy1 = (DeepCopy) deepCopy.clone();
            System.out.println(deepCopy1.id);
        }
        catch(CloneNotSupportedException ex) {
            ex.getCause();
        }
    }

    //example of difference between shallow copy and deep copy of an object
    class Foo implements Cloneable {
        private DeepCopy deepCopy;
        public Foo shallowCopy() {
            Foo newFoo = new Foo();
            newFoo.deepCopy = deepCopy;
            return newFoo;
        }

        public Foo deepCopy() throws CloneNotSupportedException {
            Foo newFoo = new Foo();
            newFoo.deepCopy = (DeepCopy) deepCopy.clone(); //or new Bar(myBar) or myBar.deepCopy or ...
            return newFoo;
        }
    }


}
