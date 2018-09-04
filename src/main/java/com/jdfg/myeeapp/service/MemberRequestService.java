package com.jdfg.myeeapp.service;

import com.jdfg.myeeapp.model.MemberRequest;
import org.omnifaces.persistence.service.BaseEntityService;

import javax.ejb.Stateless;
import java.util.List;
import java.util.stream.Stream;

@Stateless
public class MemberRequestService extends BaseEntityService<Long, MemberRequest> {

    public List<MemberRequest> findAllMemberRequestsByBook(Long bookId) {
        return super.getEntityManager()
                .createNamedQuery("Book.findAllMemberRequests")
                .setParameter("bookId", bookId)
                .getResultList();
    }

    public Stream<MemberRequest> findAllMemberRequestsByBookStream(Long bookId) {
        return super.getEntityManager()
                .createNamedQuery("Book.findAllMemberRequests")
                .setParameter("bookId", bookId)
                .getResultStream();
    }
}
