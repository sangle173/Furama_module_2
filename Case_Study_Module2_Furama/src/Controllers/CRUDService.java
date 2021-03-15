package Views;

import java.util.List;

public interface CRUDService<E> {
    List<E> searchAll();

    E searchById(String id);

    void add(E e);

    void edit(E e, String id);

    void remove(String id);
}
