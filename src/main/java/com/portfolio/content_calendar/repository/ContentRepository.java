package com.portfolio.content_calendar.repository;

import com.portfolio.content_calendar.model.Content;
import com.portfolio.content_calendar.model.Status;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

//@Repository
public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

//    @Query("""
//        SELECT * FROM Content
//        where status = :status
//    """)
//    List<Content> listByStatus(@Param("status") Status status);

}
