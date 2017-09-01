/**
 * *****************************************************************************
 * Copyright Searchbox - http://www.searchbox.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************
 */
package com.searchbox.framework.repository;

import com.searchbox.framework.model.Favorite;
import com.searchbox.framework.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

import com.searchbox.framework.model.UserFavoriteEntity;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//@Transactional(readOnly=true)
public interface UserFavoriteRepository extends CrudRepository<UserFavoriteEntity, Long> {

    Page<UserFavoriteEntity> findAll(Pageable pageable);

    @Query("select new com.searchbox.framework.model.Favorite(favoriteId,idField,title,count(uf) as time) from UserFavoriteEntity uf group by favoriteId order by count(uf) asc")
    Page<Favorite> findAllAsc(Pageable pageable);

    @Query("select new com.searchbox.framework.model.Favorite(favoriteId,idField,title,count(uf) as time) from UserFavoriteEntity uf group by favoriteId order by count(uf) desc")
    Page<Favorite> findAllDesc(Pageable pageable);

    public List<UserFavoriteEntity> findByUserId(UserEntity userId);

    public void unMarkUserFavorite(UserEntity userId, String favoriteId);
//    @Query("select uf from UserFavoriteEntity uf where uf.userId = :userId and uf.idField in (:idFields)")

    public List<UserFavoriteEntity> findByPreset(@Param("userId") UserEntity userId, @Param("idFields") List<String> idFields);
    
    @Query(value="select count(favorite_id) from (select favorite_id from user_favorite_entity uf group by favorite_id) as t",
            nativeQuery = true)
    public long countAllFavorite();
}
