package jpabook.springjpa1.repository;

import jpabook.springjpa1.domain.Member;
import jpabook.springjpa1.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    private final EntityManager em;

    //== 비즈니스 로직 ==//
    public void save(Order order){
        em.persist(order);
    }

    //== 조회 로직 ==//
    public Order findOne(Long id){
        return em.find(Order.class,id);
    }

//    public List<Order> findAll(OrderSearch orderSearch){
//    }

}
