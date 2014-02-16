// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.searchbox.domain;

import com.searchbox.domain.Searchbox;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Searchbox_Roo_Finder {
    
    public static Long Searchbox.countFindSearchboxesBySlugEquals(String slug) {
        if (slug == null || slug.length() == 0) throw new IllegalArgumentException("The slug argument is required");
        EntityManager em = Searchbox.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Searchbox AS o WHERE o.slug = :slug", Long.class);
        q.setParameter("slug", slug);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Searchbox.countFindSearchboxesBySlugLike(String slug) {
        if (slug == null || slug.length() == 0) throw new IllegalArgumentException("The slug argument is required");
        slug = slug.replace('*', '%');
        if (slug.charAt(0) != '%') {
            slug = "%" + slug;
        }
        if (slug.charAt(slug.length() - 1) != '%') {
            slug = slug + "%";
        }
        EntityManager em = Searchbox.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Searchbox AS o WHERE LOWER(o.slug) LIKE LOWER(:slug)", Long.class);
        q.setParameter("slug", slug);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<Searchbox> Searchbox.findSearchboxesBySlugEquals(String slug) {
        if (slug == null || slug.length() == 0) throw new IllegalArgumentException("The slug argument is required");
        EntityManager em = Searchbox.entityManager();
        TypedQuery<Searchbox> q = em.createQuery("SELECT o FROM Searchbox AS o WHERE o.slug = :slug", Searchbox.class);
        q.setParameter("slug", slug);
        return q;
    }
    
    public static TypedQuery<Searchbox> Searchbox.findSearchboxesBySlugEquals(String slug, String sortFieldName, String sortOrder) {
        if (slug == null || slug.length() == 0) throw new IllegalArgumentException("The slug argument is required");
        EntityManager em = Searchbox.entityManager();
        String jpaQuery = "SELECT o FROM Searchbox AS o WHERE o.slug = :slug";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        TypedQuery<Searchbox> q = em.createQuery(jpaQuery, Searchbox.class);
        q.setParameter("slug", slug);
        return q;
    }
    
    public static TypedQuery<Searchbox> Searchbox.findSearchboxesBySlugLike(String slug) {
        if (slug == null || slug.length() == 0) throw new IllegalArgumentException("The slug argument is required");
        slug = slug.replace('*', '%');
        if (slug.charAt(0) != '%') {
            slug = "%" + slug;
        }
        if (slug.charAt(slug.length() - 1) != '%') {
            slug = slug + "%";
        }
        EntityManager em = Searchbox.entityManager();
        TypedQuery<Searchbox> q = em.createQuery("SELECT o FROM Searchbox AS o WHERE LOWER(o.slug) LIKE LOWER(:slug)", Searchbox.class);
        q.setParameter("slug", slug);
        return q;
    }
    
    public static TypedQuery<Searchbox> Searchbox.findSearchboxesBySlugLike(String slug, String sortFieldName, String sortOrder) {
        if (slug == null || slug.length() == 0) throw new IllegalArgumentException("The slug argument is required");
        slug = slug.replace('*', '%');
        if (slug.charAt(0) != '%') {
            slug = "%" + slug;
        }
        if (slug.charAt(slug.length() - 1) != '%') {
            slug = slug + "%";
        }
        EntityManager em = Searchbox.entityManager();
        String jpaQuery = "SELECT o FROM Searchbox AS o WHERE LOWER(o.slug) LIKE LOWER(:slug)";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        TypedQuery<Searchbox> q = em.createQuery(jpaQuery, Searchbox.class);
        q.setParameter("slug", slug);
        return q;
    }
    
}
