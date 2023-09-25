package HW_6;

public interface Service<T, S> {
  T restock(T automat, S product);

}