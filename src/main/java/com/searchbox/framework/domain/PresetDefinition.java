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
import javax.persistence.PrePersist;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.beans.BeanUtils;
import org.springframework.core.annotation.Order;

import com.searchbox.core.dm.Preset;
import com.searchbox.core.search.query.EdismaxQuery;
import com.searchbox.core.search.result.HitList;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class PresetDefinition extends UnknownClassDefinition implements ElementFactory<Preset>{
	
	@ManyToOne
	private Searchbox searchbox;

	@ManyToOne
	private CollectionDefinition collection;
	
	@OneToMany(mappedBy="preset", cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@Order
	private Set<SearchElementDefinition> searchElements;
	
	private String slug;
	
	private String label;
	
	private String description;
	
	private Integer position;
	
	@OneToMany(targetEntity=FieldAttributeDefinition.class, cascade=CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private Set<FieldAttributeDefinition> fieldAttributes;
	
	public PresetDefinition(){
		super(Preset.class);
		searchElements = new HashSet<SearchElementDefinition>();
		fieldAttributes = new HashSet<FieldAttributeDefinition>();
	}

	public PresetDefinition(CollectionDefinition collection) {
		super(Preset.class);
		this.collection = collection;
		searchElements = new HashSet<SearchElementDefinition>();
		fieldAttributes = new HashSet<FieldAttributeDefinition>(); 
	}

	public Searchbox getSearchbox() {
		return searchbox;
	}

	public void setSearchbox(Searchbox searchbox) {
		this.searchbox = searchbox;
	}

	public CollectionDefinition getCollection() {
		return collection;
	}

	public void setCollection(CollectionDefinition collection) {
		this.collection = collection;
	}

	public Set<SearchElementDefinition> getSearchElements() {
		return searchElements;
	}

	public void setSearchElements(Set<SearchElementDefinition> searchElements) {
		this.searchElements = searchElements;
	}

	public Set<FieldAttributeDefinition> getFieldAttributes() {
		return fieldAttributes;
	}

	public void setFieldAttributes(
			Set<FieldAttributeDefinition> fieldAttributes) {
		this.fieldAttributes = fieldAttributes;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addSearchElement(SearchElementDefinition definition) {
		definition.setPreset(this);
		definition.setPosition(this.searchElements.size()+1);
		this.searchElements.add(definition);
		
	}
	
	public void addFieldAttribute(FieldAttributeDefinition definition) {
		boolean exists = false;
		for(FieldAttributeDefinition attr:fieldAttributes){
			if(attr.getField().equals(definition)){
				BeanUtils.copyProperties(definition, attr);
				exists = true;
			}
		}
		if(!exists){
			definition.setPreset(this);
			this.fieldAttributes.add(definition);
		}
	}
	
	public FieldAttributeDefinition getFieldAttributeByKey(String key){
		for(FieldAttributeDefinition adef:this.fieldAttributes){
			if(adef.getField().getKey().equals(key)){
				return adef;
			}
		}
		return null;
	}
	
	public FieldAttributeDefinition getFieldAttributeByField(FieldDefinition field){
		for(FieldAttributeDefinition adef:this.fieldAttributes){
			if(adef.getField().equals(field)){
				return adef;
			}
		}
		return null;
	}
	
	@Override
	public void setClazz(Class<?> clazz){
		super.setClazz(Preset.class);
	}

	public static PresetDefinition BasicPreset(Searchbox sb, CollectionDefinition collection){
		PresetDefinition pdef = new PresetDefinition(collection);
		pdef.setSlug("all");
		pdef.setAttributeValue("label", "Basic Preset");
		
		SearchElementDefinition query = new SearchElementDefinition("EdismaxQuery", EdismaxQuery.class);
		pdef.addSearchElement(query);
		
		SearchElementDefinition result = new SearchElementDefinition("HitList", HitList.class);
		pdef.addSearchElement(result);
		
		return pdef;
	}
	
	@PrePersist
	public void checkPresetAttributes(){
		//THis is for a SearchEngine Managed Collection!!!
		for(FieldDefinition fdef:collection.getFieldDefinitions()){
			boolean exists = false;
			for(FieldAttributeDefinition attr:fieldAttributes){
				if(attr.getField().equals(fdef)){
					exists = true;
				}
			}
			if(!exists){
				this.addFieldAttribute(new FieldAttributeDefinition(fdef));
			}
		}
	}

	// TODO put that in a JUNIT
	public static void main(String... args) {
		
		Searchbox sb = new Searchbox("test","testing");
		sb.setSlug("pubmed");
		
//		//The base collection for searchbox
//		CollectionDefinition collection = new CollectionDefinition("testCollection");
//		collection.setName("pubmed");
//		ArrayList<FieldDefinition> collectionFields = new ArrayList<FieldDefinition>();
//		collectionFields.add(FieldDefinition.StringFieldDef("id"));
//		collectionFields.add(FieldDefinition.StringFieldDef("title"));
//		collectionFields.add(FieldDefinition.StringFieldDef("article-abstract"));
//		collection.setFieldDefinitions(collectionFields);
//
//		PresetDefinition pdef = PresetDefinition.BasicPreset(sb, collection);
//
//		pdef.slug = "search-all";
//		pdef.label = "Hello World";
//		
//		SearchElementDefinition fdef = new SearchElementDefinition("FieldFacet", FieldFacet.class);
//		fdef.setAttributeValue("fieldName", "MyField");
//		fdef.setAttributeValue("label", "Categories");
//		pdef.addSearchElementDeifinition(fdef);
//		
//		PresetFieldAttributeDefinition fieldAttr = new PresetFieldAttributeDefinition(collection.getFieldDefinition("title"));
//		fieldAttr.setSearchable(true);
//		pdef.addFieldAttributeDefinition(fieldAttr);
		
//		Preset elem = pdef.getElement();
//		System.out.println("Preset label: " + elem.getLabel());
//		System.out.println("Preset slug: " + elem.getSlug());
//		
//		for(SearchElement element:elem.getSearchElements()){
//			System.out.println("SearchElement label: " + element.getLabel());
//		}
//		
//		for(PresetFieldAttribute element:elem.getFieldAttributes()){
//			System.out.println("PresetFieldAttribute: " + element);
//		}
	}

	@Override
	public Preset getInstance() {
		Preset preset = (Preset) super.toObject();
		BeanUtils.copyProperties(this, preset);
		return preset;		
	}
}