/*
 * Copyright 2017 anhlucky.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.searchbox.framework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author anhlucky
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "UserFavoriteEntity.unMarkUserFavorite", query = "delete from UserFavoriteEntity uf where uf.userId = :userId and uf.favoriteId = :favoriteId"),
    @NamedQuery(name = "UserFavoriteEntity.findByPreset", query = "select uf from UserFavoriteEntity uf where uf.userId = :userId and uf.idField in (:idFields)")
}) 
public class UserFavoriteEntity extends BaseEntity<Long>
        implements Comparable<UserFavoriteEntity> {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(SearchElementEntity.class);

    @Column(nullable = false, unique = false)
    private String favoriteId;
    private String idField;
    private String title;
    @ManyToOne
    private UserEntity userId;

    @Override
    public int compareTo(UserFavoriteEntity o) {
        return 0;//this.getName().compareTo(o.getName());
    }

    public String getFavoriteId() {
        return favoriteId;
    }

    public UserFavoriteEntity setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
        return this;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public UserFavoriteEntity setUserId(UserEntity userId) {
        this.userId = userId;
        return this;
    }

    public String getIdField() {
        return idField;
    }

    public void setIdField(String idField) {
        this.idField = idField;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
