// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.searchbox.domain;

import com.searchbox.domain.Searchbox;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Searchbox_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Searchbox.entityManager;
    
    public static final List<String> Searchbox.fieldNames4OrderClauseFilter = java.util.Arrays.asList("slug", "name", "alias", "description", "presets");
    
    public static final EntityManager Searchbox.entityManager() {
        EntityManager em = new Searchbox().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Searchbox.countSearchboxes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Searchbox o", Long.class).getSingleResult();
    }
    
    public static List<Searchbox> Searchbox.findAllSearchboxes() {
        return entityManager().createQuery("SELECT o FROM Searchbox o", Searchbox.class).getResultList();
    }
    
    public static List<Searchbox> Searchbox.findAllSearchboxes(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Searchbox o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Searchbox.class).getResultList();
    }
    
    public static Searchbox Searchbox.findSearchbox(Long id) {
        if (id == null) return null;
        return entityManager().find(Searchbox.class, id);
    }
    
    public static List<Searchbox> Searchbox.findSearchboxEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Searchbox o", Searchbox.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Searchbox> Searchbox.findSearchboxEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Searchbox o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Searchbox.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Searchbox.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Searchbox.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Searchbox attached = Searchbox.findSearchbox(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Searchbox.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Searchbox.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Searchbox Searchbox.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Searchbox merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
