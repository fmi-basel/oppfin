package com.searchbox.framework.service;

import com.searchbox.framework.model.Favorite;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.searchbox.framework.model.UserEntity;
import com.searchbox.framework.model.UserFavoriteEntity;
import com.searchbox.framework.repository.UserFavoriteRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
@Transactional
public class UserFavoriteService {

    @PersistenceContext
    EntityManager entityManager;
    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserFavoriteService.class);
    @Autowired
    private UserFavoriteRepository repository;

    public UserFavoriteEntity markFavorite(UserEntity user, String favoriteId, String title, String idField) {
        UserFavoriteEntity marked = new UserFavoriteEntity();
        marked.setUserId(user);
        marked.setFavoriteId(favoriteId);
        marked.setTitle(title);
        marked.setIdField(idField);
        return repository.save(marked);
    }

    public void unMarkFavorite(UserEntity user, String favoriteId) {
        entityManager.createNamedQuery("UserFavoriteEntity.unMarkUserFavorite")
                .setParameter("userId", user)
                .setParameter("favoriteId", favoriteId).executeUpdate();
    }

    private Sort sortByUser() {
        return new Sort(Sort.Direction.ASC, "id");
    }

    private Pageable constructPageSpecification() {
        Pageable pageSpecification = new PageRequest(0, 10, sortByUser());
        return pageSpecification;
    }

//    private Sort sortByTime() {
//        return new Sort(Sort.Direction.ASC, "time");
//    }

    private Pageable constructPage() {
        Pageable pageSpecification = new PageRequest(0, 10);
        return pageSpecification;
    }

    public List<UserFavoriteEntity> findFavoriteByUserId(UserEntity userId) {
        return repository.findByUserId(userId);
    }

    public List<UserFavoriteEntity> findByPreset(UserEntity userId, List<String> idFields) {
        return repository.findByPreset(userId, idFields);
    }

    public List<UserFavoriteEntity> findAll() {
        return findAll(constructPageSpecification());
    }

    public List<UserFavoriteEntity> findAll(Pageable pageRequest) {
        LOGGER.debug("Listing all userfavorite for page: " + pageRequest.getPageNumber());
        Page<UserFavoriteEntity> requestedPage = repository.findAll(pageRequest);
        return requestedPage.getContent();
    }

    public long countAll() {
        return repository.count();
    }
    public long countAllFavorite() {
        return repository.countAllFavorite();
    }
    public List<Favorite> findAllCount(String sort) {
        return findAllCount(sort, constructPage());
    }

    public List<Favorite> findAllCount(String sort, Pageable pageRequest) {
        LOGGER.debug("Listing all userfavorite for page: " + pageRequest.getPageNumber());
        if("asc".equalsIgnoreCase(sort)){
        Page<Favorite> requestedPage = repository.findAllAsc(pageRequest);
        return requestedPage.getContent();
        } else if("desc".equalsIgnoreCase(sort)){
        Page<Favorite> requestedPage = repository.findAllDesc(pageRequest);
        return requestedPage.getContent();
        }
        return null;
    }
//    public List<UserFavoriteEntity> findAllTime(Pageable pageRequest) {
//        LOGGER.debug("Listing all userfavorite for page: " + pageRequest.getPageNumber());
////        Page<UserFavoriteEntity> requestedPage = repository.findAll(pageRequest);
////        return requestedPage.getContent();
//Query query = entityManager.createQuery("select *, count(favorite_id) as time\n" +
//"from user_favorite_entity uf\n" +
//"group by favorite_id ").set;
//    query.setParameter("sort", pageable.getSort());
//    query.setMaxResults(pageable.getPageSize());
//    query.setFirstResult(pageable.getPageSize() * pageable.getPageNumber());
//    return query.getResultList();
//    }
}
