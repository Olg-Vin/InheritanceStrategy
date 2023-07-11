package summerPractice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import summerPractice.modelsFirst.Bike;
import summerPractice.modelsFirst.Car;
import summerPractice.modelsFirst.Plane;
import summerPractice.modelsFirst.Truck;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicle");
             EntityManager em = emf.createEntityManager()) {
//      add new objects for all classes
            BigDecimal price = new BigDecimal(2);
            Car car = new Car("type1", "model",  price, "fuelType", 2);
            Car car1 = new Car("type2", "model",  price, "fuelType", 2);
            Bike bike = new Bike("type", "model",  price, "fuelType");
            Plane plane = new Plane("type", "model",  price, "fuelType", 5);
            Truck truck = new Truck("type", "model",  price, "fuelType", 10.0);
// insert query
            try {
                em.getTransaction().begin();
                em.persist(car);
                em.persist(car1);
                em.persist(bike);
                em.persist(plane);
                em.persist(truck);
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
// id select query
            try {
                em.getTransaction().begin();
                Car result = (Car) em.find(Car.class, 1);
                em.getTransaction().commit();
                System.out.printf("Car: %s%n", result);
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
// update query
// join query

// all select query
            try {
                em.getTransaction().begin();
                List<Car> carList =
                        em.createQuery("FROM Car ", Car.class).getResultList();
                for (Car s : carList) {
                    System.out.println(s);
                }
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
        }
    }
}