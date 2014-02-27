/*******************************************************************************
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
 ******************************************************************************/
package com.searchbox.framework.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.searchbox.core.dm.Collection;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class CollectionDefinition extends UnknownClassDefinition implements ElementFactory<Collection> {

	@ManyToOne
	private SearchEngineDefinition searchEngine;

	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	private Set<FieldDefinition> fieldDefinitions = new HashSet<FieldDefinition>();
	
	public CollectionDefinition() {
		super();
	}
	
	public CollectionDefinition(String name, SearchEngineDefinition definition) {
		super();
		this.searchEngine = definition;
	}
	
	public SearchEngineDefinition getSearchEngine() {
		return searchEngine;
	}

	public void setSearchEngine(SearchEngineDefinition searchEngine) {
		this.searchEngine = searchEngine;
	}

	public SearchEngineDefinition getSearchEngineDefinition() {
		return searchEngine;
	}

	public void setSearchEngineDefinition(SearchEngineDefinition engine) {
		this.searchEngine = engine;
	}

	public Set<FieldDefinition> getFieldDefinitions() {
		return fieldDefinitions;
	}

	public void setFieldDefinitions(Set<FieldDefinition> fieldDefinitions) {
		this.fieldDefinitions = fieldDefinitions;
	}

	public FieldDefinition getFieldDefinition(String key){
		for(FieldDefinition def:this.fieldDefinitions){
			if(def.getKey().equals(key)){
				return def;
			}
		}
		return null;
	}
	
	@Override
	public Collection getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}