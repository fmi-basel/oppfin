// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.searchbox.domain;

import com.searchbox.domain.FieldDefinition;
import com.searchbox.domain.PresetDefinition;
import com.searchbox.domain.PresetFieldAttributeDefinition;

privileged aspect PresetFieldAttributeDefinition_Roo_JavaBean {
    
    public PresetDefinition PresetFieldAttributeDefinition.getPreset() {
        return this.preset;
    }
    
    public void PresetFieldAttributeDefinition.setPreset(PresetDefinition preset) {
        this.preset = preset;
    }
    
    public FieldDefinition PresetFieldAttributeDefinition.getField() {
        return this.field;
    }
    
    public void PresetFieldAttributeDefinition.setField(FieldDefinition field) {
        this.field = field;
    }
    
    public String PresetFieldAttributeDefinition.getLabel() {
        return this.label;
    }
    
    public void PresetFieldAttributeDefinition.setLabel(String label) {
        this.label = label;
    }
    
    public Boolean PresetFieldAttributeDefinition.getSearchable() {
        return this.searchable;
    }
    
    public void PresetFieldAttributeDefinition.setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }
    
    public Boolean PresetFieldAttributeDefinition.getHighlight() {
        return this.highlight;
    }
    
    public void PresetFieldAttributeDefinition.setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }
    
    public Boolean PresetFieldAttributeDefinition.getSortable() {
        return this.sortable;
    }
    
    public void PresetFieldAttributeDefinition.setSortable(Boolean sortable) {
        this.sortable = sortable;
    }
    
    public Boolean PresetFieldAttributeDefinition.getSpelling() {
        return this.spelling;
    }
    
    public void PresetFieldAttributeDefinition.setSpelling(Boolean spelling) {
        this.spelling = spelling;
    }
    
    public Boolean PresetFieldAttributeDefinition.getSuggestion() {
        return this.suggestion;
    }
    
    public void PresetFieldAttributeDefinition.setSuggestion(Boolean suggestion) {
        this.suggestion = suggestion;
    }
    
    public Float PresetFieldAttributeDefinition.getBoost() {
        return this.boost;
    }
    
    public void PresetFieldAttributeDefinition.setBoost(Float boost) {
        this.boost = boost;
    }
    
}
