package shop.mtcoding.blog.controller.Board;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class BoardRepository {
    private final EntityManager em;

    @Transactional
    public void save(String string) {
        Query query = em.createNativeQuery("insert into board_tb(file_name) values(?)");
        query.setParameter(1, string);
        query.executeUpdate();
    }
}
