package Map;

import java.util.ArrayList;
import java.util.List;

public class MyMap<X, Y> {
    private final List<X> key;
    private final List<Y> value;

    public MyMap(X key, Y value) {

        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
        this.key.add(key);
        this.value.add(value);

    }

    public MyMap() {

        this.key = new ArrayList<>();
        this.value = new ArrayList<>();

    }

    public void put (X key, Y value) {

        if (this.key.contains(key)) {

            this.value.set(this.key.indexOf(key), value);

        } else {

            this.key.add(key);
            this.value.add(value);

        }
    }

    public Y get (X key) {

        if (this.key.contains(key)) {

            return this.value.get(this.key.indexOf(key));

        } else {

            return null;

        }
    }

    public Y remove (X key) {
        if (this.key.contains(key)){

            int index = this.key.indexOf(key);

            this.key.remove(index);
            Y val = value.get(index);

            value.remove(index);

            return val;
        }
        return null;
    }

    public void display () {

        for (X e : this.key) {

            System.out.print(e + " ");

        }

        System.out.println();

        for (Y e : this.value) {

            System.out.print(e + " ");

        }
    }
}