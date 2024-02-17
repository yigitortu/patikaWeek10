import entity.Author;
import entity.Book;
import entity.Category;
import entity.Publisher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin(); // Veri kaydetmeye başlamak için transaction başlatmamız gerekiyor.
        // Author örnek ekleme
//        Author author = new Author();
//        author.setName("Victor HUGO");
//        author.setBirthDate(LocalDate.of(1903,01,01));
//        author.setCountry("France");
//        entityManager.persist(author);
//
//        //Publisher örnek ekleme
//        Publisher publisher = new Publisher();
//        publisher.setName("Can kitabevi");
//        publisher.setAddress("Çankaya/Konak/İzmir");
//        publisher.setEstablishmentYear(1987);
//        entityManager.persist(publisher);
//
//        // Örnek kategori ekleme
//        Category c1 = new Category();
//        c1.setDescription("Eşeğin rüyası");
//        c1.setName("Eşeklerin rüyasını ve temel dayanışmalarını söz alır.");
//        entityManager.persist(c1);
//
//        Category c2 = new Category();
//        c2.setDescription("Atın rüyası");
//        c2.setName("atların rüyasını ve temel dayanışmalarını söz alır.");
//        entityManager.persist(c2);
//
//        // örnek kitap ekleme
//        Book book = new Book();
//        book.setName("Eşekler");
//        book.setStock(5);
//        book.setPublicationYear(2002);
//        book.setAuthor(author);
//        book.setPublisher(publisher);
//
//        List<Category> categoryList = new ArrayList<>();
//        categoryList.add(c1);
//        categoryList.add(c2);
//        book.setCategoryList(categoryList);
//        entityManager.persist(book);



        transaction.commit(); // Transaction sonlandırması.


    }
}
