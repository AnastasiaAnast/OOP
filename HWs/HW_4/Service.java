package HW_4;

public interface Service<T, S> {
  T restock(T automat, S product);

}