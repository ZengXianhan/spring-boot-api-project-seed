package com.company.project.model;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class SolrModel implements Serializable {
    @Field
    public String id;
    @Field
    public String name;
    public SolrModel(String id, String name) {
        this.id = id;  this.name = name;
    }

    public SolrModel() {}
}
